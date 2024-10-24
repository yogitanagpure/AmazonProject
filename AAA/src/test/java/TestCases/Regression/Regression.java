package TestCases.Regression;

import org.testng.annotations.Test;

import Keywords.Keyword;

/**
 * 
 * @author yogita.hedau
 *
 */

public class Regression {
	@Test
	public void tc_01() throws Exception {
	Keyword.openBrowser("Chrome");
	Thread.sleep(1000);
	Keyword.openURL("https://admin-demo.nopcommerce.com");
	Thread.sleep(1000);
	Keyword.maximizeBrowser();
	Thread.sleep(1000);
	Keyword.clearText("ID","Email");
	Thread.sleep(1000);
	Keyword.enterText("ID","Email","admin@yourstore.com");
	Keyword.clearText("ID", "Password");
	Thread.sleep(1000);
	Keyword.enterText("ID", "Password", "admin");
	Thread.sleep(1000);
	Keyword.selectCheckBox("ID","RememberMe");
	Thread.sleep(1000);
	Keyword.clickOnElement("XPATH", "//button[normalize-space()='Log in']");
	Thread.sleep(1000);
	Keyword.clickOnElement("XPATH", "//a[@href='#']//p[contains(text(),'Customers')]");
	Thread.sleep(3000);
	Keyword.clickOnElement("XPATH", "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]");
	Thread.sleep(1000);
	
	}

}
