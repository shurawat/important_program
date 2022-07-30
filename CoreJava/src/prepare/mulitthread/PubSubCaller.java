package prepare.mulitthread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PubSubCaller {
	
	public static void main(String[] args) {
		
		Object lock = new Object();
		Queue<Integer> queue = new LinkedList<Integer>();
		int capacity = 5;
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		executor.submit(new Publisher(queue, lock, capacity));
		executor.submit(new Subscriber(queue, lock, capacity));
	}

}
