package date_20181220;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_1152 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String[] str = br.readLine().split(" ");
//			공백을 기준으로 분리하여 배열에 저장합니다.
			int count = 0;
//			문장을 세기위해 선언합니다.
			for(String i : str) {
//				배열을 순서대로 출력합니다.
				if(!i.equals(""))
//					빈 값이 아닌경우에만 문장의 개수를 세어 증분합니다.
					count++;
			}
			bw.write(String.valueOf(count));
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
