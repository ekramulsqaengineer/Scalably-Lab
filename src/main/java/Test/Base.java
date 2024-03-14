package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

public class Base extends ExtendsReport {
	
	public static WebDriver driver;
	@BeforeTest
	public static WebDriver getDriver() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Scalably\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.geckodriver.driver","C:\\Users\\user\\Desktop\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		
		capabilities.setCapability("marionette", true);
		driver = new ChromeDriver(capabilities);
		//driver = new FirefoxDriver(capabilities);
		
		//driver.get("https://test.d12yeacmg9t4eb.amplifyapp.com/login");
		driver.get("https://dev.d1v4nryes0qbsp.amplifyapp.com/signup");
		
		driver.manage().window().maximize();
		return driver;
	}

}
