package prepare.observerPattern;

public class Consumer {
	
	private String name;
	
	public Consumer(String name) {
		this.name = name;
	}
	
	public void notifyMe(String title) {
		System.out.println("video uploaded with title --> " + title + "to consumer --> " + name);
	}

}
