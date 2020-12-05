package date_20190125;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ_1874 {
//	 스택 수열 문제
//	1부터 n까지의 값을 나열하여 스택에 저장했다가 출력하는 문제
//	입력 n 8
//	4 : +++-
//	3 : -
//	6 : ++-
//	8 : ++-
//	7 : -
//	5 : -
//	2 : -
//	1 : -
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		int[] input = new int[num];
		for (int i = 0; i < num; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}

		Stack<Integer> s = new Stack<>();

//		Queue<String> q = new LinkedList<>();
		StringBuilder str = new StringBuilder();
		int[] compare = new int[num];

		int i = 0;
		int p = 0;
		int j = 0;

//		while(q.size() < (num*2)) {
		while (i != num) {
			if (s.empty() || s.peek() < input[i]) {
				for (int k = p; k < input[i]; k++) {
					s.push(k + 1);
//					q.add("+");
//					bw.write("+");
//					bw.newLine();
					str.append("+\n");
				}
				p = input[i];
			} else if (s.peek() == input[i]) {
				compare[j] = s.pop();
				j++;
				i++;
//				q.add("-");
//				bw.write("-");
//				bw.newLine();
				str.append("-\n");
			} else {
//				s.pop();
//				q.add("-");
//				bw.write("-");
//				bw.newLine();
//				str.append("-\n");
//				System.out.println("--qqqqqqqqq");
				bw.write("NO");
				break;
			}
		}

		boolean check = true;
		for (int r = 0; r < input.length; r++) {
			if (compare[r] != input[r]) {
				check = false;
				break;
			}
		}

		if (check) {
			/*
			 * while(!q.isEmpty()) { bw.write(q.poll()); bw.newLine(); }
			 */
			bw.write(str.toString());
		} else {
			
//			System.out.print("NO");
		}
		bw.close();

	}
}
