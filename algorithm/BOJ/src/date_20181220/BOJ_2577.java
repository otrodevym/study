package date_20181220;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2577 {
//	한자리 씩 데이터를 가져와서 해당 숫자가 몇인지 확인하고 개수를 세어봅니다.
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int num1 = Integer.parseInt(br.readLine());
			int num2 = Integer.parseInt(br.readLine());
			int num3 = Integer.parseInt(br.readLine());
//				int num1 = 150;
//				int num2 = 266;
//				int num3 = 427;
//				17037300
			int[] numList = numCheck(num1, num2, num3);
//			입력 받은 3개의 숫자를 함수에게 전달하고 정수형 배열을 반환받습니다.

			for (int i : numList) {
//				배열을 출력합니다.
				bw.write(String.valueOf(i));
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

	private static int[] numCheck(int num1, int num2, int num3) {
		int mul = num1 * num2 * num3;
//		3개의 숫자를 곱합니다..
		int[] count = new int[10];
//		0-9까지의 배열을 선언합니다.
		int temp = 0;
//		나머지를 저장할 변수를 선언합니다.

		while (mul != 0) {
			temp = mul % 10;
//			1의 자리를 구합니다.
			mul = mul / 10;
//			1의 자리를 제거합니다.
			switch (temp) {
//			구한 1의 자리의 숫자에 맞는 배열을 찾아 증분합니다.
			case 0:
				count[temp]++;
				break;
			case 1:
				count[temp]++;
				break;
			case 2:
				count[temp]++;
				break;
			case 3:
				count[temp]++;
				break;
			case 4:
				count[temp]++;
				break;
			case 5:
				count[temp]++;
				break;
			case 6:
				count[temp]++;
				break;
			case 7:
				count[temp]++;
				break;
			case 8:
				count[temp]++;
				break;
			case 9:
				count[temp]++;
				break;
			}
		}
		return count;
	}
}
