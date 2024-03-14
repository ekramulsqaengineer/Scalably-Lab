package Test;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class Tests extends Base {
	
/////////////////////////////////////////////////login Start//////////////////////////////////////////////////////////////////////
	@Test(priority = 0)
	public void login() throws InterruptedException, IOException {
		ExtentTest test = extent.createTest("Scalably Lab Web Application", "Login Test Functionality");
	    test.log(Status.INFO, "Login Test Functionality");
	    
	    Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("hasan-rabiul@cloudproductionltd.com");
		test.log(Status.INFO, "Set Email Address");
//		test.log(Status.PASS, "pass");
//	    test.log(Status.FAIL, "fail");
//	    Exception e;
//	    test.fail("e");
//	    test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		
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
//		Thread.sleep(2000);
//		String header = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div[2]/div[1]/div[1]/h1")).getText();
//		
//		if (header!= null) {
//			System.out.println("header: "+header);
//			if (header.equals("登録したニュースアセット一覧")) {
//				System.out.println("Test Pass");
//			} else {
//				System.out.println("Test Fail");
//			}
//			String expectedTitle = "News UI";
//	        String originalTitle = driver.getTitle();
//	        Assert.assertEquals(originalTitle, expectedTitle);
//		}
//
//		test.log(Status.INFO, "Tese Complite");
//		driver.close();
		String expectedTitle = "Hub Top UI";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, expectedTitle);
        System.out.println("Test Pass");
	}
	/////////////////////////////////////////////Login End////////////////////////////////////////////////////////////////////////////
	
	//////////////////////////////create news asset Start////////////////////////////////////////////////////////////////////
//	@Test(priority = 1)
//	public void createNewsAsset() throws InterruptedException {
//		ExtentTest test1 = extent.createTest("Scalably Lab Web Application", "Createt news Asset Functionality");
//	    test1.log(Status.INFO, "Createt news Asset Functionality");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div[2]/div[1]/div[1]/a/p")).click();
//		test1.log(Status.INFO, "Click Add News Asset Button");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.name("hub_name")).sendKeys("Kohli puts India on top on Day 1");
//		test1.log(Status.INFO, "Set News Asset Name");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.name("url")).sendKeys("thedailystar.net");
//		test1.log(Status.INFO, "Set News Asset URL");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.name("explanation")).sendKeys("Virat Kohli and Ravindra Jadeja combined in an unbroken century partnership for India to regain the ascendancy over West Indies.");
//		test1.log(Status.INFO, "Set explanation Text");
//		
//		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.className("hubTopModal_checkround__hntZj"))).click();			
//		test1.log(Status.INFO, "Click Public range setting Everyone");
//		
//		Thread.sleep(3000);
//		WebElement m=driver.findElement(By.className("ReactTags__tagInputField"));
//	      m.sendKeys("World");
//	      m.sendKeys(Keys.ENTER);
//	      test1.log(Status.INFO, "Set Category Name");
//	      
//	      Thread.sleep(3000);
//	      driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[6]/button[2]")).click();
//	      test1.log(Status.INFO, "Click Next Button");
//	      
//	      Thread.sleep(3000);
//	      driver.findElement(By.name("rss_url")).sendKeys("https://nvidianews.nvidia.com/releases.xml");
//	      test1.log(Status.INFO, "Input rss url");
//	      
//	      Thread.sleep(3000);
//	      driver.findElement(By.className("common_btn")).click();
//	      test1.log(Status.INFO, "Click Add news sources Button");
//	      
//	      Thread.sleep(3000);
//	      driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/button[2]")).click();
//	      test1.log(Status.INFO, "Click Complete news asset registration Button");
//	      
//	      Thread.sleep(3000);
//	      driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/button[1]")).click();
//	      test1.log(Status.INFO, "Click close Button");
//	      
//	       String expectedTitle = "News UI";
//	       String originalTitle = driver.getTitle();
//	       Assert.assertEquals(originalTitle, expectedTitle);
//	       test1.log(Status.INFO, "Tese Complite");
//	}
	/////////////////////////////////////////////////////create news asset End////////////////////////////////////////////////////////////////////////////////
	
	
	
	////////////////////////////////////////////// editNewsAsset Start///////////////////////////////////////////////////////////////////
	
