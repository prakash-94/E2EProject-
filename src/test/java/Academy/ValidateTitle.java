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

public class ValidateTitle extends Base{
	
	public WebDriver driver;
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void intializer() throws IOException
	{
	driver = initializerDriver();
	log.info("driver is initialized");
	driver.get(prop.getProperty("url"));
	log.info("suscesfully validated text message");
	
	}
	@Test
	public void ValidateAppTitle() throws IOException
	{
		LandingPage l = new LandingPage(driver);
		l.getButton();
		
		Assert.assertEquals(l.getTitle().getText(), "FEATURED 123COURSES");
		log.info("Sucessfully Navigated Text Message");
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}


}
