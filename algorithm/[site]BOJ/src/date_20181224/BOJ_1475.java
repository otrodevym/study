package date_20181224;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_1475 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] num = new int[10];
//		9를 제외하고 구할 예정이지만 헷갈릴 수 있으니 0-9까지 선언합니다.
		try {
			String strNum = br.readLine();
			for(int i =0; i < strNum.length(); i++){
				if((strNum.charAt(i) == '6') || strNum.charAt(i) == '9') {
//					6이나 9이면 6번째 인덱스를 증가시킵니다.
					num[6]++;
				}else {
					int idx = strNum.charAt(i)-48;
//					숫자에 해당하는 인덱스의 숫자를 증분합니다.
					num[idx]++;
				}
			}
			num[6] = (num[6] / 2) + (num[6]%2);
//			한 세트에 2개를 쓸 수 있으므로 6번째 인덱스의 몫과 나머지를 2로 구합니다.
			int max = num[0];
			for(int i = 1; i < num.length; i++) {
//				최고 값을 구합니다.
				max = Math.max(max, num[i]);
			}
			
			bw.write(String.valueOf(max));
			
			bw.flush();
			bw.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
