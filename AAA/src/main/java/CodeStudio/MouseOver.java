package CodeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.ebay.com");

		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.linkText("Health & Beauty"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(element).perform();
		

	}

}
