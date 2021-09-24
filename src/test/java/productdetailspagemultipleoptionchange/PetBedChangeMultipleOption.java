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

public class PetBedChangeMultipleOption extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(PetBedChangeMultipleOption.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.error("Starting driver");
	}
	
	    @Test
		public void petBedChangeOption() throws Exception
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
		   wait.until(ExpectedConditions.visibilityOf(productDetails.orthopedicCategory()));
		   productDetails.orthopedicCategory().click();
		   log.error("Clicked on orthopedic category option");
		   
	 	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.originalCategory()));
		   productDetails.originalCategory().click();
		   log.error("Clicked on original category option");
		   
	  	   landingpage.offerModal();
	  	   productDetails.pageScroll();
		   log.error("Scrolled down to size section");
		   
	 	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.cmDimension()));
		   productDetails.cmDimension().click();
		   log.error("Clicked on cm dimension option");
		   
	  	   landingpage.offerModal();
	  	   productDetails.sizeDropdown().click();
		   log.error("Clicked on sizedropdown field");
		   
	 	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.originalPetBedLarge46x32()));
		   productDetails.originalPetBedLarge46x32().click();
		   log.error("Clicked on one size option from the dropdown");
		   
		   landingpage.offerModal();
	  	   productDetails.sizeDropdown().click();
		   log.error("Clicked on sizedropdown field");
		   
	 	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.originalPetBedExtraLarge54x36()));
		   productDetails.originalPetBedExtraLarge54x36().click();
		   log.error("Clicked on one size option from the dropdown");
		   
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
	 			 quantityvalue.get(i).click();
	 			 log.error("Quantity is selected from drodown");
	 			 break;
	 		 }
	 	   }
	 	   
	 	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.personalizeNameSection()));
		   productDetails.personalizeNameSection().click();
		   log.error("Clicked on personalize Name Section");
		   
		   Actions name =new Actions(driver);
		   name.moveToElement(productDetails.personalizeNameField()).build().perform();
		   log.error("Move to Pet name field");
		   
	 	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.personalizeNameField()));
		   productDetails.personalizeNameField().sendKeys("Testone");
		   log.error("Enter the name in pet name field");
           
	 	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.stitchButton()));
		   productDetails.stitchButton().click();
		   log.error("Clicked on Stitch button");
		   
	 	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.editButton()));
		   productDetails.editButton().click();
		   log.error("Clicked on Edit button");
		   
	 	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.removeButton()));
		   productDetails.removeButton().click();
		   log.error("Clicked on Remove button");
		   
		   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.personalizeNameSection()));
		   productDetails.personalizeNameSection().click();
		   log.error("Clicked on personalize Name Section");
		   
		   name.moveToElement(productDetails.personalizeNameField()).build().perform();
		   log.error("Move to Pet name field");
		   
	 	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.personalizeNameField()));
		   productDetails.personalizeNameField().sendKeys("Testtwo");
		   log.error("Enter the name in pet name field");
           
	 	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.stitchButton()));
		   productDetails.stitchButton().click();
		   log.error("Clicked on Stitch button");
		   
	 	   landingpage.offerModal();
		   productDetails.addToCart();
		   log.error("Clicked on add to cart button");
		   
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-PETBEDORIG-XL-54x36']")));
			
			boolean productname = driver.findElement(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-PETBEDORIG-XL-54x36']")).isDisplayed();
			if(productname) 
			{
				System.out.println("Personalized Original category Pet Bed change option product is added in cart");
				log.error("Personalized Original category Pet Bed change option product is added in cart");
			}else
			{
				System.out.println("Personalized Original category Pet Bed change option product is not added in cart");
				log.error("Personalized Original category Pet Bed change option product is not added in cart");
			}	
		}
	    
	      @AfterTest 
		  public void closeDriver() throws IOException 
		  {
		    driver.quit();	  
			log.error("Driver is closed");

		  }
}
