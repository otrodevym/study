package date_20181222;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2908 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String[] strNum = br.readLine().split(" ");
			String[] num = new String[strNum.length];
//			거꾸로 저장 할 문자열 배열을 선언합니다.
			for(int i = 0; i < strNum.length; i++) {
//				입력 받은 문자열 만큼 반복합니다.
				num[i]="";
//				거꾸로 저장 할 문자열을 초기화합니다.
				for(int j = strNum.length; j >= 0 ; j--) {
//					입력 받은 문자열을 거꾸로 하나의 문자씩 거내 저장합니다.
					num[i]+=String.valueOf(strNum[i].charAt(j));
				}
			}
			
			int num1 = Integer.parseInt(num[0]);
			int num2 = Integer.parseInt(num[1]);
//			두 수를 정수화 하여 비교 후 큰 수를 출력합니다.
			if( num1 > num2) {
				bw.write(String.valueOf(num1));
			}else if(num1 < num2) {
				bw.write(String.valueOf(num2));
			}else {
				
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
