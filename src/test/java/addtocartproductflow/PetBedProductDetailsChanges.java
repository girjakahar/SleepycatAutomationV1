package addtocartproductflow;

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

public class PetBedProductDetailsChanges extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(PetBedProductDetailsChanges.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.info("Starting driver");
	}
	
	    @Test
		public void petBedAddToCart() throws Exception
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
		   
		   wait.until(ExpectedConditions.visibilityOf(landingpage.petBedMenu()));
		   landingpage.petBedMenu().click();
		   log.info("Clicked on Pet Bed menu option");
		   
		   landingpage.offerModal();
		   ProductDetailsPage productDetails = new ProductDetailsPage(driver);
		   wait.until(ExpectedConditions.visibilityOf(productDetails.orthopedicCategory()));
		   productDetails.orthopedicCategory().click();
		   log.info("Clicked on orthopedic category option");
		   
	  	   landingpage.offerModal();
	  	   productDetails.pageScroll();
		   log.info("Scrolled down to size section");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.cmDimension()));
		   productDetails.cmDimension().click();
		   log.info("Clicked on cm dimension option");
		   
	  	   landingpage.offerModal();
	  	   productDetails.sizeDropdown().click();
		   log.info("Clicked on sizedropdown field");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.orthopedicPetBed48x24()));
		   productDetails.orthopedicPetBed48x24().click();
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
	 	   
	 	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.personalizeNameSection()));
		   productDetails.personalizeNameSection().click();
		   log.info("Clicked on personalize Name Section");
		   
		   Actions name =new Actions(driver);
		   name.moveToElement(productDetails.personalizeNameField()).build().perform();
		   log.info("Move to Pet name field");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.personalizeNameField()));
		   productDetails.personalizeNameField().sendKeys("OrthoTest");
		   log.info("Enter the name in pet name field");
           
		   wait.until(ExpectedConditions.visibilityOf(productDetails.stitchButton()));
		   productDetails.stitchButton().click();
		   log.info("Clicked on Stitch button");
		   
		   productDetails.addToCart();
		   log.info("Clicked on add to cart button");
		   
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-PETBEDORTHO-L-48x24']")));
			
			boolean productname = driver.findElement(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-PETBEDORTHO-L-48x24']")).isDisplayed();
			if(productname) 
			{
				System.out.println("Personalized Orthopedic category Pet Bed is added in cart");
				log.info("Personalized Orthopedic category Pet Bed is added in cart");
			}else
			{
				System.out.println("Personalized Orthopedic category Pet Bed is not added in cart");
				log.info("Personalized Orthopedic category Pet Bed is not added in cart");
			}	
		}
	    
	      @AfterTest 
		  public void closeDriver() throws IOException 
		  {
		    driver.quit();	  
			log.info("Driver is closed");

		  }  

}
