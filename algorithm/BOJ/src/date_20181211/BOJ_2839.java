package date_20181211;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2839 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int num = Integer.parseInt(br.readLine().split(" ")[0]);
				int bong5_remainder = num % 5;
				int result = 0;

				if (num == 3) {
					result = 1;
				} else if(num != 4 && num !=7) {
					switch (bong5_remainder) {
					case 0:
						result = (num / 5);
						break;
					case 1:
						result = (num / 5) + 1;
						break;
					case 2:
						result = (num / 5) + 2;
						break;
					case 3:
						result = (num / 5) + 1;
						break;
					case 4:
						result = (num / 5) + 2;
						break;
					default:
						result = -1;
					}
				}else {
					result = -1;
				}
				bw.write(String.valueOf(result));
				bw.newLine();

			bw.flush();
			bw.close();

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
