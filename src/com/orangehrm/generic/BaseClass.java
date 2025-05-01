package com.orangehrm.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
@BeforeTest
public void OpenBrowser() {
	Reporter.log("Open Browser",true);
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.manage().window().maximize();
}
@AfterTest
public void CloseBrowser() {
	Reporter.log("Close Browser",true);
	driver.quit();
}
@BeforeMethod
public void Login() {
	Reporter.log("login",true);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
}
@AfterMethod
public void LogOut() {
	Reporter.log("Log Out",true);
	driver.findElement(By.className("oxd-userdropdown-tab")).click();
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
}}