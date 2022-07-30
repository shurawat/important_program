package backtracking;

public class Maze {
	
	int[][] maze;
	int[][] solution;
	int mazeSize;
	
	public Maze(int[][] maze) {
		this.maze = maze;
		mazeSize = maze[0].length;
		solution = new int[mazeSize][mazeSize];
	}
	
	public static void main(String[] args) {
		int[][] maze = {{1,1,1,1},
						{1,1,0,0},
						{0,1,0,1},
						{1,1,1,1}};
		
		Maze m = new Maze(maze);
		m.solve();
	}
	
	public void solve() {
		
		if(solveProblem(0, 0)) {
			printSolution();
		} else {
			System.out.println("Not able to solve");
		}
	}
	
	private boolean solveProblem(int rowIndex, int columnIndex) {
		if(rowIndex == mazeSize-1 && columnIndex == mazeSize-1) {
			solution[rowIndex][columnIndex] = 1;
			return true;
		}
		
		if(isValid(rowIndex, columnIndex)) {
			solution[rowIndex][columnIndex] = 1;
			if(solveProblem(rowIndex, columnIndex+1)) {
				return true;
			}
			if(solveProblem(rowIndex+1, columnIndex)) {
				return true;
			}
			solution[rowIndex][columnIndex] = 0;
		}
		
		return false;
	}
	
	private boolean isValid(int rowIndex, int columnIndex) {
		if(rowIndex <0 || rowIndex>=mazeSize ) return false;
		if(columnIndex <0 || columnIndex>=mazeSize) return false;
		if(maze[rowIndex][columnIndex] != 1) return false;
		return true;
	}
	
	private void printSolution() {
		for(int i=0;i<mazeSize;i++) {
			for(int j=0;j<mazeSize;j++) {
				if(solution[i][j] == 1) {
					System.out.print(" S ");
				} else {
					System.out.print(" - ");
				}
			}
			System.out.println();
		}
	}

}
