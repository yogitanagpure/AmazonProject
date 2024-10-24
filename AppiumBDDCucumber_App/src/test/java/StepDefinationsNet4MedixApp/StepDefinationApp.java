package StepDefinationsNet4MedixApp;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Hook;

public class StepDefinationApp extends Hook {
	
	private AndroidDriver driver;
	
	public StepDefinationApp() 
	{
		this.driver = Hook.getDriver();
	}
	
	//Lunch App
	@Given("User Lanch App")
	public void User_Lanch_App() throws Exception {
		Assert.assertTrue(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout")).isDisplayed());
		Thread.sleep(2000);		
	}

	@When("User see login page of App on mobile device")
	public void User_see_login_page_of_App_on_mobile_device() {
		 
		WebElement Login = driver.findElement(By.id("com.pwt.bhramar.superapp.zero:id/btnLogin"));
	
		if (Login.isDisplayed()==true)
		{
			System.out.println("App Lunches sucessfully");
		}		
	}

	@Then("User should see an app on my mobile device")
	public void User_should_see_an_app_on_my_mobile_device() {
		
		System.out.println("I can see the login page of app");    
	}
	
/*	//Login 
	@When("User enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) throws Exception {
		//driver.findElement(By.id("com.pwt.bhramar.superapp.zero:id/edtUsername")).sendKeys("StageAuto@pwt.com");
		
		//driver.findElement(By.id("com.pwt.bhramar.superapp.zero:id/edtPassword")).sendKeys("1234567890");
		
		lp.setUserName(email);
		Thread.sleep(2000);
	    lp.setPassword(password);
	    Thread.sleep(2000);
	}
	
	@When("User click on Check Box")
	public void user_click_on_check_box() {
		lp.clickCheckBox();
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		lp.clickLogin();
	}

	@Then("User verify page title should be {string}")
	public void user_verify_page_title_should_be(String title) {
		
		//Assert.assertEquals(driver.getTitle(), title);
		WebElement Login = driver.findElement(By.id("com.pwt.bhramar.superapp.zero:id/btnLogin"));
		driver.findElement(By.id("com.pwt.bhramar.superapp.zero:id/btnLogin")).click();
	
		if (Login.isDisplayed()==true)
		{
			System.out.println("App Lunches sucessfully");
		}
			    
	} */
}
	
	