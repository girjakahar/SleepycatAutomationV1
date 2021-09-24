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

public class DefaultPetBedProduct extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(DefaultPetBedProduct.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.error("Starting driver");
	}
	
       @Test
		public void defaultPetBedAddToCart() throws Exception
		{
	    	
    	   driver.get("https://sleepycat.in/");
	       log.error("Website opened Successfully");
	       
	  	   driver.manage().window().maximize();
	  	   log.error("Website is maximized");
	  	   
	  	   wait = new WebDriverWait(driver, 20);
	  	   LandingPageObject landingpage = new LandingPageObject(driver);
	  	   landingpage.offerModal();
	  	   landingpage.beddingHeader();
		   log.error("Bedding Submenu link is opened");
		   
		   wait.until(ExpectedConditions.visibilityOf(landingpage.petBedMenu()));
		   landingpage.petBedMenu().click();
		   log.error("Clicked on Pet Bed menu option");
		   
		   landingpage.offerModal();
		   ProductDetailsPage productDetails = new ProductDetailsPage(driver);
		   
	  	   landingpage.offerModal();
	  	   productDetails.pageScroll();
		   log.error("Scrolled down to size section");
	 	   
	 	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.personalizeNameSection()));
		   productDetails.personalizeNameSection().click();
		   log.error("Clicked on personalize Name Section");
		   
		   Actions name =new Actions(driver);
		   name.moveToElement(productDetails.personalizeNameField()).build().perform();
		   log.error("Move to Pet name field");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.personalizeNameField()));
		   productDetails.personalizeNameField().sendKeys("SingleTest");
		   log.error("Enter The pet Name");
           
		   wait.until(ExpectedConditions.visibilityOf(productDetails.stitchButton()));
		   productDetails.stitchButton().click();
		   log.error("Clicked on Stitch it button");
		   
		   productDetails.addToCart();
		   log.error("Clicked on add to cart button");
		   
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-PETBEDORIG-M-36x26']")));
			
			boolean productname = driver.findElement(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-PETBEDORIG-M-36x26']")).isDisplayed();
			if(productname) 
			{
				System.out.println("Personalized Single category Pet Bed is added in cart");
				log.error("Personalized Single category Pet Bed is added in cart");
			}else
			{
				System.out.println("Personalized Single category Pet Bed is not added in cart");
				log.error("Personalized Single category Pet Bed is not added in cart");
			}	
		}
	    
	      @AfterTest 
		  public void closeDriver() throws IOException 
		  {
		    driver.quit();	  
			log.error("Driver is closed");

		  }  

}
