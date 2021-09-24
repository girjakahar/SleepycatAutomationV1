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

public class LatexMattressCustomCategory extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(LatexMattressCustomCategory.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.error("Starting driver");
	}
	
    @Test
	public void latexMattessCustomAddToCart() throws Exception
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
	   
	   wait.until(ExpectedConditions.visibilityOf(landingPage.latexMattressMenu()));
	   landingPage.latexMattressMenu().click();
	   log.error("Clicked on latex Mattress SubMenu option");
	   
  	   landingPage.offerModal();
	   ProductDetailsPage productDetails = new ProductDetailsPage(driver);
	   wait.until(ExpectedConditions.visibilityOf(productDetails.customCategory()));
	   productDetails.customCategory().click();
	   log.error("Clicked on Custom category option");
	   
  	   landingPage.offerModal();
  	   productDetails.pageScroll();
	   log.error("Scrolled down to size section");
	   
	   landingPage.offerModal();
  	   productDetails.customLength().sendKeys("90");
	   log.error("Length value is entered");
	   
	   landingPage.offerModal();
  	   boolean lengthvalidation =productDetails.latexLenghtError().isDisplayed();
  	   if(lengthvalidation) 
  	   {  
  		  System.out.println("Incorrect length value added message is displyed");
	      log.error("Incorrect length value added message is displyed");
  	   }else 
  	   {
   		  System.out.println("Incorrect length value added message is not displyed");
 	      log.error("Incorrect length value is added message is not displyed");
  	   }
  	   
  	   landingPage.offerModal();
	   productDetails.customLength().clear();
	   log.error("Length value added is removed");
	   
	   Thread.sleep(2000);
	   productDetails.customLength().sendKeys("75");
	   log.error("Length value is entered again");
	   
	   landingPage.offerModal();
  	   productDetails.customWidth().sendKeys("75");
	   log.error("Width value is entered");
	   
	   landingPage.offerModal();
  	   boolean widthvalidation =productDetails.widthError().isDisplayed();
  	   if(widthvalidation) 
  	   {  
  		  System.out.println("Incorrect Width value added message is displyed");
	      log.error("Incorrect Width value added message is displyed");
  	   }else 
  	   {
   		  System.out.println("Incorrect Width value added message is not displyed");
 	      log.error("Incorrect Width value is added message is not displyed");
  	   }
	  
  	   landingPage.offerModal();
	   productDetails.customWidth().clear();
	   log.error("Width value added is removed");

	   Thread.sleep(2000);
	   productDetails.customWidth().sendKeys("60");
	   log.error("Width value is entered again");
	   
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
 			 quantityvalue.get(i).click();
 			 log.error("Quantity is selected from drodown");
 			 break;
 		 }
 	   }
	   
	   productDetails.addToCart();
	   log.error("Clicked on add to cart button");
	   
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-LATEX-Q-75x60x7']")));
		
		boolean productname = driver.findElement(By.xpath("//div[@class='cart_item_mid']//div[@data-product_sku='SC-LATEX-Q-75x60x7']")).isDisplayed();
		if(productname) 
		{
			System.out.println("Custom Category latex Mattress Product is added in cart");
			log.error("Custom Category latex Mattress Product is added in cart");
		}else
		{
			System.out.println("Custom Category latex Mattress Product is not added in cart");
			log.error("Custom Category latex Mattress Product is not added in cart");
		}	
	   
	}
    
      @AfterTest 
	  public void closeDriver() throws IOException 
	  {
	    driver.quit();	  
		log.error("Driver is closed");

	  }

}
