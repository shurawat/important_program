package prepare.generics;

public class GenericMethods	 {
	
	public static <R, T> T test(R r, T t) {
		
		System.out.println(r);
		System.out.println(t);
		return t;
		
	}

}
