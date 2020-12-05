package date_20190114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2751 {
	private int[] data;
	private int[] temp;
	private int count;

	public void mergeSort(int[] arr) {
		this.data = arr;
		this.temp = new int[arr.length];

		mergeSort(0, arr.length - 1); // 인덱스 초기화

	}

	private void mergeSort(int start, int end) {
		if (end > start) {	// 끝 인덱스가 클 경우에만 실행
			int mid = (start + end) / 2; // 중간 인덱스를 구함
			this.count++;	// 몇 번 호출 되는지 체크
			mergeSort(start, mid);	// 시작부터 중간인덱스 까지 나누는 재귀함수
			mergeSort(mid + 1, end);	// 중간다음 인덱스부터 끝 인덱스까지 나누는 재귀함수

			merge(start, mid, end);	// 정렬 후 결합하는 함수

		}
	}

	private void merge(int start, int mid, int end) {

		for (int i = start; i <= end; i++) {	// 임시 배열로 정렬 및 결합해야 하는 데이터 저장
			this.temp[i] = this.data[i];
		}

		int part1 = start;	// 쪼개진 배열의 시작 인덱스를 저장, 해당 인덱스를 통해 비교 연산
		int part2 = mid + 1;	// 쪼개진 배열의 중간 다음 인덱스를 저장, 해당 인덱스를 통해 비교 연산
		// 쪼개진 배열의 위치를 저장
		
		int index = start;	// 크기 만큼 연산 되었는지 확인하는 변수

		while (part1 <= mid && part2 <= end) {	// 시작은 중간까지, 중간 다음부터 끝까지 크기가 작다면  
			if (this.temp[part1] > this.temp[part2]) {	// 쪼갠 배열을 비교 작은 값을 저장 하고 저장 한 part를 증분하여 어떤 데이터가 들어갔는지 체크 
				this.data[index] = this.temp[part2];
				part2++;
			} else {
				this.data[index] = this.temp[part1];
				part1++;
			}
			index++;
		}

		for (int i = 0; i <= (mid - part1); i++) {	
			//	part1 시작 부분에 데이터가 남아 있으면 추가하고 part2 뒤쪽 부분의 남아 있는 데이터는 이미 정렬 되어 있음
			this.data[index + i] = this.temp[part1 + i];
		}
	}

	public static void main(String args[]) {
		BOJ_2751 b = new BOJ_2751();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		try {
			num = Integer.parseInt(br.readLine());

			int[] arr = new int[num];
			for (int i = 0; i < num; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			b.mergeSort(arr);
			for (int i : b.data) {
				System.out.print(i + " ");
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}
