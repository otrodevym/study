package date_20181222;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_1316 {
//	1. 문자열을 하나씩 저장합니다.
//	2. 저장한 문자열을 배열에 1로 체크합니다.
//	3. 만약 이전에 나온 문자열이라면 count하지 않습니다.
//	4. 단, 연속 되어진 숫자라면 count 합니다.
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		System.out.println((int) 'a'); //97 
//		System.out.println((int) 'z'); //122
		try {
			int num = Integer.parseInt(br.readLine());
//			반복 할 양을 정할 값을 입력받습니다.
			int count = 0;
			for(int i = 0; i < num; i++) {
				String str = br.readLine();
				int[] alphabetList = initList();
//				alphabetList를 아스키코드로 초기화 값을 초기화 합니다.
				count += checkStr(str, alphabetList);
//				반환 받은 값을 누적하여 저장합니다.
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
	
	
	private static int checkStr(String str, int[] alphabetList) {
		for(int i = 0; i < str.length(); i++) {
			alphabetList[str.charAt(i)-97] +=1;
		}
//		문자열의 문자를 아스키코드로 변환하여 0~25까지 만듭니다.
//		alphbetList의 인덱스에 해당하는 알바펫의 숫자를 세어 저장합니다.
		
		for(int i = 0; i < alphabetList.length; i++) {
//		alphabetList만큼 반복합니다.
			if(alphabetList[i] > 1) {
//				alphabetList의 배열 값 중 1보다 큰 값을 찾아냅니다.
				String alphabet = String.valueOf((char)(i+97));
//				해당하는 배열의 값을 아스키코드화 하여 alphabet에 저장합니다.
				for(int j = 1; j < alphabetList[i]; j++) {
//				 	alphabet은 첫 번째 알파벳이므로 다음 알파벳부터 비교합니다.
					if(alphabet.equals(String.valueOf(str.charAt(str.indexOf(alphabet)+j)))){
//						알파벳의 위치를 찾아 j를 더해 다음 문자를 가져온 후 String으로 변환하여 비교합니다.
//						같으면 다음 반복을 진행하고 다르면 0을 반환합니다.
						continue;
					}else {
						return 0;
					}
				}
			}
		}
		
		return 1;
	}
	
	private static int[] initList() {
		int[] init = new int[26];
		return init;
	}
}
	