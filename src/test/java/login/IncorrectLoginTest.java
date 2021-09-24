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

public class IncorrectLoginTest extends BaseSleepycat {
	
	public static Logger log =LogManager.getLogger(IncorrectLoginTest.class);

	@BeforeTest
	public void startingDriver() throws IOException 
	{
		driver = initializeChrome();
		log.error("Browser is startred");		

	}

	@Test
	public void incorrectLogin() throws Exception
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

			loginpage.password().sendKeys("ggfy");
			log.error("Password is added");

			loginpage.submit().click();
			log.error("Click on submit button");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Incorrect Email or Password']")));
			log.error("Waiting for visibility Of error message");

			boolean error = driver.findElement(By.xpath("//div[text()='Incorrect Email or Password']")).isDisplayed();
			log.error("Error message is displayed");

			if (error)
			{
				System.out.println("Incorrect login credentials");
				log.error("Incorrect login credentials");

			} else 
			{
				System.out.println("Customer is successfully logged in");
				log.error("Customer is successfully logged in");

			}

	}

	@AfterTest
	public void close() 
	{
		driver.quit();
		log.error("Driver is closed");

	}

}
