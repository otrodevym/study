package date_20190118;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class BOJ_1181Test4 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		String[] str = new String[num];
		for(int i = 0; i < str.length; i++) {
			str[i] = br.readLine();
		}

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int temp = 0;
		for (int i = 0; i < str.length; i++) {
			temp = 0;
			for (int j = 0; j < str[i].length(); j++) {
				temp += str[i].charAt(j) - 48;
			}
			map.put(str[i], temp);
		}


		Iterator<String> iter = mapSort(map).iterator();
		while (iter.hasNext()) {
			bw.write(String.valueOf(iter.next()));
			bw.newLine();
		}
		
		bw.close();

	}

	public static List<String> mapSort(final HashMap<String, Integer> map) {
		List<String> list = new ArrayList<String>();
		list.addAll(map.keySet());

		Collections.sort(list, new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				Object ob1 = map.get(o1);
				Object ob2 = map.get(o2);
				if((int)ob2 > (int) ob1) {
					return 1;
				}else if( (int)ob2 < (int)ob1) {
					return -1;
				}else {
					return 0;
				}
			}
		});
		Collections.reverse(list);
		return list;
	}


}
