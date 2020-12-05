package date_20181213;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.temporal.WeekFields;

public class BOJ_1924 {
	public enum week {
		SUN, MON, TUE, WED, THU, FRI, SAT
	}

	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		1, 3, 5, 7, 8, 10, 12 : 31일까지
//		4, 6, 9, 11 : 30일까지
//		2 : 28일까지
		try {
			String[] str = br.readLine().split(" ");
			int month = Integer.parseInt(str[0]);
			int day = Integer.parseInt(str[1]);
			int result = 0;
			for (int i = 1; i < month; i++) {
				result += countMonthDay(i);
			}
			result += day;
			result = result % 7;
			switch (result) {
			case 0:
				bw.write(String.valueOf(week.SUN));
				break;
			case 1:
				bw.write(String.valueOf(week.MON));
				break;
			case 2:
				bw.write(String.valueOf(week.TUE));
				break;
			case 3:
				bw.write(String.valueOf(week.WED));
				break;
			case 4:
				bw.write(String.valueOf(week.THU));
				break;
			case 5:
				bw.write(String.valueOf(week.FRI));
				break;
			case 6:
				bw.write(String.valueOf(week.SAT));
				break;
			}
			bw.flush();
			bw.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static int countMonthDay(int month) {
		int count = 0;
		switch (month) {
		case 1:
			count += 31;
			break;
		case 3:
			count += 31;
			break;
		case 5:
			count += 31;
			break;
		case 7:
			count += 31;
			break;
		case 8:
			count += 31;
			break;
		case 10:
			count += 31;
			break;
		case 12:
			count += 31;
			break;
		case 4:
			count += 30;
			break;
		case 6:
			count += 30;
			break;
		case 9:
			count += 30;
			break;
		case 11:
			count += 30;
			break;
		case 2:
			count += 28;
			break;
		default:
		}
		return count;
	}
}
