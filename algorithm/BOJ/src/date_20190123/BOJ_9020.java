package date_20190123;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_9020 {
//	2보다 큰 짝수는 두 소수의 합으로 표현 가능하다.
//	4<=n<=10,000

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		int input[] = new int[num];
		for (int i = 0; i < num; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}

		// 소수 만들기
		int[] arr = new int[10000 + 1];

		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			for (int j = 2; j * i < arr.length; j++) {
				arr[j * i] = 1;
			}
		}

		// 합 연산하기
		int check = 0;
		int i = 0; // 배열의 인덱스
		int j = 0; // 합을 위한 첫번째 값
		int k = 0; // 합을 위한 두번째 값
		int mid = 0; // 중간 값 임시 저장
		int sum = 0; // 두 소수의 합 저장
		int[][] result = new int[num][2];
		while (check != num) {
			mid = input[i] / 2;

			if (arr[mid] == 0) {
				j = mid;
				k = mid;
				sum = j + k;
			} else {
//				j = mid -1;
				/*for (int o = mid; o > 0; o--) {
					if (arr[o] == 0) {
						j = o;
						break;
					}
				}*/
				j = primeCheckDecrease(mid, 0, arr);
				
//				k = mid +1;
				/*
				 * for(int p = mid; p < arr.length; p++) { if(arr[p] == 0) { k = p; break; } }
				 */
				k = primeCheckIncrease(mid, arr.length, arr);
				sum = j + k;
			}
			while (sum != input[i]) {
				if (sum > input[i]) {
//					j--;
					/*for (int o = j - 1; o >= 0; o--) {
						if (arr[o] == 0) {
							j = o;
							break;
						}
					}*/
					j = primeCheckDecrease(j-1, 0, arr);
					
				} else if (sum < input[i]) {
//					k++;
					/*
					 * for(int p = k+1; p <= arr.length; p++) { if(arr[p] == 0) { k = p; break; } }
					 */
					k = primeCheckIncrease(k+1, arr.length, arr);
				} else {
					System.out.println("심각한 에러");
				}
				sum = j + k;
			}
			if (sum == input[i]) {
				result[i][0] = j;
				result[i][1] = k;
			}
			check++;
			i++;
		}

		for (int q = 0; q < num; q++) {
			bw.write(String.valueOf(result[q][0] + " " + result[q][1]));
			bw.newLine();
		}
		bw.close();
	}

	public static int primeCheckIncrease(int index, int length, int[] arr) {
		int result = 0;
		for (int p = index + 1; p <= length; p++) {
			if (arr[p] == 0) {
				result = p;
				break;
			}
		}
		return result;
	}

	public static int primeCheckDecrease(int index, int length, int[] arr) {
		int result = 0;
		for (int o = index - 1; o >= length; o--) {
			if (arr[o] == 0) {
				result = o;
				break;
			}
		}
		return result;
	}

}
