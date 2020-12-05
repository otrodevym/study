package date_20181221;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_10039 {
//	입력을 받고 40점 이하의 점수는 40점으로 변환 후 평균을 구합니다.
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		/* 배열에 넣고 풀은 문제
		 * try { int[] scores = new int[5]; for(int i = 0; i < scores.length; i++) {
		 * scores[i] = Integer.parseInt(br.readLine()); if(scores[i] < 40) { scores[i] =
		 * 40; } }
		 * 
		 * int avg = 0; for(int i = 0; i < scores.length; i++) { avg += scores[i]; } int
		 * result = avg/scores.length;
		 * 
		 * bw.write(String.valueOf(result)); bw.flush(); bw.close();
		 * 
		 * } catch (NumberFormatException e) { e.printStackTrace(); } catch (IOException
		 * e) { e.printStackTrace(); }
		 */
		
		
		/* 간단하게 풀은 문제
		*/
		try {
			int avg = 0;
			for (int i = 0; i < 5; i++) {
				int check = Integer.parseInt(br.readLine());
				if (check < 40) {
					check = 40;
				}
				avg += check;
			}
			bw.write(String.valueOf(avg / 5));
			bw.flush();
			bw.close();

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
