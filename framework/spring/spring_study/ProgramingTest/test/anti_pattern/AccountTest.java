package anti_pattern;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

// 권장 패턴
public class AccountTest {

	
	@Before
	public void setUp() throws Exception{
		
	}
	@Test
	public void deposit() throws Exception{
		Account account = new Account(1000);
		account.deposit(1000);
		assertEquals("입금", 1000, account.getMoney());
	}
	@Test
	public void withdraw() throws Exception{
		Account account = new Account(1000);
		account.withdraw(100);
		assertEquals("출금", 900, account.getMoney());
	}
}
