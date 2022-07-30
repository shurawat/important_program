import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class SequenceThread {

	AtomicInteger count = new AtomicInteger(0);
	int MAX = 20;
	AtomicBoolean odd = new AtomicBoolean(false);

	public static void main(String args[]) {

		SequenceThread s = new SequenceThread();
		ExecutorService execute = Executors.newFixedThreadPool(2);

		Runnable t1 = () -> s.printEven();
		Runnable t2 = () -> s.printOdd();

		execute.submit(t1);
		execute.submit(t2);

	}

	public void printEven() {

		while (count.get() < MAX) {
			while (!odd.get()) {
				System.out.println(Thread.currentThread().getName() + "  -->  even " + count.getAndIncrement());
				
				odd.getAndSet(true);

			}
		}
	}

	public void printOdd() {

		while (count.get() < MAX) {
			while (odd.get()) {
				
				System.out.println(Thread.currentThread().getName() + "  -->   odd" + count.getAndIncrement());
				odd.getAndSet(false);

			}
		}
	}

}
