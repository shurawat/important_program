package prepare.map;

public class MapRunner {
	
	public static void main(String[] args){
        CustomMap<Integer, String> map = new CustomMap<Integer, String>();
        System.out.println("Going to add entries in map");
        map.put(null, "Nothing");
        map.put(1, "ETC");
        map.put(2, "John");
        System.out.println("Displaying all the entry in map");
        System.out.println("Adding duplicate key 1 in map");
        map.put(1, "CSE");
        map.put(2, "John again");
        System.out.println("Displaying all the entry in map again");
        System.out.println("Adding entry with key 17 in map");
        map.put(17, "CS");
        map.display();
    }

}
