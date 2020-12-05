package date_20181223;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_1011 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int num = Integer.parseInt(br.readLine());

			for (int i = 0; i < num; i++) {
				String[] str = br.readLine().split(" ");
				long x = Integer.parseInt(str[0]);
				long y = Integer.parseInt(str[1]);

				long result = calcFunc(x, y);

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

	private static long calcFunc(long x, long y) {
		/*
		01 : 1
		02 : 11
		1과 2를 제외하고 3부터 찾습니다.
		거리	 순열			횟수
		03 : 111		3
		04 : 121		3
		-------
		05 : 1211		4
		06 : 1221		4
		-------
		07 : 12211		5
		08 : 12311		5
		09 : 12321		5
		-------
		10 : 123211		6
		11 : 123221		6
		12 : 123321		6
		-------
		13 : 1233211	7
		14 : 1233221	7
		15 : 1233321	7
		16 : 1234321	7
		-------
		17 : 12343211	8
		18 : 12343221	8
		19 : 12343321	8
		20 : 12344321	8
		
	번호(n)  순열		최대값		횟수
	1		1		1		1
	2	   121		4		3
	3	  12321		9		5
	4	 1234321	16		7
	5	123454321	25		9
	6  12345654321	36		11
	7 1234567654321	49		13
	
	횟수는 번호(n)의 2n-1입니다.
	
	최대값이 거리보다 클때까지 번호를 증분합니다.
	
	ex)
	횟수가 짝수일 경우
	distance = 11일 경우, 횟수는 6 짝수이고 횟수 5와 7의 사이입니다.
	최대값 9보다 크고 최대값 16-4보다 작은 범위에 있습니다.
	9는 (n-1)^2 입니다.
	16-4는 n^2-n 입니다.
	
	횟수가 홀수일 경우
	distance = 13일 경우, 횟수는 7 홀수입니다.
	최대값이 16이랑 같거나 작고 16-4보다 큽니다.
	16은 n^2입니다.
	12는 n^2-n입니다.
	
		
		*/
		long distance = y - x;
//		x와 y의 거리를 구합니다. 

		int num = 1;
		
		int result = 0;
//		1과 2의 경우는 바로 반환합니다.
		if(distance == 1) {
			return 1;
		}else if(distance == 2){
			return 2;
		}
		
		while ((num * num) < distance) {
			num++;
//			 num을 거리보다 클 때까지 증분합니다.
			
//			위에서 작성한 범위를 찾고 해당하는 범위를 찾았으면 반복문을 멈추고 반환합니다.
//		횟수가 짝수 일경우
			if ((Math.pow((num-1),2) < distance) && 
					(distance <= ((int) Math.pow(num, 2) - num))) {
				result = (2 * num) - 1 -1;
//				홀수 일때보다 횟수가 1 적습니다.
				break;
			}else if ((((int) Math.pow(num, 2) - num) < distance) && 
					(distance <= ((int) Math.pow(num, 2)))) {
//		횟수가 홀수 일경우
				result = (2*num) -1;
//				홀수는 본인의 범위의 횟수를 반환합니다.
				break;
			}
		}
		return result;
	}

}
