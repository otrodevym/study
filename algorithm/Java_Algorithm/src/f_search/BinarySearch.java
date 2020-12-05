package f_search;

import java.util.Arrays;

public class BinarySearch {
	
	private int BinartSearch(int list[], int size, double target) {
		int left=0, right=size -1, mid=0;
		
		while(left <= right) {
			mid = (left + right) /2;
			
			if(target < list[mid]) {
				right = mid -1;
			}else if(target > list[mid]){
				left = mid +1;
			}else {
				return list[mid];
			}
		}
		return -1;
	}
	


	public static void main(String args[]) {
		int data[]={
				1, 10,
				2, 30,
				3, 40,
				4, 100,
				5, 15,
				6, 20,
				7, 30,
				8, 99,
				9, 23,
				10, 66
			};
		
		BinarySearch bs = new BinarySearch();
		
		Arrays.sort(data);
		int result = bs.BinartSearch(data, data.length, 100);
		System.out.println(result);
	
		int result2 = Arrays.binarySearch(data, 30);
		System.out.println(result2);
	}
}
