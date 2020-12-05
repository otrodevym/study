package date_20181211;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_10430 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String[] str = br.readLine().split(" ");
			int A = Integer.parseInt(str[0]);
			int B = Integer.parseInt(str[1]);
			int C = Integer.parseInt(str[2]);
			
			bw.write(String.valueOf((A+B)%C));
			bw.newLine();
			bw.write(String.valueOf((A%C+B%C)%C));
			bw.newLine();
			bw.write(String.valueOf((A*B)%C));
			bw.newLine();
			bw.write(String.valueOf((A%C*B%C)%C));
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
