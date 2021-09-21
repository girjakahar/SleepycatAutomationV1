package addtocartproductflow;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.LandingPageObject;
import pageobject.ProductDetailsPage;
import resources.BaseSleepycat;

public class DefaultCuddlePillowProduct extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(DefaultCuddlePillowProduct.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.info("Starting driver");
	}
	
	 @Test
		public void defaultCuddlePillowAddToCart() throws Exception
		{
	    	
	       driver.get("https://sleepycat.in/");
	       log.info("Website opened Successfully");
	       
	  	   driver.manage().window().maximize();
	  	   log.info("Website is maximized");
	  	   
	  	   wait = new WebDriverWait(driver, 20);
	  	   LandingPageObject landingpage = new LandingPageObject(driver);
	  	   landingpage.offerModal();
	  	   landingpage.pillowHeader();
		   log.info("Submenu link is opened");
		   
		   wait.until(ExpectedConditions.visibilityOf(landingpage.cuddlePillowMenu()));
		   landingpage.cuddlePillowMenu().click();
		   log.info("Clicked on Cuddle Pillow Menu option");
		   
	  	   landingpage.offerModal();
		   ProductDetailsPage productdetail = new ProductDetailsPage(driver);
		   
	  	   landingpage.offerModal();
	  	   productdetail.pageScroll();
		   log.info("Scrolled down to size section");
		   
		   productdetail.addToCart();
		   log.info("Clicked on add to cart button");
		   
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-GRBDPILWSET-S-50x19']")));
			
			boolean productname = driver.findElement(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-GRBDPILWSET-S-50x19']")).isDisplayed();
			if(productname) 
			{
				System.out.println("Standard category Cuddle pillow product is added in cart");
				log.info("Standard category Cuddle pillow product is added in cart");
			}else
			{
				System.out.println("Standard category Cuddle pillow product is not added in cart");
				log.info("Standard category Cuddle pillow product is not added in cart");
			}	
		}
	 
	  @AfterTest 
	  public void closeDriver() throws IOException 
	  {
	    driver.quit();	  
		log.info("Driver is closed");
	  }

}
