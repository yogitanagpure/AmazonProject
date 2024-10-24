package CodeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=cms/demo");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).click();
		
		if (driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution"))
			{
				System.out.println("Test Pass");
			}
		else
		{
				System.out.println("Test Fail");
		}
		
		driver.close();
	}

}
