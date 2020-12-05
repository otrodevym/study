package m_divide_comquer;

public class MergeSort {
	private int[] data;
	private int[] temp;
	public MergeSort() {
	}
	public MergeSort(int[] arr) {
		data = arr;
		temp = new int[arr.length];
	}
	
	
	private void mergeSort(int startIndex, int endIndex) {
		if(endIndex > startIndex) {
		
		int middleIndex = (startIndex + endIndex) /2;
		
		mergeSort(startIndex, middleIndex);
		mergeSort(middleIndex+1, endIndex);
		
		
		merge(startIndex, middleIndex, endIndex);
		}
	}

	private void merge(int startIndex, int middleIndex, int endIndex) {
		for(int i = startIndex; i <= endIndex; i++) {
			this.temp[i] = this.data[i];
		}
		int leftIndex = startIndex;
		int rightIndex = middleIndex+1;
		
		int index = startIndex;
		
		while(leftIndex <= middleIndex && rightIndex <= endIndex) {
			if(this.temp[leftIndex] <= this.temp[rightIndex]) {
				this.data[index] = this.temp[leftIndex];
				leftIndex++;
			}else {
				this.data[index] = this.temp[rightIndex];
				rightIndex++;
			}
			index++;
		}
		
		for(int i =0; i <= (middleIndex-leftIndex); i++) {
			this.data[index + i] = this.temp[leftIndex +i]; 
		}
	}
	
	public static void main(String args[]) {
		int[] arr = {334, 6, 4, 2, 3, 1, 5, 117, 12, 34};
		MergeSort ms = new MergeSort(arr);
		
		ms.mergeSort(0, ms.data.length-1);
		
		for(int i = 0; i < ms.data.length; i++) {
			System.out.print( " " + ms.data[i]);
		}
		
	}
}
