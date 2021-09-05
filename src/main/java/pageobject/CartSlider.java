package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CartSlider {
	
	static RemoteWebDriver driver;
	
	
	   
	    // Cross selling products in cart slider
		By CrossSellingComforter = By.xpath("//a[@href='https://sleepycat.in/bedding/reversible-comforter/']//img[@class='img-responsive alsoBuy-image']");
		By CrossSellingMemoryPillow = By.xpath("//a[@href='https://sleepycat.in/pillow/memory-foam-pillow/']//img[@class='img-responsive alsoBuy-image']");
		By CrossSellingProtector = By.xpath("//a[@href='https://sleepycat.in/bedding/mattress-protector/']//img[@class='img-responsive alsoBuy-image']");
		By CrossSellingCloudPillow = By.xpath("//a[@href='https://sleepycat.in/pillow/cloud-microfiber-pillow/']//img[@class='img-responsive alsoBuy-image']");
		By CrossSellingWeightedBlanket = By.xpath("//a[@href='https://sleepycat.in/bedding/weighted-blanket/']//img[@class='img-responsive alsoBuy-image']");
		By CrossSellingCuddlePillow = By.xpath("//a[@href='https://sleepycat.in/pillow/pregnancy-body-pillow/']//img[@class='img-responsive alsoBuy-image']");
		By CrossSellingPillowCase = By.xpath("//a[@href='https://sleepycat.in/pillow/pillow-cases/']//img[@class='img-responsive alsoBuy-image']");
		
        By NextCrossProduct = By.xpath("//div[@class='cart-cross-sell-section-wrap cross-selling-section']//a[@class='lSNext']");
        By PreviousCrossProduct = By.xpath("//div[@class='cart-cross-sell-section-wrap cross-selling-section']//a[@class='lSPrev']");
        
        public WebElement nextCrossProduct() {
			return driver.findElement(NextCrossProduct);
		}
        
        public WebElement previousCrossProduct() {
			return driver.findElement(PreviousCrossProduct);
		}

		//Add to cart button xpath for Cross selling products in cart slider
        By AddtocartSingleComforter = By.xpath("//span[@data-sku='SC-COMF-S-90x60']");
		By AddtocartDoubleComforter = By.xpath("//span[@data-sku='SC-COMF-D-90x100']");
		
		By AddtocartStandardSetOffOneMemoryFoamPillow = By.xpath("//span[@data-sku='SC-PILLOW-S-26x16x4']");
		By AddtocartStandardSetOffTwoMemoryFoamPillow = By.xpath("//span[@data-sku='SC-MFPILWSET2-S-26x16x4']");
		
		By AddtocartSingleProtector75x36 = By.xpath("//span[@data-sku='SC-PROT-S-75x36']");
		By AddtocartSingleProtector72x36 = By.xpath("//span[@data-sku='SC-PROT-S-72x36']");
		
		// Webelement for different Add to cart button for products
		public WebElement addtocartSingleComforter() {
			return driver.findElement(AddtocartSingleComforter);
		}
		
		public WebElement addtocartStandardSetOffOneMemoryFoamPillow() {
			return driver.findElement(AddtocartStandardSetOffOneMemoryFoamPillow);
		}
		
		public WebElement addtocartSingleProtector75x36() {
			return driver.findElement(AddtocartSingleProtector75x36);
		}
		
		public WebElement AddtocartSingleProtector72x36() {
			return driver.findElement(AddtocartSingleProtector72x36);
		}
		       
	
		
		//Xpath for different component after adding any products to cart
        By ClosecartSlider = By.xpath("//button[@class='close_slider']");
		By IncrementQuantity = By.xpath("//div[@class='quantity checkout_page_box']//input[@class='plus']");
		By DecreseQuantity = By.xpath("//div[@class='quantity checkout_page_box']//input[@class='minus']");
		By RemoveProduct = By.xpath("//button[@class='product-remove']//i[@class='far fa-trash-alt']");
		

		// Webelement for different component after adding any products to cart
		public WebElement closecartSlider() {
			return driver.findElement(ClosecartSlider);
		}
       
		public WebElement incrementQuantity() {
			return driver.findElement(IncrementQuantity);
		}
		
		public WebElement decreseQuantity() {
			return driver.findElement(DecreseQuantity);
		}
		
		public WebElement removeProduct() {
			return driver.findElement(RemoveProduct);
		}
		
		public CartSlider(RemoteWebDriver driver) 
		{
		   this.driver=driver;
		   
		}

}
