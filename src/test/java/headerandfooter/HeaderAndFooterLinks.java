package headerandfooter;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.LandingPageObject;
import resources.BaseSleepycat;

public class HeaderAndFooterLinks extends BaseSleepycat {		
		
		public RemoteWebDriver driver;
		public static Logger log =LogManager.getLogger(HeaderAndFooterLinks.class);

		@BeforeTest
		public void startingDriver() throws IOException
		{
			driver=initializeChrome();
			log.info("Starting driver");

		  }
		
		@Test
		public void homepageLink() throws Exception
		{
		    driver.get("https://sleepycat.in/");
		    log.info("Website opened Successfully");

			LandingPageObject landingpage = new LandingPageObject(driver);
			landingpage.offerModal();
		    log.info("Offer modal is closed");

			List<WebElement> links=driver.findElements(By.tagName("a"));//This is for complete homepage
			System.out.println("Total Homepagelink are "+links.size());
		    log.info("Total Homepage links are calculated");
			
			for(int i=0;i<links.size();i++)
			{
				
				WebElement ele= links.get(i);
				
				String url=ele.getAttribute("href");
				
				verifyLinkActive(url);
				
			}
			log.info("Homepage links are done");
		}
		
		@Test
		public void headerLink() throws Exception
		{
		    driver.get("https://sleepycat.in/");
			log.info("Website opened Successfully");
			
			LandingPageObject landingpage = new LandingPageObject(driver);
			landingpage.offerModal();
		    log.info("Offer modal is closed");

		    List<WebElement> links=driver.findElements(By.xpath("//div[@class='header_row_1 sec']//a"));//This is for checking Header only
			System.out.println("Total Headerlink are "+links.size());
		    log.info("Total  HeaderLinks are calculated");

			for(int i=0;i<links.size();i++)
			{
				
				WebElement ele= links.get(i);
				
				String url=ele.getAttribute("href");
				
				verifyLinkActive(url);
				
			}
			log.info("Header links are done");

		}
		
		@Test
		public void menuLink() throws Exception
		{
		    driver.get("https://sleepycat.in/");
			log.info("Website opened Successfully");

			LandingPageObject landingpage = new LandingPageObject(driver);
			landingpage.offerModal();
		    log.info("Offer modal is closed");

			List<WebElement> links=driver.findElements(By.xpath("//div[@class='header_row_3']//a"));//This is for menu links only
			System.out.println("Total menulink are "+links.size());
		    log.info("Total Menu Links are calculated");

			for(int i=0;i<links.size();i++)
			{
				
				WebElement ele= links.get(i);
				
				String url=ele.getAttribute("href");
				
				verifyLinkActive(url);
				
			}
			log.info("Menu links are done");

		}
		
		@Test
		public void Footerlink() throws Exception
		{
		    driver.get("https://sleepycat.in/");
			log.info("Website opened Successfully");

			LandingPageObject landingpage = new LandingPageObject(driver);
			landingpage.offerModal();
		    log.info("Offer modal is closed");

			List<WebElement> links=driver.findElements(By.xpath("//div[@class='footer-bottom clearfix']//a"));//this is only for footer only
			System.out.println("Total Footerlink are "+links.size());
		    log.info("Total Footer Links are calculated");
			
			for(int i=0;i<links.size();i++)
			{
				
				WebElement ele= links.get(i);
				
				String url=ele.getAttribute("href");
				
				verifyLinkActive(url);
				
			}
			log.info("Footer links are done");

		}
		
		 @AfterTest 
		  public void closeDriver() throws IOException 
		  {
		    driver.quit();	  
			log.info("Driver is closed");

		  }
		 
		


	}

