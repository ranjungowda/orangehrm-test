package com.oragehrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestClass {
	@Test
	public void testValidLogin() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 LoginPage l = new LoginPage(driver);
		 PageFactory.initElements(driver, l);
		 l.setlogin("Admin", "admin123");
	}
}
