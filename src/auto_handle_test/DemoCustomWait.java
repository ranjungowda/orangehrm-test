package auto_handle_test;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCustomWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.name("username")).sendKeys("admin");
	       driver.findElement(By.name("pwd")).sendKeys("manager");
	       driver.findElement(By.name("//div[text()='Login']")).click();
	       int i=0;
	       while(i<=100) {
	    	   try {
	    		   driver.findElement(By.id(" logoutlink")).click();
	    		   break; }
	    	   catch(NoSuchElementException e) {
	    		   i++;
	    	   }  	   
	    	   }       
driver.quit();
	}
}
