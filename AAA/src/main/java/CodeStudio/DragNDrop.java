package CodeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		
		driver.manage().window().maximize();
		
		WebElement Rome = driver.findElement(By.id("box6"));
		WebElement Italy = driver.findElement(By.id("box106"));
		
		WebElement Madrid = driver.findElement(By.id("box7"));
		WebElement Spain  = driver.findElement(By.id("box107"));
		
		WebElement Oslo = driver.findElement(By.id("box1"));
		WebElement Norway = driver.findElement(By.id("box101"));
		
		WebElement Copenhagen = driver.findElement(By.id("box4"));
		WebElement Denmark = driver.findElement(By.id("box104"));
		
		WebElement Seoul = driver.findElement(By.id("box5"));
		WebElement South_Korea = driver.findElement(By.id("box105"));
		
		WebElement Stockholm = driver.findElement(By.id("box2"));
		WebElement Sweden = driver.findElement(By.id("box102"));
		
		WebElement Washington = driver.findElement(By.id("box3"));
		WebElement United_States = driver.findElement(By.id("box103"));
				
		Actions act = new Actions(driver);
		act.dragAndDrop(Rome, Italy).perform();
		act.dragAndDrop(Madrid, Spain).perform();
		act.dragAndDrop(Oslo, Norway).perform();
		act.dragAndDrop(Copenhagen, Denmark).perform();
		act.dragAndDrop(Seoul, South_Korea).perform();
		act.dragAndDrop(Stockholm, Sweden).perform();
		act.dragAndDrop(Washington, United_States).perform();
		
				
	}

}
