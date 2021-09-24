package productdetailspagemultipleoptionchange;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.LandingPageObject;
import pageobject.ProductDetailsPage;
import resources.BaseSleepycat;

public class CloudPillowChangeMultipleOption extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(CloudPillowChangeMultipleOption.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.error("Starting driver");
	}
	
	 @Test
		public void cloudPillowChangeOption() throws Exception
		{
	    	
	       driver.get("https://sleepycat.in/");
	       log.error("Website opened Successfully");
	       
	  	   driver.manage().window().maximize();
	  	   log.error("Website is maximized");
	  	   
	  	   wait = new WebDriverWait(driver, 20);
	  	   LandingPageObject landingpage = new LandingPageObject(driver);
	  	   landingpage.offerModal();
	  	   landingpage.pillowHeader();
		   log.error("Submenu link is opened");
		   
		   wait.until(ExpectedConditions.visibilityOf(landingpage.cloudPillowMenu()));
		   landingpage.cloudPillowMenu().click();
		   log.error("Clicked on Cloud pillow menu option");
		   
		   landingpage.offerModal();
		   ProductDetailsPage productDetails = new ProductDetailsPage(driver);
		   wait.until(ExpectedConditions.visibilityOf(productDetails.presidentCategory()));
		   productDetails.presidentCategory().click();
		   log.error("Clicked on president category option");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.standardCategory()));
		   productDetails.standardCategory().click();
		   log.error("Clicked on standard Category option");
		   
	  	   landingpage.offerModal();
	  	   productDetails.pageScroll();
		   log.error("Scrolled down to size section");
		   
	  	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.twoPillowPackSize()));
		   productDetails.twoPillowPackSize().click();
		   log.error("Clicked on Two Pillow pack size option");
		   
	  	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.fourPillowPackSize()));
		   productDetails.fourPillowPackSize().click();
		   log.error("Clicked on four Pillow pack size option");
		   
	  	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.onePillowPackSize()));
		   productDetails.onePillowPackSize().click();
		   log.error("Clicked on One Pillow pack size option");
		   
	  	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.feetDimension()));
		   productDetails.feetDimension().click();
		   log.error("Clicked on Feet dimension option");
		   
	  	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.quantityField()));
		   productDetails.quantityField().click();
		   log.error("Clicked on Quantity field dropdown");
		   
	  	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-name='quantity']")));
		   List<WebElement> quantityvalue =driver.findElements(By.xpath("//li[@data-name='quantity']"));
	 	   System.out.println(quantityvalue.size());
	 	   
	 	   for(int i=0;i<quantityvalue.size();i++)
	 	   {
	 		 quantityvalue.get(i).getText();
	 		 if(quantityvalue.get(i).getText().contains("6"))
	 		 {
	 		  	 landingpage.offerModal();
	 			 quantityvalue.get(i).click();
	 			 log.error("Quantity is selected from drodown");
	 			 break;
	 		 }
	 	   }
	 	   
	  	   landingpage.offerModal();
		   productDetails.addToCart();
		   log.error("Clicked on add to cart button");
		   
	  	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-CLPILW-S-27x18']")));
			
			boolean productname = driver.findElement(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-CLPILW-S-27x18']")).isDisplayed();
			if(productname) 
			{
				System.out.println("Standard category Cloud Pillow pack of 1 change option Product is added in cart");
				log.error("Standard category Cloud Pillow pack of 1 change option Product is added in cart");
			}else
			{
				System.out.println("Standard category Cloud Pillow pack of 1 change option Product is not added in cart");
				log.error("Standard category Cloud Pillow pack of 1 change option Product is not added in cart");
			}	
		}
	    
	      @AfterTest 
		  public void closeDriver() throws IOException 
		  {
		    driver.quit();	  
			log.error("Driver is closed");

		  } 
}
