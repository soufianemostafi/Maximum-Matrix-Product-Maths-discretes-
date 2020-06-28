import java.util.Scanner;

public class Matrix {

	public int[][] createMatrix(int m, int n){
		Scanner scanner = new Scanner(System.in);
		int[][] inputArray = new int[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.println("Entrez la prochaine valeur");
				inputArray[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		return inputArray;
	}

}
