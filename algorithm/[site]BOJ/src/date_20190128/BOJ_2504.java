package date_20190128;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ_2504 {
//	입력 되는 괄호가 올바른지 확인하고 연산한다.
//	() 는 2
//	[] 는 3

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();

		Stack<String> s = new Stack<>();

		boolean check = true;
		int sum = 0;
		int temp = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				s.push("(");
				temp *= 2;
			} else if (str.charAt(i) == '[') {
				s.push("[");
				temp *= 3;
			} else if (!s.empty() && str.charAt(i) == ')') {
				if(str.charAt(i -1 ) == '(') {
					sum += temp;
				}
				if (s.peek().equals("(")) {
					s.pop();
				} else {
					check = false;
					break;
				}
				temp /= 2;
			} else if (!s.empty() && str.charAt(i) == ']') {
				if(str.charAt(i -1 ) == '[') {
					sum += temp;
				}
				if (s.peek().equals("[")) {
					s.pop();
				} else {
					check = false;
					break;
				}
				temp /=3;
			} else {
//				System.out.println("에러 발생");
				check = false;
			}

		}
		if (check && s.empty()) {
			bw.write(String.valueOf(sum));
		} else {
			bw.write("0");
		}

		bw.close();
	}
}
