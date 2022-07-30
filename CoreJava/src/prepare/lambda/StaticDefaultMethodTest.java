package prepare.lambda;

public class StaticDefaultMethodTest implements Test1, Test2, Cloneable {

	
	
	
	@Override
	public void test() {
		Test1.super.test();
		Test2.super.test();
	}
	
	public static void main(String[] args) {
		StaticDefaultMethodTest s = new StaticDefaultMethodTest();
		s.test();
		Test1.test1();
		Test2.test1();
		
	}

}

interface Test1 {
	
	public default void test() {
		System.out.println("Test1 test is called");
	}	
	
	public static void test1() {
		System.out.println("Test1 test1 is called");
	}	
}
interface Test2 {
	
	public  default void test() {
		System.out.println("Test2 test is called");
	}
	public static void test1() {
		System.out.println("Test2 test1 is called");
	}	
	
}
