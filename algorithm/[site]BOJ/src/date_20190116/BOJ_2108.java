package date_20190116;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class BOJ_2108 {
//	첫 번째는 산술평균, 소수 첫번째에서 반올림
//	두 번째는 중앙값
//	세 번째는 최빈값 출력(가장 많이 나타나는 값), 여러개 있을 경우 두번째 작은 값 출력
//	네 번째는 범위를 출력

	
	public long avg(int[] arr) {
		// 평균을 구하는 함수
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		double avg = (double) sum / (arr.length);
		if(avg < 0) {
			// 마이너스 이하 일때를 구분
			return Math.round(Math.abs(avg)) * -1;
		}else {
			return Math.round(avg);
		}
	}

	public int middleValue(int[] arr) {
		int middle = arr[arr.length / 2];
		// 중간 인덱스에 있는 값을 선택
		return middle;
	}
	
	
	public int countValue(int[] arr) {
		int[] temp = new int[8001];
		// 음수를 없애기 위해 4000 * 2 + 1 배열을 만듬
		int index = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			index = 4000 + arr[i];
			temp[index]++;
			// 입력 받은 값에 해당하는 인덱스를 카운팅
			if (max < temp[index]) {
				max = temp[index];
				// max 값을 갱신
			}
		}
		
		Stack<Integer> s = new Stack<>();
		for(int i =0; i < temp.length; i++) {
			if (max == temp[i]) {
				s.push(i);
				// max값만 추출하기 위해 스택 활용
			}
		}
		
		Integer[] list = new Integer[s.size()];
		for(int i = 0; i < list.length; i++) {
			list[i] = s.pop();
			// 정렬하기 위해 스택에서 꺼내 배열에 저장
		}
		
//		Arrays.sort(list, Collections.reverseOrder());
		Arrays.sort(list);
		// 배열을 정렬
		
		if(list.length == 1 ) {
//			하나의 값만 있으면 출력
			return list[0] - 4000;
		}else {
//			두개 이상 일때
			if(list[0] < list[1] && list[0] > 4000) {
//				0보다 크고 오른 차순 형태로 재 비교
				return list[0] - 4000;
			}else {
//				그외 출력
				return list[1] - 4000;
			}
		}
	}
		
		
	

	public int range(int[] arr) {
		int range = 0;
		if (arr.length == 1) {
//			범위가 1일 때는 0 출력
			range = 0;
		} else if (arr[0] < 0 && arr[arr.length - 1] < 0) {
//			처음과 끝의 값이 0보다 작을 때는 처음 값만 절대 값하여 마지막 값과 같이 범위를 구함
			range = Math.abs(arr[0]) + arr[arr.length - 1];
		} else {
//			그외에 경우에는 모두 절대값하여 범위를 구함
			range = Math.abs(arr[0]) + Math.abs(arr[arr.length - 1]);
		}
		return range;
	}

	
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		BOJ_2108 b = new BOJ_2108();
		
		Arrays.sort(arr);
		
		long avg = b.avg(arr);
		bw.write(String.valueOf(avg));
		bw.newLine();
		
		
		int middle = b.middleValue(arr);
		bw.write(String.valueOf(middle));
		bw.newLine();
		
		int countValue = b.countValue(arr);
		bw.write(String.valueOf(countValue));
		bw.newLine();
		
		int range = b.range(arr);
		bw.write(String.valueOf(range));
		bw.newLine();
		
		bw.close();
		
	}
}
