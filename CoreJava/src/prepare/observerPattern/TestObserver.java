package prepare.observerPattern;

public class TestObserver {

	public static void main(String[] args) {
		Subject s = new Subject();
		s.addConsumer(new Consumer("t1"));
		s.addConsumer(new Consumer("t2"));
		s.addConsumer(new Consumer("t3"));
		s.addConsumer(new Consumer("t4"));
		s.videoUploaded("shubham ");
	}

}
