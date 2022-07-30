package map;

import static java.util.Map.Entry.comparingByValue;
import static java.util.Map.Entry.comparingByKey;

import static java.util.stream.Collectors.toMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortMap {
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("c", "a");
		map.put("a", "d");
		map.put("b", "c");
		map.put("d", "b");
		
		TreeMap<String, String> mapTree = new TreeMap<>();
		mapTree.putAll(map);
		System.out.println(mapTree);
		
		Map<String, String> sorted = map.entrySet()
				.stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
		                LinkedHashMap::new));
	
		
		System.out.println(sorted);
	}

}
