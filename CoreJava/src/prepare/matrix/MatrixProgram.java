package prepare.matrix;

public class MatrixProgram {
	
	public static void main(String[] args) {
		
		int[][] matrix = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==j) {
					System.out.print(matrix[j][i] + " -> ");
				}
			}
		}
		System.out.println();
		for(int i=2;i>=0;i--) {
			for(int j=2;j>=0;j--) {
				if(i==j) {
					System.out.print(matrix[j][i] + " -> ");
				}
			}
		}
		
	}

}
