package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import PageObjects.LandingPage;
import PageObjects.LoginPage;
import Resources.Base;

public class ValidateNavigationbar extends Base{
	
	public WebDriver driver;
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializerDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void BasepageNavigation() throws IOException
	{	
		LandingPage l = new LandingPage(driver);
		l.getButton();
		Assert.assertTrue(l.getNavBar().isDisplayed());
		log.info("sucesfully navigation bar is displayed");
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}


}
