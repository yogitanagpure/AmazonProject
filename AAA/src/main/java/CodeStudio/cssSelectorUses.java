package CodeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorUses {
	
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		//ChromeDriver driver =new ChromeDriver();
				
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		// It will return the parent window name as a String
		String currentWindowHandle=driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandle);
		
		// Tag and id (tag#id)
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		// Tag and class (tag.classname)
		//tag#id
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		
		// Tag and attribute (tag[attribute=value])
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		
		//Tag,class and attribute (tag.valueofClass[attribute=value])
		
		driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-backpack")).click();
		
		//Sub-string (start with =^, ends with=$, contains=*), tag[attribute^=substring]
		driver.findElement(By.cssSelector("button[id $= jacket]")).click();
		
	}

}
