package prepare.map;

public class Entry<K,V> {
	
	private V value;
	private K key;
	private Entry<K,V> next;
	
	
	
	public Entry(V value, K key, Entry<K, V> next) {
		super();
		this.value = value;
		this.key = key;
		this.next = next;
	}
	
	
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public Entry<K, V> getNext() {
		return next;
	}
	public void setNext(Entry<K, V> next) {
		this.next = next;
	}
	
	
	

}
