package date_20181221;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2675 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String args[]) {

		try {
			int num = Integer.parseInt(br.readLine());
//			입력 받은 값을 변수에 저장합니다.
			for (int i = 0; i < num; i++) {
//				첫 번째 입력 받은 값 만큼 반복합니다.
				String[] str = br.readLine().split(" ");
//				두번째부터 입력 받는 반복 횟수, 문자열 값을 공백으로 구분하여 String 배열에 저장합니다.
				for (int j = 0; j < str[1].length(); j++) {
//					문자열 값 만큼 반복합니다.
					strPrint(str,j);
//					가독성을 위해 함수를 사용했습니다.
				}
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

	private static void strPrint(String[] str, int j) {
		for (int k = 0; k < Integer.parseInt(str[0]); k++) {
//			문자를 입력 받은 반복 횟수 만큼 하나씩 반복하여 출력합니다.
			try {
				bw.write(String.valueOf(str[1].charAt(j)));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
