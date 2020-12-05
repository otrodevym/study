package date_20181226;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_6064 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int num = Integer.parseInt(br.readLine());
			int result = 0;
			for (int i = 0; i < num; i++) {
				String[] arrStr = br.readLine().split(" ");
				int m = Integer.parseInt(arrStr[0]);
				int n = Integer.parseInt(arrStr[1]);
				int x = Integer.parseInt(arrStr[2]);
				int y = Integer.parseInt(arrStr[3]);
				result = calc(m, n, x, y);

				bw.write(String.valueOf(result));
				bw.newLine();
			}
			bw.flush();
			bw.close();

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
	
	private static int gcd(int num1, int num2) {
		int r = num1 % num2;
		if (r != 0) {
			return gcd(num2, r);
		}
		return num2;
	}

	private static int lcm(int num1, int num2) { 
		return num1 * num2/ gcd(num1,num2);
		}
	
	/**
	 * @param m
	 * @param n
	 * @param x
	 * @param y
	 * @return
	 */
	private static int calc(int m, int n, int x, int y) {
//		x를 고정하고 x에 해당하는 y값을 찾기 위해 m을 계속 더해 해를 찾습니다.
//		x = 5 -> 10을 더하면 해는 15이지만 x는 5입니다. y값은 10만큼 증가하고 n으로 나머지를 구해주면 y 값이 됩니다.
//		수식으로는 "해 = x + m", y= (x + m) % n
		
//		m = 10, n = 12, x = 3, y = 9를 찾을 경우
//		x에 해를 맞추기 위해 해가 3일 때 x = 3, y = 3입니다. 
//		해 = 3 + m -> 13 = 3 + 10이고 y는 (x + m) %n -> (3 + 10) % 12 = 1입니다. 
		
//		해가 구해지지 않는 경우는 y를 못찾고 x는 m까지, y는 n까지입니다.
//		m*n로 하면 O(m*n)으로 시간 초과가 나오는 이유입니다. -> m이 1이고 n이 39999
//		y는 n을 벗어나지 않는 다는 전제로 n을 0부터 11까지 반복했을 때 값이 나오지 않는다면 -1를 반환하면 됩니다.
		
		int setY = x; // y 값 임시 저장
		int result = x; // 해
		

		for(int i = 0; i < n; i++) {
//			y는 n의 범위 안에 있으므로 n까지 반복
			
			setY = setY%n;
			if(setY == 0) {
				setY = n;
			}
			if(setY == y) {
				return result;
			}
			result += m;
			setY+=m;
		}
		
		return -1;
	}
	
	
	/*
	private static int calc(int m, int n, int x, int y) {
		int setY = (x % n);
		boolean check = true;
		
		int lcm = lcm(m,n);
		
		int count = 0;
		while (check) {
			if(lcm < count ) {
				check = false;
				return -1;
			}
			x += m;

			setY = ((setY) + m) % n;
			if (y == setY) {
				check = false;
				return x;
			}
			if (setY == n) {
				setY = 0;
			}
			count++;
		}
		return x;
	}
*/
	

	/*
	 * Test case 1 : 시간 초과 mCount가 m이 될 때까지, nCount가 n이 될때까지 1씩 증분하여 count를 구합니다.
	 * private static int calc(int m, int n, int x, int y) { int mCount = 1; int
	 * nCount = 1; int count = 1; boolean check = true; if(x ==1 && y ==1) { return
	 * 1; } while(check) { mCount++; nCount++; count++; if(mCount > m) { mCount = 1;
	 * } if(nCount > n) { nCount = 1; } if(mCount == 1 && nCount ==1) { check =
	 * false; return -1; } if(mCount == x && nCount == y) { check = false; return
	 * count; }
	 * 
	 * } return -1; }
	 */
	/* Test case2 : 시간 초과 m-n의 값만큼 증분합니다.
	 * private static int calc(int m, int n, int x, int y) { // 1. m과 n을 뺍니다.
	 * (m-n=k) // 2. k가 양수이면 m > n이고 n이 기준입니다. // k가 음수이면 m < n이고 m이 기준입니다. // 3. k가
	 * 양수 일때, x가 k만큼 y로 가는 횟수를 셉니다.(x->y = count) // k가 음수 일때, y가 k만큼 x로 가는 횟수를
	 * 셉니다.(y->x = count += 1) // 4. k가 양수 일때, count * n + y가 구하는 해가 됩니다. // k가 음수
	 * 일때, count * m + x가 구하는 해가 됩니다.
	 * 
	 * int k = m-n;
	 * 
	 * 
	 * int count = 0; int result = 0; if(k > 0) { count = checkY(n,k,x,y); if(count
	 * == -1) { return count; } result = count *n + y; }else if(k < 0) { count =
	 * checkX(m,k,x,y); if(count == -1) { return count; } result = count *m + x;
	 * }else {
	 * 
	 * }
	 * 
	 * return result; }
	 * 
	 * // 양수 일 때 private static int checkY(int n, int k, int x, int y) { int count =
	 * 0; while(y != x) { x+=k; if((x < 0) || (x > n)) { x = Math.abs(k); } count++;
	 * if((x*y) < count) { return -1; } }
	 * 
	 * return ++count; }
	 * 
	 * // 음수 일 때 private static int checkX(int m, int k, int x, int y) { int count =
	 * 0; while(x != y) { y+=k; if((y < 0) || (y > m)) { y = Math.abs(k); } count++;
	 * if((x*y) < count) { return -1; } }
	 * 
	 * return count; }
	 */
	
	/* Test case3 아래 공식을 대입합니다.
	 * private static int calc(int m, int n, int x, int y) { // answer = Ma + x = Nb
	 * + y
	 * 
	 * int num = 0;
	 * 
	 * boolean check = true;
	 * 
	 * int gcd = gcd(m, n); int lcm = lcm(m,n,gcd); int count = 0; while(check) {
	 * num = (m*count) + x; if((num % n) == y) { check = false; } if(lcm < count) {
	 * return -1; } count++;
	 * 
	 * } return num; }
	 * 
	 * 
	 * private static int gcd(int num1, int num2) { int r = num1%num2; if(r != 0) {
	 * return gcd(num2, r); }
	 * 
	 * return num2; }
	 * 
	 * private static int lcm(int num1, int num2, int gcd) { return gcd *(num1/gcd)
	 * * (num2/gcd); }
	 * 
	 */

}
