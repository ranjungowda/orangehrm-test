package auto_handle_test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllChildWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		String pwh = driver.getWindowHandle();
		Thread.sleep(3000);
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh) {
			
			if (!wh.equals(pwh))
			{
				driver.switchTo().window(wh);
				driver.close();
			}
		
		}

	}

}
