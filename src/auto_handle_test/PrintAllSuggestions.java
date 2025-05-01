package auto_handle_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllSuggestions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("java");
Thread.sleep(3000);
List<WebElement> allsugg = driver.findElements(By.xpath("//ul[@role='listbox']//li//span"));
int count = allsugg.size();
System.out.println(count);
for (int i=0;i<count;i++) {
	String text = allsugg.get(i).getText();
	System.out.println(text);
}
allsugg.get(0).click();
	}

}
