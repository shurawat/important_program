package prepare.mulitthread;

public class PrintSequenceCaller {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new PrintSequence(1));
		Thread t2 = new Thread(new PrintSequence(0));
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
		
	}

}
