package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Keyword {

	/**
	 * Opens specified web browser.
	 * @param browserName {@code String} Browser name should only include Chrome, Firefox, Microsoft Edge.
	 * No browser is allowed apart form this.
	 */
		
	public static void openBrowser(String browserName) {
		switch (browserName)
		{
		case "Chrome" :
			Constants.driver =new ChromeDriver();
			break;
		case "Firefox":
			Constants.driver = new FirefoxDriver();
			break;
		case "Microsoft Edge" :
			Constants.driver = new EdgeDriver();
			break;
		default:
			System.err.println("Invalid browser name: " + browserName);
		}
	}
	
	public static void maximizeBrowser()
	{
		Constants.driver.manage().window().maximize();
	}
/**
 * It opens the specified url in web browser
 * driver instance
 * @param url {@code String} url to open
 * @Return void 
 */
	public static void openURL(String url){
		System.out.println(url + " is loading");
		Constants.driver.get(url);
	}
	
	public static WebElement getWebelement(String locatorType, String locatorValue) 
	{
		WebElement element=null;
		switch (locatorType)
		{
		case "XPATH":
			element=Constants.driver.findElement(By.xpath(locatorValue));
			break;
			
		case "CSS":
			element=Constants.driver.findElement(By.cssSelector(locatorValue));
			break;
			
		case "ID":
			element=Constants.driver.findElement(By.id(locatorValue));
			break;
			
		case "CLASSNAME":
			element=Constants.driver.findElement(By.className(locatorValue));
			break;
			
		case "LINKTEXT":
			element=Constants.driver.findElement(By.linkText(locatorValue));
			break;
			
		case "NAME":
			element=Constants.driver.findElement(By.name(locatorValue));
			break;
			
		case "PARTIALLINKTEXT" :
			element=Constants.driver.findElement(By.partialLinkText(locatorValue));
			break;
			
		case "TAGNAME":
			element=Constants.driver.findElement(By.tagName(locatorValue));
			break;
			
		default:
			System.err.println ("Invalid locator type: " + locatorType + " - Not allowed");
			break;
		}
		return element;
	}
	
	public static void clearText(String locatorType, String locatorValue)
	{
		getWebelement(locatorType, locatorValue).clear();
	}
	
	public static void enterText(String locatorType, String locatorValue, String textToEnter) 
	{
		getWebelement(locatorType, locatorValue).sendKeys(textToEnter);
	}
	
	public static void clickOnElement(String locatorType, String locatorValue) 
	{
		getWebelement(locatorType, locatorValue).click();
	}
	
	public static void selectValueFromDropdown(String locatorType, String locatorValue, String textToSelect) 
	{
		WebElement element= getWebelement(locatorType, locatorValue);
		Select select =new Select(element);
		select.deselectByVisibleText(textToSelect);
	}
	
	public static void selectCheckBox(String locatorType, String locatorValue) 
	{
		getWebelement(locatorType, locatorValue).click();
	}
}