//
//	
//	@Test(priority = 1)
//	public void editNewsAsset() throws InterruptedException {
//		ExtentTest test2 = extent.createTest("Scalably Lab Web Application", "Edit news Asset Functionality");
//         test2.log(Status.INFO, "Createt news Asset Functionality");
//		
//         Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@id='basic-button-0']//div//*[name()='svg']//*[name()='path' and contains(@d,'M2 0C0.9 0')]")).click();
//		test2.log(Status.INFO, "Click Right Side Three Dot Button");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='NewsUI_dropdown__SKw_K']//div[1]")).click();
//		test2.log(Status.INFO, "Click Details Button");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@type='button']")).click();
//		test2.log(Status.INFO, "Click Edit Button");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.name("hub_name")).clear();
//	
//		
//		
//		Thread.sleep(3000);
//		driver.findElement(By.name("hub_name")).sendKeys("More than 700 sentenced to prison over French riots: minister");
//		test2.log(Status.INFO, "Set News Asset Name");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.name("url")).clear();
//		
//		Thread.sleep(3000);
//		driver.findElement(By.name("url")).sendKeys("thedailystar.net");
//		test2.log(Status.INFO, "Set News Asset URL");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.name("explanation")).clear();
//		
//		Thread.sleep(3000);
//		driver.findElement(By.name("explanation")).sendKeys("More than 700 people have been sentenced to prison over riots in France late last month, the country's justice minister said Wednesday");
//		test2.log(Status.INFO, "Set explanation Text");
//		
//		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.className("hubTopModal_checkround__hntZj"))).click();			
//		test2.log(Status.INFO, "Click Public range setting Everyone");
//		
//		Thread.sleep(3000);
//		WebElement m=driver.findElement(By.className("ReactTags__tagInputField"));
//	      m.sendKeys("World");
//	      m.sendKeys(Keys.ENTER);
//	      test2.log(Status.INFO, "Set Category Name");
//	      
//	      Thread.sleep(3000);
//	      driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[6]/button[2]")).click();
//	      test2.log(Status.INFO, "Click Next Button");
//	      
//	    
//	      driver.findElement(By.name("rss_url")).clear();
//	      
//	      Thread.sleep(3000);
//	      driver.findElement(By.name("rss_url")).sendKeys("https://nvidianews.nvidia.com/releases.xml");
//	      test2.log(Status.INFO, "Input rss url");
//	      
//	      Thread.sleep(3000);
//	      driver.findElement(By.className("common_btn")).click();
//	      test2.log(Status.INFO, "Click Add news sources Button");
//		
//	}
	///////////////////////////////////////////////////editNewsAsset End////////////////////////////////////////////////////////////////////////////////////
	
	
	//////////////////////////////////////////////deleteNewsAsset Start////////////////////////////////////////////////////////////////////
//	@Test(priority = 1)
//	public void deleteNewsAsset() throws InterruptedException {
//		ExtentTest test3 = extent.createTest("Scalably Lab Web Application", "Delete news Asset Functionality");
//	    test3.log(Status.INFO, "Delete news Asset Functionality");
//		   Thread.sleep(3000);
//			driver.findElement(By.xpath("//tbody/tr/td[@class='NewsUI_TableThreeDots__SP1ls']/button[@id='basic-button-0']/div[1]//*[name()='svg']")).click();
//	        test3.log(Status.INFO, "Click Right Side Three Dot Button");
//	        
//	        Thread.sleep(3000);
//	         driver.findElement(By.xpath("//div[@class='NewsUI_dropdown__SKw_K']//div[2]")).click();
//             test3.log(Status.INFO, "Click Delete Button");
//             
//             Thread.sleep(3000);
//             driver.findElement(By.name("news_delete_content")).sendKeys("Delete this news asset");
//             test3.log(Status.INFO, "Set  Delete this news asset");
//             
//             Thread.sleep(3000);
//             driver.findElement(By.className("common_btn")).click();
//             test3.log(Status.INFO, "Click Next button");
//             
//             Thread.sleep(3000);
//             driver.findElement(By.className("hubTopModal_editConfirmClzBtn__pBb8f")).click();
//             test3.log(Status.INFO, "Click Close button");
//             
//             String expectedTitle = "News UI";
//  	         String originalTitle = driver.getTitle();
//  	         Assert.assertEquals(originalTitle, expectedTitle);
//  	          test3.log(Status.INFO, "Tese Complite");
//             
//             
//	}
	////////////////////////////////////////////////////////////////deleteNewsAsset End//////////////////////////////////////////////////////////
	
	/////////////////////////////////////////////////connectHubToNewsAsset Start/////////////////////////////////////////////////////
