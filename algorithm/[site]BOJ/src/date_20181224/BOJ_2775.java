package date_20181224;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2775 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int num = Integer.parseInt(br.readLine());
			int result = 0;
			for (int i = 0; i < num; i++) {
				int num1 = Integer.parseInt(br.readLine());
				int num2 = Integer.parseInt(br.readLine());

				result = calc(num1, num2);
				bw.write(String.valueOf(result));
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

	private static int calc(int num1, int num2) {
//		num1 : 층수
//		num2 : 호
//		2층	01	04	10	20  35	56	84	120	165	220
//		1층	01  03  06  10  15  21  28  36  45  55 
//		0층	01  02  03  04  05  06  07  08  09  10 
		int[][] apartment = new int[15][15];

		for (int j = 1; j <= apartment[0].length; j++) {
//			0층에 대한 초기화를 합니다. j-1로 0층 1호(0번째) 인덱스를 선택하여 j를 증분하여 저장합니다.
			apartment[0][j-1] = j;
		}
		if(num1 == 0 ) {
//			층수가 0층이면 바로 반환합니다.
			return num2;
		}
		
		for (int i = 1; i <= num1; i++) {
//			층수가 1층 이상부터 1씩 증분합니다.
			for (int j = 0; j < num2; j++) {
//				호수를 0부터 1씩 증분합니다.
//				이전 층 num2-1의 합을 저장 할 변수를 선언합니다.
				
//				해당 층수와 호수에 맞게 저장합니다.
				apartment[i][j] = sum(j,i,apartment);
			}
		}
		return apartment[num1][num2-1];
	}
	
	private static int sum(int j, int i, int[][] apartment) {
		int sum = 0;
		for(int k = 0; k <= j; k++) {
//			현재 층의 호수의 사람수를 저장하기 위해 이전 층의 사람수를 누적합니다.
			sum += apartment[i-1][k]; 
		}
		return sum;
	}
}
