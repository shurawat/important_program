package prepare.frequency;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyAdjacent {

	public static void main(String[] args) {

		String s = "aabbbbccdddfaa";

		int count = 0;
		char previous = s.charAt(0);
		char current;

		for (int i = 0; i < s.length(); i++) {
			current = s.charAt(i);
			if (previous == current) {
				count ++;
			} else {
				System.out.print("" + count + previous);
				previous = current;
				count = 1;
			}

		}
		
		System.out.print("" + previous + count);

	}

}
