package crosssellingproducts;

import java.io.IOException;

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
import pageobject.LandingPageObject;
import pageobject.ProductDetailsPage;
import resources.BaseSleepycat;

public class OriginalMattressCrossSelling extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(OriginalMattressCrossSelling.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.error("Starting driver");
	}
	
	 @Test
		public void crossSellingOriginalMattress() throws Exception
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
		   
		   wait.until(ExpectedConditions.visibilityOf(landingpage.originalMattressMenu()));
		   landingpage.originalMattressMenu().click();
		   log.error("Clicked on Original mattress menu option");
		   
	  	   landingpage.offerModal();
		   ProductDetailsPage productdetail = new ProductDetailsPage(driver);
		   wait.until(ExpectedConditions.visibilityOf(productdetail.singleCategory()));
		   log.error("Single category option is selected");
		   
	  	   landingpage.offerModal();
	  	   productdetail.pageScroll();
		   log.error("Scrolled down to size section");
		   
	  	   landingpage.offerModal();
		   productdetail.addToCart();
		   log.error("Clicked on add to cart button");
		   
	  	   landingpage.offerModal();
		   CartSlider cart = new CartSlider(driver);	   
		   wait.until(ExpectedConditions.visibilityOf(cart.closecartSlider()));
		   cart.closecartSlider().click();
		   log.error("Clicked on cross icon of cart slider and close the cart Slider");
		   
	  	   landingpage.offerModal();
		   WebElement CrossSellSection = driver.findElement(By.xpath("//span[text()='10 years warranty']"));
		   wait.until(ExpectedConditions.visibilityOf(CrossSellSection));
		   Actions move =new Actions(driver);
		   move.moveToElement(CrossSellSection).build().perform();
		   log.error("Scrolled down to cross selling product section");
	  	   
		   landingpage.offerModal();
	  	   productdetail.crossSellCloudPillowCategoryField().click();
		   log.error("Clicked on category field for cloud pillow");
		   
	  	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productdetail.crossSellPresidentCategoryCloudPillow()));
		   productdetail.crossSellPresidentCategoryCloudPillow().click();
		   log.error("Clicked on President type option from the dropdown");
		   
		   wait.until(ExpectedConditions.visibilityOf(productdetail.crossSellPackFieldOfCloudPillow()));
	  	   landingpage.offerModal();
		   productdetail.crossSellPackFieldOfCloudPillow().click();
		   log.error("Clicked on Pack field for cloud pillow");
		   
	  	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productdetail.crossSellPackFourOfCloudPillow()));
		   productdetail.crossSellPackFourOfCloudPillow().click();
		   log.error("Clicked on Pack of 4 option from dropdown");
	  	   landingpage.offerModal();

		   Thread.sleep(1000);
	  	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productdetail.crossSellCloudPillowIncrementQuantity()));
		   productdetail.crossSellCloudPillowIncrementQuantity().click();
		   log.error("Increment quantity to two");
		   
	  	   landingpage.offerModal();
		   productdetail.crossSellCloudPillowIncrementQuantity().click();
		   log.error("Increment quantity to Three");
		   
	  	   landingpage.offerModal();
		   productdetail.crossSellCloudPillowIncrementQuantity().click();
		   log.error("Increment quantity to Four");
		   
	  	   landingpage.offerModal();
		   productdetail.crossSellCloudPillowDecreaseQuantity().click();
		   log.error("Decrement quantity to three");	   		   
		   
		   wait.until(ExpectedConditions.visibilityOf(productdetail.crossSellPresidentCloudPillowSet4()));
	  	   landingpage.offerModal();
		   productdetail.crossSellPresidentCloudPillowSet4().click();
		   log.error("Clicked on add to cart button of Cloud pillow");
		   
		   Thread.sleep(2000);
	  	   landingpage.offerModal();
		   productdetail.CrossSellNextproduct().click();
		   log.error("Click on next product icon in cross selling product section");
		   
		   landingpage.offerModal();
	  	   productdetail.crossSellComforterCategoryField().click();
		   log.error("Clicked on category field for Comforter");
		   
		   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productdetail.crossSellDoubleCategoryComforter()));
	  	   productdetail.crossSellDoubleCategoryComforter().click();
		   log.error("Clicked on cross Sell Double Category Comforter option");
		   
	  	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productdetail.crossSellComforterPinkColor()));
		   productdetail.crossSellComforterPinkColor().click();
		   log.error("Clicked on cross Sell Comforter Pink Color option");
	  	   
		   landingpage.offerModal();
		   productdetail.crossSellDoubleCategoryPinkComforter().click();
		   log.error("Click on add to cart product button of Comforter");
		   
		   Thread.sleep(2000);
		   landingpage.offerModal();
	  	   productdetail.crossSellProtectorCategoryField().click();
		   log.error("Clicked on category field for Protector");
		   
		   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productdetail.crossSellDoubleCategoryProtector()));
	  	   productdetail.crossSellDoubleCategoryProtector().click();
		   log.error("Clicked on cross Sell Double Category option in Protector");
		   
		   Thread.sleep(2000);
	  	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productdetail.crossSellProtectorSizeField()));
		   productdetail.crossSellProtectorSizeField().click();
		   log.error("Clicked on cross Sell Protector Size Field");
	  	   
		   Thread.sleep(2000);
		   landingpage.offerModal();
		   productdetail.crossSellDoubleProtector75x48().click();
		   log.error("Click on one size option from dropdown");
		   
		   Thread.sleep(2000);
		   landingpage.offerModal();
		   productdetail.crossSellAddToCartDoubleProtector75x48().click();
		   log.error("Click on add to cart product button of Protector");
		   
		   Thread.sleep(2000);
	  	   landingpage.offerModal();
		   productdetail.CrossSellNextproduct().click();
		   log.error("Click on next product icon in cross selling product section");
		   
		   Thread.sleep(2000);
	  	   landingpage.offerModal();
		   productdetail.CrossSellNextproduct().click();
		   log.error("Click on next product icon in cross selling product section");
	       
		   Thread.sleep(2000);
	  	   landingpage.offerModal();
		   productdetail.crossSellCuddlePillow().click();
		   log.error("Click on add to cart product button of cuddle pillow");

		   Thread.sleep(2000);
	  	   landingpage.offerModal();
		   landingpage.cartIcon().click();
		   log.error("Click on cart icon");
		   
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Reversible Comforter']")));
			
			boolean productname = driver.findElement(By.xpath("//a[text()='Reversible Comforter']")).isDisplayed();
			if(productname) 
			{
				System.out.println("Single category Original Mattress and cross sell products are added in cart");
				log.error("Single category Original Mattress and cross sell products are added in cart");
			}else
			{
				System.out.println("Single category Original Mattress and cross sell products are not added in cart");
				log.error("Single category Original Mattress and cross sell products are not added in cart");
			}	
		}
	 
	  @AfterTest 
	  public void closeDriver() throws IOException 
	  {
	    driver.quit();	  
		log.error("Driver is closed");

	  }

}
