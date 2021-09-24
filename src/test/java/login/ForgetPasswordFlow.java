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
		log.error("Starting driver");
	}
	
	@Test
	public void forgetflow() throws Exception
	{
		driver.get("https://sleepycat.in/");
		log.error("website is opened");

		driver.manage().window().maximize();
		log.error("website is Maximized");

		LandingPageObject landingPage = new LandingPageObject(driver);
		landingPage.offerModal();
		log.error("Offer modal is closed");
		
		landingPage.loginHeader().click();
		log.error("Click on login button");

		LoginPageObject loginpage = new LoginPageObject(driver);
		loginpage.switchingWindow();
		log.error("Switching to login tab");
        
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#login-email")));
		
		loginpage.forgetPassword().click();
		log.error("Clicked on forgetPassword link");
		
		wait.until(ExpectedConditions.visibilityOf(loginpage.forgetEmail()));
		loginpage.forgetEmail().sendKeys("kahargirja789@gmail.com");
		log.error("Email id is added");
		
		loginpage.resetPassword().click();
		log.error("Clicked on reset password button");

		wait.until(ExpectedConditions.visibilityOf(loginpage.EmailSentText()));
		boolean SentText = loginpage.EmailSentText().isDisplayed();
		
		if(SentText) 
		{
			System.out.println("Reset Password Email is Sent");
			log.error("Reset Password Email is Sent");
		}else
		{
			System.out.println("Reset Password Email is not Sent");
			log.error("Reset Password Email is not Sent");
		}	
		
	}
		
		 @AfterTest
		  public void close() 
		   {
		     driver.quit();
		     log.error("Driver is closed");

		   }		
	
}