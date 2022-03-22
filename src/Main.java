import Prog1Tools.IOTools;

public class Main {

	public static void main(String[] args) {

		int i, j, x, y,  size_x, size_y, methode, number;
			
		System.out.println("Verfügbare Methoden: ");
		System.out.println("1 - 1 Matrix erstellen und ausgeben");
		System.out.println("2 - 2 Matrix erstellen und addieren");
		System.out.println("3 - 2 Matrix erstellen und multiplitieren");
		System.out.println("4 - 1 Matrix erstellen und transponieren, nur für quadratische Matrix möglich");
		System.out.println();
		
		methode = IOTools.readInteger("Geben Sie die gewünschte Methode ein: ");
		size_x = IOTools.readInteger("Geben Sie Anzahl er Zeilen ein: ");
		size_y = IOTools.readInteger("Geben Sie Anzahl er Spalten ein: ");
		System.out.println();
		
		Matrix matrix_new = new Matrix();
		int[][] matrix1 = matrix_new.matrixCreate(size_x, size_y);
		int[][] matrix2 = matrix_new.matrixCreate(size_x, size_y);
		int[][] matrix_result = new int[size_x][size_y];
		
		if (methode == 1) {
			matrix_new.matrixPrint(matrix1);
		} else if (methode == 2) {
			matrix_result = matrix_new.matrixAddition(matrix1, matrix2, size_x, size_y);
			matrix_new.matrixPrint(matrix1);
			System.out.println();
			matrix_new.matrixPrint(matrix2);
			System.out.println();
			matrix_new.matrixPrint(matrix_result);
		} else if (methode == 3) {
			matrix_result = matrix_new.matrixMultiplication(matrix1, matrix2, size_x, size_y);
			matrix_new.matrixPrint(matrix1);
			System.out.println();
			matrix_new.matrixPrint(matrix2);
			System.out.println();
			matrix_new.matrixPrint(matrix_result);
		} else if (methode == 4) {
			matrix_result = matrix_new.matrixTrans(matrix1, size_x, size_y);
			matrix_new.matrixPrint(matrix1);
			System.out.println();
			matrix_new.matrixPrint(matrix_result);
		} else {
			System.out.println("Falsche Eingabe");
		}
		
	}
	
}
