package prepare.paranthesis;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {
	
	public static void main(String[] args) {
		
		String s  =  "({[]})";
		
		Map<Character, Character> pOpen = new HashMap<>();
		pOpen.put(')', '(');
		pOpen.put('}', '{');
		pOpen.put(']', '[');
		
		boolean isValid = true;
		
		char[] c = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<c.length; i++) {
			if(pOpen.containsValue(c[i])) {
				stack.push(c[i]);
			} else if (pOpen.containsKey(c[i]) && !stack.isEmpty()){
				char c1 = stack.pop();
				char c2 = pOpen.get(c[i]);
				if(c1 != c2) {
					isValid = false;
					break;
				}
			} else {
				isValid = false;
				break;
			}
		}
		
		System.out.println(isValid);
		
	}

}
