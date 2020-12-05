package date_20181216;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_10817 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String[] str = br.readLine().split(" ");
			int num1 = Integer.parseInt(str[0]);
			int num2 = Integer.parseInt(str[1]);
			int num3 = Integer.parseInt(str[2]);
			
			if(((num1 <= num2) && (num1 >= num3)) || ((num1 >= num2) && (num1 <= num3))) {
				bw.write(String.valueOf(num1));
			}else if(((num2 <= num1) && (num2 >= num3)) || ((num2 >= num1) && (num2 <= num3))) {
				bw.write(String.valueOf(num2));
			}else if(((num3 <= num1) && (num3 >= num2)) || ((num3 >= num1) && (num3 <= num2))) {
				bw.write(String.valueOf(num3));
			}else {
				bw.write("error");
			}
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
