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

public class DefaultPlusMattressProduct extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(DefaultPlusMattressProduct.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.info("Starting driver");
	}
	
    @Test
	public void defaultPlusMattressAddToCart() throws Exception
	{
    	
	   driver.get("https://sleepycat.in/");
       log.info("Website opened Successfully");
       
  	   driver.manage().window().maximize();
  	   log.info("Website is maximized");
  	   
  	   wait = new WebDriverWait(driver, 20);
  	   LandingPageObject landingPage = new LandingPageObject(driver);
  	   landingPage.offerModal();
  	   landingPage.maattheader();
	   log.info("Submenu link is opened");
	   
	   wait.until(ExpectedConditions.visibilityOf(landingPage.plusMattressMenu()));
	   landingPage.plusMattressMenu().click();
	   log.info("Clicked on Plus mattress submenu option");
	   
  	   landingPage.offerModal();
	   ProductDetailsPage productDetails = new ProductDetailsPage(driver);
	  
  	   landingPage.offerModal();
  	   productDetails.pageScroll();
	   log.info("Scrolled down to size section");
	   
  	   landingPage.offerModal();
       productDetails.addToCart();
	   log.info("Clicked on add to cart button");
	   
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-PLUS-S-72x30x8']")));
		
		boolean productname = driver.findElement(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-PLUS-S-72x30x8']")).isDisplayed();
		if(productname) 
		{
			System.out.println("Product is added in cart");
			log.info("Product is added in cart");
		}else
		{
			System.out.println("Product is not added in cart");
			log.info("Product is not added in cart");
		}	
	   
	}
    
      @AfterTest 
	  public void closeDriver() throws IOException 
	  {
	    driver.quit();	  
		log.info("Driver is closed");

	  }
}