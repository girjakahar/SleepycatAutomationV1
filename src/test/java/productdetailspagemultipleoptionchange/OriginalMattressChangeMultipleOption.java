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

public class OriginalMattressChangeMultipleOption extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(OriginalMattressChangeMultipleOption.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.error("Starting driver");
	}
	
    @Test
	public void originalMattressChangeOption() throws Exception
	{
    	
	   driver.get("https://sleepycat.in/");
       log.error("Website opened Successfully");
       
  	   driver.manage().window().maximize();
  	   log.error("Website is maximized");
  	   
  	   wait = new WebDriverWait(driver, 20);
  	   LandingPageObject landingPage = new LandingPageObject(driver);
  	   landingPage.offerModal();
  	   landingPage.maattheader();
	   log.error("Submenu link is opened");
	   
	   wait.until(ExpectedConditions.visibilityOf(landingPage.originalMattressMenu()));
	   landingPage.originalMattressMenu().click();
	   log.error("Clicked on first submenu option");
	   
  	   landingPage.offerModal();
	   ProductDetailsPage productDetails = new ProductDetailsPage(driver);
	   wait.until(ExpectedConditions.visibilityOf(productDetails.queenCategory()));
  	   landingPage.offerModal();
	   productDetails.doubleCategory().click();
	   log.error("Clicked on double category");
	   
  	   landingPage.offerModal();
	   wait.until(ExpectedConditions.visibilityOf(productDetails.kingCategory()));
	   productDetails.kingCategory().click();
	   log.error("Clicked on King category");
	   
  	   landingPage.offerModal();
	   wait.until(ExpectedConditions.visibilityOf(productDetails.singleCategory()));
	   productDetails.singleCategory().click();
	   log.error("Clicked back on Single category");
	   
  	   landingPage.offerModal();
  	   productDetails.pageScroll();
	   log.error("Scrolled down to size section");
	   
  	   landingPage.offerModal();
  	   productDetails.sizeDropdown().click();
	   log.error("Clicked on sizedropdown field");
	   
  	   landingPage.offerModal();
	   wait.until(ExpectedConditions.visibilityOf(productDetails.singleOriginal75x36x6()));
	   productDetails.singleOriginal75x36x6().click();
	   log.error("Clicked on one size option from the dropdown");
	   
	   landingPage.offerModal();
  	   productDetails.sizeDropdown().click();
	   log.error("Clicked on sizedropdown field again");
	   
  	   landingPage.offerModal();
	   wait.until(ExpectedConditions.visibilityOf(productDetails.singleOriginal78x36x6()));
	   productDetails.singleOriginal78x36x6().click();
	   log.error("Clicked on one size option again from the dropdown");
	   
  	   landingPage.offerModal();
	   wait.until(ExpectedConditions.visibilityOf(productDetails.quantityField()));
	   productDetails.quantityField().click();
	   log.error("Clicked on Quantity field dropdown");
	   
  	   landingPage.offerModal();
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-name='quantity']")));
	   List<WebElement> quantityvalue =driver.findElements(By.xpath("//li[@data-name='quantity']"));
 	   System.out.println(quantityvalue.size());
 	   
 	   for(int i=0;i<quantityvalue.size();i++)
 	   {
 		 quantityvalue.get(i).getText();
 		 if(quantityvalue.get(i).getText().contains("6"))
 		 {   
 		  	 landingPage.offerModal();
 			 quantityvalue.get(i).click();
 			 log.error("Quantity is selected from drodown");
 			 break;
 		 }
 	   }
 	   
  	   landingPage.offerModal();
	   productDetails.addToCart();
	   log.error("Clicked on add to cart button");
	   
  	   landingPage.offerModal();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-ORIG-S-78x36x6']")));
		
		boolean productname = driver.findElement(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-ORIG-S-78x36x6']")).isDisplayed();
		if(productname) 
		{
			System.out.println("Single Category Original Mattress change option Product is added in cart");
			log.error("Single Category Original Mattress change option Product is added in cart");
		}else
		{
			System.out.println("Single Category Original Mattress change option Product is not added in cart");
			log.error("Single Category Original Mattress change option Product is not added in cart");
		}	
	   
	}
    
      @AfterTest 
	  public void closeDriver() throws IOException 
	  {
	    driver.quit();	  
		log.error("Driver is closed");

	  }

}
