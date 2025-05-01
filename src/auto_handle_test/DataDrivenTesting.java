package auto_handle_test;

import java.util.ArrayList;
import java.util.HashMap;

public class DataDrivenTesting {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
        a1.add("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        a1.add("Admin");
        a1.add("admin123");
        System.out.println(a1.get(0));
        
        HashMap<String, String> hm = new HashMap<>();
        hm.put("url", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        hm.put("Username","Admin");
        hm.put("Password","admin123");
        System.out.println(hm.get("Username"));
	}

}
