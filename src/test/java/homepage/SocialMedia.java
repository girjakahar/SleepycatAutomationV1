package homepage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.LandingPageObject;
import resources.BaseSleepycat;

public class SocialMedia extends BaseSleepycat
{
	public RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(SocialMedia.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	 
	}
	
	@AfterTest
	public void close() throws IOException
	{
	   driver.quit();
	 
	}
	
	
	@Test
	public void facebooklink() throws Exception
	{
		
	   driver.get(property.getProperty("url"));
	   log.info("Website opened Successfully");
	       
	   driver.manage().window().maximize();
	   log.info("Website is maximized");
	  	   
	   wait = new WebDriverWait(driver, 20);
	   LandingPageObject landingPage = new LandingPageObject(driver);
	   landingPage.offerModal();
	   log.info("Offer modal is closed");
	   
	   //WebElement Ele = l.Facebook();
	   JavascriptExecutor executor = (JavascriptExecutor) driver;
       //js.executeScript("arguments[0].scrollIntoView();", Ele);
	   executor.executeScript("window.scrollBy(0,4000)", "");
	   landingPage.facebook().click();
	   log.info("Clicked on facebook");

	   Set<String> window = driver.getWindowHandles();
	   Iterator<String> it = window.iterator();
	   String Parentid=it.next();
	   log.info("parent window id");

	   String Childid=it.next();
	   log.info("parent window id");

       driver.switchTo().window(Childid);
	   log.info("Switched to child window");

	   String url = driver.getCurrentUrl();
	   log.info("Saving the current opened URL");

	   verifyLinkActive(url);
	   log.info("Verifying the opened URL Response code");
	   
	}
	
}
