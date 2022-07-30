package prepare.file.string;

public class LongestPalindrome {
	
	public static void main(String args[]) {
		
		String s = "aaaabbaa";
		String s1 = findLongestPalindrome(s, 0, s.length());
		System.out.println(s1);
		
	}
	
	static int MAX = -1;
	
	public static String findLongestPalindrome(String s, int start, int end) {
		
		if(start > end) {
			return "";
		}
		for(int i=start; i<end; i++) {
			
		}
		return s;
		
	}

}
