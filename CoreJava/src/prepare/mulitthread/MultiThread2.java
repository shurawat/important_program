package prepare.mulitthread;

public class MultiThread2 implements Runnable{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread name - "+ Thread.currentThread().getName() + " count - "+ i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
