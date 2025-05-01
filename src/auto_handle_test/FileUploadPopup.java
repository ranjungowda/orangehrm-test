package auto_handle_test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Ranjitha/OneDrive/Desktop/naukari.html");
       Thread.sleep(3000);
       File f = new File("./data/Resume.docx");
       String absPath = f.getAbsolutePath();
       driver.findElement(By.id("cv")).sendKeys(absPath);
	}

}
