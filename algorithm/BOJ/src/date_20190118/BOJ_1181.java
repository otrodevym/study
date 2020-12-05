package date_20190118;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class BOJ_1181 {
	
	public static void main(String args[]) throws IOException {
		String[] str = testCase1();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		HashSet<String> set = new HashSet<>();
//		int num = Integer.parseInt(br.readLine());
//		String[] str = new String[num];
//		for(int i = 0; i < str.length; i++) {
//			str[i] = br.readLine();
//		}
		
		for(int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}
		String[] temp = new String[set.size()];
		set.toArray(temp);
		
		Arrays.sort(temp, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int length1 = o1.length();
				int length2 = o2.length();
				if(length1 == length2) {
					return o1.compareTo(o2);
				}else {
					return length1 - length2;
				}
			}
		});
		
		
		
		
		for(int i=0; i < temp.length; i++) {
			bw.write(String.valueOf(temp[i]));
			bw.newLine();
		}
		bw.close();
		
	}
	
	
	public static String[] testCase1() {
		String[] str = { "but", "i", "wont", "hesitate", "no", "more", "no", "more", "it", "cannot", "wait", "im",
				"yours" };

		return str;
	}
}
