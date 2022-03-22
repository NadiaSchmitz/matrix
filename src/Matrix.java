
public class Matrix {

	private int[][] matrix;
	private int i, j, x, y;
	
	public Matrix() {}
	
	public int getSizeX() {
		return x;
	}
	
	public void setSizeX(int x) {
		this.x = x;
	}
	
	public int getSizeY() {
		return y;
	}
	
	public void setSizeY(int y) {
		this.y = y;
	}
	
	// Matrix x*y erstellen
	
	public int[][] matrixCreate(int size_x, int size_y) {
		int[][] matrix = new int[size_x][size_y];
		for (i = 0; i < size_x; i++) {
			for(j = 0; j < size_y; j++) {
				matrix[i][j] = (int)Math.round(Math.random()*100);
			}
		}
		return matrix;
	}
	
	// Matrix ausgeben
	
	public void matrixPrint(int[][] matrix) {
		int i, j;
		for (i = 0; i < matrix.length; i++) {
			for (j = 0; j < matrix[i].length; j++) {
				System.out.printf("%-5s ", matrix[i][j]);
			}
			System.out.println();
		}
	}

	// 2 Matrix addieren
	
	public int[][] matrixAddition(int[][] matrix_1, int[][] matrix_2, int size_x, int size_y) {
		int i, j;
		int[][] matrix_result = new int[size_x][size_y];
		for (i = 0; i < size_x; i++) {
			for (j = 0; j < size_y; j++) {
				matrix_result[i][j] = matrix_1[i][j] + matrix_2[i][j];
			}
		}
		return matrix_result;
	}

	// 2 Matrix multiplizieren
	
	public int[][] matrixMultiplication(int[][] matrix_1, int[][] matrix_2, int size_x, int size_y) {
		int i, j;
		int[][] matrix_result = new int[size_x][size_y];
		for (i = 0; i < size_x; i++) {
			for (j = 0; j < size_y; j++) {
				matrix_result[i][j] = matrix_1[i][j] * matrix_2[i][j];
			}
		}
		return matrix_result;
	}
	
	// 1 Matrix transponieren
	
	public int[][] matrixTrans(int[][] matrix, int size_x, int size_y) {
		int i, j;
		int[][] matrix_result = new int[size_x][size_x];
		if (size_x == size_y) {
			for (i = 0; i < matrix.length; i++) {
				for (j = 0; j < matrix[i].length; j++) {
					matrix_result[i][j] = matrix[j][i];
				}
			}
		}
		return matrix_result;
	}
	
}
