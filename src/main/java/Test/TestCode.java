package Test;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestCode extends Base{
	@Test(priority = 0)
	public void testCode() throws InterruptedException {
	
		//implicit wait
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
	   
	    String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
	    driver.findElement(By.linkText("urlLink")).sendKeys(selectLinkOpeninNewTab);
	    
	    // method Keys.chord
//	    String n = Keys.chord(Keys.CONTROL, Keys.ENTER);
//	    
//	    //open link in new tab
//	    driver.findElement(By.linkText("Team")).sendKeys(n);
//	    Thread.sleep(2000);
//	    // store window handle ids
//	    ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
//	    //switch to open tab
//	    driver.switchTo().window(w.get(1));
//	    System.out.println("New tab title: " + driver.getTitle());
//	    //switch to first tab
//	    driver.switchTo().window(w.get(0));
//	    System.out.println("First tab title: " + driver.getTitle());
//	    //driver.quit();
		
	}
	

}
