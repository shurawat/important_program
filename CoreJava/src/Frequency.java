import java.util.HashMap;
import java.util.Map;

public class Frequency {
	
	public static void main(String[] args) {
		String s = "shubham";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		StringBuilder s1 = new StringBuilder();
		for(int i=0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(!map.containsKey(c)) {
				s1.append(c);
			} 
			map.put(c, 1);
		}
		//map.entrySet().stream().filter(e -> e.getValue() != 1).forEach(e->System.out.println(e.getKey()));
		System.out.println(s1.toString());
	}

}
