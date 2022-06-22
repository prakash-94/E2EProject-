package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.ForgotPassword;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import Resources.Base;

public class HomePage extends Base{
	
	public WebDriver driver;
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException 
	{
		driver = initializerDriver();
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.getButton().click();
		l.getSignin();
		
	}
	
	
	
	@Test(dataProvider= "getdata")
	public void basepageNavigation(String Username,String Password,String text) throws IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		
		log.info(text);
		System.out.println(text);
		
		ForgotPassword	fp = lp.ForgotPassword();
		fp.getEmail().sendKeys("xyz@qw.com");
		fp.SendMeInstructions().click();
		fp.Login().click();
		lp.getLogin().click();
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		
	}

	
	@DataProvider
	public  Object[][] getdata()
	{
	Object[][] data = new Object[2][3];
	
	data[0][0]= "NonRestricteduser@qw.com";
	data[0][1]= "123456";
	data[0][2]= "Restricted User";
	
	data[1][0]= "Restricteduser@qw.com";
	data[1][1]= "123456";
	data[1][2]= "NonRestricted User";
	
	
	return data;
	}		

}
