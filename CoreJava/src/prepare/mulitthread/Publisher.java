package prepare.mulitthread;

import java.util.Queue;

public class Publisher implements Runnable {
	
	Queue<Integer> queue;
	int MAX_CAPACITY;
	Object lock;
	int i = 0;
	
	public Publisher(Queue<Integer> queue, Object lock, int capacity) {
		this.queue = queue;
		this.lock = lock;
		MAX_CAPACITY = capacity;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (lock) {
				while(queue.size() == MAX_CAPACITY) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				i++;
				queue.add(i);
				
				System.out.println("Produces produces " + i);
				lock.notify();
			}
		}
	}

}
