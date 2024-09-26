package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	
public static WebDriver driver;
public static WebDriverWait wait;
	
	By noResultsMessage = By.xpath("//span[normalize-space()='No results for']");
	By homepageLabel = By.xpath("//a[@id='nav-logo-sprites']");
	By productList = By.cssSelector("div.s-main-slot");
	By fourthProduct = By.xpath("//button[@id='a-autoid-4-announce']");
	
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	// Method to check if products are displayed
	public void ProductDisplayed(String product) {
		driver.findElement(productList).isDisplayed();
		String pr= ('"'+ product +'"');
		String productname = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();
		System.out.println(productname);
		
		if(pr.equalsIgnoreCase(productname)){
            System.out.println("Product Display");
        }
		return;	
        }
   
    //Add the 4th product to the cart
	public void addFourthProductToCart() throws Exception {
		driver.findElement(fourthProduct).click();
		Thread.sleep(3000);				
	}	
	// Method to check if no results message is displayed
		public boolean NoResultsMessageDisplayed() {
			  return driver.findElement(noResultsMessage).isDisplayed();
		} 
		
		public void goToHomePage() throws Exception {
			driver.findElement(homepageLabel).click();
			Thread.sleep(3000);
		}

}
	
	
	