package date_20181219;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2448 {
	
	
	static String[][] arr;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String args[]) {
		
		
		try {
			int n = Integer.parseInt(br.readLine());
			int len = (n*2)-1;
//			0 1 2
//			0 1 2 3 4 
			arr = new String[n][len];
			arr = initArr(arr);
			star(n, (len/2), 0);
			printCall(arr);
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void star(int n, int x, int y) {
		if(n == 3) {
			arr[y][x] = "*";
			arr[y+1][x-1] = "*";
			arr[y+1][x+1] = "*";
			arr[y+2][x] = "*";
			arr[y+2][x+1] = "*";
			arr[y+2][x+2] = "*";
			arr[y+2][x-2] = "*";
			arr[y+2][x-1] = "*";
			return ;
		}
		
		star(n/2, x, y);
		star(n/2, x - (n/2), y + (n/2));
		star(n/2, x + (n/2), y + (n/2));
		
		
		
	}
	
	private static void printCall(String[][] arr) throws IOException {
		for(String[] i : arr ) {
			for(String j : i) {
				bw.write(j);
			}
			bw.newLine();
		}
	}
	private static String[][] initArr(String[][] arr) {
		for(int i = 0 ; i < arr.length;i++) {
			for(int j =0; j < arr[i].length; j++) {
				arr[i][j] = " ";
			}
		}
		return arr;
	}
}
