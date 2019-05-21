package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class RemoteWebDriver {

	public static WebDriver driver;

	public static RemoteWebDriver chromeHisBrowserWeb() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--disable-infobars");

		driver = new ChromeDriver(options);
		return new RemoteWebDriver();
	}
	
	public static RemoteWebDriver firefoxHisBrowserWeb()
	{
		driver = new FirefoxDriver();
		return new RemoteWebDriver();
	}
	
	public static RemoteWebDriver internetExplorerHisBrowserWeb()
	{
		driver = new InternetExplorerDriver();
		return new RemoteWebDriver();
	}
	public static WebDriver on(String url) {
		driver.get(url);
		return driver;
	}
}
