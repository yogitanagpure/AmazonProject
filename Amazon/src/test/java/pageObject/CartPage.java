package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CartPage {
	public static WebDriver driver;
	
	By cartBtnClick= By.xpath("//span[@id='nav-cart-count']");
	By dropDownClick = By.xpath("//span[@id='a-autoid-0-announce']");
	By quantityInput = By.id("quantity_2");
	By removeButton = By.cssSelector("input[value='Delete']");
    By emptyCartMessage = By.xpath("//h2[normalize-space()='Your Amazon Cart is empty.']");
	
	public CartPage(WebDriver driver) {
		 this.driver = driver;
    }
	
    public void clickOnCartBtn() {
    	driver.findElement(cartBtnClick).click();
    }

    public void updateQuantity() {
        driver.findElement(dropDownClick).click();
        driver.findElement(quantityInput).click();
    }

    public void isPriceUpdated() throws Exception {
    	
    	String priceForItem = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")).getText();
        String SingleItemPrice = priceForItem.replaceAll("[^\\d.]", "");
        
        System.out.println("Price for Single Item" + SingleItemPrice);
    	
    	float SumforTwoItem = Float.parseFloat(SingleItemPrice)+Float.parseFloat(SingleItemPrice);
    	System.out.println("Price of Two Item " + SumforTwoItem);
    	
    	Thread.sleep(3000);
    	String totalPrice = driver.findElement(By.xpath("//span[@id='sc-subtotal-amount-buybox']//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']")).getText();
    	System.out.println(totalPrice);
    	String TotalPriceforTwoItem = totalPrice.replaceAll("[^\\d.]", "");
    	
    	float TotalPriceOfCartItem = Float.parseFloat(TotalPriceforTwoItem);
    	System.out.println("TotalPrice" + TotalPriceOfCartItem);
    	
    	if (TotalPriceOfCartItem==SumforTwoItem)
    		
    	{
    		System.out.println("Updated Price for 2 Items" + TotalPriceOfCartItem);
    	}
    	Thread.sleep(3000);
    }

    public void removeProduct() throws Exception {
        driver.findElement(removeButton).click();
        Thread.sleep(3000);
    }

    public boolean cartEmpty() {
        return driver.findElement(emptyCartMessage).isDisplayed();
        
    }
}