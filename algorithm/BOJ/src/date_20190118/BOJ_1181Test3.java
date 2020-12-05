package date_20190118;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_1181Test3 {
	public static void main(String args[]) {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = { "but", "i", "wont", "hesitate", "no", "more", "no", "more", "it", "cannot", "wait", "im",
				"yours" };

		List<String> list = new ArrayList<String>();

		for (int i = 0; i < str.length; i++) {
			list.add(str[i]);
		}

		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
