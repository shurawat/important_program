package prepare.map;

public class StringTest {

	public static void main(String[] args) {

		
		String s1 = "foobar";
		String s2 = "foobar";

		System.out.println(s1 == s2); // true

		s2 = new String("foobar");
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true

	}

}
