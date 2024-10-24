package CodeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class rightClick {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");		
		driver.manage().window().maximize();
		
		WebElement btn= driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		Actions act =new Actions(driver); 
		act.contextClick(btn).perform();
		
		driver.close();
		
		
		
	}

}
