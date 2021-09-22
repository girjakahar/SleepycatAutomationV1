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

public class PlusMattressChangeMultipleOption extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(PlusMattressChangeMultipleOption.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.info("Starting driver");
	}
	
    @Test
	public void plusMattressChangeoption() throws Exception
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
	   wait.until(ExpectedConditions.visibilityOf(productDetails.queenCategory()));
	   productDetails.queenCategory().click();
	   log.info("Clicked on Queen category");
	   
	   wait.until(ExpectedConditions.visibilityOf(productDetails.kingCategory()));
	   productDetails.kingCategory().click();
	   log.info("Clicked on King category");
	   
	   wait.until(ExpectedConditions.visibilityOf(productDetails.singleCategory()));
	   productDetails.singleCategory().click();
	   log.info("Clicked on Single category");
	   
  	   landingPage.offerModal();
  	   productDetails.pageScroll();
	   log.info("Scrolled down to size section");
	   
  	   landingPage.offerModal();
	   wait.until(ExpectedConditions.visibilityOf(productDetails.tenInchHeight()));
	   productDetails.tenInchHeight().click();
	   log.info("Clicked on ten Inch Height option");
	   
	   landingPage.offerModal();
	   wait.until(ExpectedConditions.visibilityOf(productDetails.eightInchHeight()));
	   productDetails.eightInchHeight().click();
	   log.info("Clicked on Eight Inch Height option");
	   
  	   landingPage.offerModal();
	   wait.until(ExpectedConditions.visibilityOf(productDetails.sizeDropdown()));
  	   landingPage.offerModal();
  	   productDetails.sizeDropdown().click();
	   log.info("Clicked on sizedropdown field");
	   
  	   landingPage.offerModal();
	   wait.until(ExpectedConditions.visibilityOf(productDetails.singlePlus72x36x8()));
	   productDetails.singlePlus72x36x8().click();
	   log.info("Clicked on one size option from the dropdown");
	   
	   landingPage.offerModal();
	   wait.until(ExpectedConditions.visibilityOf(productDetails.sizeDropdown()));
  	   landingPage.offerModal();
  	   productDetails.sizeDropdown().click();
	   log.info("Clicked on sizedropdown field");
	   
  	   landingPage.offerModal();
	   wait.until(ExpectedConditions.visibilityOf(productDetails.singlePlus72x30x8()));
	   productDetails.singlePlus72x30x8().click();
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
	   
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-PLUS-S-72x30x8']")));
		
		boolean productname = driver.findElement(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-PLUS-S-72x30x8']")).isDisplayed();
		if(productname) 
		{
			System.out.println("Single Category Plus Mattress change option Product is added in cart");
			log.info("Single Category Plus Mattress change option Product is added in cart");
		}else
		{
			System.out.println("Single Category Plus Mattress change option Product is not added in cart");
			log.info("Single Category Plus Mattress change option Product is not added in cart");
		}	
	   
	}
    
      @AfterTest 
	  public void closeDriver() throws IOException 
	  {
	    driver.quit();	  
		log.info("Driver is closed");

	  }
}