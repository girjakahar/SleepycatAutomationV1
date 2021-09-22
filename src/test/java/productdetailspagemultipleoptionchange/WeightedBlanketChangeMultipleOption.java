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

import addtocartproductflow.WeightedBlanketProductDetailsChanges;
import pageobject.LandingPageObject;
import pageobject.ProductDetailsPage;
import resources.BaseSleepycat;

public class WeightedBlanketChangeMultipleOption extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(WeightedBlanketChangeMultipleOption.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.info("Starting driver");
	}
	
	    @Test
		public void weightedBlanketChangeOption() throws Exception
		{
	    	
	       driver.get("https://sleepycat.in/");
	       log.info("Website opened Successfully");
	       
	  	   driver.manage().window().maximize();
	  	   log.info("Website is maximized");
	  	   
	  	   wait = new WebDriverWait(driver, 20);
	  	   LandingPageObject landingpage = new LandingPageObject(driver);
	  	   landingpage.offerModal();
	  	   landingpage.beddingHeader();
		   log.info("Bedding Submenu link is opened");
		   
		   wait.until(ExpectedConditions.visibilityOf(landingpage.weightedBlanketMenu()));
		   landingpage.weightedBlanketMenu().click();
		   log.info("Clicked on weighted Blanket Menu option");
		   
		   landingpage.offerModal();
		   ProductDetailsPage productDetails = new ProductDetailsPage(driver);
		   
	  	   landingpage.offerModal();
	  	   productDetails.pageScroll();
		   log.info("Scrolled down to size section");
		   
		   landingpage.offerModal();
	  	   productDetails.weightedBlanketPinkColor().click();
		   log.info("Clicked on weighted Blanket pink color option");
		   
		   landingpage.offerModal();
	  	   productDetails.weightedBlanketGreyColor().click();
		   log.info("Clicked on weighted Blanket Grey color option");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.cmDimension()));
		   productDetails.cmDimension().click();
		   log.info("Clicked on cm dimension option");
		   
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
		   
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-CLWTBLANKET-S-75x50']")));
			
			boolean productname = driver.findElement(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-CLWTBLANKET-S-75x50']")).isDisplayed();
			if(productname) 
			{
				System.out.println("Grey color Weighted Blanket change option Product is added in cart");
				log.info("Grey color Weighted Blanket change option Product is added in cart");
			}else
			{
				System.out.println("Grey color Weighted Blanket change option Product is not added in cart");
				log.info("Grey color Weighted Blanket change option Product is not added in cart");
			}	
		}
	    
	      @AfterTest 
		  public void closeDriver() throws IOException 
		  {
		    driver.quit();	  
			log.info("Driver is closed");

		  }  

}
