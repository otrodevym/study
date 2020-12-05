package date_20181222;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_5622 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		System.out.println((int) 'A'); // 65
//		System.out.println((int) 'Z'); // 90

		try {
			String str = br.readLine();

			String[] alphbet = initAlphabet();
//			다이얼의 알파벳을 초기화합니다.
			int[] num = new int[str.length()];
//			다이얼의 숫자를 저장 할 배열 변수를 선언합니다.
			for (int k = 0; k < str.length(); k++) {
//				입력 받은 문자열 길이만큼 반복합니다.
				for (int i = 0; i < alphbet.length; i++) {
//					0부터 9까지 반복합니다.
					for (int j = 0; j < alphbet[i].length(); j++) {
//						다이얼의 알파벳만큼 반복하고 입력 받은 값과 비교합니다.
						if (alphbet[i].charAt(j) == str.charAt(k)) {
							num[k] = i;
//							알파벳 인덱스 위치에 0-9까지 인덱스 값을 저장합니다.
						}
					}
				}
			}
			int sum = 0;
			for (int i : num) {
				sum += (i + 1) + 1;
//				첫번째 1은 0부터 시작하는 값을 보정합니다.
//				두번째 1은 1초를 더해 보정합니다.
			}

			bw.write(String.valueOf(sum));
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String[] initAlphabet() {
		String[] alphbet = new String[10];
		alphbet[0] = "";
		alphbet[1] = "ABC";
		alphbet[2] = "DEF";
		alphbet[3] = "GHI";
		alphbet[4] = "JKL";
		alphbet[5] = "MNO";
		alphbet[6] = "PQRS";
		alphbet[7] = "TUV";
		alphbet[8] = "WXYZ";
		alphbet[9] = "option";

		return alphbet;
	}
}
