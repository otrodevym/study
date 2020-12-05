package AccountTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import account.Account;

public class AccountTest {
	
	private Account account;
	private Account account2;
	private Account account3;
	private Account account4;

	@Test
	public void testAccount() throws Exception{
		setup();
	}
	public void setup() {
		account = new Account(1000);
	}
	@Test
	public void testGetBalance() throws Exception{
		account2 = new Account(10000);
		assertEquals("10000원으로 계좌 생성 후 잔고 조회", 10000, account2.getBalance());
		
		setup();
		assertEquals("1000원으로 계좌 생성 후 잔고 조회", 1000, account.getBalance());
		
		account2 = new Account(0);
		assertEquals("0원으로 계좌 생성 후 잔고 조회", 0,account2.getBalance());
	}
	
	@Test
	public void testDoposit() throws Exception{
		account3 = new Account(1000);
		account3.deposit(1000);
		assertEquals("1000원 게좌에 1000원을 입금", 2000, account3.getBalance());
	}
	
	@Test
	public void testWithdraw() throws Exception{
		account4 = new Account(1000);
		account4.withraw(1000);
		assertEquals("1000원 계좌에 1000원을 출금", 0, account4.getBalance());
	}
	
	public static void main(String args[]) {
		AccountTest test = new AccountTest();
		try {
			test.testAccount();
			test.testGetBalance();
		} catch (Exception e) {
			System.out.println("실패(X)");
			return ;
		}
		System.out.println("성공");
	}
	
}
