package anti_pattern;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

// 권장하지 않는 패턴
// 테스트 픽스처는 셋팅에만 사용하길 권장.
public class AccountTest2 {

	private Account account;
	
	@Before
	public void setUp() throws Exception{
		this.account = new Account(1000);
	}
	@Test
	public void deposit() throws Exception{
		account.deposit(1000);
		assertEquals("입금", 1000, account.getMoney());
	}
	@Test
	public void withdraw() throws Exception{
		account.withdraw(100);
		assertEquals("출금", 900, account.getMoney());
	}
}
