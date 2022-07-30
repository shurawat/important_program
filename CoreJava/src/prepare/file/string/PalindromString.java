
package prepare.file.string;

public class PalindromString {
	
	public static void main(String[] args) {
		String s = "nitins";
		StringBuilder s1 = new StringBuilder();
		for(int i=s.length()-1;i>=0;i--) {
			s1.append(s.charAt(i));
		}
		if(s.equals(s1.toString())) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}

}
