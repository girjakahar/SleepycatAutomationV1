package homepage;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.LandingPageObject;
import pageobject.LoginPageObject;
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
	
	
	
	@Test
	public void facebooklink() throws Exception
	{
		
	   driver.get("https://sleepycat.in/");
	   log.error("Website opened Successfully");
	       
	   driver.manage().window().maximize();
	   log.error("Website is maximized");
	  	   
	   wait = new WebDriverWait(driver, 20);
	   LandingPageObject landingPage = new LandingPageObject(driver);
	   landingPage.offerModal();
	   log.error("Offer modal is closed");
	   
	   WebElement facebook = landingPage.facebook();
	   //JavascriptExecutor executor = (JavascriptExecutor) driver;
	   //executor.executeScript("arguments[0].scrollIntoView();", facebook);
	   //executor.executeScript("window.scrollBy(0,4000)", "");
	   Actions move=new Actions(driver);
	   move.moveToElement(facebook).click().build().perform();
	   //landingPage.facebook().click();
	   log.error("Clicked on facebook");
       
	   LoginPageObject loginpage = new LoginPageObject(driver);
	   loginpage.switchingWindow();
	   log.error("Switched to facebook window");

	   String url = driver.getCurrentUrl();
	   log.error("Saving the current opened URL");

	   verifyLinkActive(url);
	   log.error("Verifying the opened URL Response code");
	   
	   System.out.println("Link verified");

	   
	}
	
	@Test
	public void instagramlink() throws Exception
	{
		
	   driver.get("https://sleepycat.in/");
	   log.error("Website opened Successfully");
	       
	   driver.manage().window().maximize();
	   log.error("Website is maximized");
	  	   
	   wait = new WebDriverWait(driver, 20);
	   LandingPageObject landingPage = new LandingPageObject(driver);
	   landingPage.offerModal();
	   log.error("Offer modal is closed");
	   
	   WebElement instagram = landingPage.instagram();
	   Actions move=new Actions(driver);
	   move.moveToElement(instagram).click().build().perform();
	   log.error("Clicked on instagram");
       
	   LoginPageObject loginpage = new LoginPageObject(driver);
	   loginpage.switchingWindow();
	   log.error("Switched to instagram window");

	   String url = driver.getCurrentUrl();
	   log.error("Saving the current opened URL");

	   verifyLinkActive(url);
	   log.error("Verifying the opened URL Response code");
	   
	   System.out.println("Link verified");
	   
	}
	
	@Test
	public void twitterlink() throws Exception
	{
		
	   driver.get("https://sleepycat.in/");
	   log.error("Website opened Successfully");
	       
	   driver.manage().window().maximize();
	   log.error("Website is maximized");
	  	   
	   wait = new WebDriverWait(driver, 20);
	   LandingPageObject landingPage = new LandingPageObject(driver);
	   landingPage.offerModal();
	   log.error("Offer modal is closed");
	   
	   WebElement twitter = landingPage.twitter();
	   Actions move=new Actions(driver);
	   move.moveToElement(twitter).click().build().perform();
	   log.error("Clicked on Twitter");
       
	   LoginPageObject loginpage = new LoginPageObject(driver);
	   loginpage.switchingWindow();
	   log.error("Switched to Twitter window");

	   String url = driver.getCurrentUrl();
	   log.error("Saving the current opened URL");

	   verifyLinkActive(url);
	   log.error("Verifying the opened URL Response code");
	   
	   System.out.println("Link verified");
	   
	}
	
	@Test
	public void youtubelink() throws Exception
	{
		
	   driver.get("https://sleepycat.in/");
	   log.error("Website opened Successfully");
	       
	   driver.manage().window().maximize();
	   log.error("Website is maximized");
	  	   
	   wait = new WebDriverWait(driver, 20);
	   LandingPageObject landingPage = new LandingPageObject(driver);
	   landingPage.offerModal();
	   log.error("Offer modal is closed");
	   
	   WebElement youtube = landingPage.youtube();
	   Actions move=new Actions(driver);
	   move.moveToElement(youtube).click().build().perform();
	   log.error("Clicked on Youtube");
       
	   LoginPageObject loginpage = new LoginPageObject(driver);
	   loginpage.switchingWindow();
	   log.error("Switched to Youtube window");

	   String url = driver.getCurrentUrl();
	   log.error("Saving the current opened URL");

	   verifyLinkActive(url);
	   log.error("Verifying the opened URL Response code");
	   
	   System.out.println("Link verified");
	   
	}
	
	@AfterTest
	public void close() throws IOException
	{
	   driver.quit();
	   log.error("Driver is closed");

	}
	
}
