package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pageObject.CartPage;
import pageObject.HomePage;
import pageObject.SearchPage;

public class stepDefination {
	WebDriver driver;
	HomePage homePage;
	SearchPage searchpage;
	CartPage cartPage;


	@Given("I am on the Amazon homepage")
	public void i_am_on_the_Amazon_homepage() {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); 
		homePage = new HomePage(driver);
		searchpage= new SearchPage (driver);
		cartPage = new CartPage(driver);
	}

	@When("I Enter product as {string} in the search bar")
	public void i_enter_product_as_in_the_search_bar(String product) {
		homePage.searchProduct(product);
		homePage.clickSearchBtn();
	}

	@And("I should see a {string} message")
	public void i_should_see_a_message(String string) {
		searchpage.NoResultsMessageDisplayed();
	}

	@And("I click on amazon.in label go to home page")
	public void i_click_on_amazon_in_label_go_to_home_page() throws Exception {
		searchpage.goToHomePage();
	}

	@And("I should see product results containing {string}")
	public void i_should_see_product_results_containing(String product) {
		searchpage.ProductDisplayed(product);
	}

	@And("I add the 4th product from the results to the cart")
	public void i_add_the_4th_product_from_the_results_to_the_cart() throws Exception {
		searchpage.addFourthProductToCart();
		Thread.sleep(3000);
	}

	@And("I am on the cart page")
	public void i_am_on_the_cart_page() {
		cartPage.clickOnCartBtn();
	}

	@And("I should see product in cart")
	public void i_should_see_product_in_cart() {
		cartPage.updateQuantity();
	}

	@Then("The cart should reflect the updated quantity and price")
	public void the_cart_should_reflect_the_updated_quantity_and_price() throws Exception {
		cartPage.isPriceUpdated();
	}

	@When("I remove the product from the cart")
	public void i_remove_the_product_from_the_cart() throws Exception {
		cartPage.removeProduct(); 
	}

	@Then("the cart should be empty")
	public void the_cart_should_be_empty() {
		cartPage.cartEmpty();

	}

}