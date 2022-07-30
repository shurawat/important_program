package backtracking_practice;

public class ColoringPractice {
	
	int numberOfVertices;
	int[][] graph;
	int[] colors;
	int numberOfColors;
	
	public ColoringPractice(int[][] graph, int colors) {
		numberOfColors = colors;
		this.graph = graph;
		this.numberOfVertices = graph[0].length;
		this.colors = new int[numberOfVertices];
	}
	
	public static void main(String[] args) {
		int[][] adjacencyMatrix = {
				{0,1,1,1,0,0},
				{1,0,1,0,1,1},
				{1,1,0,1,0,1},
				{1,0,1,0,0,1},
				{0,1,0,0,0,1},
				{0,1,1,1,1,0}};
		ColoringPractice coloringPractice = new ColoringPractice(adjacencyMatrix, 4);
		coloringPractice.solve();
		
	}
	
	public void solve() {
		
		if(solveColoring(0)) {
			System.out.println("Found Solution");
			for(int i=0;i<numberOfVertices;i++) {
				System.out.println("vertice " + i + " has color " + colors[i]);
			}
		}else {
			System.out.println("No Solution");
		}
	}
	
	public boolean solveColoring(int position) {
		if(position == numberOfVertices) {
			return true;
		}
		for(int i=0;i<numberOfColors;i++) {
			if(isValidColor(i, position)) {
				colors[position] = i;
				if(solveColoring(position+1)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean isValidColor(int color, int position) {
		for(int i=0;i<numberOfVertices; i++) {
			if(graph[position][i] == 1 && colors[i] == color) {
				return false;
			}
		}
		return true;
	}

}
