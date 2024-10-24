package CodeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws Exception {
		
		 	WebDriver driver;
	    	        
	    	driver = new ChromeDriver();
	        driver.get("https://www.amazon.in/");
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
	        driver.findElement(By.xpath("//span[@id='nav-search-submit-text']")).click();
	        
	        driver.findElement(By.xpath("//button[@id='a-autoid-4-announce']")).click();
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
	        driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']")).click();
	        driver.findElement(By.id("quantity_2")).click();
	               
	        String a ="12.00";
	        double val = Double.valueOf(a);
	        System.out.println("value of " +val);
	        double val1 = Double.parseDouble(a);
	        System.out.println("value of " +val1);
	        
	        double val3=val1 +val;
	        System.out.println("value of " +val3);
	        
	        String priceForItem = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")).getText();
	        String cleanedPrice = priceForItem.replaceAll("[^\\d.]", "");
	        
	        System.out.println("cleanedPrice" + cleanedPrice);
	    	
	    	float value = Float.parseFloat(cleanedPrice)+Float.parseFloat(cleanedPrice);
	    	
	    	//Float Total = Add(priceForItem + priceForItem);
	    	System.out.println("value of" + value);
	    	
	    	float itemPrice = Float.valueOf(priceForItem);
	    	System.out.println("itemPrice" + itemPrice);
	    	float itemPrice1 = Float.parseFloat(priceForItem);
	    	System.out.println("itemPrice" + itemPrice1);
	    	
	    	
	    	/*Double total = itemPrice * 2;
	    	System.out.println("total" + total);
	    	String totalPriceForItem = driver.findElement(By.xpath("//span[@id='sc-subtotal-amount-activecart']//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']")).getText();
	    	//Double totalItemPrice = Double.valueOf(totalPriceForItem);
	    	Double totalItemPrice = Double.parseDouble(totalPriceForItem);
	    	System.out.println("totalItemPrice" + totalItemPrice);
	    	
	    	if (total.equals(totalItemPrice))
	    	{
	    		System.out.println("Price is updated for 2 Items" + total);
	    	}*/
	        
	        
	}

}
