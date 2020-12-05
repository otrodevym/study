package mock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MockTest {

	
	
	@Test
	public void savePassword_패스워드저장() throws Exception{
		UserRegister register = new UserRegister();
		
		MyCipher cipher = new MockMD5Cipher();
		
		String userId = "test";
		String passwd = "potato";
		
		register.savePassword(userId, cipher.encrypt(passwd));
		String decrytedPassword = cipher.decrypt(register.getPaswd());
		assertEquals(passwd, decrytedPassword);
	}
}
