package date_20190119;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_1978 {
// 입력 받은 값이들 중 소수가 몇개인지 확인

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		String[] range = br.readLine().split(" ");

		int count = 0;
		int check = 0;
		for (int i = 0; i < range.length; i++) {

			for (int j=2; j <= Integer.parseInt(range[i]); j++) {
				if ((Integer.parseInt(range[i]) % j) == 0) {
					check++;
				}
				if(check > 1) {
					break;
				}
			}
			if (check == 1) {
				count++;
			}
			check = 0;
		}
		bw.write(String.valueOf(count));
		bw.close();

	}

	public static int[] testCase() {
		int[] test = { 1, 3, 5, 7 };
		return test;
	}
}
