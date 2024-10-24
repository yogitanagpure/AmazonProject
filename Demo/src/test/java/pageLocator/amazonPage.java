package pageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonPage {
	
	public static WebDriver driver;
	
	By txtsearch = By.xpath("//input[@id='twotabsearchtextbox']");
	By btnsearch = By.xpath("//span[@id='nav-search-submit-text']");
	By btnaddToCart = By.xpath("//button[@id='a-autoid-4-announce']");
	
	public amazonPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void searchProduct(String product) {
		driver.findElement(txtsearch).sendKeys(product);	
	}
	
	public void clickSearchBtn() {
		driver.findElement(btnsearch).click();		
	}
	
	public void clickOnAddToCart() {
		driver.findElement(btnaddToCart).click();
	}
	

}
