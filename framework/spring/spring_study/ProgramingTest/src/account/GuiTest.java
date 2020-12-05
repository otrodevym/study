package account;

import junit.framework.TestCase;

public class GuiTest extends TestCase {
	public void testGetString() {
		assertEquals("Happy", "hpaay");
	}


	public static void main(String[] args) {
//		junit.swingui.TestRunner.run(DisplayTest.class);
		junit.textui.TestRunner.run(GuiTest.class);
//		junit.awtui.TestRunner.run(DisplayTest.class);
	}
}
