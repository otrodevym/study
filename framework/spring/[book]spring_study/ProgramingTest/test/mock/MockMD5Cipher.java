package mock;

public class MockMD5Cipher implements MyCipher{

	@Override
	public String encrypt(String source) {
		return "8ee2027983915ec78acc45027d874316";
	}

	@Override
	public String decrypt(String source) {
		return "potato";
	}

}
