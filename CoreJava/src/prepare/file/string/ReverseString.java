
package prepare.file.string;

public class ReverseString {
	
	public static void main(String[] args) {
		String s = "shubham";
		StringBuilder s1 = new StringBuilder();
		for(int i=s.length()-1;i>=0;i--) {
			s1.append(s.charAt(i));
		}
		System.out.println(s1.toString());
	}

}
