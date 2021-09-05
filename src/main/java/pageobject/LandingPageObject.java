package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LandingPageObject {
	
	static RemoteWebDriver driver;
	
	// HeaderMenu links
	By Login = By.xpath("//a[text()='Login']");
	
	//Mattress and its products dropdown links
	By MattressHeader = By.xpath("//a[text()='Mattress']");
	By OriginalMattressHeader = By.xpath("//a[text()='Original Mattress – 6″']");
	By LatexMattressHeader = By.xpath("//a[text()='Latex Mattress – 7″']");
	By PlusMattressHeader = By.xpath("//a[text()='Plus Mattress – 8″ & 10″']");
	By BabyMattressHeader = By.xpath("//a[text()='Baby Mattress']");
	By CompareMattressHeader = By.xpath("//a[text()='Compare Page']");
	
	//Webelements for Mattress and its products dropdown links
	public WebElement MattressHeader() {
		return driver.findElement(MattressHeader);
	}
	
	public WebElement originalMattressHeader() {
		return driver.findElement(OriginalMattressHeader);
	}
	
	public WebElement latexMattressHeader() {
		return driver.findElement(LatexMattressHeader);
	}
	
	public WebElement plusMattressHeader() {
		return driver.findElement(PlusMattressHeader);
	}
    
	public WebElement babyMattressHeader() {
		return driver.findElement(BabyMattressHeader);
	}
	
	public WebElement compareMattressHeader() {
		return driver.findElement(CompareMattressHeader);
	}
	
	// Cross selling products in cart slider
	By CartIcon = By.xpath("//li[@class='crticn']//a");
			
	public WebElement cartIcon() {
		return driver.findElement(CartIcon);
	}
			

	
	//Bed And its products dropdown list
	By Bedding = By.xpath("//h3[text()=' Bedding ']");
	
	//Bedding And its products dropdown list
	By Pillows = By.xpath("//h3[text()='Pillows']");
	
	//Pillows And its products dropdown list
	By OhayoBed = By.xpath("//h3[text()=' Ohayo Bed ']");
	
	//About us and its dropdown link list
	
	
	
	
	By LandTxt = By.xpath("//div[@class='desktop_header']//div[3]");
	By MyAccount = By.xpath("//a[text()='My Account']");

	// Banner section xpath
	By FirstBanner = By.xpath("//li[@class='slide-2 regular regular lslide active']//a");
	By SecondBanner = By.xpath("//a[@href='/mattress-recommender']");
	By ThirdBanner = By.xpath("//li[@class='slide-4 regular regular lslide active']//a[@href='/bedding']");
	By FourthBanner = By.xpath("//li[@class='slide-5 regular regular lslide active']//a[@href='/weighted-blanket']");
	By FifthBanner = By.xpath("//li[@class='slide-6 regular regular lslide active']//a");
	By Nextbanner = By.xpath("//div[@class='home-cover']//a[@class='lSNext']");
	By PreviousBanner = By.xpath("//div[@class='home-cover']//a[@class='lSPrev']");

	// Sound sleep image section xpath
	By MattressImage = By.xpath("//img[@alt='Mattresses']");
	By BeddingImage = By.xpath("//img[@alt='Bedding']");
	By PillowImage = By.xpath("//img[@alt='Pillows']");
	By OhayoBedImage = By.xpath("//img[@alt='Ohayo Bed']");

	// sound sleep text section xpath
	By TextMattress = By.xpath("//h3[text()=' Mattresses ']");
	By TextBedding = By.xpath("//h3[text()=' Bedding ']");
	By TextPillow = By.xpath("//h3[text()='Pillows']");
	By TextOhayoBed = By.xpath("//h3[text()=' Ohayo Bed ']");

	// sleepy cat banner
	By BrowseButton = By.xpath("//a[text()='Browse All Products']");

	// Shop from our bestsellers section links xpath for images
	By PlusMattressImage = By.xpath("//a[@href='/plus-mattress']//img[@class='vin-lazy-load']");
	By OriginalMattressImage = By.xpath("//a[@href='/original-mattress']//img[@class='vin-lazy-load']");
	By MemoryFoamPillowImage = By.xpath("//a[@href='/pillow-memory-foam-pillow']//img[@class='vin-lazy-load']");
	By ComforterImage = By.xpath("//a[@href='/comforter']//img[@class='vin-lazy-load']");

	// Shop from our bestsellers section links xpath for shop now button
	By PlusMattressText = By.xpath("//a[@href='/plus-mattress'][text()='Shop now']");
	By OriginalMattressText = By.xpath("//a[@href='/original-mattress'][normalize-space()='Shop now']");
	By MemoryFoamPillowText = By.xpath("//a[@href='/pillow-memory-foam-pillow'][normalize-space()='Shop now']");
	By ComforterText = By.xpath("//a[@href='/comforter'][normalize-space()='Shop now']");

	// Social media links on Homepage
	By Facebook = By.xpath("//i[@class='fab fa-facebook-square']");
	By Instagram = By.xpath("//i[@class='fab fa-instagram']");
	By Youtube = By.xpath("//i[@class='fab fa-youtube ']");
	By Twitter = By.xpath("//i[@class='fab fa-twitter']");

	public LandingPageObject(RemoteWebDriver driver) // to provide life to driver in different test cases where this Landing page
	{ 
		this.driver = driver; // this vaiable is created to give life to driver
	}

	//Header Menu links
	public WebElement loginHeader() {
		return driver.findElement(Login);
	}

	public WebElement mattressHeader() {
		return driver.findElement(MattressHeader);
	}

	public WebElement beddingHeader() {
		return driver.findElement(Bedding);
	}

	public WebElement pillowHeader() {
		return driver.findElement(Pillows);
	}

	public WebElement ohayoBedHeader() {
		return driver.findElement(OhayoBed);
	}


	public WebElement landTxtHeader() {
		return driver.findElement(LandTxt);
	}
	
	public WebElement myAccount() {
		return driver.findElement(MyAccount);
	}

	// banner section
	public WebElement firstBanner() {
		return driver.findElement(FirstBanner);
	}

	public WebElement secondBanner() {
		return driver.findElement(SecondBanner);
	}

	public WebElement thirdBanner() {
		return driver.findElement(ThirdBanner);
	}

	public WebElement fourthBanner() {
		return driver.findElement(FourthBanner);
	}
	
	public WebElement fifthBanner() {
		return driver.findElement(FifthBanner);
	}

	public WebElement nextbanner() {
		return driver.findElement(Nextbanner);
	}

	public WebElement previousBanner() {
		return driver.findElement(PreviousBanner);
	}

	// sound sleep image section xpath
	public WebElement mattressImage() {
		return driver.findElement(MattressImage);
	}

	public WebElement beddingImage() {
		return driver.findElement(BeddingImage);
	}

	public WebElement pillowImage() {
		return driver.findElement(PillowImage);
	}

	public WebElement ohayoBedImage() {
		return driver.findElement(OhayoBedImage);
	}

	// Sound sleep text section
	public WebElement textMattress() {
		return driver.findElement(TextMattress);
	}

	public WebElement textBedding() {
		return driver.findElement(TextBedding);
	}

	public WebElement textPillow() {
		return driver.findElement(TextPillow);
	}

	public WebElement textOhayoBed() {
		return driver.findElement(TextOhayoBed);
	}

	// sleepy cat banner
	public WebElement browseButton() {
		return driver.findElement(BrowseButton);
	}

	// Shop from our bestsellers section links xpath for images
	public WebElement plusMattressImage() {
		return driver.findElement(PlusMattressImage);
	}

	public WebElement originalMattressImage() {
		return driver.findElement(OriginalMattressImage);
	}

	public WebElement memoryFoamPillowImage() {
		return driver.findElement(MemoryFoamPillowImage);
	}

	public WebElement comforterImage() {
		return driver.findElement(ComforterImage);
	}

	// Shop from our bestsellers section links xpath for text
	public WebElement plusMattressText() {
		return driver.findElement(PlusMattressText);
	}

	public WebElement originalMattressText() {
		return driver.findElement(OriginalMattressText);
	}

	public WebElement memoryFoamPillowText() {
		return driver.findElement(MemoryFoamPillowText);
	}

	public WebElement comforterText() {
		return driver.findElement(ComforterText);
	}

	// Social media links on Homepage
	public WebElement facebook() {
		return driver.findElement(Facebook);
	}

	public WebElement instagram() {
		return driver.findElement(Instagram);
	}

	public WebElement youtube() {
		return driver.findElement(Youtube);
	}

	public WebElement twitter() {
		return driver.findElement(Twitter);
	}

	public void maattheader() {
		WebElement scrollmatt = driver.findElement(By.xpath("//a[text()='Mattress']"));
		// WebElement mattresschild = driver.findElement(By.xpath("//a[text()='Original
		// Mattress – 6 Inches']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollmatt).build().perform();

	}

	public void offerModal() throws Exception {
		try { 
			driver.findElement(By.xpath("//*[@class='soundest-form-without-image-close ']")).click();// get upto 30% modal
		} catch (Exception e)
		{
			System.out.println("Model 1 error :" + e);
		}
		try { 
			driver.findElement(By.xpath("//*[@class='soundest-form-without-image-close ']")).click();// liked what you saw
		} catch (Exception e) 
		{
			System.out.println("Model 2 error :" + e);
		}

	}

}



