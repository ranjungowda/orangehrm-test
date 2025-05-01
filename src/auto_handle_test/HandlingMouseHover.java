package auto_handle_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseHover {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement target = driver.findElement(By.linkText("Company"));
		Actions a = new Actions(driver);
        a.moveToElement(target).perform();
        driver.findElement(By.partialLinkText("Contact Us")).click();
        String phno = driver.findElement(By.xpath("//p[contains(text(), 'Bengaluru, India')]/../p[2]")).getText();
        System.out.println(phno);
        driver.quit();
	}

}
