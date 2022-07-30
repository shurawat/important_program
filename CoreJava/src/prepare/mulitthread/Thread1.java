package prepare.mulitthread;

public class Thread1 extends Thread{
	
	public static void main(String[] args) throws InterruptedException {
		
		MultiThread1 multiThread1 = new MultiThread1();
		MultiThread1 multiThread2 = new MultiThread1();
		multiThread1.setName("test thread 1");
		multiThread1.start();
		multiThread2.start();
		multiThread2.setName("test thread 2");
		multiThread2.join();
		System.out.println("test");
	}

}
