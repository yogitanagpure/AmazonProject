package ForDemo;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;

public class Login extends BaseTest {
	
	public static void main(String[] args) {
		  
		 try {
			driver.findElement(By.id("com.pwt.bhramar.superapp.zero:id/edtUsername")).sendKeys("stage54@pwt.com");
			driver.findElement(By.id("com.pwt.bhramar.superapp.zero:id/edtPassword")).sendKeys("1234567890");
			 driver.findElement(By.id("com.pwt.bhramar.superapp.zero:id/checkboxTermsPrivacy")).click();
			 driver.findElement(By.id("com.pwt.bhramar.superapp.zero:id/btnLogin")).click();
			 driver.manage().timeouts().implicitlyWait(Duration.ofHours(1)); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
}
	
	

