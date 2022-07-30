package prepare.mulitthread;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

public class LRUCache {
	
	
	private Deque<Integer> cache;
	
	private HashSet<Integer> hashSet;
	
	private final Integer CACHE_SIZE;
	
	public LRUCache(int capacity) {
		this.CACHE_SIZE = capacity;
		this.cache = new LinkedList<Integer>();
		this.hashSet = new HashSet<Integer>();
	}
	
	public void refer(int page) {		
		if(!hashSet.contains(page)) {
			if(cache.size() == CACHE_SIZE) {
				int last = cache.removeLast();
				hashSet.remove(last);
			}
		} else {
			cache.remove(page);
		}
		hashSet.add(page);
		cache.push(page);
	}
	
	public void display() {
		for(int i: cache) {
			System.out.println(i);
		}
	}
	
	public static void main(String args[]) {
		
		LRUCache lruCache = new LRUCache(3);
		lruCache.refer(1);
		lruCache.refer(2);
		lruCache.refer(3);
		lruCache.refer(1);
		lruCache.refer(4);
		lruCache.refer(5);
		lruCache.display();
	}

}
