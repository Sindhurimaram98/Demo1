package step_def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Demoweblogin {
	WebDriver driver;

	
	@Given("The user is on demowebshop home page")
	public void the_user_is_on_demowebshop_home_page() {
		driver=MyDrivers.getDriver("chrome");
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	    
	}

	@Given("chooses to login")
	public void chooses_to_login() {
	  driver.findElement(By.xpath("//a[text()='Log in']")).click();
	}

	@When("the user enters valid username and password")
	public void the_user_enters_valid_username_and_password() {
	  driver.findElement(By.name("Email")).sendKeys("karthik456@gmail.com");
	  driver.findElement(By.name("Password")).sendKeys("karthik456");
	}

	@When("clicks on login")
	public void clicks_on_login() {
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	   
	}

	@Then("user sees a  home page")
	public void user_sees_a_home_page() {
		String etitle="Demo Web Shop";
	    String atitle=driver.getTitle();
	    Assert.assertEquals(etitle, atitle);
	    System.out.println("login succesfull");
	   
	}
	@Given("Again the user is on home page")
	public void again_the_user_is_on_home_page() {
	    System.out.println("home page");
	}

	@Given("user searches for products in search bar")
	public void user_searches_for_products_in_search_bar() {
	   System.out.println("enter product in search");
	}

	@When("user clicks on search")
	public void user_clicks_on_search() {
	    System.out.println("click on search");
	}

	@Then("product is displayed")
	public void product_is_displayed() {
	   System.out.println("product display");
	}
	
	
	
	@Given("Again the user is on Demoweb login")
	public void again_the_user_is_on_Demoweb_login() {
		driver=MyDrivers.getDriver("chrome");
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[text()='Log in']")).click();
	}

	@Given("user provides {string} and {string}")
	public void user_provides_and(String Email, String Password)
	{
	driver.findElement(By.name("Email")).sendKeys(Email);
	  driver.findElement(By.name("Password")).sendKeys(Password);
	}

	@When("he clicks on login")
	public void he_clicks_on_login() {
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}

	@Then("he is on home page")
	public void he_is_on_home_page() {
		String etitle="Demo Web Shop";
	    String atitle=driver.getTitle();
	    Assert.assertEquals(etitle, atitle);
	    System.out.println("login succesfull");
	}

}
