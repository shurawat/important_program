package dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class Febonacci {
	
	Map<Integer, Integer> map = new HashMap<>();
	
	public static void main(String[] args) {
		Febonacci febonacci = new Febonacci();
		int n = febonacci.febonacciNumber(8);
		System.out.println(n);
		febonacci.map.put(0, 1);
		febonacci.map.put(1, 1);
		
		int k = febonacci.febonacciMemoization(8);
		System.out.println(k);
		
		febonacci.map = new HashMap<Integer, Integer>();
		febonacci.map.put(0, 1);
		febonacci.map.put(1, 1);
		
		int m = febonacci.febonacciTabulation(8);
		System.out.println(m);
		
	}
	
	public int febonacciNumber(int n) {
		if(n==0||n==1) {
			return 1;
		}
		return febonacciNumber(n-1) + febonacciNumber(n-2);
	}
	
	// top down approach -- Memoization
	public int febonacciMemoization(int n) {
		
		if(!map.containsKey(n)) {
			map.put(n, febonacciMemoization(n-1) + febonacciMemoization(n-2));
		}
		return map.get(n);
	}
	
	// bottom up approach
	public int febonacciTabulation(int n) {
		
		for(int i=2;i<=n;i++) {
			map.put(i, map.get(i-1) + map.get(i-2));
		}
		return map.get(n);
		
	}

}
