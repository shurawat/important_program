package prepare.generics;

public class TestGeneric {
	
	public static void main(String args[]) {
		
		GenericClass<String, Integer> generic = new GenericClass<>();
		
		generic.setId(1);
		generic.setName("shubh");
		
		System.out.println(generic);
		
		Integer i = GenericMethods.test("Shubh", 1);
		System.out.println("i is " + i);
		
	}

}
