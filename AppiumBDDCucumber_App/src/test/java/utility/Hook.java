package utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
	private static AndroidDriver driver;
		
	@Before("@appium")
	public void setUpAppium() throws MalformedURLException
	{
			
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//cap.setCapability(MobileCapabilityType.UDID, "10.1.0.153:5555");
		cap.setCapability(MobileCapabilityType.UDID, "HGAGQSZM"); 
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "TB-8504X");
		cap.setCapability(MobileCapabilityType.APP,"C:\\Users\\yogita.hedau\\eclipse-workspace\\AppiumBDDCucumber_App\\App\\N4M_ENC_DEC_V65_Stage_16_Jan_24_1.apk");
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap); ///wd/hub
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	public static AndroidDriver getDriver()
	{
		return driver;
	}
	
}

