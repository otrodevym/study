package date_20181210;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BOJ_10172 {
	public static void main(String args[]) {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			bw.write("|\\_/|");
			bw.newLine();
			bw.write("|q p|   /}");
			bw.newLine();
			bw.write("( 0 )\"\"\"\\");
			bw.newLine();
			bw.write("|\"^\"`    |");
			bw.newLine();
			bw.write("||_/=\\\\__|");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}