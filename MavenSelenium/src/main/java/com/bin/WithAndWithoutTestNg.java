package com.bin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WithAndWithoutTestNg {
	@Test
	public void Test1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Selenium\\selenium_binding\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V1/index.php");
		String actual="yu";
		String expected="Hare";
		try {
			Assert.assertEquals(actual, expected);
			System.out.println("inside the try block");
		}
		catch(Throwable e) {
			System.out.println("both are not same");
		}
	}

}
