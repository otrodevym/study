package date_20181216;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_1110 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int num = Integer.parseInt(br.readLine());
			int num_save = num;
//			초기 입력 값을 저장한다.
			int sum = 0;
			int tan_num = 0;
			int one_num = 0;
			int count = 0;
			boolean s = true;
//			반복문의 switch 역할을 한다.
			while(s) {
				tan_num = num / 10;	
//				 10의 자리를 10의로 나누어 1의 자리로 구한다.
				one_num = num % 10;	
//				 1의 자리를 10의 나머지로 1의 자리를 구한다.
				sum = tan_num + one_num;	
//				 십의 자리와 1의 자리를 더한다.
				num = (one_num * 10) + (sum%10) ;
//				1의 자리에 10을 곱하여 10의 자리로 만들고 sum값을 10의 나머지를 구해 1의 자리와 더해 새로운 수로 만든다. 
				count++;
//				몇번을 순회하는지 세어 저장한다.
				if(num_save == num) {
//				초기 num 값과 새로운 값이 같으면 반복문을 종료한다.
					s= false;
				}
			}
			bw.write(String.valueOf(count));
			bw.flush();
			bw.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
