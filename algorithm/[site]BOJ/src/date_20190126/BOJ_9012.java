package date_20190126;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ_9012 {
	// 괄호가 VPS인지 아닌지 확인하는 문제
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		Stack<String> s = new Stack<>();
		
		String str = "";
		int o = 0;
		int c = 0;
		String check ="";
		for(int i = 0 ; i < num; i++) {
			str = br.readLine();
			for(int j = str.length()-1 ; j >= 0 ; j--) {
				s.push(String.valueOf(str.charAt(j)));
			}
			
			
			while(!s.isEmpty()) {
				check = s.pop();
				if(check.equals("(")) {
					o++;
				}else if(check.equals(")")){
					c++;
				}else {
					System.out.println("에러");
				}
				
				if(o < c) {
					s.clear();
//					스택에 남아 있는 데이터를 삭제한다.
					break;
				}
			}
			if(o == c) {
				bw.write("YES");
			}else {
				bw.write("NO");
			}
			bw.newLine();
			o = 0;
			c = 0;
		}
		
		bw.close();
	}
}
