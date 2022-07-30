package prepare.file.string;

public class LongestPrefix {

	public static void main(String[] args) {

		String s = "Bangalore";
		String s1 = "Bangtoge";
		StringBuilder s2 = new StringBuilder();
		int i = 0;
		while (i < s.length() && i < s1.length()) {
			if(s.charAt(i) == s1.charAt(i)) {
				s2.append(s.charAt(i));
			} else {
				break;
			}
			i++;
		}
		
		System.out.println(s2.toString());
	}

}
