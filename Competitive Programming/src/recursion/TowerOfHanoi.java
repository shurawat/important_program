package recursion;

public class TowerOfHanoi {
	
	public static void main(String[] args) {
		solve(2, "A", "B", "C");
	}
	
	public static void solve(int disk, String source, String middle, String destination) {
		
		if(disk == 0) {
			System.out.println("plate " + disk + " from " + source +" to " + destination);
			return;
		}
		
		solve(disk-1, source, destination, middle);
		System.out.println("plate " + disk + " from " + source + " to " + destination);
		solve(disk-1, middle, source, destination);
		
	}

}
