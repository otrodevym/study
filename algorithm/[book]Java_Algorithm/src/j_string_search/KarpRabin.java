package j_string_search;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class KarpRabin {
	private int karpRibin(String text, int textLength, String pattern, int patternLength) {

		double confficient = Math.pow(2.0, patternLength - 1);

		int hashText = hash(text, patternLength);
		int hashPattern = hash(pattern, patternLength);

		for (int i = 0; i <= (textLength - patternLength); i++) {
			hashText = reHash(text, i, patternLength, hashText, confficient);

			if (hashPattern == hashText) {
				int j = 0;
				while (j < patternLength) {
					if (text.charAt(i + j) != pattern.charAt(j)) {
						break;
					}

					j++;
				}
				if (j >= patternLength) {
					return i;
				}
			}
		}
		return -1;

	}

	private int reHash(String text, int start, int patternLength, int hashPrev, double confficient) {
		if (start == 0) {
			return hashPrev;
		}

		return (int) (text.charAt(start + patternLength - 1) + ((hashPrev - confficient * text.charAt(start - 1)) * 2));
	}

	private int hash(String pattern, int patternLength) {
		int hashValue = 0;

		for (int i = 0; i < patternLength; i++) {
			hashValue += pattern.charAt(i) * Math.pow(2.0, patternLength - (i + 1));
		}
		return hashValue;
	}

	public static void main(String args[]) throws IOException {
		KarpRabin kr = new KarpRabin();

		String text = new String();
		String pattern = "Righteousness";
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hwesd\\git\\Algorithm_study\\Java_Algorithm\\src\\j_string_search\\kjv.txt"));
		int position = 0;
		int line = 0;
		int patternLength = pattern.length();
		while ((text = br.readLine()) != null) {
			position = kr.karpRibin(text, text.length(), pattern, patternLength);
			line++;
			if (position >= 0) {
				System.out.println("line " + line + " column : " + position + " text : " + text);
			}
		}

	}
}
