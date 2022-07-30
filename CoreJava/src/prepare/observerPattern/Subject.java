package prepare.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private List<Consumer> consumers = new ArrayList<Consumer>();

	public void videoUploaded(String title) {
		consumers.forEach(c->c.notifyMe(title));
	}
	
	public void addConsumer(Consumer consumer) {
		consumers.add(consumer);
	}

}
