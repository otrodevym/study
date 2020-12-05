package date_20190122;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BOJ_4948 {
// 주어진 수의 n부터 2n까지의 소수를 구하라
// n <=123456
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		int[] num = {1, 10, 13, 100, 1000, 10000, 100000};
		String check = "";
		Queue<Integer> q = new LinkedList<>(); 
		while(!(check = br.readLine()).equals("0")) {
			q.add(Integer.parseInt(check));
		}
		
		int[] num = new int[q.size()];
		for(int i= 0; i < num.length; i++) {
			num[i] = q.poll();
		}
		
		
		// 최대 값 찾기
		int max = 0;
		for(int i = 0; i < num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
		}
		max = max * 2;
		// 소수만 체크하기 1은 소수 아니고 0은 소수
		int[] arr = new int[max+1];
		for(int i = 2; i <= max+1; i++) {
			for(int j = 2; j * i <= max; j++) {
				arr[j*i] = 1;
			}
		}
		arr[0] = 1;
		arr[1] = 1;
		int[] count = new int[num.length];
		for(int i = 0; i < num.length; i++) {
			int n = num[i] + 1;
			for(int j = n; j < (2 *n) -1; j++) {
				if(arr[j] == 0) {
					count[i]++;
				}
			}
		}
		
		for(int i = 0; i < count.length; i++) {
			bw.write(String.valueOf(count[i]));
			bw.newLine();
		}
		
		bw.close();
		
		
	}
}
