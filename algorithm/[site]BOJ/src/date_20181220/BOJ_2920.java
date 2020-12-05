package date_20181220;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2920 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String[] scals = br.readLine().split(" ");
//			음계를 입력 받습니다.
			String[] strScals = new String[2];
			strScals[0] = "12345678";
			strScals[1] = "87654321";
//			입력 받을 데이터를 알고 있으므로 비교 할 데이터를 선언합니다.
			
			boolean ascending = true;
			boolean descending = true;
//			비교 여부를 확인 할 변수들을 선언합니다.
			for(int i = 0; i < scals.length; i++) {
//				음계 만큼 반복합니다.
				 if(!scals[i].equals(String.valueOf(strScals[0].charAt(i)))) {
					 ascending = false;
				 }
//				 ascending 음계와 하나라도 다르다면 거짓으로 변경합니다.
				 if(!scals[i].equals(String.valueOf(strScals[1].charAt(i)))) {
					 descending = false;
				 }
//				 descending 음계와 하나라도 다르다면 거짓으로 변경합니다.
				 if(!ascending && !descending){
					 break;
				 }
//				 asceding과 descending이 모두 거짓이라면 반복문을 종료합니다.
			}
			if(ascending) {
				bw.write("ascending");
			}else if(descending) {
				bw.write("descending");
			}else {
				 bw.write("mixed");
			 }
//			참인 내용을 출력하고 참이 없다면 "mixed"를 출력합니다.
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
