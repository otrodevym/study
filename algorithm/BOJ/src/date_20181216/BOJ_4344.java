package date_20181216;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class BOJ_4344 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int num_len = Integer.parseInt(br.readLine());	
//			 몇 행을 만들지 입력 값을 받는다.
			
			int col_len = 0;	
//			 열의 길이를 저장한다.
			String[] str = new String[num_len];	
//			 열의 정보를 배열에 저장한다.
			int sum = 0;	
//			 총 합을 저장한다.
			double avg = 0;	
//			 평균을 저장한다.
			int avg_cnt = 0;	
//			 평균을 초과하는 학생을 세어 저장한다.
			double result = 0;	
//			 결과를 저장한다.
			
			
			for(int i = 0; i < num_len; i++) {
//				첫 번째 입력 값만큼 반복한다.
				str = br.readLine().split(" ");
//				학생 수와 과목 점수를 받아 str배열로 저장한다.
				col_len= Integer.parseInt(str[0]);
//				str배열에 저장한 점수 중 첫 번째 열에 있는 점수 학생 수를 col_len에 저장한다.
				for(int j = 1; j <= col_len; j++) {
//					배열의 두번 째 값이 1부터 하며 학생수와 같을 때 까지 1씩 증분한다. 
					sum += Integer.parseInt(str[j]);
//					과목 점수를 총합에 합하여 저장한다.
				}
				avg = sum/(col_len);
//				총합과 학생수를 평균 낸다.
				for(int k = 1; k <=col_len; k++) {
//					배열의 두번 째 값이 1부터 하며 학생수와 같을 때 까지 1씩 증분한다. 
					if(avg < Integer.parseInt(str[k]) ) {
//						평균을 초과 하는 학생을 비교하고 넘는다면 인원수를 증분한다.
						avg_cnt++;
					}
				}
				result = ((double)(avg_cnt)/(col_len))*100;
//				평균이 넘는 학생수와 학생수를 나누어 결과로 출력한다.
				System.out.printf("%.3f", result);
				System.out.println("%");
				avg_cnt = 0;
				sum = 0;
				avg = 0;
				result = 0;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
