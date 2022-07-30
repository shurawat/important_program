//https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended-ii/
package dynamicprogramming;

import java.util.Arrays;
import java.util.LinkedList;

class MaxEvent {
    
    private int[][] memo;
    public static void main(String[] args) {
    	MaxEvent event = new MaxEvent();
		int[][] events = {{1,2,4}, {3,4,3}, {2,3,1}};	
		int i = event.maxValue(events, 2);
		System.out.println(i);
	}
    
    public int maxValue(int[][] events, int k) {
        Arrays.sort(events, (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));
        
        this.memo  = new int[events.length][k+1];
        return find(0, events, k);
    }
    
    
    private int find(int index, int[][] events, int k){
        if(k == 0 ) return 0;
        if(index == -1 || index == events.length) return 0;
        
        if(memo[index][k] != 0){
            return memo[index][k];
        }
        
        int maxVal = 0;
        // Two options, either attend the current event or not
        // 1) Attend the current
        // Find the next aval index, (least index with starting greater than the ending of current)
        int nextIndex = findTheNextIndex(events[index][1], events, index+1, events.length-1);
        maxVal = events[index][2] + find(nextIndex, events, k-1); 
        
        // 2) Leave the current
        maxVal = Math.max(maxVal, find(index+1, events, k));
        
        memo[index][k] = maxVal;
        return maxVal;
    }
    
    private int findTheNextIndex(int key, int[][] events, int l, int h){
        if(l > h || events[h][0] <= key) return -1;
        if(events[l][0] > key) return l;
        
        while(l < h){
            int m = l + (h-l)/2;
            if(events[m][0] <= key){
                l = m+1;
            }else h = m;
        }
        
        return h;
    }
}

