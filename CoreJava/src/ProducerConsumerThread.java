import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumerThread {

	BlockingDeque<Integer> bq = new LinkedBlockingDeque<Integer>(100);
	int count = 1;

	public static void main(String args[]) {

		ProducerConsumerThread s = new ProducerConsumerThread();

		ExecutorService execute = Executors.newFixedThreadPool(5);

		Runnable t1 = () -> s.consumer();
		Runnable t2 = () -> s.producer();
		
		
		execute.submit(t1);
		execute.submit(t2);
		execute.submit(t2);
		execute.submit(t2);
		execute.submit(t2);


	}

	public  void consumer() {

		while(true) {
			
			if(!bq.isEmpty()) {
				System.out.println("size - " + bq.size() );
				System.out.println(bq.pollLast());
			}
			
			
		}
	}

	public void producer() {

		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(bq.remainingCapacity() !=0) {
					try {
						bq.put(count++);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	
			}
			
		}
	}

}
