package prepare.frequency;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
	
	public static void main(String[] args) {
		
		String s = "aabbbbccdddfaa";
		
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<s.length();i++) {
			
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
			
		}
		
		map.forEach((k, v) -> System.out.print("" + v + k)  );
		
	}

}
