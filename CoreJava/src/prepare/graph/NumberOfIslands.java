package prepare.graph;

public class NumberOfIslands {

	public static void main(String[] args) {
		int[][] M = { 
				{ 1, 1, 0, 0, 0 }, 
				{ 0, 1, 0, 0, 1 }, 
				{ 1, 0, 0, 1, 1 }, 
				{ 0, 0, 0, 0, 0 }, 
				{ 1, 0, 1, 0, 1 } 
				};
		int i = countIslands(M);
		System.out.println(i);
	}
	
	public static void DFS(int[][] M, int i, int j, int row, int col) {
		
		if(i<0 || j<0 || i>row-1 || j > col-1 || M[i][j]!=1) {
			return;
		}
		M[i][j] = 0;
		DFS(M, i-1, j, row, col);  // left
		DFS(M, i+1, j, row, col); // right
		DFS(M, i, j-1, row, col); // up
		DFS(M, i, j+1, row, col); // down
		DFS(M, i-1, j+1, row, col); // left up
		DFS(M, i+1, j+1, row, col); // right up 
		DFS(M, i+1, j-1, row, col); // right down 
		DFS(M, i-1, j-1, row, col); // left down
		
	}
	
	public static int countIslands(int [][] M) {
		int count = 0;
		int row = M.length;
		int col = M[0].length;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(M[i][j] == 1) {
					M[i][j] = 0;
					count++;
					DFS(M, i-1, j, row, col);  // left
					DFS(M, i+1, j, row, col); // right
					DFS(M, i, j+1, row, col); // up
					DFS(M, i, j-1, row, col); // down
					DFS(M, i-1, j+1, row, col); // left up
					DFS(M, i+1, j+1, row, col); // right up 
					DFS(M, i+1, j-1, row, col); // right down 
					DFS(M, i-1, j-1, row, col); // left down
				}
			}
		}
		return count;
	}

}
