package date_20181216;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_10871 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String[] str = br.readLine().split(" ");
			int num_len = Integer.parseInt(str[0]);
			int num_std = Integer.parseInt(str[1]);
			
			String[] num_list = br.readLine().split(" ");
			
			for(int i = 0; i < num_len; i++) {
				if(num_std > Integer.parseInt(num_list[i])) {
					bw.write(String.valueOf(num_list[i]));
					bw.write(" ");
				}
			}
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
