package date_20181214;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_11720 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // input을 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // writer를 선언
		try {
			String len = br.readLine(); // 첫 번쨰 입력 값을 받음
			String str = br.readLine(); // 두 번쨰 입력 밧을 받음
			int sum = 0; // 총 합을 저장 할 변수
			for(int i=0; i < Integer.parseInt(len); i++) { // 0부터 시작하고 첫 번째 값만큼 1씩 증가하는 반복문
				sum += (int) str.charAt(i)-48; // 두 번째 값을 한 문자씩 읽어오고 아스키 코드 교정을 위해 -48하여 합함
			}
			bw.write(String.valueOf(sum)); // 결과 출력
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
