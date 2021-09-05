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

import pageobject.CartSlider;
import pageobject.LandingPageObject;
import resources.BaseSleepycat;

public class CartHandling extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(CartHandling.class);
	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.info("Starting driver");
	}
	
    @Test
	public void cartHandling() throws Exception
	{
    	
       driver.get(property.getProperty("url"));
       log.info("Website opened Successfully");
       
  	   driver.manage().window().maximize();
  	   log.info("Website is maximized");
  	   
  	   wait = new WebDriverWait(driver, 20);
  	   LandingPageObject landingPage = new LandingPageObject(driver);
	   landingPage.offerModal();
  	   log.info("Offer modal is closed");

  	   CartSlider cart = new CartSlider(driver);
	   wait.until(ExpectedConditions.visibilityOf(landingPage.cartIcon()));
	   landingPage.cartIcon().click();
  	   log.info("Clicked on Cart icon");
       
  	   Thread.sleep(2000L);
	   wait.until(ExpectedConditions.visibilityOf(cart.addtocartSingleComforter()));
  	   cart.addtocartSingleComforter().click();
  	   log.info("Click on Add to cart button for single comforter");
  	   
  	   Thread.sleep(2000L);
	   wait.until(ExpectedConditions.visibilityOf(cart.incrementQuantity()));
  	   cart.incrementQuantity().click();
  	   log.info("Increment product quantity");
       
  	   Thread.sleep(2000L);
	   wait.until(ExpectedConditions.visibilityOf(cart.decreseQuantity()));
  	   cart.decreseQuantity().click();
  	   log.info("Decrese quantity by one");

  	   Thread.sleep(2000L);
  	   cart.removeProduct().click();
  	   log.info("Clicked on remove product icon from cart slider ");

}
    
      @AfterTest 
	  public void closeDriver() throws IOException 
	  {
	    driver.quit();	  
		log.info("Driver is closed");

	  }
	 
}
