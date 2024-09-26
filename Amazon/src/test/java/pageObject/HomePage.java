package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	public static WebDriver driver;
	
	By txtsearch = By.xpath("//input[@id='twotabsearchtextbox']");
	By btnsearch = By.xpath("//span[@id='nav-search-submit-text']");
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void searchProduct(String product) {
		driver.findElement(txtsearch).sendKeys(product);	
	}
	
	public void clickSearchBtn() {
		driver.findElement(btnsearch).click();		
	}
	
}