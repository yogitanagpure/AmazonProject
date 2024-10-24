package stepDefinations;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import io.cucumber.java.en.*;

public class AddCustomerSteps {

	public WebDriver driver;
    static String CustomerID;
    int integerValue ;

    
    @BeforeTest
    @Given("Open url as {string}")
    public void open_url_as(String url)  {
    	driver = new ChromeDriver();
  	   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(url);
        driver.manage().window().maximize();
    }
    //Add customer
    @When("click on Add Customer")
    public void click_on_add_customer() {
    	driver.findElement(By.xpath("//div[@class='flex-item left']//div//h3//a[@href='addcustomer.php'][normalize-space()='Add Customer']")).click();
	    driver.navigate().to("https://demo.guru99.com/telecom/addcustomer.php");
	   
    }
    
    @And("User verify page title should be Guru99 Telecom Add Customer")
    public void user_verify_page_title_should_be_guru99_telecom_add_customer() throws Exception  {
    	String title = "Guru99 Telecom Add Customer";
    	Assert.assertEquals(driver.getTitle(), title);
		Thread.sleep(2000);
    }

    @And("I fill customer details info as {string} and {string} and {string} and {string} and {string}")
    public void i_fill_customer_details_info_as_and_and_and_and(String Fname, String Lname, String Email, String Address , String MobileNo) {
        driver.findElement(By.id("fname")).sendKeys(Fname);
        driver.findElement(By.id("lname")).sendKeys(Lname);
        driver.findElement(By.id("email")).sendKeys(Email);
        driver.findElement(By.name("addr")).sendKeys(Address);
        driver.findElement(By.id("telephoneno")).sendKeys(MobileNo);
    }

    @And("I click on submit")
    public void i_click_on_submit() {
        driver.findElement(By.name("submit")).click();
    }

    @Then("the customer should be added successfully")
    public void the_customer_should_be_added_successfully() {
    	Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Access Details to Guru99 Telecom']")).getText().contains("Access Details to Guru99 Telecom"));
    	CustomerID= driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
    	
    	System.out.println(CustomerID);
    	integerValue = Integer.parseInt(CustomerID);
    	System.out.println(integerValue);
    	
    	driver.findElement(By.xpath("//a[@class='button']")).click();
    	
    }
        
    // Add Tariff Plan to Customer
    @And("Add Tariff Plan to Customer")
    public void add_tariff_plan_to_customer() throws Exception {
    	driver.findElement(By.xpath("//div[@class='flex-item left']//div//h3//a[@href='assigntariffplantocustomer.php'][normalize-space()='Add Tariff Plan to Customer']")).click();
	    driver.navigate().to("https://demo.guru99.com/telecom/assigntariffplantocustomer.php");
    	Thread.sleep(2000);   	
    }

    @And("User verify page title should be Guru99 Add Tariff Plan to Customer")
    public void user_verify_page_title_should_be_guru99_add_tariff_plan_to_customer() throws Exception  {
    	String title = "Guru99 Add Tariff Plan to Customer";
    	Assert.assertEquals(driver.getTitle(), title);
		Thread.sleep(2000);
    }
    @And("I fill CustomerID")
    public void i_fill_customer_id() throws Exception {   	
       driver.findElement(By.xpath("//input[@id='customer_id']")).sendKeys(String.valueOf(integerValue));
       Thread.sleep(2000);
    }
    
    @When("I click on submit to add plan")
    public void i_click_on_submit_to_add_plan() throws Exception {
    	driver.findElement(By.xpath("//input[@name='submit']")).click();
    	Thread.sleep(3000);
    }
   
    @Then("Tariff Plan to Customer should be added successfully")
    public void tariff_plan_to_customer_should_be_added_successfully() {
    	
    	String ValidCustID= (driver.findElement(By.xpath("//h2[normalize-space()='Approved Tariff Plans']")).getText());
    		
    	if (ValidCustID == "Approved Tariff Plans")
   	 	{
            System.out.println("Tariff plan assigned successfully!");
       } else {
             System.out.println("Failed to assign tariff plan.");
        } 
    	
    	
  }
}