//	@Test(priority = 1)
//	
//	public void connectHubToNewsAsset() throws InterruptedException {
//		ExtentTest test4 = extent.createTest("Scalably Lab Web Application", "Connect Hub To News Asset Functionality");
//		test4.log(Status.INFO, "Connect Hub To News Asset Functionality");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[1]/ul/a[1]/li")).click();
//		test4.log(Status.INFO, "Click Add Hub Top Button");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/section[2]/div[4]/div/button")).click();
//		test4.log(Status.INFO, "Click Next Button");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/section[2]/div[4]/div/div[2]/button[1]")).click();
//		test4.log(Status.INFO, "Click Close Button");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/section[1]/div[2]/div[2]/div/h2/a")).click();
//		test4.log(Status.INFO, "Click Hub Top Details Button");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div/div[3]/div[1]/div/p")).click();
//		test4.log(Status.INFO, "Click Connect News Asset Button");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/input")).sendKeys("10");
//		test4.log(Status.INFO, "Search News Asset");
//		
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div[1]/div/div[5]/div/button")).click();
//		test4.log(Status.INFO, "Click to News Asset");
//		
//		
//		Thread.sleep(5000);
//		driver.navigate().refresh();
//		
//		
//		 String expectedTitle = "Hub Top Detail";
//       String originalTitle = driver.getTitle();
//       Assert.assertEquals(originalTitle, expectedTitle);
//       test4.log(Status.INFO, "Tese Complite");
//	}
	///////////////////////////////////////////////connectHubToNewsAsset End//////////////////////////////////////////////////////////
	
	////////////////////////////////////////////////disconnectHubToNewsAsset Start//////////////////////////////////////////////////////////
//	@Test(priority = 1)
//	public void disconnectHubToNewsAsset() throws InterruptedException {
//		ExtentTest test4 = extent.createTest("Scalably Lab Web Application", "Connect Hub To News Asset Functionality");
//		test4.log(Status.INFO, "Connect Hub To News Asset Functionality");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[1]/ul/a[1]/li")).click();
//		test4.log(Status.INFO, "Click Add Hub Top Button");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/section[2]/div[4]/div/button")).click();
//		test4.log(Status.INFO, "Click Next Button");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/section[2]/div[4]/div/div[2]/button[1]")).click();
//		test4.log(Status.INFO, "Click Close Button");	
//		
//	   Thread.sleep(3000);
//       driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/section[1]/div[2]/div[2]/div/h2/a")).click();
//       test4.log(Status.INFO, "Click Hub Top Details Button");
//       
//       Thread.sleep(4000);
//	    driver.findElement(By.xpath("//button[@id='basic-btn-0']//div")).click();
//	    test4.log(Status.INFO, "Click Three dot button");
//	    
//	    Thread.sleep(4000);
//	    driver.findElement(By.xpath("//button[@id='basic-btn-0']//div//*[name()='svg']")).click();
//	    
//	    Thread.sleep(4000);
//	   driver.findElement(By.xpath("//button[@id='basic-btn-0']//div//*[name()='svg']")).click();
//	}
	////////////////////////////////////////////////////////////disconnectHubToNewsAsset End/////////////////////////////////////////////////////////////////////////

	///////////////////////////////////////setNewsAssetCategory Start/////////////////////////////////////////////////////////////////////////
