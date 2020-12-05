package date_20181221;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_10809 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		bw.write(97); // a
//		bw.write(122); //z

		try {
			String str = br.readLine();
//			입력 받은 문장을 저장합니다.
			int[] alphabet = initAlphabet();
//			알바펫을 아스키 코드로 초기화 합니다.
			int[] list = new int[26];
//			비교 후 저장 할 배열 변수를 선언합니다.

			for (int j = 0; j < alphabet.length; j++) {
				list[j] = -1;
//				비교 후 저장 할 배열 변수를 -1로 초기화 합니다.
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) == (char) alphabet[j] &&  list[j] == -1) {
//						입력 받은 문자와 아스키 코드로 초기화 한 배열을 비교하고 같은 경우와 -1이 아닌경우에만 저장합니다. 
						list[j] = i;
					}
				}
			}
			
			for(int i : list) {
				bw.write(String.valueOf(i));
				bw.write(" ");
			}

			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int[] initAlphabet() {
		int[] alphabet = new int[26];
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = 97 + i;
		}
		return alphabet;
	}

}
