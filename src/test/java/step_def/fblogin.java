package step_def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import step_def.MyDrivers;

public class fblogin {
	WebDriver d;
	 
	 
	@Given("user have chosen to sign in from home page")
	public void user_have_chosen_to_sign_in_from_home_page() {
		d=MyDrivers.getDriver("chrome");
		d.get("https://en-gb.facebook.com/login/");
	 
	    
	}

	@When("user gives valid username and password")
	public void user_gives_valid_username_and_password() {
		
		d.findElement(By.xpath("//input[@name='email']")).sendKeys("dfjfjdj");
		d.findElement(By.name("pass")).sendKeys("fufh");
		
		}
	@When("clicks on login button")
	public void clicks_on_login_button() {
	   d.findElement(By.name("login")).click();
	}

	@Then("user shall be able to login and should be taken to home page")
	public void user_shall_be_able_to_login_and_should_be_taken_to_home_page() 
	{
	System.out.println("hello");
	}

	@Then("sees his timeline page .")
	public void sees_his_timeline_page() {
	    System.out.println("welcome to fb");

}
}
   