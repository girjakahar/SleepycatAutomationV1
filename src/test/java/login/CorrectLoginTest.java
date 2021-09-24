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

public class CorrectLoginTest extends BaseSleepycat {
	
	public static Logger log =LogManager.getLogger(CorrectLoginTest.class);
	
	@BeforeTest
	public void startingDriver() throws IOException
	{
		driver=initializeSafari();
		log.error("Browser is startred");		
	}
	
	@Test	
	public void correctLogin() throws Exception
	{
		
		driver.get("https://sleepycat.in/");
		log.error("website is opened");
		
		driver.manage().window().maximize();
		log.error("Website Window is maxmized");
		
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
		loginpage.email().sendKeys("Kahargirja789@gmail.com");
		log.error("Email id is added");

		loginpage.password().sendKeys("red");
		log.error("Password is added");

		loginpage.submit().click();
		log.error("Click on submit button");

		Thread.sleep(2000);
		driver.navigate().refresh();
		log.error("Refreshing the page");

		wait.until(ExpectedConditions.visibilityOf((landingPage.myAccount())));
		log.error("My account is displayed");
		System.out.println("Customer is logged in");


		}

    @AfterTest
    public void close() 
    	{
    		driver.quit();
    		log.error("Driver is closed");

    	}
		
	}

