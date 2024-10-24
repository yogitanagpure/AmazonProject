package ForDemo;

import java.net.URL;
import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {
	static DesiredCapabilities dc;
	static AndroidDriver driver;
	
	public static void main(String[] args) throws Exception
	{
		dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo TB-8504X");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		//dc.setCapability(MobileCapabilityType.UDID, "10.1.0.154:5555");
		dc.setCapability(MobileCapabilityType.UDID, "HGAGQSZM");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\yogita.hedau\\eclipse-workspace\\AppiumBDDCucumber_App\\App\\N4M_ENC_DEC_V65_Stage_16_Jan_24_1.apk");
		
		driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		System.out.println("App Lunches sucessfully");
		
		Thread.sleep(40000);
		
		//String title = driver.getTitle() ;
				
		//Assert.assertEquals(driver.getTitle(), title);
		WebElement Login = driver.findElement(By.id("com.pwt.bhramar.superapp.zero:id/btnLogin"));
		driver.findElement(By.id("com.pwt.bhramar.superapp.zero:id/btnLogin")).click();
	
		if (Login.isDisplayed()==true)
		{
			System.out.println("App Lunches sucessfully");
		}
		//System.out.println(title);
				
		driver.findElement(By.id("com.pwt.bhramar.superapp.zero:id/edtUsername")).sendKeys("StageAuto@pwt.com");
		driver.findElement(By.id("com.pwt.bhramar.superapp.zero:id/edtPassword")).sendKeys("1234567890");
		 driver.findElement(By.id("com.pwt.bhramar.superapp.zero:id/checkboxTermsPrivacy")).click();
		 driver.findElement(By.id("com.pwt.bhramar.superapp.zero:id/btnLogin")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofHours(1)); 
		
	}
	
/*	public void swipeAction(WebElement ele, String direction)
	{
		((JavascriptExecutor) driver).executeScript("mobile:swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)ele).getId(),
				"direction", direction,
				"percent", 0.75
		));
	}
	
	/*	@AfterClass
	public void tearDown()
	{
		driver.quit();
		
	}*/



}