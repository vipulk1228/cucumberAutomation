package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

public WebDriver driver;

public LoginPage(WebDriver driver)
 {
	this.driver=driver;
	PageFactory.initElements(driver, this);
 }

@FindBy(id="email")
WebElement email1;

@FindBy(id="pass")
WebElement pass1;

@FindBy(name="login")
WebElement loginBtn;

public void setUsername(String uName)
 {
	email1.sendKeys(uName);
 }

public void setPassword(String Pass)
{
	pass1.sendKeys(Pass);
}

public void clickLgnBtn()
 {
	loginBtn.click();
 }

public void closeBrowser()
{
	driver.close();
	}
}
