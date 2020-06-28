import java.util.ArrayList;
import java.util.Scanner;

class QuickSort extends CalculateProducts
		{ 
			int partition(ArrayList<Integer> array, int a, int b) 
			{ 
				int pivot = array.get(b); 
				int i = (a-1);  
				for (int j=a; j<b; j++) 
				{ 
					if (array.get(j) < pivot) 
					{ 
						i++; 
						int temp = array.get(i); 
						array.add(i, array.get(j)); 
						array.add(j, temp); 
					} 
				} 
				int temp = array.get(i); 
				array.add(i+1, array.get(b)); 
				array.add(b, temp); 
				return i+1; 
			} 

			void sort(ArrayList<Integer> array, int low, int high) 
			{ 
				if (low < high) 
				{ 
					int partitionIndex = partition(array, low, high); 
					sort(array, low, partitionIndex-1); 
					sort(array, partitionIndex+1, high); 
				} 
			} 
			static void printBiggestProduct(ArrayList<Integer> array) 
			{ 
				int n = array.size(); 
				System.out.println(array.get(n - 1)); 
			} 
 
			public static void main(String args[]) 
			{ 
				Scanner scanner = new Scanner(System.in);
				Matrix rawArray = new Matrix();
				System.out.println("Nombre de lignes");
				int m = scanner.nextInt();
				System.out.println("Nombre de colonnes");
				int n = scanner.nextInt();
				scanner.close();
				int[][] inputArray= rawArray.createMatrix(m, n);
				
				CalculateProducts matrix1 = new CalculateProducts();
				ArrayList<Integer> array = matrix1.returnArray(m, n, inputArray); 
				int l = array.size(); 

				QuickSort object2 = new QuickSort(); 
				object2.sort(array, 1, l-1); 

				System.out.print("Biggest Producst is:"); 
				printBiggestProduct(array); 
			} 
	}

