package date_20190115;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_10989 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		try {
			int num = Integer.parseInt(br.readLine());
//			 입력 할 값을 저장
			int[] arr = new int[num];
//			입력 할 값 만큼 배열 생성
			
			int max = 0;
			for(int i = 0; i < num; i++) {
				arr[i] = Integer.parseInt(br.readLine());
//				배열의 크기만큼 입력
				
				if(max < arr[i]) {
//					가장 큰 값을 확인
					max = arr[i];
				}
			}
			
			int[] count = new int[max+1];
//			가장 큰 값 만큼 count 배열 생성
			for(int i = 0; i < arr.length; i++) {
				count[arr[i]]++;
//				arr 배열에 저장 된 값을 기준으로 인덱스 증가
			}
			
			for(int i = 1; i < count.length; i++) {
				count[i] = count[i-1]+ count[i];
//				이전 값을 누적하여 저장
			}
			
			int[] tempArr = new int[num];
			
			int  temp = 0;
			for(int i = arr.length-1; i >= 0; i--) {
				temp = arr[i];
//				arr 배열의 끝부터 확인
				tempArr[--count[arr[i]]] = temp;
//				arr 배열의 값을 count배열의 인덱스로 사용하고 count배열의 값을하나씩 줄여나가면서 정렬
			}
			for(int i = 0; i < tempArr.length; i++) {
				bw.write(String.valueOf(tempArr[i]));
				bw.newLine();
			}
			bw.close();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
