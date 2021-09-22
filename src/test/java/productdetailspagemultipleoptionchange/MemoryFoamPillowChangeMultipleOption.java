package productdetailspagemultipleoptionchange;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

public class MemoryFoamPillowChangeMultipleOption extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(MemoryFoamPillowChangeMultipleOption.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.info("Starting driver");
	}
	
	 @Test
		public void memoryFoamPillowAddToCart() throws Exception
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
		   log.info("Clicked on Memory Foam pillow menu option");
		   
		   landingpage.offerModal();
		   ProductDetailsPage productDetails = new ProductDetailsPage(driver);
		   wait.until(ExpectedConditions.visibilityOf(productDetails.presidentCategory()));
		   productDetails.presidentCategory().click();
		   log.info("Clicked on president category option");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.standardCategory()));
		   productDetails.standardCategory().click();
		   log.info("Clicked on standard Category option");
		   
	  	   landingpage.offerModal();
	  	   productDetails.pageScroll();
		   log.info("Scrolled down to size section");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.twoPillowPackSize()));
		   productDetails.twoPillowPackSize().click();
		   log.info("Clicked on Two Pillow pack size option");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.fourPillowPackSize()));
		   productDetails.fourPillowPackSize().click();
		   log.info("Clicked on four Pillow pack size option");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.onePillowPackSize()));
		   productDetails.onePillowPackSize().click();
		   log.info("Clicked on One Pillow pack size option");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.feetDimension()));
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
	 	   
	 	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.personalizeNameSection()));
		   productDetails.personalizeNameSection().click();
		   log.info("Clicked on personalize Name Section");
		   
		   Actions name =new Actions(driver);
		   name.moveToElement(productDetails.personalizeNameField()).build().perform();
		   log.info("Move to name field");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.personalizeNameField()));
		   productDetails.personalizeNameField().sendKeys("TE");
		   log.info("Entered the name in name field");
          
		   wait.until(ExpectedConditions.visibilityOf(productDetails.stitchButton()));
		   productDetails.stitchButton().click();
		   log.info("Clicked on Stitch button");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.editButton()));
		   productDetails.editButton().click();
		   log.info("Clicked on Edit button");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.removeButton()));
		   productDetails.removeButton().click();
		   log.info("Clicked on Remove button");
		   
		   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.personalizeNameSection()));
		   landingpage.offerModal();
		   productDetails.personalizeNameSection().click();
		   log.info("Clicked on personalize Name Section");
		   
		   name.moveToElement(productDetails.personalizeNameField()).build().perform();
		   log.info("Move to name field");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.personalizeNameField()));
		   productDetails.personalizeNameField().sendKeys("RE");
		   log.info("Entered the name in name field");
          
		   wait.until(ExpectedConditions.visibilityOf(productDetails.stitchButton()));
		   productDetails.stitchButton().click();
		   log.info("Clicked on Stitch button");
		   
		   productDetails.addToCart();
		   log.info("Clicked on add to cart button");
		   
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-PILLOW-S-26x16x4']")));
			
			boolean productname = driver.findElement(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-PILLOW-S-26x16x4']")).isDisplayed();
			if(productname) 
			{
				System.out.println("Standard category Memory Foam Pillow pack of 1 change option Product is added in cart");
				log.info("Standard category Memory Foam Pillow pack of 1 change option Product is added in cart");
			}else
			{
				System.out.println("Standard category Memory Foam Pillow pack of 1 change option Product is not added in cart");
				log.info("Standard category Memory Foam Pillow pack of 1 change option Product is not added in cart");
			}	
		}
	    
	      @AfterTest 
		  public void closeDriver() throws IOException 
		  {
		    driver.quit();	  
			log.info("Driver is closed");

		  }
}
