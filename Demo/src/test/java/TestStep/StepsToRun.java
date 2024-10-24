package TestStep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLocator.amazonPage;


public class StepsToRun {
	 WebDriver driver;
	 amazonPage ap;
			
	@Given("I am on the Amazon homepage")
	public void i_am_on_the_Amazon_homepage() {
		
		driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize(); 
	    ap = new amazonPage(driver);
	}


	@When("I Enter product as {string} in the search bar")
	public void i_enter_product_as_in_the_search_bar(String newproduct) {
		
		ap.searchProduct(newproduct);
	    ap.clickSearchBtn();
	}
	
	@When("I should see product results containing {string}")
	public void i_should_see_product_results_containing(String string) {
	    
	}
	
	@Then("I add the 4th product from the results to the cart")
	public void i_add_the_4th_product_from_the_results_to_the_cart() {
		ap.clickOnAddToCart();
	}
	
	
}




















/* WebDriver driver;
	
	
	@Given("Open url as {string}")
	public void open_url_as(String url) {
		driver = new ChromeDriver();
  	   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(url);
        driver.manage().window().maximize();
	}

	@When("click on Add Customer")
	public void click_on_add_customer() {
	    driver.findElement(By.xpath("//div[@class='flex-item left']//div//h3//a[@href='addcustomer.php'][normalize-space()='Add Customer']")).click();
	    driver.navigate().to("https://demo.guru99.com/telecom/addcustomer.php");
	 
	}
	
	@When("User verify page title should be Guru99 Telecom Add Customer")
	public void user_verify_page_title_should_be_guru99_telecom_add_customer() {
	   
	}

	@When("I fill customer details info as {string} and {string} and {string} and {string} and {string}")
	public void i_fill_customer_details_info_as_and_and_and_and(String string, String string2, String string3, String string4, String string5) {
	    
	}

	@When("I click on submit")
	public void i_click_on_submit() {
	    
	}

	@Then("the customer should be added successfully")
	public void the_customer_should_be_added_successfully() {
	    
	}

 */
