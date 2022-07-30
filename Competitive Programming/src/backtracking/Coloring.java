package backtracking;

public class Coloring {
	
	int numberOfColors;
	int[] colors;
	int[][] graph;
	int numberOfVertices;
	
	public Coloring(int[][] graph, int numberOfColors) {
		this.numberOfColors = numberOfColors;
		this.graph = graph;
		numberOfVertices = graph[0].length;
		colors = new int[numberOfVertices];
	}
	
	public static void main(String[] args) {
		int[][] adjacencyMatrix = {
				{0,1,1,1,0,0},
				{1,0,1,0,1,1},
				{1,1,0,1,0,1},
				{1,0,1,0,0,1},
				{0,1,0,0,0,1},
				{0,1,1,1,1,0}
				
		};
		Coloring problem = new Coloring(adjacencyMatrix, 4);
		problem.solve();
	}
	
	public void solve() {
		if(findSolution(0)) {
			print();
		} else {
			System.out.println("No solution found !!");
		}
	}
	
	private boolean findSolution(int position) {
		if(position == numberOfVertices) {
			return true;
		}
		for(int i=0;i<numberOfColors; i++) {
			if(isColorValid(position, i)) {
				colors[position] = i;
				if(findSolution(position+1)) {
					return true;
				}
			}
		}
		return false;
	}
	
	private boolean isColorValid(int nodeIndex, int colorIndex) {
		for(int i=0; i<numberOfVertices; i++) {
			if(graph[nodeIndex][i] == 1 && colorIndex == colors[i]) {
				return false;
			}
		}
		return true;
	}
	
	private void print() {
		for(int i=0;i<numberOfVertices;i++) {
			System.out.println("Vertice" +(i+1)+ " has color "+colors[i]);
		}
	}

}
