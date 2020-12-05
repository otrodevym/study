package designbycontract;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AccountTest {

	private Account account;
	private Account wrongAccount;

	@Test
	public void setUpTest_계좌_생성테스트() throws Exception {
		account = new Account(10000);
		wrongAccount = new Account(-10000);
	}

	@Test
	public void Account() {
		wrongAccount = new Account(-10000);

		assertEquals("계좌 생성시 0보다 작으면 안된다.", wrongAccount.getMoney() > 0);
	}

	@Test
	public void Account2() {
		try {
			wrongAccount = new Account(-10000);

			assertEquals("계좌 생성시 0보다 작으면 안된다.", false);
		} catch (Exception e) {
			assertTrue(true);
		}
	}
}