//	@Test(priority = 1)
//	public void setNewsAssetCategory() throws InterruptedException {
//		ExtentTest test4 = extent.createTest("Scalably Lab Web Application", "Connect Hub To News Asset Functionality");
//		test4.log(Status.INFO, "Connect Hub To News Asset Functionality");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[1]/ul/a[1]/li")).click();
//		test4.log(Status.INFO, "Click Add Hub Top Button");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/section[2]/div[4]/div/button")).click();
//		test4.log(Status.INFO, "Click Next Button");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/section[2]/div[4]/div/div[2]/button[1]")).click();
//		test4.log(Status.INFO, "Click Close Button");	
//		
//	   Thread.sleep(3000);
//       driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/section[1]/div[2]/div[2]/div/h2/a")).click();
//       test4.log(Status.INFO, "Click Hub Top Details Button");
//       
//       Thread.sleep(4000);
//	    driver.findElement(By.xpath("//button[@id='basic-btn-0']//div//*[name()='svg']")).click();
//	    test4.log(Status.INFO, "Click Three dot button");
//	    
//	    Thread.sleep(4000);
//	    driver.findElement(By.xpath("//div[@id='hubdetails_dropdown']//div[1]")).click();
//	    
//	    Thread.sleep(4000);  
//	    WebElement Cate=driver.findElement(By.className("ReactTags__tagInputField"));
//        Cate.sendKeys("MummyMummy");
//        Cate.sendKeys(Keys.ENTER);
//        
//        Thread.sleep(4000); 
//        driver.findElement(By.className("common_btn")).click();
//        
//        Thread.sleep(4000); 
//        driver.findElement(By.className("hubTopModal_editConfirmClzBtn__pBb8f")).click();
//	}
	///////////////////////////////////////////////////////////setNewsAssetCategory End//////////////////////////////////////////////////////////
	
	////////////////////////////////////////////viewHubTop Start////////////////////////////////////////////////////////////////////////
//	@Test(priority = 1)
//	public void viewHubTop() throws InterruptedException {
//		ExtentTest test6 = extent.createTest("Scalably Lab Web Application", "view Hub Top");
//	    test6.log(Status.INFO, "view Hub Top Functionality");
//	
//	    Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[1]/ul/a[1]/li")).click();
//		test6.log(Status.INFO, "Click Add Hub Top Button");
//			
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/section[2]/div[4]/div/button")).click();
//		test6.log(Status.INFO, "Click Next Button");	
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/section[2]/div[4]/div/div[2]/button[1]")).click();
//		test6.log(Status.INFO, "Click Close Button");	
//			
//		Thread.sleep(3000);
//		 driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/section[1]/div[2]/div[2]/div/h2/a")).click();
//		 test6.log(Status.INFO, "Click Hub Top Details Button");
//		 
//		Thread.sleep(3000);
//		 driver.findElement(By.className("HubTopDetail_uri_text__7A7j_")).click();
//		
//		
//			}
	////////////////////////////////////////////////////////viewHubTop End/////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////viewHubTopDetails Start///////////////////////////////////////////////////////////
//	@Test(priority = 1)
//	public void viewHubTopDetails() throws InterruptedException {
//		ExtentTest test6 = extent.createTest("Scalably Lab Web Application", "view Hub Top");
//	    test6.log(Status.INFO, "view Hub Top Functionality");
//	
//	    Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[1]/ul/a[1]/li")).click();
//		test6.log(Status.INFO, "Click Add Hub Top Button");
//			
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/section[2]/div[4]/div/button")).click();
//		test6.log(Status.INFO, "Click Next Button");	
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/section[2]/div[4]/div/div[2]/button[1]")).click();
//		test6.log(Status.INFO, "Click Close Button");	
//			
//		Thread.sleep(3000);
//		 driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/section[1]/div[2]/div[2]/div/h2/a")).click();
//		 test6.log(Status.INFO, "Click Hub Top Details Button");
//		 
//		 Thread.sleep(3000);
//		 driver.findElement(By.className("HubTopDetail_uri_text__7A7j_")).click();
//		
//		 
//		 Thread.sleep(5000);
//		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div/div[1]/div[2]/a[1]/div/div/p")).click();
//		
//		
//			}
	/////////////////////////////////////////////////////viewHubTopDetails End///////////////////////////////////////////////////////////////////////////////
	
	//////////////////////////////////////////////////loginGmail start///////////////////////////////////////////////////////////////////
