package date_20181210;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
public class BOJ_11718 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		List<String> strList = new ArrayList<String>();
		String str = "";
		while ((str = br.readLine()) != null) {
			strList.add(str);
		}

//		String str2 = "";
//		for(int i = 0; i < 100; i++) {
//			str2 = br.readLine();
//			if( str2 != null) {
//				strList.add(str2);
//			}
//		}

		for (int i = 0; i < strList.size(); i++) {
            bw.write(strList.get(i));
            bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
