package prepare.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test {
	
	public static void main(String[] args) {
		List<Person> personList = Person.generateDefaultList();		
		Test.printPersonOlderThan(personList, 0);
	}
	
	public static void printPersonOlderThan(List<Person> personList, int age) {
		
		personList.stream().filter(p->p.getAge() > age).forEach(p -> p.printPerson());
		
		Function<Integer, Integer> p = p1 -> p1+ 2;
		//System.out.println(p.apply(5));
		
		int [] arr = {1,2,3,4,5,6,7,8,9};
		  
		Integer findFirst = Arrays.stream(arr).filter(i -> (i%2) == 0)
		  .findFirst()
		  .orElse(-1);
		
		//System.out.println(findFirst);
		
		Integer findAny = Arrays.stream(arr).filter(i -> (i%2) == 0)
				  .findAny()
				  .orElse(-1);
		//System.out.println(findAny);
		
		Arrays.stream(arr).filter(i -> (i%2) == 0)
				  .limit(2)
				  .forEach(System.out::println);;


	}


}
