package auto_handle_test;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enter the browser name which has to be closed");
		Scanner s = new Scanner(System.in);
		String etitle = s.nextLine();
		s.close();
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allwh = driver.getWindowHandles();
        for(String wh:allwh) {
        	driver.switchTo().window(wh);
			String atitile = driver.getTitle();
			if(atitile.contains(etitle)) {
				driver.close();
			}
        }
	}

}
