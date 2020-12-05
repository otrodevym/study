package date_20181220;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_9858 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		5
//		OOXXOXXOOO
//		OOXXOOXXOO
//		OXOXOXOXOXOXOX
//		OOOOOOOOOO
//		OOOOXOOOOXOOOOX
//		int num = 5;
//		String[] testCase = new String[num]; 
//		testCase[0] = "OOXXOXXOOO";
//		testCase[1] = "OOXXOOXXOO";
//		testCase[2] = "OXOXOXOXOXOXOX";
//		testCase[3] = "OOOOOOOOOO";
//		testCase[4] = "OOOOXOOOOXOOOOX";
		try {
			int num = Integer.parseInt(br.readLine());
//			OX를 입력 할 양을 정하는 숫자를 입력 받습니다.
			String[] strOx = new String[num];
//			OX를 입력 받을 배열을 선언합니다.
			for (int i = 0; i < num; i++) {
				strOx[i] = br.readLine();
//				입력 할 양 만큼 반복하여 OX를 입력 받아 배열에 저장합니다.
			}

			for (int i = 0; i < num; i++) {
				bw.write(String.valueOf(countOX(strOx[i])));
//				countOX 함수로 OX를 전달하고 반환되는 정수를 출력합니다.
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

	private static int countOX(String strOX) {
		int checkO = 0;
//		O의 개수를 저장 할 변수를 선언합니다.
		int sum = 0;
//		총 점수를 저장 할 변수를 선언합니다. 
		for (int i = 0; i < strOX.length(); i++) {
//			전달 받은 OX 길이만큼 반복합니다.
			if (strOX.charAt(i) == 'O') {
//				한 문자가 'O'와 같다면 check변수를 증분합니다.
				checkO++;
				sum += checkO;
//				증분한 checkO변수를 총 점수에 더합니다.
			} else {
				checkO = 0;
//				한 문자가 'X'이면 checkO를 0으로 초기화합니다.
			}
		}
		return sum;
	}
}