//	@Test(priority = 0)
//	public void loginGmail() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/main/div[2]/div/div[2]/a[1]/div/p")).click();
//		
//		Thread.sleep(3000);
//		driver.findElement(By.id("identifierId")).sendKeys("cplsqa0@gmail.com");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).sendKeys("haque1@#$");
//		driver.close();
//	}
	//////////////////////////////////////////////////////////loginGmail end/////////////////////////////////////////////////////////////////////
	
	/////////////////////////////////////////////////changeNewsAssetIcon Start///////////////////////////////////////////////////////////
//	@Test(priority = 1)
//    public void changeNewsAssetIcon() throws InterruptedException {
//		ExtentTest test7 = extent.createTest("Scalably Lab Web Application", "Change News Asset Icon");
//       test7.log(Status.INFO, "Change News Asset Icon");
//	   Thread.sleep(3000);
//	   driver.findElement(By.className("NewsUI_TableThreeDots__SP1ls")).click();
//	   test7.log(Status.INFO, "Click Three Dot Button");
//	    
//	   Thread.sleep(3000);
//	    driver.findElement(By.xpath("//div[@class='NewsUI_dropdown__SKw_K']//div[1]")).click();
//	    test7.log(Status.INFO, "Click Details Button");
//	
//	   Thread.sleep(5000);
//	   WebElement changeImage = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/article/div[1]/div[2]/input"));
//	    changeImage.sendKeys("C:\\Users\\user\\Desktop\\news icon.png");
//	    test7.log(Status.INFO, "Click Change Image Button");
//	
//	   String expectedTitle = "News_Asset_Detail";
//       String originalTitle = driver.getTitle();
//       Assert.assertEquals(originalTitle, expectedTitle);
//        test7.log(Status.INFO, "Tese Complite");
//        Thread.sleep(5000);
//        driver.close();
//	
//}
	//////////////////////////////////////////////////////changeNewsAssetIcon End//////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	@Test(priority = 1)
