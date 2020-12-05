package date_20190117;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class BOJ_1427 {
// 자리수를 내림 차순으로 정렬한 뒤 출력한다.
	
	public static void main(String args[]) throws IOException {
		long start = System.currentTimeMillis();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		int num =  Integer.parseInt(br.readLine());
		Stack<Integer> s = new Stack<>();
		
		
		int temp = 0;
		while(num != 0) {
			temp = num%10;
			num = num/10;
			s.push(temp);
		}
		Integer[] arr = new Integer[s.size()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = s.pop();
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(Integer j : arr) {
			bw.write(String.valueOf(j));
		}
		bw.newLine();
		long end = System.currentTimeMillis();
		
		bw.write("time : " + (end-start)/1000.0);
		bw.close();
		
	}
}
