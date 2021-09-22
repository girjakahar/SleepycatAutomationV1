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

public class PillowCasesChangeMultipleOption extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(PillowCasesChangeMultipleOption.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.info("Starting driver");
	}
	
	    @Test
		public void pillowCasesChangeOption() throws Exception
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
		   
		   wait.until(ExpectedConditions.visibilityOf(landingpage.pillowCaseMenu()));
		   landingpage.pillowCaseMenu().click();
		   log.info("Clicked on pillow Case Menu option");
		   
		   landingpage.offerModal();
		   ProductDetailsPage productDetails = new ProductDetailsPage(driver);
		   wait.until(ExpectedConditions.visibilityOf(productDetails.memoryFoamPillowCaseCategory()));
		   productDetails.memoryFoamPillowCaseCategory().click();
		   log.info("Clicked on memory Foam Pillow Case category option");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.cuddlePillowCaseCategory()));
		   productDetails.cuddlePillowCaseCategory().click();
		   log.info("Clicked on cuddle Pillow Case Category option");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.cloudPillowCaseCategory()));
		   productDetails.cloudPillowCaseCategory().click();
		   log.info("Clicked on cloud Pillow Case Category option");
		   
	  	   landingpage.offerModal();
	  	   productDetails.pageScroll();
		   log.info("Scrolled down to size section");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.fourPillowCasesPackSize()));
		   productDetails.fourPillowCasesPackSize().click();
		   log.info("Clicked on four Pillow Cases Pack Size option");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.eightPillowCasesPackSize()));
		   productDetails.eightPillowCasesPackSize().click();
		   log.info("Clicked on Eight Pillow Cases Pack Size option");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.twoPillowCasesPackSize()));
		   productDetails.twoPillowCasesPackSize().click();
		   log.info("Clicked on Two Pillow Cases Pack Size option");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.feetDimension()));
		   productDetails.feetDimension().click();
		   log.info("Clicked on Feet dimension option");
		   
	  	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.sizeDropdown()));
	  	   productDetails.sizeDropdown().click();
		   log.info("Clicked on sizedropdown field");
		   
		   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.cloudPillowTwoCases33x21()));
		   landingpage.offerModal();
	  	   productDetails.cloudPillowTwoCases33x21().click();
		   log.info("Clicked on cloud Pillow Two Cases33x21 option");
		   
		   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.sizeDropdown()));
	  	   productDetails.sizeDropdown().click();
		   log.info("Clicked on sizedropdown field");
		   
		   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.cloudPillowTwoCases28x18()));
		   landingpage.offerModal();
	  	   productDetails.cloudPillowTwoCases28x18().click();
		   log.info("Clicked on cloud Pillow Two Cases28x18 option");
		   
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
		   
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-GRPILWCS-S-28x18']")));
			
			boolean productname = driver.findElement(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-GRPILWCS-S-28x18']")).isDisplayed();
			if(productname) 
			{
				System.out.println("Cloud pillow category Pillow case pack of 2 change option Product is added in cart");
				log.info("Cloud pillow category Pillow case pack of 2 change option Product is added in cart");
			}else
			{
				System.out.println("Cloud pillow category Pillow case pack of 2 change option Product is not added in cart");
				log.info("Cloud pillow category Pillow case pack of 2 change option Product is not added in cart");
			}	
		}
	    
	      @AfterTest 
		  public void closeDriver() throws IOException 
		  {
		    driver.quit();	  
			log.info("Driver is closed");

		  }  
}
