package auto_handle_test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPrintPopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/downloads/");
	Thread.sleep(3000);
    Robot r = new Robot();
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_P);
    r.keyPress(KeyEvent.VK_CONTROL);
    Thread.sleep(3000);
    r.keyPress(KeyEvent.VK_TAB);
    Thread.sleep(3000);
    r.keyPress(KeyEvent.VK_TAB);
    Thread.sleep(3000);
    r.keyPress(KeyEvent.VK_DOWN);
    Thread.sleep(3000);
    r.keyPress(KeyEvent.VK_DOWN);
    Thread.sleep(3000);
    r.keyPress(KeyEvent.VK_DOWN);
    Thread.sleep(3000);
    r.keyPress(KeyEvent.VK_DOWN);
    Thread.sleep(3000);
    r.keyPress(KeyEvent.VK_1);
    r.keyPress(KeyEvent.VK_MINUS);
    r.keyPress(KeyEvent.VK_2);
    Thread.sleep(3000);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyPress(KeyEvent.VK_ENTER);
    Thread.sleep(3000);
    r.keyPress(KeyEvent.VK_K);
    Thread.sleep(3000);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyPress(KeyEvent.VK_ENTER);
	}
}
