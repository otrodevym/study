package date_20181221;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_1157 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		System.out.println((int) 'a'); // 97
//		System.out.println((int) 'z'); // 122
//		System.out.println((int) 'A'); // 65
//		System.out.println((int) 'Z'); // 90
		
		try {
			String str = br.readLine();
//			문자열을 입력받습니다.
			int[] alphabetList = initAlphabet();
//			알파벳 리스트를 소문자 아스키코드로 초기화합니다.
			int[] alphabetCheck = alphabetCheck(str, alphabetList);
//			입력 받은 문자열과 알파벳 리스트를 비교합니다.(대소문자 포함) 
//			개수를 세어 alphabetCheck 정수형 배열에 저장합니다.
			int max = maxCheck(alphabetCheck);
//			개수를 세어 본 alphabetCheck 배열의 최고 값을 찾아 반환합니다.
			int duplicateMax = duplicateMaxCheck(alphabetCheck, max);
//			최고 값이 유일한지 확인합니다.
			
			if(duplicateMax > 1) {
//				유일하지 않으면 '?'를 출력하고 유일하지 않다면 최고 값을 찾아 출력합니다.
				bw.write("?");
			}else {
				for(int i = 0; i < alphabetCheck.length; i++) {
					if(max == alphabetCheck[i]) {
						bw.write(String.valueOf((char)alphabetList[i]));
					}
				}
			}
			
			bw.flush();
			bw.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static int[] initAlphabet() {
		int[] alphabet = new int[26];
		for(int i = 0; i < alphabet.length; i++) {
			alphabet[i] = 65+i;
		}
		return alphabet;
	}
	
	private static int maxCheck(int[] alphabetCheck) {
		int max = 0;
		for(int i : alphabetCheck) {
			if(max < i) {
				max = i;
			}
		}
		return max;
	}
	
	private static int duplicateMaxCheck(int[] alphabetCheck, int max) {
		int duplicateMax = 0;
		for(int i : alphabetCheck) {
			if(max == i) {
				duplicateMax++;
			}
		}
		return duplicateMax;
	}
	
	private static int[] alphabetCheck(String str, int[] alphabetList) {
		int[] alphabetCheck = new int[26];
		for(int j = 0; j < alphabetList.length; j++) {
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == alphabetList[j] || str.charAt(i) == (alphabetList[j]+32)) {
					alphabetCheck[j]++;
				}
			}
		}
		return alphabetCheck;
	}
}
