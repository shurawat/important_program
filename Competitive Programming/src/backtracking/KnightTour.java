package backtracking;

public class KnightTour {
	
	int boardSize;
	int[][] board;
	int[] xMoves = {2,1,-1,-2,-2,-1,1,2};
	int[] yMoves = {1,2,2,1,-1,-2,-2,-1};
	
	public KnightTour(int boardSize) {
		this.boardSize = boardSize;
		board = new int[boardSize][boardSize];
		initialLoad();
	}
	
	private void initialLoad() {
		for(int i=0;i<boardSize; i++) {
			for(int j=0;j<boardSize; j++) {
				board[i][j] = Integer.MIN_VALUE;
			}
		}
	}
	
	public static void main(String[] args) {
		KnightTour problem = new KnightTour(5);
		problem.solve();
	}
	
	
	private void solve() {
		board[0][0] = 0;
		if(solution(1, 0, 0)) {
			print();
		} else {
			System.out.println("No solution");
		}
	}
	
	private boolean solution(int step, int x, int y) {
		if(step == boardSize * boardSize) {
			return true;
		}
		for(int i =0; i<xMoves.length; i++) {
			int nextX = x + xMoves[i];
			int nextY = y + yMoves[i];
			if(isValid(nextX, nextY)) {
				board[nextX][nextY] = step;
				if(solution(step + 1, nextX, nextY)) {
					return true; 
				}
				board[nextX][nextY] = Integer.MIN_VALUE;
			}
		}
		return false;
	}
	private boolean isValid(int x, int y) {
		if(x<0||x>=boardSize) return false;
		if(y<0||y>=boardSize) return false;
		if(board[x][y] != Integer.MIN_VALUE) return false;
		return true;
	}
	private void print() {
		for(int i=0;i<boardSize; i++) {
			for(int j=0;j<boardSize; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

}
