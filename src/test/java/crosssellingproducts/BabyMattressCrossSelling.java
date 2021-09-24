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

import pageobject.LandingPageObject;
import pageobject.ProductDetailsPage;
import resources.BaseSleepycat;

public class BabyMattressCrossSelling extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(BabyMattressCrossSelling.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.error("Starting driver");
	}
	
    @Test
    public void crossSellingBabyMattress() throws Exception
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
	   
	   wait.until(ExpectedConditions.visibilityOf(landingpage.babyMattressMenu()));
	   landingpage.babyMattressMenu().click();
	   log.error("Clicked on first submenu option");
	   
	   landingpage.offerModal();
	   ProductDetailsPage productdetail = new ProductDetailsPage(driver);
	   wait.until(ExpectedConditions.visibilityOf(productdetail.singleCategory()));
	   
	   WebElement CrossSellSection = driver.findElement(By.xpath("//span[text()='10 years warranty']"));
	   Actions move =new Actions(driver);
	   move.moveToElement(CrossSellSection).build().perform();
	   log.error("Scrolled down to cross selling product section");
	   
	   productdetail.crossSellSingleComforter().click();
	   log.error("Click on add to cart product button of Comforter");

	   Thread.sleep(2000);
	   landingpage.offerModal();
	   log.error("closed the offer modal");

	   productdetail.CrossSellNextproduct().click();
	   log.error("Click on next product icon in cross selling product section");

	   productdetail.crossCloudPillow().click();
	   log.error("Click on add to cart product button of cloud pillow");

	   Thread.sleep(2000);
 	   landingpage.offerModal();
	   landingpage.cartIcon().click();
	   log.error("Click on cart icon");
	   
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Reversible Comforter']")));
		
		boolean productname = driver.findElement(By.xpath("//a[text()='Reversible Comforter']")).isDisplayed();
		if(productname) 
		{
			System.out.println("Comforter and Cloud pillow Products is added in cart");
			log.error("Comforter and Cloud pillow Products is added in cart");
		}else
		{
			System.out.println("Comforter and Cloud pillow Products is not added in cart");
			log.error("Comforter and Cloud pillow Products is not added in cart");
		}	
	}
    
      @AfterTest 
	  public void closeDriver() throws IOException 
	  {
	    driver.quit();	  
		log.error("Driver is closed");

	  }

}
