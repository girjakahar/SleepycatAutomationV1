package homepage;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.LandingPageObject;
import resources.BaseSleepycat;

public class BannerLinking extends BaseSleepycat {

	public static Logger log = LogManager.getLogger(BannerLinking.class);

	@BeforeTest
	public void startingDriver() throws IOException 
	{
		driver = initializeChrome();
		log.error("Starting driver");

	}

	@Test
	public void firstBanner() throws Exception 
	{
	    driver.get("https://sleepycat.in/");
		log.error("Website is opened");

		LandingPageObject landingPage = new LandingPageObject(driver);
		landingPage.offerModal();
		log.error("Offer Modal is closed");

		landingPage.firstBanner().click();
		log.error("Clicked on first banner");

		String url = driver.getCurrentUrl();
		log.error("Fetching the current url");

		System.out.println(url);
		log.error("Printing the current opened url");

		verifyLinkActive(url);
		log.error("checking the response code for the opened url");

	}

	@Test
	public void secondBanner() throws Exception {

	    driver.get("https://sleepycat.in/");
		log.error("Website is opened");

		LandingPageObject landingPage = new LandingPageObject(driver);
		landingPage.offerModal();
		log.error("Offer Modal is closed");

		landingPage.nextbanner().click();
		log.error("Clicked on next banner icon on first banner");

		landingPage.secondBanner().click();
		log.error("Clicked on Second banner");

		String url = driver.getCurrentUrl();
		log.error("Fetching the current url");

		System.out.println(url);
		log.error("Printing the Current opened URL");

		verifyLinkActive(url);
		log.error("checking the response code for the opened url");

	}

	@Test
	public void thirdBanner() throws Exception {

	    driver.get("https://sleepycat.in/");
		log.error("Website is opened");

		LandingPageObject landingPage = new LandingPageObject(driver);
		landingPage.offerModal();
		log.error("Offer Modal is closed");

		landingPage.nextbanner().click();
		log.error("Clicked on next banner icon on first banner");

		landingPage.nextbanner().click();
		log.error("Clicked on next banner icon on Second banner");

		landingPage.thirdBanner().click();
		log.error("Clicked on Third banner");

		String url = driver.getCurrentUrl();
		log.error("Fetching the current url");

		System.out.println(url);
		log.error("Printing the Current opened URL");

		verifyLinkActive(url);
		log.error("checking the response code for the opened url");

	}

	@Test
	public void fourthBanner() throws Exception {

	    driver.get("https://sleepycat.in/");
		log.error("Website is opened");

		LandingPageObject landingPage = new LandingPageObject(driver);
		landingPage.offerModal();
		log.error("Offer Modal is closed");

		landingPage.nextbanner().click();
		log.error("Clicked on next banner icon on first banner");

		landingPage.nextbanner().click();
		log.error("Clicked on next banner icon on Second banner");

		landingPage.nextbanner().click();
		log.error("Clicked on next banner icon on third banner");

		landingPage.fourthBanner().click();
		log.error("Clicked on fourth banner");

		String url = driver.getCurrentUrl();
		log.error("Fetching the current url");

		System.out.println(url);
		log.error("Printing the Current opened URL");

		verifyLinkActive(url);
		log.error("checking the response code for the opened url");


	}

	@Test
	public void fifthBanner() throws Exception {

	    driver.get("https://sleepycat.in/");
		log.error("Website is opened");

		LandingPageObject landingPage = new LandingPageObject(driver);
		landingPage.offerModal();
		log.error("Offer Modal is closed");

		landingPage.nextbanner().click();
		log.error("Clicked on next banner icon on first banner");

		landingPage.nextbanner().click();
		log.error("Clicked on next banner icon on Second banner");

		landingPage.nextbanner().click();
		log.error("Clicked on next banner icon on Third banner");

		landingPage.nextbanner().click();
		log.error("Clicked on next banner icon on fourth banner");

		landingPage.fifthBanner().click();
		log.error("Clicked on fifth banner");

		String url = driver.getCurrentUrl();
		log.error("Fetching the current url");

		System.out.println(url);
		log.error("Printing the Current opened URL");

		verifyLinkActive(url);
		log.error("checking the response code for the opened url");

	}

	@AfterTest
	public void closeDriver() throws IOException
	{
		driver.quit();
		log.error("Driver is closed");

	}

}
