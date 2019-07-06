package bddcucumber.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivermanager {
	
	static WebDriver driver;

	public static WebDriver GetDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chintan\\Downloads\\chromedriver_win32\\chromedriver.exe");
			if (driver==null) {
				driver = new ChromeDriver();
			}else {
				return driver;
			}

		}else if (browser.equalsIgnoreCase("firefox")) {
			//yet to be written
		}
		return driver;


	}

}
