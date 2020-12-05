package date_20181214;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_111721 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String str = br.readLine();
			/* 런타임 에러
			bw.write(str.substring(0, 10));
			bw.newLine();
			for(int i =1 ; i< str.length()/10; i++) {
				bw.write(str.substring(i*10, (i+1)*10));
				bw.newLine();
			}
			bw.write(str.substring((str.length()/10)*10, str.length()));
			bw.flush();
			bw.close();
			*/
//			/*
			bw.write(str.charAt(0));
			for(int i = 1; i < str.length(); i++) {
				if(i%10 == 0) {
					bw.newLine();
				}
				bw.write(str.charAt(i));
			}
			bw.flush();
			bw.close();
//			*/
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
