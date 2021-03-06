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

import pageobject.CartSlider;
import pageobject.CheckoutPage;
import pageobject.LandingPageObject;
import pageobject.ProductDetailsPage;
import resources.BaseSleepycat;

public class BestSellingPlusMattressAddToCart extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(BestSellingPlusMattressAddToCart.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.error("Starting driver");
	}
	
    @Test
	public void bestsellingPlusMattressAddToCart() throws Exception
	{
 	   driver.get("https://sleepycat.in/");
       log.error("Website opened Successfully");
     
 	   driver.manage().window().maximize();
 	   log.error("Website is maximized");
 	   
 	   wait = new WebDriverWait(driver, 20);
 	   LandingPageObject landingPage = new LandingPageObject(driver);
 	   landingPage.offerModal();
 	   log.error("Offer modal is closed");
 	   
 	   Actions scroll=new Actions(driver);
 	   scroll.moveToElement(landingPage.plusMattressText()).click().build().perform();
 	   log.error("clicked on shop now button of plus mattress");
 	   
 	   landingPage.offerModal();
 	   ProductDetailsPage productdetails = new ProductDetailsPage(driver);
 	   wait.until(ExpectedConditions.visibilityOf(productdetails.kingCategory()));
 	   productdetails.kingCategory().click();
 	   log.error("Clicked on king category option");
 	   
 	   landingPage.offerModal();
 	   productdetails.pageScroll();
 	   log.error("Scrolled down to size section");
 	   
 	   landingPage.offerModal();
 	   productdetails.cmDimension().click();
 	   log.error("Clicked on cm option");
 	   
 	   landingPage.offerModal();
 	   productdetails.sizeDropdown().click();
 	   landingPage.offerModal();
 	   log.error("Clicked on sizedropdown field");
 	   
 	   landingPage.offerModal();
 	   wait.until(ExpectedConditions.visibilityOf(productdetails.kingPlus198x182x20()));
 	   productdetails.kingPlus198x182x20().click();
 	   log.error("Clicked on one size option from the dropdown");
 	   
 	   landingPage.offerModal();
 	   productdetails.quantityField().click();
 	   log.error("Clicked on quantity field");
 	   
 	   List<WebElement> quantityvalue =driver.findElements(By.xpath("//li[@data-name='quantity']"));
 	   System.out.println(quantityvalue.size());
 	   
 	   for(int i=0;i<quantityvalue.size();i++)
 	   {
 		 quantityvalue.get(i).getText();
 		 if(quantityvalue.get(i).getText().contains("7"))
 		 {
 		 	 landingPage.offerModal();
 			 quantityvalue.get(i).click();
 			 log.error("Quantity is selected from drodown");
 			 break;
 		 }
 	   }
 	   
 	   landingPage.offerModal();
 	   productdetails.addToCart();
 	   log.error("Clicked on add to cart button");

 	   landingPage.offerModal();
 	   CartSlider cart = new CartSlider(driver);	   
 	   wait.until(ExpectedConditions.visibilityOf(cart.addtocartSingleComforter()));
 	   cart.addtocartSingleComforter().click();
 	   log.error("Click on Add to cart button for single comforter");
 	   landingPage.offerModal();
 	   
	   wait.until(ExpectedConditions.visibilityOf(cart.incrementQuantity()));
 	   cart.incrementQuantity().click();
 	   log.error("Increment product quantity");
 	   
       cart.secureCheckout().click();
 	   log.error("Clicked on securecheckout button");
        
 	   CheckoutPage check=new CheckoutPage(driver);
 	   wait.until(ExpectedConditions.visibilityOf(check.billingFirstName()));
 	   boolean firstname = check.billingFirstName().isDisplayed();
 		
 		if(firstname) 
 		{
 			System.out.println("checkout page is opened with Plus mattress and comforter product");
 			log.error("checkout page is opened with Plus mattress and comforter product");
 		}else
 		{
 			System.out.println("checkout page is not opened with Plus mattress and comforter product");
 			log.error("checkout page is not opened with Plus mattress and comforter product");
 		}	
 		
	}		
    
 		@AfterTest
 	    public void close() 
 	    	{
 	    		driver.quit();
 	    		log.error("Driver is closed");

 	    	}	
}