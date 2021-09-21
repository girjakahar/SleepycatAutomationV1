package addtocartproductflow;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.LandingPageObject;
import pageobject.ProductDetailsPage;
import resources.BaseSleepycat;

public class DefaultMemoryFoamPillowProduct extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(DefaultMemoryFoamPillowProduct.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.info("Starting driver");
	}
	
	 @Test
		public void defaultMemoryFoamPillowAddToCart() throws Exception
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
		   
		   wait.until(ExpectedConditions.visibilityOf(landingpage.memoryFoamPillowMenu()));
		   landingpage.memoryFoamPillowMenu().click();
		   log.info("Clicked on Memory Foam Pillow Menu option");
		   
	  	   landingpage.offerModal();
		   ProductDetailsPage productdetail = new ProductDetailsPage(driver);
		   
	  	   landingpage.offerModal();
	  	   productdetail.pageScroll();
		   log.info("Scrolled down to size section");
		   
		   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productdetail.personalizeNameSection()));
		   productdetail.personalizeNameSection().click();
		   log.info("Clicked on personalize Name Section");
		   
		   Actions name =new Actions(driver);
		   name.moveToElement(productdetail.personalizeNameField()).build().perform();
		   log.info("Move to Name field");
		   
		   wait.until(ExpectedConditions.visibilityOf(productdetail.personalizeNameField()));
		   productdetail.personalizeNameField().sendKeys("ME");
		   log.info("Entered The Name");
           
		   wait.until(ExpectedConditions.visibilityOf(productdetail.stitchButton()));
		   productdetail.stitchButton().click();
		   log.info("Clicked on Stitch it button");
		   
		   productdetail.addToCart();
		   log.info("Clicked on add to cart button");
		   
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-PILLOW-S-26x16x4']")));
			
			boolean productname = driver.findElement(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-PILLOW-S-26x16x4']")).isDisplayed();
			if(productname) 
			{
				System.out.println("Standard category Memory Foam pillow pack of one product is added in cart");
				log.info("Standard category Memory Foam pillow pack of one product is added in cart");
			}else
			{
				System.out.println("Standard category Memory Foam pillow pack of one product is not added in cart");
				log.info("Standard category Memory Foam pillow pack of one product is not added in cart");
			}	
		}
	 
	  @AfterTest 
	  public void closeDriver() throws IOException 
	  {
	    driver.quit();	  
		log.info("Driver is closed");
	  }

}
