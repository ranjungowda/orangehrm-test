package auto_handle_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAlignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int X1 = driver.findElement(By.id("email")).getLocation().getX();
		int X2 = driver.findElement(By.name("pass")).getLocation().getX();
		System.out.println("X1: " + X1 + "X2: " +X2);
		if(X1==X2) {
			System.out.println("username and password are properly aligned and pass");
		}
		else {
			System.out.println("username and password are not properly aligned and fail");
		}
driver.close();
	}

}
