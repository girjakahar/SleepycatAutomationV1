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

public class LatexMattressProductDetailsChanges extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(LatexMattressProductDetailsChanges.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.error("Starting driver");
	}
	
	    @Test
		public void latexMattressAddToCart() throws Exception
		{
	    	
	       driver.get("https://sleepycat.in/");
	       log.error("Website opened Successfully");
	       
	  	   driver.manage().window().maximize();
	  	   log.error("Website is maximized");
	  	   
	  	   wait = new WebDriverWait(driver, 20);
	  	   LandingPageObject landingpage = new LandingPageObject(driver);
	  	   landingpage.offerModal();
	  	   landingpage.maattheader();
		   log.error("Submenu link is opened");
		   
		   wait.until(ExpectedConditions.visibilityOf(landingpage.plusMattressMenu()));
		   landingpage.latexMattressMenu().click();
		   log.error("Clicked on latex mattress menu option");
		   
		   landingpage.offerModal();
		   ProductDetailsPage productDetails = new ProductDetailsPage(driver);
		   wait.until(ExpectedConditions.visibilityOf(productDetails.queenCategory()));
		   productDetails.queenCategory().click();
		   log.error("Clicked on Queen category option");
		   
	  	   landingpage.offerModal();
	  	   productDetails.pageScroll();
		   log.error("Scrolled down to size section");
		   
	  	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.cmDimension()));
		   productDetails.feetDimension().click();
		   log.error("Clicked on Feet dimension option");
		   
	  	   landingpage.offerModal();
	  	   productDetails.sizeDropdown().click();
		   log.error("Clicked on sizedropdown field");
		   
	  	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productDetails.queenLatex75x60x7()));
		   productDetails.queenLatex75x60x7().click();
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
	 		  	 landingpage.offerModal();
	 			 quantityvalue.get(i).click();
	 			 log.error("Quantity is selected from drodown");
	 			 break;
	 		 }
	 	   }
		   
	  	   landingpage.offerModal();
		   productDetails.addToCart();
		   log.error("Clicked on add to cart button");
		   
	  	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-LATEX-Q-75x60x7']")));
			
			boolean productname = driver.findElement(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-LATEX-Q-75x60x7']")).isDisplayed();
			if(productname) 
			{
				System.out.println("Queen category latex mattress Product is added in cart");
				log.error("Queen category latex mattress Product is added in cart");
			}else
			{
				System.out.println("Queen category latex mattress Product is not added in cart");
				log.error("Queen category latex mattress Product is not added in cart");
			}	
		}
	    
	      @AfterTest 
		  public void closeDriver() throws IOException 
		  {
		    driver.quit();	  
			log.error("Driver is closed");

		  }    
}    