//	public void createOutputRSS() throws InterruptedException {
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/section[1]/div[2]/div[2]")).click();
//	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//*[@id=\"basic-button-1\"]")).click();
//	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//div[@id='hubdetails_dropdown']//div[1]")).click();
//	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div[2]/div[4]/div/button")).click();
//	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div[2]/div[4]/div/div[2]/button[1]")).click();
//	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//p[contains(text(),'外部へ書き出す')]")).click();
//	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//button[@class='common_btn']")).click();
//	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//button[@class='common_btn']")).click();
//	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//button[@class='common_btn']")).click();
//	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//input[@value='TITLE_ONLY']")).click();
//	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//textarea[@placeholder='-例）メインコミュニティへの情報流通のため']")).sendKeys("Daily Star");
//	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//button[@class='common_btn']")).click();
//	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div[2]/div[4]/div/div/button")).click();
//	
//	Thread.sleep(5000);
//	driver.navigate().refresh();
//	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/div[2]/svg")).click();
//	
//	// A new window is opened and switches to it
//	((SafariDriver) driver.switchTo()).newWindow(WindowType.WINDOW);
//	// Loads Sauce Labs open source website in the newly opened window
//	driver.get("https://opensource.saucelabs.com/");
//	
//	
//}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	@Test(priority = 1)
//   public void editOutPutRSS() throws InterruptedException {
//	  ExtentTest test9 = extent.createTest("Scalably Lab Web Application", "Edit Output RSS");
//    test9.log(Status.INFO, "Edit Output RSS ");
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/section[1]/div[2]/div[2]")).click();
//	test9.log(Status.INFO, "Click Out Put RSS");
//	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//*[@id=\"basic-button-1\"]")).click();
//	test9.log(Status.INFO, "Click Three Dot Button");
//	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//div[@id='hubdetails_dropdown']//div[1]")).click();
//	test9.log(Status.INFO, "Click Output the hub externally Menu");
//	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div[2]/div[4]/div/button")).click();
//	test9.log(Status.INFO, "Click Three Dot Button");
//	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div[2]/div[4]/div/div[2]/button[1]")).click();
//	test9.log(Status.INFO, "Click To Edit Button");
//	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//*[@id=\"basic-button-0\"]/div")).click();
//	test9.log(Status.INFO, "Click To the next Button");
//	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//div[contains(text(),'編集する')]")).click();
//	test9.log(Status.INFO, "Click discord radio Button");
//	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//button[@class='common_btn']")).click();
//	test9.log(Status.INFO, "Click To the next Button");
//	
//    Thread.sleep(5000);
//    driver.findElement(By.xpath("//button[@class='common_btn']")).click();
//    test9.log(Status.INFO, "Click English radio Button");
//    
//    Thread.sleep(5000);
//	driver.findElement(By.xpath("//button[@class='common_btn']")).click();
//	test9.log(Status.INFO, "Click To the next Button");
//	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//input[@value='TITLE_ONLY']")).click();
//	test9.log(Status.INFO, "Click Title only Button");
//	
//	Thread.sleep(5000);
//	driver.findElement(By.name("explanation")).clear();
//	test9.log(Status.INFO, "Clear OutputRSS usage (for notes)");
//	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//textarea[@placeholder='-例）メインコミュニティへの情報流通のため']")).sendKeys("Out Put RSS Update");
//	test9.log(Status.INFO, "Set OutputRSS usage (for notes)");
//	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//button[@class='common_btn']")).click();
//	test9.log(Status.INFO, "Click Completion button");
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//button[@class='hubTopModal_editConfirmClzBtn__pBb8f']")).click();
//	test9.log(Status.INFO, "Click close button");
//	
//	 String expectedTitle = "General Output RSS";
//     String originalTitle = driver.getTitle();
//     Assert.assertEquals(originalTitle, expectedTitle);
//     test9.log(Status.INFO, "Test Complite");
//	
//}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	@Test(priority = 1)
//	public void deleteOutPutRSS() throws InterruptedException {
//		ExtentTest test10 = extent.createTest("Scalably Lab Web Application", "Delete Output RSS");
//	    test10.log(Status.INFO, "Delete Output RSS ");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/section[1]/div[2]/div[2]")).click();
//		test10.log(Status.INFO, "Click Output RSS");
//	
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"basic-button-1\"]")).click();
//		test10.log(Status.INFO, "Click Three Dot Button");
//	
//	     Thread.sleep(5000);
//		driver.findElement(By.xpath("//div[@id='hubdetails_dropdown']//div[1]")).click();
//		test10.log(Status.INFO, "Click Output the hub externally Menu");
//		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div[2]/div[4]/div/button")).click();
//		test10.log(Status.INFO, "Click Three Dot Button");
//		
//		Thread.sleep(6000);
//		driver.findElement(By.className("common_btn")).click();
//		
//		//Thread.sleep(6000);
//		//driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div[2]/div[4]/div/div[2]/button[1]")).click();
//		//Thread.sleep(6000);
//		//driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div[2]/div[4]/div/div[2]/button[1]")).click();
//		
////		Thread.sleep(5000);
////		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div[2]/div[4]/div/button")).click();
////		
////		Thread.sleep(5000);
////		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div[2]/div[4]/div/div[2]/button[1]")).click();
//		
////		Thread.sleep(5000);
////		driver.findElement(By.xpath("//div[@class='NewsUI_dropdown__SKw_K']//div[2]")).click();
//		
//		
//	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test(priority = 1)
	public void name() {
		
	}
}

