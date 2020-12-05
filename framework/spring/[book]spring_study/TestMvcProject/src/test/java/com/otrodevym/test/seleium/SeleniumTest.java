package com.otrodevym.test.seleium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
//	private WebDriver driver;

	/*@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
	}*/

	@Test
	public void seleniumTest_셀레니움테스트() throws Exception {
//		driver.get("http//www.google.com/xhtml");
//		Thread.sleep(5000);

		// Optional, if not specified, WebDriver will search your path for chromedriver.
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/xhtml");
		Thread.sleep(5000); // Let the
//		  user actually see something! 
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("ChromeDriver");
		searchBox.submit();
		Thread.sleep(5000); // Let the user actually see something!
		driver.quit();

	}

	/*@After
	public void tearDown() throws Exception {
		driver.quit();
	}*/

}
