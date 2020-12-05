package date_20181217;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BOJ_4673 {
	public static void main(String args[]) {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		/*
		 * 9까지는 2씩 증가 9부터 11 증가 : 정답과 결과 값이 다르다. 규칙이 있을까 해서 확인해 봤다.
		 */
		/*
		 * for(int i = 20; i < 10000; i+=11) { try { bw.write(String.valueOf(i));
		 * bw.newLine(); } catch (IOException e) { // 
		 * e.printStackTrace(); } }
		 */
		int[] noSelfNum = new int[10000];
//		구하고자 하는 양만큼의 배열을 선언했다.
		
		int check = 0;
//		셀프 넘버가 아닌 숫자를 저장한다.
		for (int i = 0; i < noSelfNum.length; i++) {
//			구하고자 하는 양만큼 1씩 증분하여 반복한다.
			check = noSelfNumber((i+1), (i+1));
//			재귀함수를 호출하여 셀프 넘버가 아닌 숫자를 구하고 check변수에 저장한다. 1부터 시작하므로 i에 1을 더해준다
			if(noSelfNum.length > check) {
//				셀프 넘버가 아닌 숫자가 구하고자 하는 양을 넘었는지 체크한다.
				noSelfNum[check] = -1;
//				넘지 않았다면 셀프 넘버에 -1을 입력한다. 이는 셀프 넘버가 아닌 배열의 위치를 기록한다.
			}
		}
		for (int i = 1; i < noSelfNum.length; i++) {
//			1부터 구하고자 하는 숫자의 양만큼 1씩 증분하여 반복한다.
			try {
				if(noSelfNum[i] != -1) {
//					배열에서 -1이 입력 된 값이 아닌 값을 확인하고 출력한다.
					bw.write(String.valueOf(i));
					bw.newLine();
				}
					
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int noSelfNumber(int number, int sum) {
//		셀프 넘버가 아닌 숫자를 호출하는 재귀 함수이며 number은 연산해야 하는 변수, sum은 더해야 하는 변수이다.
//		ex) 125 : 125/10=12 125%10=5 -> (재귀 호출) 12/10=1 12%10=2 -> (재귀호출) 1/10=0 1%10=1 
//						sum = 125 + 5     			sum = 130 + 2 			sum = 132 + 1 
		int tan = 0;
//		10의 자리를 저장한다.
		int one = 0;
//		1의 자리를 저장한다.
		tan = number / 10;
//		입력 받은 수를 나누어 10의 자리를 구하여 저장한다.
		one = number % 10;
//		입력 받은 수의 나머지인 1의 자리를 구하여 저장한다.
		sum += one;
//		누적되는 값을 가지고 있는 sum 변수와 1의 자리를 더한다.
		if(tan !=0) {
//			10의 자리가 0이 아니라면 재구 함수를 호출한다.
			return noSelfNumber(tan, sum);
//			10의 자리가 1이 될 때까지 반복해야 하므로 number 대신 tan을 넣어준다.
		}
		return sum;
//		누적 값을 반환한다.
	}
	
//	완성 되지 않은 코드이다.
//	1. 셀프넘버가 아닌 숫자를 찾는다.
//	2. 1-100까지 숫자 중에서 셀프 넘버가 아닌 숫자를 찾아서 제거한다.
//	3. 남은 셀프 넘버 숫자만 출력한다.
//	1-3번 순으로 개발 하려고 만든 함수이지만 애초에 셀프 넘버가 아닌 숫자를 표시하고 출력 하면 된다고 생각을 바꾸고 위에처럼 풀었다.
	/*public static int SelfNumber(int[] noSelfNum) {
		int[] checkNum = new int[100];
		int[] SelfNum = new int[100]; 
		int checkNumI = 0;
			for(int i = 0; i < noSelfNum.length; i++){
				if(noSelfNum[i] != i) {
					checkNum[i] = i;
					checkNumI++;
				}
			}
		return 0;
	}*/
}
