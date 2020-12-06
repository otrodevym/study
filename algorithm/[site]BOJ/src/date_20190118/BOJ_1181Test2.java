package date_20190118;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class BOJ_1181Test2 {

	public static void main(String args[]) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = { "but", "i", "wont", "hesitate", "no", "more", "no", "more", "it", "cannot", "wait", "im",
				"yours" };

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		int temp = 0;
		for (int i = 0; i < str.length; i++) {
			temp = 0;
			for (int j = 0; j < str[i].length(); j++) {
				temp += str[i].charAt(j) - 48;
			}
			map.put(temp, str[i]);
		}

//	Iterator iter = mapSort(map).iterator();

//	TreeMap<String, Integer> treeMap = new TreeMap<>(map);
		TreeMap<Integer, String> treeMap = new TreeMap<>(map);
		Iterator iter = treeMap.keySet().iterator();	// 오름차순
//		Iterator iter = treeMap.descendingKeySet().iterator(); // 내림차순
		

		while (iter.hasNext()) {
			Integer key = (Integer) iter.next();
			bw.write(String.valueOf(treeMap.get(key)));
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
				return ((Comparable) ob2).compareTo(ob1);
			}
		});
		Collections.reverse(list);
		return list;
	}

}