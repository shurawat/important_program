package prepare.file.string;

public class DuplicateString {
	
	public static void main(String[] args) {
		String s = "ABCD";
		String s1 = "CDAB";
		
		String s2 = s+s;
		
		if(s2.contains(s1)) {
			System.out.println("rotation string");
		} else {
			System.out.println("not rotation string");
		}
		
	}

}
