package auto_handle_test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageLoad {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		try {
			driver.get("https://facebook.com/");
			System.out.println("page is loaded with in 5 seconds and pass");
		}
catch(Exception e) {
	System.out.println("page is not loaded with in 5 seconds and fail");
}
	driver.quit();
	}

}
