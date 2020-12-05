package date_20181224;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_10250 {
	public static void main(String agrs[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int num = Integer.parseInt(br.readLine());
			String result = "";
			for(int i = 0; i < num; i++) {
				String[] strNum = br.readLine().split(" ");
				result= calc(strNum);
				bw.write(result);
				bw.newLine();
			}
			
			bw.flush();
			bw.close();
			
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static String calc(String[] strNum) {
		int h = Integer.parseInt(strNum[0]); // 층의 개수
		int w = Integer.parseInt(strNum[1]); // 방의 개수
		int n = Integer.parseInt(strNum[2]); // n번째 손님 
		
		int count = 0;
		String result = "";
		aFor : for(int i = 1; i <= w; i++) {
//			방의 개수를 1호부터 반복합니다.
			for(int j = 1; j <= h; j++) {
//				층의 개수를 1층부터 반복하여 h층까지 반복후 방의 개수를 1늘립니다.
				count++;
//				채워진 방의 개수를 세어 저장합니다.
				if(count == n) {
					if(i/10 == 0) {
//						방 번호가 10으로 나누어 떨어지지 않으면 0을 붙여줍니다.
						result = j+"0" + i;
					}else {
						result = j+"" + i;
					}
					break aFor;
				}
			}
		}
		
		
		
		return result;
	}
}
