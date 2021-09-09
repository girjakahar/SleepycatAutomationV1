package pageobject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageObject {

		RemoteWebDriver driver;
		By Email = By.cssSelector("input#login-email");
		By Password = By.cssSelector("input#login-password");
		By Submit = By.xpath("//button[@data-logindiv='LoginDiv']");
		By NewAccount = By.xpath("//span[text()=' Create new account ']");
		By ForgetPassword = By.xpath("//span[text()=' Forgot password? ']");
		By ForgetEmail = By.xpath("//input[@id='forgot-password-email']");
		By ResetPassword = By.xpath("//*[@id='forgotPasswordDiv']//*[contains(@class, 'button')]");
		By EmailSentText = By.xpath("//form[@id='forgotPasswordDiv']//div[@class='login-success-txt']");

		public LoginPageObject(RemoteWebDriver driver) //to provide life to driver in different test cases where this Landing page object is used we have added this method
		{ 
			this.driver=driver;                        
		}
		
		public void switchingWindow() 
		{
			Set<String> s1=driver.getWindowHandles();
            Iterator<String> It= s1.iterator();
			String parentWindow = It.next();
			String childWindow = It.next();
			driver.switchTo().window(childWindow);
		 }
		
		public WebElement email()
		{
			return driver.findElement(Email);
		}

		public WebElement password()
		{
			return driver.findElement(Password);
		}

		public WebElement submit()
		{
			return driver.findElement(Submit);
		}

		public WebElement newAccount()
		{
			return driver.findElement(NewAccount);
		}

		public WebElement forgetPassword()
		{
			return driver.findElement(ForgetPassword);
		}
		
		public WebElement forgetEmail()
		{
			return driver.findElement(ForgetEmail);
		}
		
		public WebElement resetPassword()
		{
			return driver.findElement(ResetPassword);
		}
		
		public WebElement EmailSentText()
		{
			return driver.findElement(EmailSentText);
		}

	}

