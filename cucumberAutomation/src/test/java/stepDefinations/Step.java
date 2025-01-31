package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

//public WebDriver driver;


public class Step {

public WebDriver driver;
public LoginPage lp;

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		lp=new LoginPage(driver);
	    driver =new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	}

	@When("user enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String uname1, String pass1) {
	    driver.findElement(By.id("email")).sendKeys(uname1);
	    driver.findElement(By.id("pass")).sendKeys(pass1);
	    
	}

	@When("click on submit button")
	public void click_on_submit_button() {
	    
	    driver.findElement(By.name("login")).click();
	}

	@Then("user should be login")
	public void user_should_be_login() {
	    System.out.println("login");
	    
	}
	
	@Then("browser should be closed")
	public void browser_should_be_closed() {
	    driver.close();
	}
	
	
}
