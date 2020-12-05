package j_string_search;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class KnuthMorrisPratt {

	private void preProcess(String pattern, int patternLength, int[] table) {
		int i = 0;
		int j = -1;
		
		table[0] = -1;
		
		while(i < patternLength) {
			while(j > -1 && pattern.charAt(i) != pattern.charAt(j)) {
				j = table[j];
			}
			i++;
			j++;
			
			table[i] = j;
		}
	}
	
	private int KMP(String text, int textLength, String pattern, int patternLength) {
		int i = 0;
		int j = 0;
		int position = -1;
		
		int[] table = new int[patternLength+1];
		
		this.preProcess(pattern, patternLength, table);
		
		while(i < textLength) {
			while(j >= 0 && text.charAt(i) != pattern.charAt(j)) {
				j = table[j];
			}
			i++;
			j++;
			
			if(j == patternLength) {
				position = i-j;
				break;
			}
		}
		return position;
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hwesd\\git\\Algorithm_study\\Java_Algorithm\\src\\j_string_search\\kjv.txt"));
		String pattern = "The Prince of Peace";
		
		
		String str = new String();
		int line = 0;
		int position = 0;
		KnuthMorrisPratt kmp = new KnuthMorrisPratt();
		while((str = br.readLine()) != null) {
			position = kmp.KMP(str, str.length(), pattern, pattern.length());
			line++;
			if(position >= 0) {
				System.out.println("line : " + line + " column : " + position + " text : " + str);
			}
		}
	}
}
