package date_20190116;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class BOJ_2108_fail {
//	첫 번째는 산술평균, 소수 첫번째에서 반올림
//	두 번째는 중앙값
//	세 번째는 최빈값 출력(가장 많이 나타나는 값), 여러개 있을 경우 두번째 작은 값 출력
//	네 번째는 범위를 출력

	public long avg(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		double avg = (double) sum / (arr.length);
		if(avg < 0) {
			return Math.round(Math.abs(avg)) * -1;
		}else {
			return Math.round(avg);
		}
	}

	public int middleValue(int[] arr) {
		int middle = arr[arr.length / 2];

		return middle;
	}

	public int minValue(int[] arr) {
		HashMap<Integer, Integer> list = new HashMap<>();
		
		
		list.put(arr[0], 1);
		for(int i = 1; i < arr.length; i++) {
			if(list.get(arr[i-1]) == list.get(arr[i])) {
				list.put(arr[i-1], list.get(arr[i-1])+1);
			}else {
				list.put(arr[i], 1);
			}
		}
		
		int maxCount = 0;
		for(Integer i : list.keySet()) {
			if(list.get(i.intValue()) > maxCount ) {
				maxCount = list.get(i.intValue()); 
			}
		}
		
		LinkedList<Integer> secondValue = new LinkedList<Integer>();
		int j = 0;
		for(Integer i : list.keySet()) {
			if(list.get(i.intValue()) == maxCount) {
				secondValue.add(i.intValue());
			}
			j++;
		}
		
		
		
		if(secondValue.size() > 1 ) {
			return (Math.abs(secondValue.get(0)) > Math.abs(secondValue.get(1)))? secondValue.get(1) : secondValue.get(0);
		}else {
			return secondValue.get(0);
		}
	}

	public int range(int[] arr) {
		int range = 0;
		if (arr.length == 1) {
			range = 0;
		} else if (arr[0] < 0 && arr[arr.length - 1] < 0) {
			range = Math.abs(arr[0]) + arr[arr.length - 1];
		} else {
			range = Math.abs(arr[0]) + Math.abs(arr[arr.length - 1]);
		}
		return range;
	}

	public static void main(String args[]) throws NumberFormatException, IOException {
		BOJ_2108_fail t = new BOJ_2108_fail();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);
		// 정렬 오름차순
		System.out.println("-------------");
		long avg = t.avg(arr);
		bw.write(String.valueOf(avg));

		bw.newLine();
		int middle = t.middleValue(arr);
		bw.write(String.valueOf(middle));

		bw.newLine();
		int min = t.minValue(arr);
		bw.write(String.valueOf(min));

		bw.newLine();
		int range = t.range(arr);
		bw.write(String.valueOf(range));

		bw.close();

	}
}
