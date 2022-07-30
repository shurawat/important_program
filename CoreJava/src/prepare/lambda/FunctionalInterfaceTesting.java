package prepare.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalInterfaceTesting {
	
	public static void main(String[] args) {
		
		FunctionalTest f = (i,j) -> i+j;
		FunctionalTest f1 = (i,j) -> i*j;
		
		System.out.println(f.test(10, 5));
		System.out.println(f1.test(10, 5));
		
		
		Function<List<String>, List<String>> fim = (l) -> l.stream().filter(o -> o.equals("shubh")).collect(Collectors.toList());
		System.out.println(search(fim));
		
		
	}
	
	public static List<String> search(Function<List<String>, List<String>> fim) {
		List<String> t = new ArrayList<String>();
		t.add("shubh");
		t.add("rawat");
		return fim.apply(t);
		
	}
	
	
	private static void instanceReference_WithoutMethodRef() {
		 Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
		 stream.filter(i -> i%2==0 )
		  .forEach((i -> System.out.println(i)));
		}
	
	private static void instanceReference_WithMethodRef() {
		 Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
		 stream.filter(i -> i%2==0 )
		  .forEach(System.out::println);
		}

}
