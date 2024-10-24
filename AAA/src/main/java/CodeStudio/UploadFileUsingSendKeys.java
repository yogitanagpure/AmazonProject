package CodeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileUsingSendKeys {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\yogita.hedau\\OneDrive - Periwinkle Technologies Pvt Ltd\\Desktop\\Register.txt");
		driver.close();
	}

}
