import java.util.ArrayList;

public class Products {
	public ArrayList<Integer> returnArray(int m, int n, int[][] inputArray){
		ArrayList<Integer> productsArray = new ArrayList<Integer>(); 
		int i = 0, j = 0;
		while(i < m) {
			while(j < n) {
				int a = inputArray[i][j];
				int k = i;
				int l = j + 1;
				while(k < m) {
					while(l < n) {
						int b = inputArray[k][l];
						int o = k;
						int p = l + 1;
						while(o < m) {
							while(p < n) {
								int c = inputArray[o][p];
								productsArray.add(a * b *c);
								p++;
							}
							o++;
							p = 0;
						}
						l++;
					}
					k++;
					l = 0;
				}
				j++;
			}
			i++;
			j = 0;
		}
		return productsArray;
	}
}


