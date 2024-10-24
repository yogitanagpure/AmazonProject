package CrossBrowser;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {
	WebDriver driver;
	FirefoxOptions firefoxoptions = new FirefoxOptions();
	//ChromeOptions chromeoptions = new ChromeOptions();
	//EdgeOptions edgeoptions =new EdgeOptions();
	
	@Parameters ("browser")
	@BeforeTest
	public void initialize (String browser) throws Exception
	{
		if (browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
			Thread.sleep(3000);
			System.out.println("FireFox is lunched");
		}
	/*	else
		{
			System.out.println("not lunched");
		}
		/* else if (browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			Thread.sleep(3000);
			System.out.println("Chrome is lunched");
		}
		else if (browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
			Thread.sleep(3000);
			System.out.println("Edge is lunched");
		}*/
	}
	
  @Test
  public void citibanklogin() throws Exception
  {
	  driver.get("https://www.citi.com");
	  //Thread.sleep(3000);
	  String actual =driver.getTitle();
	  String except = "citi";
	  Assert.assertEquals(actual.contains("citi"), except.contains("citi")); 
  }
  
  @AfterTest
  public void endTest() 
  {
	  //driver.quit();
  }
}
