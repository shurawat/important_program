package prepare.mulitthread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {

	public static void main(String args[]) {
		AtomicInteger counter = new AtomicInteger();
		Counter counter1 = new Counter();


		Runnable r = () -> {
			System.out.println(counter.incrementAndGet());
		};
		/*new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();*/
		
		CompletableFuture.supplyAsync(() -> counter1.getAndIncrement()).thenApply((i) -> counter1.getAndIncrement());
		
		Runnable r1 = () -> {
			System.out.println(counter1.getAndIncrement());
		};
		
		new Thread(r1).start();
		new Thread(r1).start();
		new Thread(r1).start();
		new Thread(r1).start();
		new Thread(r1).start();
		new Thread(r1).start();
		new Thread(r1).start();
		new Thread(r1).start();
		new Thread(r1).start();
		new Thread(r1).start();
		new Thread(r1).start();
		new Thread(r1).start();

	}

}

class Counter{
	Integer i = 0;
	
	public int getAndIncrement() {
	
		return i++;
	}
}
