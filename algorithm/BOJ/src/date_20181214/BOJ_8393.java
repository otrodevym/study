package date_20181214;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_8393 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int num = Integer.parseInt(br.readLine().split(" ")[0]);
			int sum = 0;
			/* Test case1			
			 * i부터 num까지 반복하여 sum에 합한다.
			 * O(n)
			 */
//			for (int i = 1; i <= num; i++) {
//				sum += i;
//			}
			
			/* Test case2
			 * 홀수 짝수에 따라 규칙을 찾았다.
			 * 10x(10/2)+(10/5) = 55
			 * 1+2+3+4+5+6+7+8+9+10 = 55
			 * O(1)
			*/
			if(num%2 == 0) {
				sum = num * (num/2) +(num/2);
			}else {
				sum = num * (num/2) + num;
			}
			
			bw.write(String.valueOf(sum));
			bw.flush();
			bw.close();

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
