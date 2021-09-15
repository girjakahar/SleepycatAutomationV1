package order;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.LandingPageObject;
import pageobject.ProductDetailsPage;
import resources.BaseSleepycat;

public class AddToCartFlow extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(AddToCartFlow.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.info("Starting driver");
	}
	
    @Test
	public void addtocart() throws Exception
	{
    	
       driver.get(property.getProperty("url"));
       log.info("Website opened Successfully");
       
  	   driver.manage().window().maximize();
  	   log.info("Website is maximized");
  	   
  	   wait = new WebDriverWait(driver, 20);
  	   LandingPageObject landingPage = new LandingPageObject(driver);
  	   landingPage.offerModal();
  	   landingPage.maattheader();
	   log.info("Submenu link is opened");
	   
	   wait.until(ExpectedConditions.visibilityOf(landingPage.originalMattressHeader()));
	   landingPage.originalMattressHeader().click();
	   log.info("Clicked on first submenu option");
	   
  	   landingPage.offerModal();
	   ProductDetailsPage productDetails = new ProductDetailsPage(driver);
	   wait.until(ExpectedConditions.visibilityOf(productDetails.queenCategory()));
	   //pd.Scroll();
	   //pd.Queen().click();
	   log.info("Category is displayed");
	   
  	   landingPage.offerModal();
  	   productDetails.pageScroll();
	   log.info("Scrolled down to size section");
	   
	   //pd.cm().click();
	   //log.info("Clicked on cm option");
	   
  	   productDetails.sizeDropdown().click();
	   log.info("Clicked on sizedropdown field");
	   
	   wait.until(ExpectedConditions.visibilityOf(productDetails.singleOriginal78x36x6()));
	   productDetails.singleOriginal78x36x6().click();
	   log.info("Clicked on one size option from the dropdown");
	   
	   productDetails.addToCart();
	   log.info("Clicked on add to cart button");
		
	   System.out.println("Product is added in cart");
	   
	}
    
      @AfterTest 
	  public void closeDriver() throws IOException 
	  {
	    driver.quit();	  
		log.info("Driver is closed");

	  }
	 

}
