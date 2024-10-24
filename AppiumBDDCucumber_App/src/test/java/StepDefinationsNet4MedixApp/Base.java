package StepDefinationsNet4MedixApp;

import java.net.URL;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pageObject.LoginPageNetApp;

public class Base {
	
	static DesiredCapabilities dc;
	static AndroidDriver driver;
	public LoginPageNetApp lp;
	
	@BeforeClass
	public void configureAppium() throws Exception 
	{
		dc= new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		 
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		 
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");  
		 
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo TB-8504X");  
		 
		dc.setCapability(MobileCapabilityType.UDID, "10.1.0.154:5555"); //10.1.0.153:5555
		
		dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\yogita.hedau\\eclipse-workspace\\AppiumBDDCucumber_App\\App\\N4M_ENC_DEC_V65_Stage_16_Jan_24_1.apk");
		 
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc); ///wd/hub
		
		Thread.sleep(40000);
}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		
	}
}
