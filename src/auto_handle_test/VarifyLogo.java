package auto_handle_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VarifyLogo {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    boolean logo = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]")).isDisplayed();
    if(logo==true) {
    	System.out.println("logo is displayed and pass");
    }
    else {
    	System.out.println("logo is not displayed and pass");
    }
    driver.quit();
	}

}
