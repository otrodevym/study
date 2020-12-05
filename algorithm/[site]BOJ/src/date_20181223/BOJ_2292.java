package date_20181223;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2292 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		try {
			int num = Integer.parseInt(br.readLine());
//			찾고자 하는 번호를 입력 받습니다.
			int result = honeryCombCount(num);
//			입력 받은 값을 인자로 전달하고 결과를 반환합니다.
			
			bw.write(String.valueOf(result));
			bw.flush();
			bw.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private static int honeryCombCount(int num) {
//		처음 1을 제외하고 6씩 증가하는 벌집의 규칙을 푸는 문제입니다.
		int checkNum = 0;
//		규칙적으로 6씩 증가하는 값을 저장 할 변수를 선언합니다.
		num -= 1;
//		처음 1번의 값을 미리 빼줍니다.
		int count = 1;
//		처음 1번을 미리 카운트합니다.
		while(num > 0) {
//			0보다 작을때까지 반복합니다.
			checkNum +=6;
//			6씩 증분하고 누적하여 저장합니다.
			num -= checkNum;
//			증분한 값을 입력 받은 값에서 빼줍니다.
			count++;
//			반복문이 반복 될때마다 카운트합니다.
		}
		return count;
	}
	
}
