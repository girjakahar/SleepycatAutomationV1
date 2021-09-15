package login;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.LandingPageObject;
import pageobject.LoginPageObject;
import resources.BaseSleepycat;

public class ForgetPasswordFlow extends BaseSleepycat {
	
	public static Logger log =LogManager.getLogger(ForgetPasswordFlow.class);


	@BeforeTest
	public void logi() throws IOException
	{
		driver=initializeSafari();
	}
	
	@Test
	public void forgetflow() throws Exception
	{
		driver.get(property.getProperty("url"));
		log.info("website is opened");

		driver.manage().window().maximize();
		log.info("website is opened");

		LandingPageObject landingPage = new LandingPageObject(driver);
		landingPage.offerModal();
		log.info("Offer modal is closed");
		
		landingPage.loginHeader().click();
		log.info("Click on login button");

		LoginPageObject loginpage = new LoginPageObject(driver);
		loginpage.switchingWindow();
		log.info("Switching to login tab");
        
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#login-email")));
		
		loginpage.forgetPassword().click();
		log.info("Clicked on forgetPassword link");
		
		wait.until(ExpectedConditions.visibilityOf(loginpage.forgetEmail()));
		loginpage.forgetEmail().sendKeys("kahargirja789@gmail.com");
		log.info("Email id is added");
		
		loginpage.resetPassword().click();
		log.info("Clicked on reset password button");

		wait.until(ExpectedConditions.visibilityOf(loginpage.EmailSentText()));
		boolean SentText = loginpage.EmailSentText().isDisplayed();
		
		if(SentText) 
		{
			System.out.println("Reset Password Email is Sent");
			log.info("Reset Password Email is Sent");
		}else
		{
			System.out.println("Reset Password Email is not Sent");
			log.info("Reset Password Email is not Sent");
		}	
		
	}
		
		 @AfterTest
		  public void close() 
		   {
		     driver.quit();
		     log.info("Driver is closed");

		   }		
	
}


