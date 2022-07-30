package prepare.mulitthread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExample {
	
	public static void main(String args[]) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Future<String> result = executor.submit(new Thread3());
		System.out.println(result.get());
		System.out.println(result.isDone());
		executor.submit(new Thread3());
		executor.submit(new Thread3());
		executor.submit(new Thread3());
		
		executor.submit(new Thread3());
		executor.submit(new Thread3());
		executor.submit(new Thread3());
		executor.submit(new Thread3());
		
		executor.submit(new Thread3());
		executor.submit(new Thread3());
		executor.shutdown();
	}

}


class Thread3 implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("test");
		Thread.sleep(2000);
		return "test " + Thread.currentThread().getId();
	}
	
	
}
