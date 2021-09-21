package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LandingPageObject {
	
	static RemoteWebDriver driver;
	
	// Xpath for login HeaderMenu link
	By Login = By.xpath("//a[text()='Login']");
	
	//Webelement for login Menu links
	public WebElement loginHeader() {
		return driver.findElement(Login);
	}

	
	//Mattress and its products dropdown links
	By MattressHeader = By.xpath("//a[text()='Mattress']");
	By OriginalMattressMenu = By.xpath("//a[text()='Original Mattress – 6″']");
	By LatexMattressMenu = By.xpath("//a[text()='Latex Mattress – 7″']");
	By PlusMattressMenu = By.xpath("//a[text()='Plus Mattress – 8″ & 10″']");
	By BabyMattressMenu = By.xpath("//a[text()='Baby Mattress']");
	By CompareMattressMenu = By.xpath("//a[text()='Compare Page']");
	
	//Webelements for Mattress and its products dropdown links
	public WebElement mattressHeader() {
		return driver.findElement(MattressHeader);
	}
	
	public WebElement originalMattressMenu() {
		return driver.findElement(OriginalMattressMenu);
	}
	
	public WebElement latexMattressMenu() {
		return driver.findElement(LatexMattressMenu);
	}
	
	public WebElement plusMattressMenu() {
		return driver.findElement(PlusMattressMenu);
	}
    
	public WebElement babyMattressMenu() {
		return driver.findElement(BabyMattressMenu);
	}
	
	public WebElement compareMattressMenu() {
		return driver.findElement(CompareMattressMenu);
	}
	
	
	// Xpath for cart icon 
	By CartIcon = By.xpath("//li[@class='crticn']//a");
		
	//Webelement Xpath for cart icon
	public WebElement cartIcon() {
		return driver.findElement(CartIcon);
	}	
	
	//Xpath for Bedding and its products dropdown links
	By ProtectorMenu = By.xpath("//ul[@class='sub-menu']//a[text()='Protector']");
	By ComforterMenu = By.xpath("//ul[@class='sub-menu']//a[text()='Comforter']");
	By WeightedBlanketMenu = By.xpath("//ul[@class='sub-menu']//a[text()='Weighted Blanket']");
	By PetBedMenu = By.xpath("//ul[@class='sub-menu']//a[text()='Pet Bed']");
		
	//Webelements for Bedding products dropdown links	
	public WebElement protectorMenu() {
		return driver.findElement(ProtectorMenu);
	}
		
	public WebElement comforterMenu() {
		return driver.findElement(ComforterMenu);
	}
		
	public WebElement weightedBlanketMenu() {
		return driver.findElement(WeightedBlanketMenu);
	}
	
	public WebElement petBedMenu() {
		return driver.findElement(PetBedMenu);
	}
	
	
	//Xpath for Pillow products dropdown links
	By CloudPillowMenu = By.xpath("//ul[@class='sub-menu']//a[text()='Cloud Pillow']");
	By MemoryFoamPillowMenu = By.xpath("//ul[@class='sub-menu']//a[text()='Memory Foam Pillow']");
	By CuddlePillowMenu = By.xpath("//ul[@class='sub-menu']//a[text()='Cuddle Pillow']");
	By PillowCaseMenu = By.xpath("//ul[@class='sub-menu']//a[text()='Pillow Case']");
			
	//Webelements for Pillow products dropdown links	
	public WebElement cloudPillowMenu() {
		return driver.findElement(CloudPillowMenu);
	}
			
	public WebElement memoryFoamPillowMenu() {
		return driver.findElement(MemoryFoamPillowMenu);
	}
			
	public WebElement cuddlePillowMenu() {
		return driver.findElement(CuddlePillowMenu);
	}
	
	public WebElement pillowCaseMenu() {
		return driver.findElement(PillowCaseMenu);
	}
	
	
	//Xpath for Bed products dropdown links
	By OhayoBedMenu = By.xpath("//ul[@class='sub-menu']//a[text()='Ohayo Bed']");
	By MetalBedFrameMenu = By.xpath("//ul[@class='sub-menu']//a[text()='Metal Bed Frame']");
				
	//Webelements for Bed products dropdown links	
	public WebElement ohayoBedMenu() {
		return driver.findElement(OhayoBedMenu);
	}
			
	public WebElement metalBedFrameMenu() {
		return driver.findElement(MetalBedFrameMenu);
	}
	
	
	//Xpath for Land and MYAccount xpath section
	By LandTxt = By.xpath("//div[@class='desktop_header']//div[3]");
	By MyAccount = By.xpath("//a[text()='My Account']");
	
	//Webelement for LandTxt and myaccount link
	public WebElement landTxtHeader() {
		return driver.findElement(LandTxt);
	}
	
	public WebElement myAccount() {
		return driver.findElement(MyAccount);
	}
	

	// Xpath for Banner section 
	By FirstBanner = By.xpath("//li[@class='slide-2 regular regular lslide active']//a");
	By SecondBanner = By.xpath("//a[@href='/mattress-recommender']");
	By ThirdBanner = By.xpath("//li[@class='slide-4 regular regular lslide active']//a[@href='/bedding']");
	By FourthBanner = By.xpath("//li[@class='slide-5 regular regular lslide active']//a[@href='/weighted-blanket']");
	By FifthBanner = By.xpath("//li[@class='slide-6 regular regular lslide active']//a");
	By Nextbanner = By.xpath("//div[@class='home-cover']//a[@class='lSNext']");
	By PreviousBanner = By.xpath("//div[@class='home-cover']//a[@class='lSPrev']");
	
	// Webelement for banner section
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
	

	// Sound sleep image section xpath
	By MattressImage = By.xpath("//img[@alt='Mattresses']");
	By BeddingImage = By.xpath("//img[@alt='Bedding']");
	By PillowImage = By.xpath("//img[@alt='Pillows']");
	By OhayoBedImage = By.xpath("//img[@alt='Ohayo Bed']");
	
	//Webelement for sound sleep image section 
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

	
	// sound sleep text section xpath
	By TextMattress = By.xpath("//h3[text()=' Mattresses ']");
	By TextBedding = By.xpath("//h3[text()=' Bedding ']");
	By TextPillow = By.xpath("//h3[text()='Pillows']");
	By TextOhayoBed = By.xpath("//h3[text()=' Ohayo Bed ']");
	
	// Webelement for Sound sleep text section
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
	

	// Xpath for Browse All Products banner
	By BrowseButton = By.xpath("//a[text()='Browse All Products']");
	
	//Webelement for Browse All Products banner
	public WebElement browseButton() {
		return driver.findElement(BrowseButton);
	}
	

	// Shop from our bestsellers section links xpath for images
	By PlusMattressImage = By.xpath("//a[@href='/plus-mattress']//img[@class='vin-lazy-load']");
	By OriginalMattressImage = By.xpath("//a[@href='/original-mattress']//img[@class='vin-lazy-load']");
	By MemoryFoamPillowImage = By.xpath("//a[@href='/pillow-memory-foam-pillow']//img[@class='vin-lazy-load']");
	By ComforterImage = By.xpath("//a[@href='/comforter']//img[@class='vin-lazy-load']");
	
	// Webelement Shop from our bestsellers section links xpath for images
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

	// Shop from our bestsellers section links xpath for shop now button text
	By PlusMattressText = By.xpath("//a[@href='/plus-mattress'][text()='Shop now']");
	By OriginalMattressText = By.xpath("//a[@href='/original-mattress'][normalize-space()='Shop now']");
	By MemoryFoamPillowText = By.xpath("//a[@href='/pillow-memory-foam-pillow'][normalize-space()='Shop now']");
	By ComforterText = By.xpath("//a[@href='/comforter'][normalize-space()='Shop now']");
	
	// Webelement for Shop from our bestsellers section links xpath for shop now button text
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


	// Xpath for Social media links on Homepage
	By Facebook = By.xpath("//i[@class='fab fa-facebook-square']");
	By Instagram = By.xpath("//i[@class='fab fa-instagram']");
	By Youtube = By.xpath("//i[@class='fab fa-youtube ']");
	By Twitter = By.xpath("//i[@class='fab fa-twitter']");
	
	// Webelement for Social media links on Homepage
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

	
	public LandingPageObject(RemoteWebDriver driver) // to provide life to driver in different test cases where this Landing page
	{ 
		this.driver = driver; // this vaiable is created to give life to driver
	}


	public void maattheader() {
		WebElement scrollmatt = driver.findElement(By.xpath("//a[text()='Mattress']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollmatt).build().perform();

	}
	
	public void beddingHeader() {
		WebElement scrollbedding = driver.findElement(By.xpath("//a[text()='Bedding']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollbedding).build().perform();

	}
	
	public void pillowHeader() {
		WebElement scrollbedding = driver.findElement(By.xpath("//a[text()='Pillows']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollbedding).build().perform();

	}
	
	public void bedHeader() {
		WebElement scrollbedding = driver.findElement(By.xpath("//a[text()='Bed']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollbedding).build().perform();

	}

	public void offerModal() throws Exception {
		try { 
			driver.findElement(By.xpath("//*[@class='soundest-form-without-image-close ']")).click();// get upto 30% modal
		} catch (Exception e)
		{
			//System.out.println("Model 1 error :" + e);
		}
		try { 
			driver.findElement(By.xpath("//*[@class='soundest-form-without-image-close ']")).click();// liked what you saw
		} catch (Exception e) 
		{
			//System.out.println("Model 2 error :" + e);
		}

	}

}



