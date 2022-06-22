package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	
	By email = By.cssSelector("input[id='user_email']");
	By password = By.cssSelector("input[type='password']");
	By login = By.cssSelector("input[type='submit']");
	By forgotpassword = By.cssSelector("a[class='link-below-button']");
	

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	public PageObjects.ForgotPassword ForgotPassword()
	{
		driver.findElement(forgotpassword).click();
		return  new ForgotPassword(driver);
		
	}
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
		
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
		
	}

}
