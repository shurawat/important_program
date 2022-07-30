package prepare.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableTest {
	
	public static void main(String args[]) {
		ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
        
        Collections.sort(list);
        
        System.out.println(list);
        
        MovieComparator comparator = new MovieComparator();
        
        Collections.sort(list, comparator);
        
        
        Comparator<Movie> comparatorNew = Comparator.comparing(Movie::getName).thenComparing(Movie::getRating);
        Collections.sort(list, comparatorNew.reversed());
        
        System.out.println(list);
	}

}
