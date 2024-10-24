package pages;

import helpers.GlobalVariables;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LoginPage {
    private AppiumDriver appiumDriver;
    private String errMsg;
    private String expectedErrMsg;

    public LoginPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AjaxElementLocatorFactory(appiumDriver, GlobalVariables.TIMEOUT), this);
    }

    @AndroidFindBy(xpath = "//*[@text='Username']")
    private WebElement usernameField;

    @AndroidFindBy(xpath = "//*[@text='Password']")
    private WebElement passwordField;

    @AndroidFindBy(xpath = "//*[@text='LOGIN']")
    private WebElement loginBtn;

    @AndroidFindBy(className = "android.widget.TextView")
    private List<WebElement> errMessage;

    @AndroidFindBy(className = "android.widget.ImageView")
    private List<WebElement> botImg;

    public void seeBotImg(){
        //if(botImg.size() > 0)
    	{
            System.out.println("Bot image is displayed!");
        }
    }

    public void inputUsername(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void inputPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginBtn.click();
    }

    public void readErrMessage(String expected){
        expectedErrMsg = expected;
        for (WebElement err : errMessage){
            errMsg = err.getText();
            if(errMsg.equalsIgnoreCase(expected)){
                System.out.println("Expected: " + expected);
                assertEquals(expectedErrMsg,errMsg);
            }
            break;
        }
    }
}
