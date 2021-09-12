package order;

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

import pageobject.CartSlider;
import pageobject.CheckoutPage;
import pageobject.LandingPageObject;
import pageobject.ProductDetailsPage;
import resources.BaseSleepycat;

public class BestsellingProductsCart extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(BestsellingProductsCart.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.info("Starting driver");
	}
	
    @Test
	public void addtocart() throws Exception
	{
       driver.get(property.getProperty("url"));
       log.info("Website opened Successfully");
     
 	   driver.manage().window().maximize();
 	   log.info("Website is maximized");
 	   
 	   wait = new WebDriverWait(driver, 20);
 	   LandingPageObject landingPage = new LandingPageObject(driver);
 	   landingPage.offerModal();
 	   log.info("Offer modal is closed");
 	   
 	   Actions scroll=new Actions(driver);
 	   scroll.moveToElement(landingPage.plusMattressText()).click().build().perform();
 	   log.info("clicked on shop now button of plus mattress");
 	   
 	   landingPage.offerModal();
 	   ProductDetailsPage productdetails = new ProductDetailsPage(driver);
 	   wait.until(ExpectedConditions.visibilityOf(productdetails.kingCategory()));
 	   productdetails.kingCategory().click();
 	   log.info("Clicked on king category option");
 	   
 	   landingPage.offerModal();
 	   productdetails.pageScroll();
 	   log.info("Scrolled down to size section");
 	   
 	   productdetails.cmDimension().click();
 	   log.info("Clicked on cm option");
 	   
 	   productdetails.sizeDropdown().click();
 	   log.info("Clicked on sizedropdown field");
 	   
 	   wait.until(ExpectedConditions.visibilityOf(productdetails.kingPlus198x182x20()));
 	   productdetails.kingPlus198x182x20().click();
 	   log.info("Clicked on one size option from the dropdown");
 	   
 	   productdetails.quantityField().click();
 	   log.info("Clicked on quantity field");
 	   
 	   List<WebElement> quantityvalue =driver.findElements(By.xpath("//li[@data-name='quantity']"));
 	   System.out.println(quantityvalue.size());
 	   
 	   for(int i=0;i<quantityvalue.size();i++)
 	   {
 		 quantityvalue.get(i).getText();
 		 if(quantityvalue.get(i).getText().contains("7"))
 		 {
 			 quantityvalue.get(i).click();
 			 log.info("Quantity is selected from drodown");
 			 break;
 		 }
 	   }
 	   
 	   productdetails.addToCart();
 	   log.info("Clicked on add to cart button");

 	   CartSlider cart = new CartSlider(driver);	   
 	   wait.until(ExpectedConditions.visibilityOf(cart.addtocartSingleComforter()));
 	   cart.addtocartSingleComforter().click();
 	   log.info("Click on Add to cart button for single comforter");
 	   
 	   wait.until(ExpectedConditions.visibilityOf(cart.incrementQuantity()));
 	   cart.incrementQuantity().click();
 	   log.info("Increment product quantity");
 	   
       cart.secureCheckout().click();
 	   log.info("Clicked on securecheckout button");
        
 	   CheckoutPage check=new CheckoutPage(driver);
 	   wait.until(ExpectedConditions.visibilityOf(check.billingFirstName()));
 	   boolean firstname = check.billingFirstName().isDisplayed();
 		
 		if(firstname) 
 		{
 			System.out.println("checkout page is opened");
 			log.info("checkout page is opened");
 		}else
 		{
 			System.out.println("checkout page is not opened");
 			log.info("checkout page is not opened");
 		}	
 		
	}		
 		
 		@AfterTest
 	    public void close() 
 	    	{
 	    		driver.quit();
 	    		log.info("Driver is closed");

 	    	}
}



