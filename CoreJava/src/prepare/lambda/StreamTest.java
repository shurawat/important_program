package prepare.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest {
	
	public static void main(String args[]) {
	    List<Integer> numbers = Arrays.asList(2,3,4,5,2);
	    
	    int even = numbers.stream().filter(i -> i%2==0).reduce(0, (ans, i) -> ans+i);
	    System.out.println(even);
	    List<Integer> evenList = numbers.stream().filter(i -> i%2==0).sorted().collect(Collectors.toList());
	    System.out.println(evenList);
	    Long s = numbers.stream().filter(i -> i%2==0).sorted().mapToInt(m -> m).count();
	    System.out.println(s);
	    
        List<List<Integer> > number = new ArrayList<>();
        
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));

        List<Integer> list = number.stream().flatMap(l -> l.stream()).collect(Collectors.toList());
	    System.out.println(list);
	    
	    Map<Integer, String> map = new HashMap<Integer, String>();
	    
	    map.put(1, "1");
	    map.put(2, "2");
	    map.put(3, "3");
	    map.put(4, "4");
	    map.put(5, "5");
	    
	}

}
