package backtracking;

public class NQueensProblem {
	
	public static void main(String[] args) {
		NQueensProblem problem = new NQueensProblem(4);
		problem.solve();
	}
	
	int[][] chessBoard;
	int numberOfQueens;
	
	public NQueensProblem(int numberOfQueens) {
		this.numberOfQueens = numberOfQueens;
		this.chessBoard = new int[numberOfQueens][numberOfQueens];
	}
	
	public void solve() {
		if(setQueens(0)) {
			printQueens();
		}else {
			System.out.println("There is no solution..");
		}
	}
	
	private boolean setQueens(int columnIndex) {
		
		if(columnIndex == numberOfQueens) {
			return true;
		}
		
		for(int rowIndex=0;rowIndex<numberOfQueens;rowIndex++) {
			if(isValidPosition(rowIndex, columnIndex)) {
				chessBoard[rowIndex][columnIndex] = 1;
				if(setQueens(columnIndex + 1)) {
					return true;
				}
				chessBoard[rowIndex][columnIndex] = 0;
			}
		}
		return false;
	}
	
	private boolean isValidPosition(int row, int column) {
		for(int i=0;i<column; i++) {
			if(chessBoard[row][i] == 1) {
				return false;
			}
		}
		for(int i=row, j=column;i>=0 && j >=0;i--,j--) {
			if(chessBoard[i][j] == 1) {
				return false;
			}
		}
		for(int i=row, j=column;i<chessBoard.length && j>=0;i++,j--) {
			if(chessBoard[i][j] == 1) {
				return false;
			}
		}
		return true;
	}
	
	private void printQueens() {
		for(int row =0;row<chessBoard.length; row++) {
			for(int col =0; col<chessBoard.length; col++) {
				if(chessBoard[row][col] == 1) {
					System.out.print(" * ");
				} else {
					System.out.print(" - ");
				}
			}
			System.out.println();
		}
	}

}
