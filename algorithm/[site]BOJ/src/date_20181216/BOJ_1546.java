package date_20181216;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class BOJ_1546 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int num_len = Integer.parseInt(br.readLine()); // 길이 값을 입력 받는다.
			String[] num_list = br.readLine().split(" "); // 과목 점수를 입력 받는다.
			
			int max = 0;	// 최고 값을 저장한다.
			for(int i = 0; i < num_len; i++) { // 길이 값까지 1씩 증분한다.
				if(max < Integer.parseInt(num_list[i])) { // 최고 값과 과목 점수  값을 비교 한다.
					max = Integer.parseInt(num_list[i]); // 과목 점수가 최고 값보다 크면 과목 점수를 저장한다.
				}
			}
			
			double sum = 0;	// 평균을 구하기 위한 총 합을 저장한다. 
			for(int i = 0; i < num_len; i++) {	// 길이 값까지 1씩 증분한다.
				sum += Double.parseDouble(num_list[i])/max;	// 최고 값으로 과목 점수 값을 나눠서 총합에 저장한다.
			}
			double result = (sum/num_list.length)*100;	// 평균을 구하고 100을 곱해 정수화 한다.
			DecimalFormat df = new DecimalFormat(".##");	// 10^-2의 소수점을 선언한다.
			bw.write(df.format(result));	// 결과 값을 출력한다.
			
			bw.flush();
			bw.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
