package com.bin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Source {
	@Test(invocationCount=2)
	public void Test1() {
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Selenium\\selenium_binding\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V1/index.php");
		Reporter.log("Url is entered");
		driver.findElement(By.xpath("//input[@name='d']"));
		Reporter.log("Found first element");
		driver.findElement(By.xpath("//input[@name='password']"));*/
		
		System.out.println("Run this");
	}
}
