package order;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.CheckoutPage;
import pageobject.LandingPageObject;
import pageobject.ProductDetailsPage;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import resources.BaseSleepycat;


public class RazorPayPaymentGateway extends BaseSleepycat {
			
		static RemoteWebDriver driver;
		static WebDriverWait wait;
		public static Logger log =LogManager.getLogger(RazorPayPaymentGateway.class);

		
		@BeforeTest
		public void startingDriver() throws IOException
		{
		   driver=initializeChrome();
		   log.error("Starting driver");
		}
		
	    @Test
		public void razorPayPaymentGateway() throws Exception
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
		   
		   wait.until(ExpectedConditions.visibilityOf(landingPage.plusMattressMenu()));
		   landingPage.plusMattressMenu().click();
		   log.error("Clicked on Plus mattress submenu option");
		   
	  	   landingPage.offerModal();
		   ProductDetailsPage productDetails = new ProductDetailsPage(driver);
		   log.error("Plus mattress page is displayed");
		   
		   wait.until(ExpectedConditions.visibilityOf(productDetails.queenCategory()));
		   productDetails.queenCategory().click();
		   log.error("Clicked on Queen category");
		   
	  	   landingPage.offerModal();
	  	   productDetails.pageScroll();
		   log.error("Scrolled down to size section");
		   
	 	   landingPage.offerModal();
	  	   productDetails.sizeDropdown().click();
	 	   landingPage.offerModal();
		   log.error("Clicked on sizedropdown field");
		   
	 	   landingPage.offerModal();
	 	   Actions move =new Actions(driver);
		   //wait.until(ExpectedConditions.visibilityOf(productDetails.queenPlus75x60x8()));
	 	   move.moveToElement(productDetails.queenPlus75x60x8()).click().build().perform();
		   //productDetails.queenPlus75x60x8().click();
		   log.error("Clicked on one size option from the dropdown");
		   
	 	   landingPage.offerModal();
		   productDetails.addToCart();
		   log.error("Clicked on add to cart button");
			   
	  	   landingPage.offerModal();
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("secure_checkout")));
		   driver.findElement(By.id("secure_checkout")).click();
		   log.error("Clicked on Secure checkout button");
		   
		   CheckoutPage Checkout = new CheckoutPage(driver);
		   wait.until(ExpectedConditions.visibilityOf(Checkout.billingFirstName()));
		   Checkout.billingFirstName().sendKeys("Test");
		   log.error("First name is entered");
		   
		   wait.until(ExpectedConditions.visibilityOf(Checkout.billingLastName()));
		   Checkout.billingLastName().sendKeys("sel");
		   log.error("last name is entered");
		   
		   wait.until(ExpectedConditions.visibilityOf(Checkout.billingEmail()));
		   Checkout.billingEmail().sendKeys("Test@red.com");
		   log.error("Email id is entered");
		   
		   wait.until(ExpectedConditions.visibilityOf(Checkout.billingPhone()));
		   Checkout.billingPhone().sendKeys("8888888888");
		   log.error("Phone number is entered");
		   
		   wait.until(ExpectedConditions.visibilityOf(Checkout.whatsappCheckbox()));
		   Checkout.whatsappCheckbox().click();
		   log.error("Notification checkbox is checked");
		   
		   wait.until(ExpectedConditions.visibilityOf(Checkout.continueShipping()));
		   Checkout.continueShipping().click();
		   log.error("Clicked on continue to shopping button");
		   
		   wait.until(ExpectedConditions.visibilityOf(Checkout.street()));
		   Checkout.street().sendKeys("Street");
		   log.error("Street name is entered");
		   
		   wait.until(ExpectedConditions.visibilityOf(Checkout.house()));
		   Checkout.house().sendKeys("House");
		   log.error("House name is entered");
		   
		   wait.until(ExpectedConditions.visibilityOf(Checkout.billingPostcode()));
		   Checkout.billingPostcode().sendKeys("400101");
		   log.error("Pincode is entered");
		   
		   wait.until(ExpectedConditions.visibilityOf(Checkout.billingCity()));
		   Checkout.billingCity().sendKeys("Mumbai");
		   log.error("City is added");
		   
		   Checkout.selectState();;
		   log.error("State is selected");
		   
		   wait.until(ExpectedConditions.visibilityOf(Checkout.placeOrder()));
		   Checkout.placeOrder().click();
		   log.error("Clicked on Place order button");
		   
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='razorpay-checkout-frame']")));
		   log.error("Waiting for razorpay modal");

		   WebElement iframe1=driver.findElement(By.xpath("//*[@class='razorpay-checkout-frame']"));
		   driver.switchTo().frame(iframe1);
		   log.error("Switching to Razorpay Frame");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='merchant']")));
			boolean paymentgGateway = driver.findElement(By.xpath("//*[@id='merchant']")).isDisplayed();
			
			if(paymentgGateway) 
			{
				System.out.println("Razorpay is displayed");
				log.error("Razorpay is displayed");
			}else
			{
				System.out.println("Razorpay is not displayed");
				log.error("Razorpay is not displayed");
			}

		}
	    
	      @AfterTest 
		  public void closeDriver() throws IOException 
		  {
		    driver.quit();	  
			log.error("Driver is closed");

		  }
		 

	}