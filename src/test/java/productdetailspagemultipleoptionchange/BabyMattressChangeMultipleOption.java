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

public class BabyMattressChangeMultipleOption extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(BabyMattressChangeMultipleOption.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.info("Starting driver");
	}
	
	    @Test
		public void babyMattressChangeoption() throws Exception
		{
	    	
	       driver.get("https://sleepycat.in/");
	       log.info("Website opened Successfully");
	       
	  	   driver.manage().window().maximize();
	  	   log.info("Website is maximized");
	  	   
	  	   wait = new WebDriverWait(driver, 20);
	  	   LandingPageObject landingpage = new LandingPageObject(driver);
	  	   landingpage.offerModal();
	  	   landingpage.maattheader();
		   log.info("Submenu link is opened");
		   
		   wait.until(ExpectedConditions.visibilityOf(landingpage.babyMattressMenu()));
		   landingpage.babyMattressMenu().click();
		   log.info("Clicked on Baby mattress menu option");
		   
		   landingpage.offerModal();
		   ProductDetailsPage productDetails = new ProductDetailsPage(driver);
		   wait.until(ExpectedConditions.visibilityOf(productDetails.customCategory()));
		   productDetails.customCategory().click();
		   log.info("Clicked on Custom category option");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.singleCategory()));
		   productDetails.singleCategory().click();
		   log.info("Clicked on Single category option");
		   
	  	   landingpage.offerModal();
	  	   productDetails.pageScroll();
		   log.info("Scrolled down on page");
		   
		   landingpage.offerModal();
	  	   productDetails.sizeDropdown().click();
		   log.info("Clicked on sizedropdown field");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.singleBabyMattress52x28x4()));
		   productDetails.singleBabyMattress52x28x4().click();
		   log.info("Clicked on one size option from the dropdown");
		   
		   landingpage.offerModal();
	  	   productDetails.sizeDropdown().click();
		   log.info("Clicked on sizedropdown field");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.singleBabyMattress48x24x4()));
		   productDetails.singleBabyMattress48x24x4().click();
		   log.info("Clicked on one size option from the dropdown");
		   
	  	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.quantityField()));
		   productDetails.quantityField().click();
		   log.info("Clicked on Quantity field dropdown");
		   
	  	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-name='quantity']")));
		   List<WebElement> quantityvalue =driver.findElements(By.xpath("//li[@data-name='quantity']"));
	 	   System.out.println(quantityvalue.size());
	 	   
	 	   for(int i=0;i<quantityvalue.size();i++)
	 	   {
	 		 quantityvalue.get(i).getText();
	 		 if(quantityvalue.get(i).getText().contains("6"))
	 		 {
	 			 quantityvalue.get(i).click();
	 			 log.info("Quantity is selected from drodown");
	 			 break;
	 		 }
	 	   }
		   
		   productDetails.addToCart();
		   log.info("Clicked on add to cart button");
		   
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-BABY-S-48x24x4']")));
			
			boolean productname = driver.findElement(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-BABY-S-48x24x4']")).isDisplayed();
			if(productname) 
			{
				System.out.println("Single Baby mattress change option Product is added in cart");
				log.info("Single Baby mattress change option Product is added in cart");
			}else
			{
				System.out.println("Single Baby mattress change option Product is not added in cart");
				log.info("Single Baby mattress change option Product is not added in cart");
			}	
		}
	    
	      @AfterTest 
		  public void closeDriver() throws IOException 
		  {
		    driver.quit();	  
			log.info("Driver is closed");

		  }
}
