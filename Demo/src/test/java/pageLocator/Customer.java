package pageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Customer {
	
	public WebDriver ldriver;
	
	public Customer (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//WebElement
	
	//Locator 1st method
	@FindBy(id="fname")
	WebElement  txtFName ;
	
	//Locator 2nd method
	By txtLName = By.id("lname");
	
	//Locator 3rd method
	@FindBy (how=How.ID, using = "email")
	WebElement txtEmail;
	
	@FindBy(how=How.ID, using ="message")
	WebElement txtAddress;
	
	@FindBy(id="telephoneno")
	WebElement txtPhone;
	
	By BtnSubmit = By.name("telephoneno");
	By BtnReset = By.xpath("//input[@value='Reset']");
	
	//User defined methods
	public void setFname(String Fname)
	{
		txtFName.sendKeys(Fname);
	}
	
	public void setLname(String Lname)
	{
		ldriver.findElement(txtLName).sendKeys(Lname);
	}
	
	public void setEmail(String eMail)
	{
		txtEmail.sendKeys(eMail);
	}
	
	public void setAddress(String Address)
	{
		txtAddress.sendKeys(Address);
	}
	
	public void setMobileNo(String MobileNo)
	{
		txtPhone.sendKeys(MobileNo);
	}
	
	public void clickSubmit()
	{
		ldriver.findElement(By.name("telephoneno")).click();
	}

}
