package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ProductDetailsPage {

	static RemoteWebDriver driver;

	// Category section on product details page
	By QueenCategory = By.xpath("//li[contains(text(),'Queen')]");
	By SingleCategory = By.xpath("//li[text()='Single']");
	By DoubleCategory = By.xpath("//li[text()='Double']");
	By KingCategory = By.xpath("//li[text()='King']");
	By CustomCategory = By.xpath("//li[text()='Custom']");
	
	// Webelement for Category section of product details page
	public WebElement queenCategory() {
		return driver.findElement(QueenCategory);
	}
	
	public WebElement singleCategory() {
		return driver.findElement(SingleCategory);
	}
	
	public WebElement doubleCategory() {
		return driver.findElement(DoubleCategory);
	}
	
	public WebElement kingCategory() {
		return driver.findElement(KingCategory);
	}

	public WebElement customCategory() {
		return driver.findElement(CustomCategory);
	}

	// Dimension section of product details page
	By InchDimension = By.xpath("//Span[text()=' inch ']");
	By CmDimension = By.xpath("//Span[text()=' cm ']");
	By FeetDimension = By.xpath("//Span[text()=' feet ']");
	
	//Webelement for Dimension section on product details page
	public WebElement inchDimension() {
		return driver.findElement(InchDimension);
	}
	
	public WebElement cmDimension() {
		return driver.findElement(CmDimension);
	}
	
	public WebElement feetDimension() {
		return driver.findElement(FeetDimension);
	}

	// Size dropdown section
	By SizeDropdown = By.xpath("//div[@Class='variations attr']");// div[contains(@class,'prRightPadding')]//li[14]
	
	//Webelement for sizeDropdown field
	public WebElement sizeDropdown() {
		return driver.findElement(SizeDropdown);
	}

	// Dropdown option when Inch is selected in original mattress
	By SingleOriginal72x30x6 = By.xpath("//ul[@class='original']//li[@data-sku='SC-ORIG-S-72x30x6']");
	By SingleOriginal72x36x6 = By.xpath("//ul[@class='original']//li[@data-sku='SC-ORIG-S-72x36x6']");
	By SingleOriginal75x36x6 = By.xpath("//ul[@class='original']//li[@data-sku='SC-ORIG-S-75x36x6']");
	By SingleOriginal78x36x6 = By.xpath("//ul[@class='original']//li[@data-sku='SC-ORIG-S-78x36x6']");

	// Webelement for single original mattress
	public WebElement singleOriginal75x36x6() {
		return driver.findElement(SingleOriginal75x36x6);
	}

	public WebElement singleOriginal78x36x6() {
		return driver.findElement(SingleOriginal78x36x6);
	}

	// Dropdown option when Inch is selected in Plus mattress and when category is Single
	By SinglePlus72x30x8 = By.xpath("//ul[@class='plus']//li[@data-sku='SC-PLUS-S-72x30x8']");
	By SinglePlus72x36x8 = By.xpath("//ul[@class='plus']//li[@data-sku='SC-PLUS-S-72x36x8']");
	// By SinglePlus72x30x8 =By.xpath("//ul[@class='original']//li[@data-sku='SC-ORIG-S-75x36x6']");
	// By SinglePlus72x30x8 =By.xpath("//ul[@class='original']//li[@data-sku='SC-ORIG-S-78x36x6']");

	// Webelement when Inch is selected in Plus mattress and when category is Single
	public WebElement singlePlus72x30x8() {
		return driver.findElement(SinglePlus72x30x8);
	}

	public WebElement singlePlus72x36x8() {
		return driver.findElement(SinglePlus72x36x8);
	}

	// Dropdown option when Inch is selected in Plus mattress and when category is queen
	By QueenPlus72x60x8 = By.xpath("//ul[@class='plus']//li[@data-sku='SC-PLUS-Q-72x60x8']");
	By QueenPlus75x60x8 = By.xpath("//ul[@class='plus']//li[@data-sku='SC-PLUS-Q-75x60x8']");
	// By SinglePlus72x30x8 =By.xpath("//ul[@class='original']//li[@data-sku='SC-ORIG-S-75x36x6']");
	// By SinglePlus72x30x8 =By.xpath("//ul[@class='original']//li[@data-sku='SC-ORIG-S-78x36x6']");

	// Webelement when Inch is selected in Plus mattress and when category is queen
	public WebElement queenPlus72x60x8() {
		return driver.findElement(QueenPlus72x60x8);
	}

	public WebElement queenPlus75x60x8() {
		return driver.findElement(QueenPlus75x60x8);
	}

	public void pageScroll() {
		JavascriptExecutor Matt = (JavascriptExecutor) driver;
		// WebElement scrollmatt =
		// driver.findElement(By.xpath("//li[@class='noSliderDropDown
		// active']//span[text()='190\" x 152\" x 15\"']"));
		// List<WebElement> addsd = driver.findElements(By.xpath("//button[text()='Add
		// To Cart']"));
		// WebElement add1 = addsd.get(0);
		// Matt.executeScript("arguments[0].scrollIntoView();",scrollmatt );
		Matt.executeScript("window.scrollBy(0,80)", "");
	}

	public void addToCart() {
		List<WebElement> add = driver.findElements(By.xpath("//button[text()='Add To Cart']"));//div[@class='productDirectPurchase hidden_form plus']//button[@type='button'][normalize-space()='Add To Cart']
		WebElement add1 = add.get(1);
		Actions cart = new Actions(driver);
		cart.moveToElement(add1).click(add1).build().perform();
	}
	

	public ProductDetailsPage(RemoteWebDriver driver) // to provide life to driver in different test cases where this
														// Landing page object is used we have added this method
	{
		this.driver = driver; // this vaiable is created to give life to driver
	}
}
