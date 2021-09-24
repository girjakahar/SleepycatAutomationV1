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

public class PlusMattressCrossSelling extends BaseSleepycat {
	
	static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(PlusMattressCrossSelling.class);

	
	@BeforeTest
	public void startingDriver() throws IOException
	{
	   driver=initializeChrome();
	   log.error("Starting driver");
	}
	
	@Test
	public void crossSellingPlus() throws Exception
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
	   landingpage.plusMattressMenu().click();
	   log.error("Clicked on Plus mattress menu option");
	   
  	   landingpage.offerModal();
  	   ProductDetailsPage productdetail = new ProductDetailsPage(driver);
	   wait.until(ExpectedConditions.visibilityOf(productdetail.singleCategory()));
	   
	   WebElement CrossSellSection = driver.findElement(By.xpath("//span[text()='10 years warranty']"));
	   Actions move =new Actions(driver);
	   move.moveToElement(CrossSellSection).build().perform();
	   log.error("Scrolled down to cross selling product section");
  	   landingpage.offerModal();
	   
  	   productdetail.crossSellCloudPillowCategoryField().click();
	   log.error("Clicked on category field for cloud pillow");
	   
	   wait.until(ExpectedConditions.visibilityOf(productdetail.crossSellPresidentCategoryCloudPillow()));
	   productdetail.crossSellPresidentCategoryCloudPillow().click();
	   log.error("Clicked on President type option from the dropdown");
	   
	   wait.until(ExpectedConditions.visibilityOf(productdetail.crossSellPresidentCloudPillowSet1()));
	   productdetail.crossSellPresidentCloudPillowSet1().click();
	   log.error("Click on add to cart product button of Cloud pillow");
	   
	   Thread.sleep(2000);
  	   landingpage.offerModal();
	   productdetail.CrossSellNextproduct().click();
	   log.error("Click on next product icon in cross selling product section");
	   
	   Thread.sleep(2000);
  	   landingpage.offerModal();
	   productdetail.crossSellSingleComforter().click();
	   log.error("Click on add to cart product button of Comforter");
	   
	   Thread.sleep(2000);
  	   landingpage.offerModal();
	   productdetail.crossSellSingleProtector75x36().click();
	   log.error("Click on add to cart product button of Protector");
       
	   Thread.sleep(2000);
  	   landingpage.offerModal();
	   productdetail.CrossSellNextproduct().click();
	   log.error("Click on next product icon in cross selling product section");
       
	   Thread.sleep(2000);
  	   landingpage.offerModal();
	   productdetail.crossSellCuddlePillow().click();
	   log.error("Click on add to cart product button of cuddle pillow");

  	   landingpage.offerModal();
	   Thread.sleep(2000);
	   landingpage.cartIcon().click();
	   log.error("Click on cart icon");
	   
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Reversible Comforter']")));
		
		boolean productname = driver.findElement(By.xpath("//a[text()='Reversible Comforter']")).isDisplayed();
		if(productname) 
		{
			System.out.println("Cross sell products present on Plus mattress page is added in cart");
			log.error("Cross sell products present on Plus mattress page is added in cart");
		}else
		{
			System.out.println("Cross sell products present on Plus mattress page is not added in cart");
			log.error("Cross sell products present on Plus mattress page is not added in cart");
		}	
	}
	
	@AfterTest 
	public void closeDriver() throws IOException 
	  {
	    driver.quit();	  
		log.error("Driver is closed");

	  }
}