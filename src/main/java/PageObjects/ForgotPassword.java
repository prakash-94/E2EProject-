package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
	
	public WebDriver driver;
	
	By email = By.cssSelector("input[id='user_email']");
	By sendmeinstructions = By.cssSelector("[type='submit']");
	By login = By.xpath("(//a[@class='nav-link'])[3]");
	
	

	public ForgotPassword(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement  SendMeInstructions()
	{
		return driver.findElement(sendmeinstructions);
	}
	
	public WebElement Login()
	{
		return driver.findElement(login);
	}

}
