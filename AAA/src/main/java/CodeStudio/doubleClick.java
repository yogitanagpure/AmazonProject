package CodeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class doubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		WebElement dblClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
			
		Actions act = new Actions(driver);
		act.doubleClick(dblClick).perform();
		
		driver.close();

	}

}
