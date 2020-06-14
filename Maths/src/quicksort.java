import java.util.ArrayList;

class QuickSort extends Products
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
				int m = 5, n = 5;
				int[][] inputArray = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
				Products object1 = new Products();
				ArrayList<Integer> array = object1.returnArray(m, n, inputArray); 
				int l = array.size(); 

				QuickSort object2 = new QuickSort(); 
				object2.sort(array, 1, l-1); 

				System.out.print("Biggest Producst is:"); 
				printBiggestProduct(array); 
			} 
	}

