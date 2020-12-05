package date_20181223;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_1193 {
	public static void main(String args[]) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int num = Integer.parseInt(br.readLine());
			String result = fractionalNumbers(num);
			bw.write(result);
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static String fractionalNumbers(int num) {
		int molecule = 1;	// 분자
		int denominator = 1;	// 분모
		
		boolean check = true;
		
		String result = "";
		
		if(num ==1) {
			result = molecule +"/"+denominator;
			return result;
		}
//		첫 번째 값이면 바로 반환합니다.
		
		int level = 2;
//		두 번째 값부터 확인합니다.
		int count = 1;
//		첫 번째 값을 세었다는 가정하에 저장합니다.
		
		while(check) {
//			1레벨일 때 1/1
//			2레벨일 때 1/2, 2/1
//			3레벨일 때 3/1, 2/2, 1/3
//			1차,2차로 구분하여 체크합니다.
//			1차는 각 레벨의 첫 번째 인덱스를 셋팅 및 확인합니다.
//			2차는 각 레벨의 두 번째 인덱스부터 i번째까지 셋팅 및 확인합니다. 
			
			
//			1차
			if(level % 2 == 0) {
//				레벨 값이 짝수이면 분모는 i로, 분자는 1로 시작합니다.
				molecule = 1;
				denominator = level;
			}else if(level % 2 != 0) {
//				레벨 값이 홀수이면 분모는 1로, 분자는 i로 시작합니다.
				molecule = level;
				denominator = 1;
			}else {
				
			}
			count++;
			if(num == count) {
				check =false;
				result = molecule +"/"+denominator;
				return result;
			}
			
//			2차
			for(int j = 1; j < level; j++) {
//				첫 번쨰를 제외하고 레벨까지 확인합니다.
				if(level % 2 == 0) {
//					짝수이면 분모는 -1씩 더하고, 분자는 +1씩 더합니다.
					molecule += 1;
					denominator += -1;
				}else if(level % 2 != 0) {
//					홀수이면 분모는 +1씩 더하고, 분자는 -1씩 더합니다.
					molecule += -1;
					denominator += 1;
				}else {
					
				}
				count++;
				if(num == count) {
					check =false;
					result = molecule +"/"+denominator;
					return result;
				}
			}
			level++;
		}
		return result;
	}

}
