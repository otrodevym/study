package date_20190120;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ_2581 {
	// 소수의 최솟값과 총 
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> s = new Stack<>();
		int check = 0 ;
		for(int i = m; i <= n; i++) {
			for(int j = 2; j <= i; j++) {
				if((i%j) == 0) {
					check++;
				}
				
				if(check > 1) {
					break;
				} // if
			} // for j
			if(check == 1) {
				s.push(i);
			}
			check = 0;
		} // for i
		
		int sum = 0;
		int temp = 0;
		int min = n;
		if(s.size() != 0) {
			while(!s.empty()) {
				temp = s.pop();
				sum += temp;
				if(min > temp) {
					min = temp;
				}
			}
			bw.write(String.valueOf(sum));
			bw.newLine();
			bw.write(String.valueOf(min));
		}else {
			bw.write("-1");
		}
		bw.close();
		
	} // main
} // class
