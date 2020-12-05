package date_20181211;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_1008 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
//			Test case1
			/*
			String[] str = br.readLine().split(" ");
			double num1 = (Double.parseDouble(str[0])) ;
			double num2 = (Double.parseDouble(str[1])) ;
			int result = (int)((num1 / num2) * 1000000000);
			
			bw.write(String.valueOf((double)result/1000000000));
			bw.flush();
			bw.close();
			*/
//			Test case2
			String[] str = br.readLine().split(" ");
			double num1 = (Double.parseDouble(str[0]));
			double num2 = (Double.parseDouble(str[1]));
			double result = (num1 / num2); 
			System.out.printf("%.9f", result);
			
			System.out.printf("%.2f", 17.3456);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
