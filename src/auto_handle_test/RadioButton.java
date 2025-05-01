package auto_handle_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		try {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		
		WebElement radio1 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        WebElement radio2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        WebElement radio3 = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
        int Y1 = radio1.getLocation().getY();
        int Y2 = radio2.getLocation().getY();
        int Y3 = radio3.getLocation().getY();

        if (Y1 == Y2 && Y2 == Y3) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        driver.quit();
	}
	}
}
