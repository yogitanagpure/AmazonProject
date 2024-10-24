package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPageNetApp {
	
		AndroidDriver ldriver;
		
		public LoginPageNetApp (AndroidDriver driver)
		{

			ldriver=driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}

		@AndroidFindBy(id="com.pwt.bhramar.superapp.zero:id/edtUsername")
		private WebElement txtEmail;
		
		@AndroidFindBy(id="com.pwt.bhramar.superapp.zero:id/edtPassword")
		private WebElement txtPassword;
		
		@AndroidFindBy(id="com.pwt.bhramar.superapp.zero:id/checkboxTermsPrivacy")
		private WebElement checkBox;
		
		@AndroidFindBy(id = "com.pwt.bhramar.superapp.zero:id/btnLogin")
		private WebElement btnLogin;
		
		public void setUserName(String uname) {
			txtEmail.clear();
			txtEmail.sendKeys(uname);
		}
		
		public void setPassword(String pwd)
		{
			txtPassword.clear();
			txtPassword.sendKeys(pwd);
		}
		
		public void clickCheckBox()
		{
			checkBox.click();
		}
		
		public void clickLogin()
		{
			btnLogin.click();
		}
			
}
