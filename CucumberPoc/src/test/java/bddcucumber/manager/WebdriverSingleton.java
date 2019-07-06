package bddcucumber.manager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebdriverSingleton {


	private static  WebdriverSingleton instanceOfSingletonClass=null;
	private static WebDriver driver;

	//Private Constructor
	private WebdriverSingleton() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chintan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	//To create instance of Class
	public static  WebdriverSingleton getInstanceOfWebDriverManager() {

		if(instanceOfSingletonClass==null) {
			instanceOfSingletonClass = new  WebdriverSingleton();
		}
		return instanceOfSingletonClass;
	}

	//to get Driver
	public  WebDriver getDriver() {
		if (driver==null) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chintan\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		return driver;
	}


	public void CloseDriver() {
		if (!(driver==null)) {
			driver.quit();
			driver = null;

		}
	}

}

