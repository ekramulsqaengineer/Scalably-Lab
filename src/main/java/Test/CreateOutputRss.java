package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CreateOutputRss extends Base{
	
	public void createOutputRssLogin() throws InterruptedException {
		ExtentTest test = extent.createTest("Scalably Lab Web Application", "Login Test Functionality");
	    test.log(Status.INFO, "Login Test Functionality");
	    
	    Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("hasan-rabiul@cloudproductionltd.com");
		test.log(Status.INFO, "Set Email Address");

		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		test.log(Status.INFO, "Click Submit Button");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='パスワードを入力してください']")).sendKeys("hasan@123");
		test.log(Status.INFO, "Set Password");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		test.log(Status.INFO, "Click Submit Button");
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/section[2]/div[4]/div/button")).click();
		test.log(Status.INFO, "Handle Pop Up");
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/section[2]/div[4]/div/div[2]/button[1]")).click();

		String expectedTitle = "Hub Top UI";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, expectedTitle);
        System.out.println("Test Pass");

}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Test(priority = 1)
	public void createOutputRSS() throws InterruptedException {
	ExtentTest test8 = extent.createTest("Scalably Lab Web Application", "Create Output RSS");
	test8.log(Status.INFO, "Create Output RSS");
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/section[1]/div[2]/div[2]")).click();
	test8.log(Status.INFO, "Handle Pop Up");
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"basic-button-1\"]")).click();
	test8.log(Status.INFO, "Handle Pop Up");
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@id='hubdetails_dropdown']//div[1]")).click();
	test8.log(Status.INFO, "Handle Pop Up");
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div[2]/div[4]/div/button")).click();
	test8.log(Status.INFO, "Handle Pop Up");
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div[2]/div[4]/div/div[2]/button[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//p[contains(text(),'外部へ書き出す')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='common_btn']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='common_btn']")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='common_btn']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@value='TITLE_ONLY']")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//textarea[@placeholder='-例）メインコミュニティへの情報流通のため']")).sendKeys("Daily Star");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='common_btn']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div[2]/div[4]/div/div/button")).click();
	Thread.sleep(5000);
	driver.navigate().refresh();
	
	
}
	
}
