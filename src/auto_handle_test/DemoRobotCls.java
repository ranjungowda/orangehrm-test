package auto_handle_test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class DemoRobotCls {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		Runtime.getRuntime().exec("notepad");
		Thread.sleep(3000);
       Robot r = new Robot();
       r.keyPress(KeyEvent.VK_SHIFT);
       r.keyPress(KeyEvent.VK_R);
       r.keyPress(KeyEvent.VK_A);
       r.keyPress(KeyEvent.VK_N);
       r.keyPress(KeyEvent.VK_J);
       r.keyPress(KeyEvent.VK_I);
       r.keyPress(KeyEvent.VK_T);
       r.keyPress(KeyEvent.VK_H);
       r.keyPress(KeyEvent.VK_A);
       r.keyRelease(KeyEvent.VK_SHIFT);
	}

}
