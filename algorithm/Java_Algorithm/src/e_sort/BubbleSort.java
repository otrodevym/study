package e_sort;

public class BubbleSort {
	private void BubbleSort(int[] data) {
		int temp = 0;
		for(int i = 0; i < data.length; i++) {
			for(int j = (i+1); j < data.length; j++) {
				if(data[i] > data[j]) {
					temp = data[j];
					data[j] = data[i];
					data[i] = temp;
				}
				
			}
		}
	}
	
	public static void main(String args[]) {
		BubbleSort bs = new BubbleSort();
		int[] data = {5, 2, 4, 3, 1,};
		
		bs.BubbleSort(data);
		for(int i : data) {
			System.out.print(i + " " );
		}
	}
}
