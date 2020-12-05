package date_20181222;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2941 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			String str = br.readLine();
			int result = checkStr(str);
			bw.write(String.valueOf(result));
			bw.flush();
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int checkStr(String str) {
		String[] croatia = croatiaStr();
//		크로아티아 문자를 배열로 선언합니다.

		for (int j = 0; j < croatia.length; j++) {
			str = str.replace(croatia[j], "1");
//			해당하는 문자를 1로 치환합니다.
		}
		return str.length();
//		길이를 반환합니다.
	}

	private static String[] croatiaStr() {
		String[] croatia = new String[8];
		croatia[0] = "c=";
		croatia[1] = "c-";
		croatia[2] = "dz=";
		croatia[3] = "d-";
		croatia[4] = "lj";
		croatia[5] = "nj";
		croatia[6] = "s=";
		croatia[7] = "z=";

		return croatia;
	}
}
