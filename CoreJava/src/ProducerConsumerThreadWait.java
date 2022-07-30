import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerThreadWait {

	Deque<Integer> bq = new LinkedList<>();
	int count = 1;
	int max = 10;
	public static void main(String args[]) {

		ProducerConsumerThreadWait s = new ProducerConsumerThreadWait();

		ExecutorService execute = Executors.newFixedThreadPool(5);

		Runnable t1 = () -> s.consumer();
		Runnable t2 = () -> s.producer();

		execute.submit(t1);
		execute.submit(t2);
		execute.submit(t1);

	}

	Object obj = new Object();

	public void consumer() {
		while (true) {
			synchronized (obj) {
				while (bq.isEmpty()) {
					try {
						Thread.sleep(1000);
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				System.out.println("size - " + bq.size());
				System.out.println(bq.pollLast());
				obj.notifyAll();

			}
		}

	}

	public void producer() {
		while (true) {
			synchronized (obj) {
				while (bq.size() == max) {
					try {
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				if (bq.size() < max) {
					bq.add(count++);
					obj.notifyAll();
				}

			}
		}

	}

}
