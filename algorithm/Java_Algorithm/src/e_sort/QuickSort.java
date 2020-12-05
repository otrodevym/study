package e_sort;

public class QuickSort {
	public void swap(int[] data, int index1, int index2) {
		int temp = 0;
		
		temp = data[index1];
		
		data[index1] = data[index2];
		
		data[index2] = temp;
		
	}
	
	public int partition(int[] data, int left, int right) {
		int first = left;
		int pivot = data[left];
		
		while(left < right) {
			while(data[left] <= pivot && left < right) {
				++left;
			}
			while(data[right] > pivot && left <= right) {
				--right;
			}
			
			if(left < right) {
				swap(data, left, right);
			}else {
				break;
			}
		}
		
		swap(data, first, right);
		
		return right;
	}
	
	public void quickSort(int[] data, int left, int right) {
		if(left < right) {
			int index = partition(data, left, right);
			
			quickSort(data, left, index-1);
			quickSort(data, index+1, right);
		}
	}
	
	public static void main(String args[]) {
		QuickSort qs = new QuickSort();
		int data[] = {6, 4, 2, 3, 1, 5};
		
		
		qs.quickSort(data, 0, data.length-1);
		for(int i : data) {
			System.out.print(i + " ");
		}
	}
}
