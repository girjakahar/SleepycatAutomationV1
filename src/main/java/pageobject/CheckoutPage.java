package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {

		static RemoteWebDriver driver;
		
		//Contact details section
		By Billing_First_Name = By.name("billing_first_name");
		By Billing_Last_Name = By.id("billing_last_name");
		By Billing_Email = By.id("billing_email");
		By Billing_Phone = By.id("billing_phone");
		By WhatsappCheckbox = By.xpath("//label[@for='billing_whatsappfield']");
		By ContinueShipping = By.xpath("//a[text()='Continue to Shipping']");
		
		//Webelements for Contact details section
		public WebElement billingFirstName()
		{
			return driver.findElement(Billing_First_Name);
		}
		public WebElement billingLastName()
		{
			return driver.findElement(Billing_Last_Name);
		}
		public WebElement billingEmail()
		{
			return driver.findElement(Billing_Email);
		}
		public WebElement billingPhone()
		{
			return driver.findElement(Billing_Phone);
		}
		public WebElement whatsappCheckbox()
		{
			return driver.findElement(WhatsappCheckbox);
		}
		public WebElement continueShipping()
		{
			return driver.findElement(ContinueShipping);
		}
		
		//Billing address section 
		By House = By.id("billing_address_1");
		By Street = By.id("billing_address_2");
		By Billing_Postcode = By.id("billing_postcode");
		By Billing_City = By.id("billing_city");
		By Place_Order = By.id("place_order");
	
		//Webelements for billing address details section
		public WebElement house()
		{
			return driver.findElement(House);
		}
		public WebElement street()
		{
			return driver.findElement(Street);
		}
		public WebElement billingPostcode()
		{
			return driver.findElement(Billing_Postcode);
		}
		public WebElement billingCity()
		{
			return driver.findElement(Billing_City);
		}
		public WebElement placeOrder()
		{
			return driver.findElement(Place_Order);
		}
		
		public void selectState()
		{
			WebElement state = driver.findElement(By.id("billing_state"));
			Select drpstate = new Select(state);
			drpstate.selectByVisibleText("Maharashtra");
		}
		
		public CheckoutPage(RemoteWebDriver driver) { //to provide life to driver in different test cases where this Landing page object is used we have added this method

			this.driver=driver; //this vaiable is created to give life to driver
		}


	}

