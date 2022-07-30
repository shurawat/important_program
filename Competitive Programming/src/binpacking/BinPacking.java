package binpacking;

import java.util.Arrays;

public class BinPacking {
	
	public static void main(String[] args) {
		int[] bin = {8,8,8,8,8};
		int[] garbage = { 2, 3, 5, 4, 7, 6}; 
		
		int minBin = solve(bin, garbage);
		System.out.println( minBin);
		
	}
	
	public static int solve(int[] bin, int[] garbage) {
		
		Arrays.sort(garbage);
		
		for(int i=garbage.length-1;i>=0;i--) {
			for(int j=0; j<bin.length; j++) {
				if(garbage[i] <= bin[j]) {
					bin[j] = bin[j] - garbage[i];
					System.out.println(garbage[i] + " -  j - " + j + " - " + bin[j]);
					break;
				}
			}
		} 	
		
		
		int count=0;
		
		for(int i=0 ; i<bin.length;i++) {
			//System.out.println(bin[i]);
			if(bin[i] != 8) {
				count++;
			}
		}
		return count;
		
	}
	

}
