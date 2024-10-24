package CodeStudio;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRadioBtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List <WebElement> radiobtnlist = driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println("Total number of radio button   " + radiobtnlist.size());
		
		driver.close();
		
		

	}

}
