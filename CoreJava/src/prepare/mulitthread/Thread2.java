package prepare.mulitthread;

public class Thread2{
	
	public static void main(String[] args) throws InterruptedException {
		MultiThread2 m1 = new MultiThread2();
		Thread multiThread1 = new Thread(m1);
		Thread multiThread2 = new Thread(m1);
		multiThread1.setName("test thread 1");
		multiThread1.start();
		multiThread2.start();
		multiThread2.currentThread().yield();
		multiThread2.setName("test thread 2");
		multiThread2.join();
		System.out.println("test");
	}
	
}
