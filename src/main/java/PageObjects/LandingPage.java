package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By button = By.xpath("//button[text()='NO THANKS']");
	By signin = By.cssSelector("a[href*='sign_in']");
	
	By title = By.cssSelector("div[class='text-center'] h2");
	By navbar = By.cssSelector("ul[class='nav navbar-nav navbar-right']");
	
	
	


	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}


	public WebElement getButton()
	{
		return driver.findElement(button);
		
	}
	
	public LoginPage getSignin()
	{
		 driver.findElement(signin).click();
		LoginPage lp = new LoginPage(driver);
		return lp;
	
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
		
	}
	public WebElement getNavBar()
	{
		return driver.findElement(navbar);
		
	}

}
