package addtocartproductflow;

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

public class CuddlePillowProductDetailsChanges extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(CuddlePillowProductDetailsChanges.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.error("Starting driver");
	}
	
	 @Test
		public void cuddlePillowAddToCart() throws Exception
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
		   
		   wait.until(ExpectedConditions.visibilityOf(landingpage.cuddlePillowMenu()));
		   landingpage.cuddlePillowMenu().click();
		   log.error("Clicked on cuddle Pillow Menu option");
		   
		   landingpage.offerModal();
		   ProductDetailsPage productDetails = new ProductDetailsPage(driver);
		   
	  	   landingpage.offerModal();
	  	   productDetails.pageScroll();
		   log.error("Scrolled down to size section");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.feetDimension()));
		   productDetails.feetDimension().click();
		   log.error("Clicked on Feet dimension option");
		   
	  	   landingpage.offerModal();
	  	   productDetails.sizeDropdown().click();
		   log.error("Clicked on sizedropdown field");
		   
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
		   
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-GRBDPILWSET-S-50x19']")));
			
			boolean productname = driver.findElement(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-GRBDPILWSET-S-50x19']")).isDisplayed();
			if(productname) 
			{
				System.out.println("Standard category Cuddle Pillow cm Product is added in cart");
				log.error("Standard category Cuddle Pillow cm Product is added in cart");
			}else
			{
				System.out.println("Standard category Cuddle Pillow cm Product is not added in cart");
				log.error("Standard category Cuddle Pillow cm Product is not added in cart");
			}	
		}
	    
	      @AfterTest 
		  public void closeDriver() throws IOException 
		  {
		    driver.quit();	  
			log.error("Driver is closed");

		  }  
}
