package Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CreateNewsAsset extends Base{
	@Test(priority = 0)
	public void login() throws InterruptedException, IOException {
		ExtentTest test = extent.createTest("Scalably Lab Web Application", "Login Test Functionality");
	    test.log(Status.INFO, "Login Test Functionality");
	    
	    Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("ekramulcsediu2016@gmail.com");
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
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}
	@Test(priority = 1)
	public void createNewsAsset() throws InterruptedException {
		ExtentTest test1 = extent.createTest("Scalably Lab Web Application", "Createt news Asset Functionality");
	    test1.log(Status.INFO, "Createt news Asset Functionality");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div[2]/div[1]/div[1]/a/p")).click();
		test1.log(Status.INFO, "Click Add News Asset Button");
		
		Thread.sleep(3000);
		driver.findElement(By.name("hub_name")).sendKeys("Kohli puts India on top on Day 1");
		test1.log(Status.INFO, "Set News Asset Name");
		
		Thread.sleep(3000);
		driver.findElement(By.name("url")).sendKeys("thedailystar.net");
		test1.log(Status.INFO, "Set News Asset URL");
		
		Thread.sleep(3000);
		driver.findElement(By.name("explanation")).sendKeys("Virat Kohli and Ravindra Jadeja combined in an unbroken century partnership for India to regain the ascendancy over West Indies.");
		test1.log(Status.INFO, "Set explanation Text");
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.className("hubTopModal_checkround__hntZj"))).click();			
		test1.log(Status.INFO, "Click Public range setting Everyone");
		
		Thread.sleep(3000);
		WebElement m=driver.findElement(By.className("ReactTags__tagInputField"));
	      m.sendKeys("World");
	      m.sendKeys(Keys.ENTER);
	      test1.log(Status.INFO, "Set Category Name");
	      
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[6]/button[2]")).click();
	      test1.log(Status.INFO, "Click Next Button");
	      
	      Thread.sleep(3000);
	      driver.findElement(By.name("rss_url")).sendKeys("https://nvidianews.nvidia.com/releases.xml");
	      test1.log(Status.INFO, "Input rss url");
	      
	      Thread.sleep(3000);
	      driver.findElement(By.className("common_btn")).click();
	      test1.log(Status.INFO, "Click Add news sources Button");
	      
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/button[2]")).click();
	      test1.log(Status.INFO, "Click Complete news asset registration Button");
	      
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/button[1]")).click();
	      test1.log(Status.INFO, "Click close Button");
	      
	       String expectedTitle = "News UI";
	       String originalTitle = driver.getTitle();
	       Assert.assertEquals(originalTitle, expectedTitle);
	       test1.log(Status.INFO, "Tese Complite");
	}
}
