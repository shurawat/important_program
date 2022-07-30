package prepare.file.string;

import java.util.Arrays;

public class ValidShuffleString {
	
	public static void main(String[] args) {
		String s = "XY";
		String s1 = "12";
		String s2 = "X2Y1";
		String s3 = s+s1;
		
		char[] c = s2.toCharArray();
		
		Arrays.sort(c);
		char[] c1 = s3.toCharArray();
		Arrays.sort(c1);
		boolean isValidShuffle = true;

		for(int i=0; i<c.length; i++) {
			
			if(c[i] != c1[i]) {
				isValidShuffle = false;
			}
			
		}
		
		System.out.println(isValidShuffle);
		
				
	}

}
