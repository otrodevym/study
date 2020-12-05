package j_string_search;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BruteForce {
	private int bruteForce(char[] text, int textLength, char[] pattern, int patternLength) {
		for (int i = 0; i <= (textLength - patternLength); i++) {
			int j = 0;
			while (j < patternLength) {
				if (text[i + j] != pattern[j]) {
					break;
				}
				j++;
			}
			if (j >= patternLength) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String args[]) throws IOException {
		BruteForce bf = new BruteForce();

		char[] text;
		char[] pattern = "Faithful".toCharArray();
		BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\hwesd\\git\\Algorithm_study\\Java_Algorithm\\src\\j_string_search\\kjv.txt"));
		int position = 0;
		int line = 0;
		
		String temp = "";
		while ((temp = br.readLine()) != null) {
			text = temp.toCharArray();
			position = bf.bruteForce(text, text.length, pattern, pattern.length);
			if (position >= 0) {
				System.out.print("line " + line++ + " column : " + position);
				int i =0;
				while(i < text.length-1) {
					System.out.print(text[i]);
					i++;
				}
				System.out.println();
			}
		}

	}
/*
	private int bruteForce(String text, String pattern) {
		for (int i = 0; i <= (text.length() - pattern.length()); i++) {
			int j = 0;
			while (j < pattern.length()) {
				if (text.charAt(i + j) != pattern.charAt(j)) {
					break;
				}
				j++;
			}
			if (j >= pattern.length()) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String args[]) throws IOException {
		BruteForce bf = new BruteForce();

		String text = new String();
		String pattern = "Faithful";
		BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\hwesd\\git\\Algorithm_study\\Java_Algorithm\\src\\j_string_search\\kjv.txt"));
		int position = 0;
		int line = 0;
		while ((text = br.readLine()) != null) {
			position = bf.bruteForce(text, pattern);
			if (position >= 0) {
				System.out.println("line " + line++ + " column : " + position + " text : " + text);
			}
		}

	}
*/
}
