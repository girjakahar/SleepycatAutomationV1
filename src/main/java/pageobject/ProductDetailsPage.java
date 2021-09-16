package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	
	// Qunatity dropdown selection section
	By QuantityField = By.xpath("//div[@data-name='quantity']");
	
    
	// Webelement for single original mattress
	public WebElement quantityField() {
		return driver.findElement(QuantityField);
	}	
	
    // Original mattress size section on product details page
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
	
	// Original mattress size section on product details page when Double category is selected
    // Drop down option when Inch,cm or feet is selected in original mattress for double category
	By DoubleOriginal75x48x6 = By.xpath("//ul[@class='original']//li[@data-sku='SC-ORIG-D-75x48x6']");
	//Above Xpath can also be used when cm or feet is selected as dimension for 190 x 121 x 15 cm and 6.25' x 4' x 0.5' feet
	
	By DoubleOriginal78x48x6 = By.xpath("//ul[@class='original']//li[@data-sku='SC-ORIG-D-78x48x6']");
	//Above xpath can also be used when cm or feet is selected as dimension for 198 x 121 x 15 cm and 6.5' x 4' x 0.5' feet

	// Webelement for Drop down option when Inch,cm or feet is selected in original mattress for double category
	public WebElement doubleOriginal75x48x6() {
		return driver.findElement(DoubleOriginal75x48x6);
	}

	public WebElement doubleOriginal78x48x6() {
		return driver.findElement(DoubleOriginal78x48x6);
	}
	
	
     //Plus mattress size section on product details page
	// Dropdown option when Inch is selected in Plus mattress and when category is Single
	By SinglePlus72x30x8 = By.xpath("//ul[@class='plus']//li[@data-sku='SC-PLUS-S-72x30x8']");
	By SinglePlus72x36x8 = By.xpath("//ul[@class='plus']//li[@data-sku='SC-PLUS-S-72x36x8']");

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
	
	// Dropdown option when cm is selected as dimensions in Plus mattress and when category is King
    By KingPlus190x182x20 = By.xpath("//span[text()='190 x 182 x 20']");
	By KingPlus198x182x20 = By.xpath("//span[text()='198 x 182 x 20']");
		
	// Webelement option when cm is selected as dimensions in Plus mattress and when category is King
	public WebElement kingPlus190x182x20() {
		return driver.findElement(KingPlus190x182x20);
	}

	public WebElement kingPlus198x182x20() {
		return driver.findElement(KingPlus198x182x20);
	}
	
	//Xpath for 10 inch Height on Plus mattress page
	By TenInchHeight = By.xpath("//li[@data-value='10 inch']");
	
	// Webelement option for 10 inch Height on Plus mattress page
	public WebElement tenInchHeight() {
		return driver.findElement(TenInchHeight);
	}
	
	// Xpath for Dropdown option when category is Queen on Plus mattress and height is 10 inch
    By QueenPlus75x60x10 = By.xpath("//li[@data-sku='SC-PLUS-Q-75x60x10']");
	By QueenPlus78x60x10 = By.xpath("//li[@data-sku='SC-PLUS-Q-78x60x10']");
		
	// Webelement option for Dropdown option when category is Queen on Plus mattress and height is 10 inch
	public WebElement queenPlus75x60x10() {
		return driver.findElement(QueenPlus75x60x10);
	}

	public WebElement queenPlus78x60x10() {
		return driver.findElement(QueenPlus78x60x10);
	}
	
	//Latex mattress size section on product details page
	// Dropdown option when feet is selected in Plus mattress and when category is King
	By KingLatex72x72x7 = By.xpath("//li[@data-sku='SC-LATEX-K-72x72x7']");
	//Above xpath can also be used when cm or feet is selected as dimension for 182 x 182 x 17 cm and 6' x 6' x 0.58' feet
			
	By KingLatex75x72x7 = By.xpath("//li[@data-sku='SC-LATEX-K-75x72x7']");
	//Above xpath can also be used when cm or feet is selected as dimension for 190 x 182 x 17 cm and 6.5' x 6' x 0.58' feet
			
    By KingLatex78x72x7 = By.xpath("//li[@data-sku='SC-LATEX-K-78x72x7']");
	//Above xpath can also be used when cm or feet is selected as dimension for 198 x 182 x 17 cm and 6.5' x 6' x 0.58' feet

	// Webelement when Inch,cm or feet dimension is selected in latex mattress and when category is king
	public WebElement kingLatex72x72x7() {
		return driver.findElement(KingLatex72x72x7);
	}

	public WebElement kingLatex75x72x7() {
		return driver.findElement(KingLatex75x72x7);
	}
			
	public WebElement kingLatex78x72x7() {
		return driver.findElement(KingLatex78x72x7);
	}
	
    // Drop down option when Inch,cm or feet is selected in original mattress for Queen category
	By QueenLatex75x60x7 = By.xpath("//li[@data-sku='SC-LATEX-Q-75x60x7']");
	//Above Xpath can also be used when cm or feet is selected as dimension for 190 x 152 x 17 cm and 6.25' x 5' x 0.58' feet
	
	By QueenLatex78x60x7 = By.xpath("//li[@data-sku='SC-LATEX-Q-78x60x7']");
	//Above xpath can also be used when cm or feet is selected as dimension for 198 x 152 x 17 cm and 6.5' x 5' x 0.58' feet

	// Webelement for Drop down option when Inch,cm or feet is selected in original mattress for Queen category
	public WebElement queenLatex75x60x7() {
		return driver.findElement(QueenLatex75x60x7);
	}

	public WebElement queenLatex78x60x7() {
		return driver.findElement(QueenLatex78x60x7);
	}

	
	//Cross selling section product Add to cart button xpath section on product details page
    By CrossSellSingleComforter = By.xpath("//div[@class='container_cross_sell comforter ']//span[@data-sku='SC-COMF-S-90x60']");
	By CrossSellCuddlePillow = By.xpath("//div[@class='container_cross_sell body_pillow ']//span[@data-sku='SC-GRBDPILWSET-S-50x19']");
	By CrossCloudPillow = By.xpath("//div[@class='container_cross_sell cloud_pillow ']//span[@data-sku='SC-CLPILW-S-27x18']");

	// Webelement option when cm is selected as dimensions in Plus mattress and when category is King
	public WebElement crossSellSingleComforter() {
		return driver.findElement(CrossSellSingleComforter);
	}

	public WebElement crossSellCuddlePillow() {
		return driver.findElement(CrossSellCuddlePillow);
	}
	
	public WebElement crossCloudPillow() {
		return driver.findElement(CrossCloudPillow);
	}
	
	//Cross selling next and previous product icon xpath section on product details page
    By CrossSellNextproduct = By.xpath("//div[@class='product_cross_sell_wrap cross-selling-section']//a[@class='lSNext']");
	By CrossSellPreviousProduct = By.xpath("//div[@class='product_cross_sell_wrap cross-selling-section']//a[@class='lSPrev']");
		
	// Webelement option for Cross selling next and previous product icon on product details page
	public WebElement CrossSellNextproduct() {
		return driver.findElement(CrossSellNextproduct);
	}

	public WebElement CrossSellPreviousProduct() {
		return driver.findElement(CrossSellPreviousProduct);
	}
	
	//Cross selling section product Add to cart button xpath section on product details page of Original mattress page
    By CrossSellPresidentCloudPillowSet1 = By.xpath("//div[@class='container_cross_sell cloud_pillow ']//span[@data-sku='SC-CLPILW-P-32x20']");
    By CrossSellPresidentCloudPillowSet2 = By.xpath("//div[@class='container_cross_sell cloud_pillow ']//span[@data-sku='SC-CLPILWSET2-P-32x20']");
    By CrossSellPresidentCloudPillowSet4 = By.xpath("//div[@class='container_cross_sell cloud_pillow ']//span[@data-sku='SC-CLPILWSET4-P-32x20']");
	By CrossSellSingleProtector75x36 = By.xpath("//div[@class='container_cross_sell protector on-sale']//span[@data-sku='SC-PROT-S-75x36']");
	By CrossSellStandardMemoryPillowSet1 = By.xpath("//div[@class='container_cross_sell pillow ']//span[@data-sku='SC-PILLOW-S-26x16x4']");

	// Webelement option for cross selling product on Original mattress page 
	public WebElement crossSellPresidentCloudPillowSet1() {
		return driver.findElement(CrossSellPresidentCloudPillowSet1);
	}
	
	public WebElement crossSellPresidentCloudPillowSet2() {
		return driver.findElement(CrossSellPresidentCloudPillowSet2);
	}
	
	public WebElement crossSellPresidentCloudPillowSet4() {
		return driver.findElement(CrossSellPresidentCloudPillowSet4);
	}

	public WebElement crossSellSingleProtector75x36() {
		return driver.findElement(CrossSellSingleProtector75x36);
	}
	
	public WebElement crossSellStandardMemoryPillowSet1() {
		return driver.findElement(CrossSellStandardMemoryPillowSet1);
	}
	
	//Xpath for category field of cloud pillow cross selling product section
	By CrossSellCloudPillowCategoryField= By.xpath("//div[@class='container_cross_sell cloud_pillow ']//div[@data-value='Standard']");

	// Webelement option for cross selling product on Original mattress page 
	public WebElement crossSellCloudPillowCategoryField() {
		return driver.findElement(CrossSellCloudPillowCategoryField);
	}
	
	By CrossSellPresidentCategoryCloudPillow = By.xpath("//*[@id='product_cross_sell_wrap_slider']//span[text()='President']");
	
	// Webelement option for Cross selling next and previous product icon on product details page
	public WebElement crossSellPresidentCategoryCloudPillow() {
		return driver.findElement(CrossSellPresidentCategoryCloudPillow);
	}
	
	//Xpath for pack field of cloud pillow in cross selling product section
    By CrossSellPackFieldOfCloudPillow = By.xpath("//div[@data-name='pack']//span[text()='Pack of 1']");
	
	// Webelement option for pack field of cloud pillow in cross selling product section
	public WebElement crossSellPackFieldOfCloudPillow() {
		return driver.findElement(CrossSellPackFieldOfCloudPillow);
	}
	
	//Xpath for pack field of cloud pillow in cross selling product section
    By CrossSellPackTwoOfCloudPillow = By.xpath("//*[@id='product_cross_sell_wrap_slider']//li[text()='Pack of 2']");
    By CrossSellPackFourOfCloudPillow = By.xpath("//*[@id='product_cross_sell_wrap_slider']//li[text()='Pack of 4']");

	
	// Webelement option for pack field of cloud pillow in cross selling product section
	public WebElement crossSellPackFourOfCloudPillow() {
		return driver.findElement(CrossSellPackFourOfCloudPillow);
	}
	
	public WebElement CrossSellPackTwoOfCloudPillow() {
		return driver.findElement(CrossSellPackTwoOfCloudPillow);
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
		this.driver = driver; // this variable is created to give life to driver
	}
}
