package addtocartproductflow;

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

public class LatexMattressCrossSell extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(OriginalMattessProductDetailsChanges.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.info("Starting driver");
	}
	
	 @Test
		public void crossSellingLatexMattress() throws Exception
		{
	    	
	       driver.get("https://sleepycat.in/");
	       log.info("Website opened Successfully");
	       
	  	   driver.manage().window().maximize();
	  	   log.info("Website is maximized");
	  	   
	  	   wait = new WebDriverWait(driver, 20);
	  	   LandingPageObject landingpage = new LandingPageObject(driver);
	  	   landingpage.offerModal();
	  	   landingpage.maattheader();
		   log.info("Submenu link is opened");
		   
		   wait.until(ExpectedConditions.visibilityOf(landingpage.plusMattressMenu()));
		   landingpage.latexMattressMenu().click();
		   log.info("Clicked on latex mattress menu option");
		   
	  	   landingpage.offerModal();
		   ProductDetailsPage productdetail = new ProductDetailsPage(driver);
		   wait.until(ExpectedConditions.visibilityOf(productdetail.kingCategory()));
		   productdetail.kingCategory().click();
		   log.info("Clicked on latex mattress King category option");
		   
	  	   landingpage.offerModal();
	  	   productdetail.pageScroll();
		   log.info("Scrolled down to size section");
		   
	  	   landingpage.offerModal();
		   productdetail.feetDimension().click();
	  	   landingpage.offerModal();
		   log.info("Clicked on feet option");
		   
	  	   landingpage.offerModal();
		   productdetail.sizeDropdown().click();
		   log.info("Clicked on sizedropdown field");
		   
	  	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productdetail.kingLatex75x72x7()));
		   productdetail.kingLatex75x72x7().click();
		   log.info("Clicked on one size option from the dropdown");
		   
	  	   landingpage.offerModal();
		   productdetail.addToCart();
		   log.info("Clicked on add to cart button");
		   
		   CartSlider cart = new CartSlider(driver);	   
		   wait.until(ExpectedConditions.visibilityOf(cart.closecartSlider()));
		   cart.closecartSlider().click();
		   log.info("Clicked on cross icon of cart slider and close the cart Slider");
		   
	  	   landingpage.offerModal();
		   WebElement CrossSellSection = driver.findElement(By.xpath("//span[text()='10 years warranty']"));
		   wait.until(ExpectedConditions.visibilityOf(CrossSellSection));
		   Actions move =new Actions(driver);
		   move.moveToElement(CrossSellSection).build().perform();
		   log.info("Scrolled down to cross selling product section");
	  	   landingpage.offerModal();
		   
	  	   productdetail.crossSellCloudPillowCategoryField().click();
		   log.info("Clicked on category field for cloud pillow");
		   
	  	   landingpage.offerModal();
		   wait.until(ExpectedConditions.visibilityOf(productdetail.crossSellPresidentCategoryCloudPillow()));
		   productdetail.crossSellPresidentCategoryCloudPillow().click();
		   log.info("Clicked on President type option from the dropdown");
		   
		   wait.until(ExpectedConditions.visibilityOf(productdetail.crossSellPackFieldOfCloudPillow()));
	  	   landingpage.offerModal();
		   productdetail.crossSellPackFieldOfCloudPillow().click();
		   log.info("Clicked on Pack field for cloud pillow");
		   
		   wait.until(ExpectedConditions.visibilityOf(productdetail.crossSellPackFourOfCloudPillow()));
	  	   landingpage.offerModal();
		   productdetail.crossSellPackFourOfCloudPillow().click();
		   log.info("Clicked on Pack of 4 option from dropdown");
		   
		   wait.until(ExpectedConditions.visibilityOf(productdetail.crossSellPresidentCloudPillowSet4()));
	  	   landingpage.offerModal();
		   productdetail.crossSellPresidentCloudPillowSet4().click();
		   log.info("Clicked on add to cart button");
		   
		   Thread.sleep(2000);
	  	   landingpage.offerModal();
		   productdetail.CrossSellNextproduct().click();
		   log.info("Click on next product icon in cross selling product section");
		   
		   Thread.sleep(2000);
	  	   landingpage.offerModal();
		   productdetail.crossSellSingleComforter().click();
		   log.info("Click on add to cart product button of Comforter");
		   
			/*
			 * Thread.sleep(2000); pd.crossSellSingleProtector75x36().click();
			 * log.info("Click on add to cart product button of Protector");
			 */
		   
		   Thread.sleep(2000);
	  	   landingpage.offerModal();
		   productdetail.CrossSellNextproduct().click();
		   log.info("Click on next product icon in cross selling product section");
	       
		   Thread.sleep(2000);
	  	   landingpage.offerModal();
		   productdetail.crossSellCuddlePillow().click();
		   log.info("Click on add to cart product button of cuddle pillow");

		   Thread.sleep(2000);
	  	   landingpage.offerModal();
		   landingpage.cartIcon().click();
		   log.info("Click on cart icon");
		   
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Reversible Comforter']")));
			
			boolean productname = driver.findElement(By.xpath("//a[text()='Reversible Comforter']")).isDisplayed();
			if(productname) 
			{
				System.out.println("Product is added in cart");
				log.info("Product is added in cart");
			}else
			{
				System.out.println("Product is not added in cart");
				log.info("Product is not added in cart");
			}	
		}
	 
	  @AfterTest 
	  public void closeDriver() throws IOException 
	  {
	    driver.quit();	  
		log.info("Driver is closed");

	  }
}