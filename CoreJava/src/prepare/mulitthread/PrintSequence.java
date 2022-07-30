package prepare.mulitthread;

public class PrintSequence implements Runnable {

	int remainder;
	static Object lock = new Object();
	int MAX_NUMBER = 10;
	static int number = 1;

	public PrintSequence(int remainder) {
		this.remainder = remainder;
	}

	@Override
	public void run() {

		while (number < MAX_NUMBER) {

			synchronized (lock) {

				if (number % 2 != remainder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				System.out.println(Thread.currentThread().getName() + "  " + number);
				number++;
				lock.notify();
			}

		}

	}

}
