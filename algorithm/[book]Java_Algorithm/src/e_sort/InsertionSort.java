package e_sort;

public class InsertionSort {
	public void InsertionSort(int[] data) {
		int temp = 0;
		for (int i = 1; i < data.length; i++) {
			temp = data[i];
			int j = i-1;
			while(j >=0 && temp < data[j]) {
				data[j+1] = data[j];
				j--;
			}
			data[j+1] = temp;
		}
	}

	public static void main(String args[]) {

		InsertionSort is = new InsertionSort();
		int[] data = { 5, 2, 3, 4, 1 };
		is.InsertionSort(data);

		for (int i : data) {
			System.out.print(" " + i);
		}
	}
}
