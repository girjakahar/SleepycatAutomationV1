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

public class OriginalMattessProductDetailsChanges extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(OriginalMattessProductDetailsChanges.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.info("Starting driver");
	}
	
    @Test
	public void originalMattessAddToCart() throws Exception
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
	   
	   wait.until(ExpectedConditions.visibilityOf(landingPage.originalMattressMenu()));
	   landingPage.originalMattressMenu().click();
	   log.info("Clicked on first submenu option");
	   
  	   landingPage.offerModal();
	   ProductDetailsPage productDetails = new ProductDetailsPage(driver);
	   wait.until(ExpectedConditions.visibilityOf(productDetails.queenCategory()));
	   productDetails.doubleCategory().click();
	   log.info("Clicked on double category");
	   
  	   landingPage.offerModal();
  	   productDetails.pageScroll();
	   log.info("Scrolled down to size section");
	   
  	   landingPage.offerModal();
	   wait.until(ExpectedConditions.visibilityOf(productDetails.cmDimension()));
	   productDetails.cmDimension().click();
	   log.info("Clicked on cm dimension option");
	   
  	   landingPage.offerModal();
  	   productDetails.sizeDropdown().click();
	   log.info("Clicked on sizedropdown field");
	   
  	   landingPage.offerModal();
	   wait.until(ExpectedConditions.visibilityOf(productDetails.doubleOriginal75x48x6()));
	   productDetails.doubleOriginal75x48x6().click();
	   log.info("Clicked on one size option from the dropdown");
	   
  	   landingPage.offerModal();
	   wait.until(ExpectedConditions.visibilityOf(productDetails.quantityField()));
	   productDetails.quantityField().click();
	   log.info("Clicked on Quantity field dropdown");
	   
  	   landingPage.offerModal();
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
	   
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-ORIG-D-75x48x6']")));
		
		boolean productname = driver.findElement(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-ORIG-D-75x48x6']")).isDisplayed();
		if(productname) 
		{
			System.out.println("Double Category Original Mattress Product is added in cart");
			log.info("Double Category Original Mattress Product is added in cart");
		}else
		{
			System.out.println("Double Category Original Mattress Product is not added in cart");
			log.info("Double Category Original Mattress Product is not added in cart");
		}	
	   
	}
    
      @AfterTest 
	  public void closeDriver() throws IOException 
	  {
	    driver.quit();	  
		log.info("Driver is closed");

	  }
	 

}