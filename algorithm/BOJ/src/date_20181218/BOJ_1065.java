package date_20181218;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/*
 * 1. N을 입력 받는다.
 * 2. 1~N까지 등차 수열인지 각각 확인한다.
 * 3. 123이 입력되었다면 1 -> 2 -> 3 공차는 1인 등차 수열이다.
 * 		123이 입력 되었다는 가정으로 의사 코드를 작성한다.
 * 4. 100, 10, 1의 자리를 구분 하는 방법
 * 	4-1 int 배열과 String.charAt(i)으로 각각 한 문자씩 저장한다.
 * 	4-2 10 나누기 10 나머지를 이용하여 자리수를 1의 자리수로 저장한다.
 * 5. 1과 2, 2와 3을 빼주어 등차 수열인지 확인한다.
 * 		1-2 = -1, 3-2 = -1 
 * 6. 뺀 값이 동일하다면 등차 수열이 맞으므로 카운트한다. 
*/

public class BOJ_1065 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int inputNum = Integer.parseInt(br.readLine());
//			
			
			int count = 0;
			for(int i = 1; i <= inputNum; i++) {
				count += arrayCheck(i);
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


	private static int arrayCheck(int calcNum) {
//		System.out.println("-----------start----------------");
//		System.out.println("입력 받은 수 : " + calcNum);
		String strNum = String.valueOf(calcNum);
		int[] numList = new int[strNum.length()-1];
//		System.out.println("각 항의 길이 : " + strNum.length());

		
		int temp = strNum.charAt(0)-48;
		for(int i = 1; i < strNum.length(); i++) {
			numList[i-1] = temp - (strNum.charAt(i) - 48);
//			System.out.println("앞 뒤 숫자를 뺀 값 : " + numList[i-1]);
			temp = strNum.charAt(i)-48;
		}
		
		
		
		boolean check = true;
		for(int i = 1; i < numList.length; i++) {
			if(numList[i-1] == numList[i]) {
//				System.out.println("같아요");
			}else {
//				System.out.println("달라요");
				check = false;
			}
		}
		
//		System.out.println("-------------end--------------");
		if(check) {
			return 1;
		}else {
			return 0;
		}
	}
}
