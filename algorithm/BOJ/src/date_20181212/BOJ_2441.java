package date_20181212;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2441 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int num = Integer.parseInt(br.readLine().split(" ")[0]);
			for(int i = 1; i <= num; i++){
				for(int k = 1; k < i; k++) {
					bw.write(" ");
				}
				for(int j = i; j <= num; j++) {
					bw.write("*");
				}
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
}
