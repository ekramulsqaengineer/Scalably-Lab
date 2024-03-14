package Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Test(priority = 1)
public class SignUp extends Base{
	public void signUP() {
		driver.findElement(By.linkText("Username")).sendKeys("dev");
		
	}

}
