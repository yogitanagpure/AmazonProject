package steps;

import java.io.IOException;

import com.testinium.deviceinformation.exception.DeviceNotFoundException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import pages.ProductsPage;
import setups.DriverSetup;

public class LoginStep {
    LoginPage loginPage = new LoginPage(DriverSetup.getAppiumDriver());
    ProductsPage productsPage = new ProductsPage(DriverSetup.getAppiumDriver());

    public LoginStep() throws IOException, DeviceNotFoundException, Exception {	
    	
    }
    
    @Given("user input username as {string}")
    public void user_input_username_as(String username) {
        // Your implementation to input username
    	loginPage.inputUsername(username);
        System.out.println("User inputs username as: " + username);
    }
    
    /*@Given("user input username")
    public void userInputUsername(String username){
        loginPage.inputUsername(username); 
    }*/

    @And("user input password")
    public void userInputPassword(String password) {
        loginPage.inputPassword(password);
    }

    @And("user click Login button")
    public void userClickLoginButton() throws Exception {
        loginPage.clickLogin();
        Thread.sleep(20000);
    }

    @Then("user redirected to page")
    public void userRedirectedToProductPage(String expected) {
        productsPage.readTitlePage(expected);
    }

    @Then("warning message appear")
    public void warningMessageAppear(String expected) {
        loginPage.readErrMessage(expected);
    }
}