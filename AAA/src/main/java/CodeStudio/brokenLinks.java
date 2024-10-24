package CodeStudio;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinks {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		
		int rescode=200;
		int brokenLinkCnt=0;
		
		System.out.println("Total Link on page:" + linkList.size());
		
		for(WebElement element:linkList)
		{
			String url = element.getAttribute("href");
			
			try {
			URL urlLink = new URL(url);
			HttpURLConnection huc = (HttpURLConnection)urlLink.openConnection();
			huc.setRequestMethod("HEAD");
			huc.connect();
			
			rescode =huc.getResponseCode();
			
			if (rescode >= 400)
			{
				System.out.println(url + "Broken Link");
				brokenLinkCnt ++;
			}
			
						}
			catch(MalformedURLException e)
			{
				
			}
			catch(Exception e)
			{
				
			}
		}
		
		System.out.println("Total broken links: " + brokenLinkCnt);
	}

}
