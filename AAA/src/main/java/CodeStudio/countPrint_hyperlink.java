package CodeStudio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countPrint_hyperlink {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.calculator.net/");
		
		driver.manage().window().maximize();
		
		List <WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Total no. of Link: " + list.size());
		
		for(WebElement el:list)
		{
			System.out.println(el.getText());
		}
		
		driver.close();
		

	}

}
