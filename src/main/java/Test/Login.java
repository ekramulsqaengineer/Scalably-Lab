package Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Login extends Base{
	
	@Test(priority = 0)
	public void login() throws InterruptedException, IOException {
		ExtentTest test = extent.createTest("Scalably Lab Web Application", "Login Test Functionality");
	    test.log(Status.INFO, "Login Test Functionality");
	    
	    Thread.sleep(3000);
		driver.findElement(By.name("ema il")).sendKeys("ekramulcsediu2016@gmail.com");
		test.log(Status.INFO, "Set Email Address");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		test.log(Status.INFO, "Click Submit Button");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='パスワードを入力してください']")).sendKeys("haque1@#$");
		test.log(Status.INFO, "Set Password");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		test.log(Status.INFO, "Click Submit Button");
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/button")).click();
		test.log(Status.INFO, "Handle Pop Up");
		
		Thread.sleep(2000);
		String header = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div[2]/div[1]/div[1]/h1")).getText();
		
		if (header!= null) {
			System.out.println("header: "+header);
			if (header.equals("登録したニュースアセット一覧")) {
				System.out.println("Test Pass");
			} else {
				System.out.println("Test Fail");
			}
			String expectedTitle = "News UI";
	        String originalTitle = driver.getTitle();
	        Assert.assertEquals(originalTitle, expectedTitle);
		}

		test.log(Status.INFO, "Tese Complite");
		//driver.close();
		((SafariDriver) driver.switchTo()).newWindow(WindowType.TAB);
		// Loads Sauce Labs open source website in the newly opened window
		driver.get("https://opensource.saucelabs.com/");
	}
}
