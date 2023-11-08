package BaseClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public void launchBrowser()
	{
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		
	}
	

}
