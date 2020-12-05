package date_20181215;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_9498 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int num = Integer.parseInt(br.readLine());
			if((num >=90) && (num <=100)) {
				bw.write("A");
			}else if((num >= 80) && (num <= 89)) {
				bw.write("B");
			}else if((num >= 70) && (num <= 79)) {
				bw.write("C");
			}else if((num >=60) && (num <=69)) {
				bw.write("D");
			}else {
				bw.write("F");
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
