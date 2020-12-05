package date_20181226;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2750 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int rang = Integer.parseInt(br.readLine());
			int[] num = new int[rang];
			for(int i = 0; i < rang; i++) {
				num[i] = Integer.parseInt(br.readLine());
			}
			
			int[] result = calc(num);
			
			for(int i : result) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
			bw.flush();
			bw.close();
			
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int[] calc(int[] num) {
		
		int temp = 0;
//		임시 저장 변수를 선언합니다.
		for(int i = 0; i < num.length; i++) {
			for(int j = (i+1); j <= num.length-1; j++) {
//				i의 다음 수를 j로 지정합니다.
				if(num[i] > num[j]) {
//					i번쨰 값이 j번쨰 값보다 크다면 j의 값을 temp에 저장합니다.
//					i번째 값을 j에 저장합니다.
//					temp값을 i에 저장합니다.
					temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
		}
		
		return num;
	}
	
}
