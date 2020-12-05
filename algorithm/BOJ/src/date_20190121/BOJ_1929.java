package date_20190121;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_1929 {
	public static void main(String args[]) throws IOException {
		long start = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] num = br.readLine().split(" ");
		
		int m = Integer.parseInt(num[0]);
		int n = Integer.parseInt(num[1]);
		

		int[] arr = new int[n+1];
		
		for(int i = 2; i <= n+1; i++) {
			for(int j = 2; j * i <= n; j++) {
				arr[i*j] = 1;
			}
		}
		
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i = m; i < arr.length; i++) {
			if(arr[i] == 0) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}
		
		long end = System.currentTimeMillis();
		bw.newLine();
		bw.write(String.valueOf((end - start) / 1000.0));
		bw.close();
		
	}
}
