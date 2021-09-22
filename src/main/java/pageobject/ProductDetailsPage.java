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
	
	// Xpath for Pet Bed Category section on product details page
	By OriginalCategory = By.xpath("//li[text()='Original']");
	By OrthopedicCategory = By.xpath("//li[text()='Orthopedic']");
	
	// Webelement for Xpath for Pet Bed Category section on product details page
	public WebElement originalCategory() {
		return driver.findElement(OriginalCategory);
	}
	
	public WebElement orthopedicCategory() {
		return driver.findElement(OrthopedicCategory);
	}
	
	
	// Xpath for Cloud pillow Standard,President Category option on product details page
    By PresidentCategory = By.xpath("//li[text()='President']");
    By StandardCategory = By.xpath("//li[text()='Standard']");
	
	// Webelement for Cloud pillow President Category option on product details page
	public WebElement presidentCategory() {
		return driver.findElement(PresidentCategory);
	}
	
	public WebElement standardCategory() {
		return driver.findElement(StandardCategory);
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
	By EightInchHeight = By.xpath("//li[@data-value='8 inch']");

	
	// Webelement option for 10 inch Height on Plus mattress page
	public WebElement tenInchHeight() {
		return driver.findElement(TenInchHeight);
	}
	
	public WebElement eightInchHeight() {
		return driver.findElement(EightInchHeight);
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
	// Dropdown option when feet is selected in latex mattress and when category is King
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
	
	
	// Latex mattress size section on product details page
	// Dropdown option when feet is selected in Plus mattress and when category is King
	By SingleLatex72x36x7 = By.xpath("//li[@data-sku='SC-LATEX-S-72x36x7']");
	//Above xpath can also be used when cm or feet is selected as dimension for 182 x 91 x 17 cm and 6' x 3' x 0.58' feet
				
	By SingleLatex75x36x7 = By.xpath("//li[@data-sku='SC-LATEX-S-75x36x7']");
	//Above xpath can also be used when cm or feet is selected as dimension for 190 x 91 x 17 cm and 6.25' x 3' x 0.58' feet
	

	// Webelement when Inch,cm or feet dimension is selected in latex mattress and when category is king
	public WebElement singleLatex72x36x7() {
		return driver.findElement(SingleLatex72x36x7);
	}

	public WebElement singleLatex75x36x7() {
		return driver.findElement(SingleLatex75x36x7);
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
	}//input[@name='custom_length']
	
	 // Baby mattress Different Size sections
	// Drop down option when Inch,cm or feet is selected in Baby mattress for Single category
	By SingleBabyMattress52x28x4 = By.xpath("//li[@data-sku='SC-BABY-S-52x28x4']");
	//Above Xpath can also be used when cm or feet is selected as dimension for 132 x 71 x 10 cm and 4.33' x 2.33' x 0.33' feet
		
	By SingleBabyMattress48x24x4 = By.xpath("//li[@data-sku='SC-BABY-S-48x24x4']");
	//Above xpath can also be used when cm or feet is selected as dimension for 121 x 60 x 10 cm and 4' x 2' x 0.33' feet

	// Webelement for Drop down option when Inch,cm or feet is selected in Baby mattress for Single category
	public WebElement singleBabyMattress52x28x4() {
		return driver.findElement(SingleBabyMattress52x28x4);
	}

	public WebElement singleBabyMattress48x24x4() {
		return driver.findElement(SingleBabyMattress48x24x4);
	}
    
	
	// Xpath for custom lenght and width option when category is custom
    By CustomLength = By.xpath("//input[@name='custom_length']");
	By CustomWidth = By.xpath("//input[@name='custom_breath']");
		
	// Webelement option for Dropdown option when category is Queen on Plus mattress and height is 10 inch
	public WebElement customLength() {
		return driver.findElement(CustomLength);
	}

	public WebElement customWidth() {
		return driver.findElement(CustomWidth);
	}
	
	
	//Mattress Protector size section on product details page
	// Dropdown option when Inch is selected in Protector and when category is double
	By DoubleProtector75x48 = By.xpath("//ul[@class='protector']//li[@data-sku='SC-PROT-D-75x48']");
	//Above Xpath can also be used when cm or feet is selected as dimension for 190 x 121 cm and 6.25' x 4' feet

	By DoubleProtector78x48 = By.xpath("//ul[@class='protector']//li[@data-sku='SC-PROT-D-78x48']");
	//Above Xpath can also be used when cm or feet is selected as dimension for 198 x 121 cm and 6.5' x 4' feet

	// Webelement when Inch is selected in Protector and when category is double
	public WebElement doubleProtector75x48() {
		return driver.findElement(DoubleProtector75x48);
	}

	public WebElement doubleProtector78x48() {
		return driver.findElement(DoubleProtector78x48);
	}
	
	
	// Mattress Protector size section on product details page
	// Dropdown size option in Protector when category is Single
	By SingleProtector75x48 = By.xpath("//ul[@class='protector']//li[@data-sku='SC-PROT-S-75x36']");
	//Above Xpath can also be used when cm or feet is selected as dimension for 190 x 121 cm and 6.5' x 3' feet

	By SingleProtector78x36 = By.xpath("//ul[@class='protector']//li[@data-sku='SC-PROT-S-78x36']");
	//Above Xpath can also be used when cm or feet is selected as dimension for 198 x 121 cm and 6.5' x 3' feet

	// Webelement when Inch is selected in Protector and when category is Single
	public WebElement singleProtector75x48() {
		return driver.findElement(SingleProtector75x48);
	}

	public WebElement singleProtector78x36() {
		return driver.findElement(SingleProtector78x36);
	}
	
	
	//Xpath for Color options of Comforter on product details page
    By ComforterCoffeeColor = By.xpath("//div[@class='Color ']//li[@data-value='coffee']");
    By ComforterPinkColor = By.xpath("//div[@class='Color ']//li[@data-value='pink']");
	
	// Webelement for Color options of Comforter on product details page
	public WebElement comforterCoffeeColor() {
		return driver.findElement(ComforterCoffeeColor);
	}
			
	public WebElement comforterPinkColor() {
		return driver.findElement(ComforterPinkColor);
	}
	
	
	//Xpath for Color options of Weighted Blanket on product details page
    By WeightedBlanketGreyColor = By.xpath("//div[@class='Color ']//li[@data-value='wbgrey']");
    By WeightedBlanketPinkColor = By.xpath("//div[@class='Color ']//li[@data-value='wbpink']");
	
	// Webelement for Color options of Weighted Blanket on product details page
	public WebElement weightedBlanketGreyColor() {
		return driver.findElement(WeightedBlanketGreyColor);
	}
			
	public WebElement weightedBlanketPinkColor() {
		return driver.findElement(WeightedBlanketPinkColor);
	}
	
	
	//Pet Bed size section on product details page
	// Dropdown option when inch is selected in Pet Bed and when category is Orthopedic
   	By OrthopedicPetBed28x26 = By.xpath("//li[@data-sku='SC-PETBEDORTHO-M-28x26']");
	//Above xpath can also be used when cm or feet is selected as dimension for Medium - 71 x 66 cm and Medium - 2.33' x 2.17' feet
				
	By OrthopedicPetBed48x24 = By.xpath("//li[@data-sku='SC-PETBEDORTHO-L-48x24']");
	//Above xpath can also be used when cm or feet is selected as dimension for Large - 121 x 60 cm and Large - 4' x 2' feet
				
    By OrthopedicPetBed52x28 = By.xpath("//li[@data-sku='SC-PETBEDORTHO-XL-52x28']");
	//Above xpath can also be used when cm or feet is selected as dimension for Extra Large - 132 x 71 cm and Extra Large - 4.33' x 2.33' feet

	// Webelement option when inch is selected in Pet Bed and when category is Orthopedic
	public WebElement orthopedicPetBed28x26() {
		return driver.findElement(OrthopedicPetBed28x26);
	}

	public WebElement orthopedicPetBed48x24() {
		return driver.findElement(OrthopedicPetBed48x24);
	}
				
	public WebElement orthopedicPetBed52x28() {
		return driver.findElement(OrthopedicPetBed52x28);
	}
	
	// Dropdown option for Pet Bed and when category is Original
   	By OriginalPetBedMedium36x26 = By.xpath("//li[@data-sku='SC-PETBEDORIG-M-36x26']");
	//Above xpath can also be used when cm or feet is selected as dimension for Medium - 91 x 66 cm and Medium - 3' x 2.17' feet
				
	By OriginalPetBedLarge46x32 = By.xpath("//li[@data-sku='SC-PETBEDORIG-L-46x32']");
	//Above xpath can also be used when cm or feet is selected as dimension for Large - 116 x 81 cm and Large - 3.83' x 2.67' feet
				
    By OriginalPetBedExtraLarge54x36 = By.xpath("//li[@data-sku='SC-PETBEDORIG-XL-54x36']");
	//Above xpath can also be used when cm or feet is selected as dimension for Extra Large - 137 x 91 cm and Extra Large - 4.5' x 3' feet

	// Webelement option for Pet Bed and when category is Original
	public WebElement originalPetBedMedium36x26() {
		return driver.findElement(OriginalPetBedMedium36x26);
	}

	public WebElement originalPetBedLarge46x32() {
		return driver.findElement(OriginalPetBedLarge46x32);
	}
				
	public WebElement originalPetBedExtraLarge54x36() {
		return driver.findElement(OriginalPetBedExtraLarge54x36);
	}
	
	
	//Xpath for Personalize Name Section,Stitch it button and name field on product details page
    By PersonalizeNameSection = By.xpath("//button[@id='personalize-toggle-btn']");
    By PersonalizeNameField = By.xpath("//input[@id='personalize-initials']");
    By StitchButton = By.xpath("//button[@id='stitch-it-btn']");
    By EditButton = By.xpath("//button[@id='edit-btn']");
    By RemoveButton = By.xpath("//button[@id='cancel-btn']");

	
	// Webelement for Personalize Name Section,Stitch it button and name field on product details page
	public WebElement personalizeNameSection() {
		return driver.findElement(PersonalizeNameSection);
	}
	
	public WebElement personalizeNameField() {
		return driver.findElement(PersonalizeNameField);
	}
	
	public WebElement stitchButton() {
		return driver.findElement(StitchButton);
	}
	
	public WebElement editButton() {
		return driver.findElement(EditButton);
	}
	
	public WebElement removeButton() {
		return driver.findElement(RemoveButton);
	}
	
	//Xpath for different Pack size on product details page of Cloud Pillow
    By OnePillowPackSize = By.xpath("//div[@class='attr attr_Pack ']//li[@data-value='pillow-1']");
    By TwoPillowPackSize = By.xpath("//div[@class='attr attr_Pack ']//li[@data-value='pillow-2']");
    By FourPillowPackSize = By.xpath("//div[@class='attr attr_Pack ']//li[@data-value='pillow-4']");

	
	// Webelement for different Pack size on product details page of Cloud Pillow
	public WebElement onePillowPackSize() {
		return driver.findElement(OnePillowPackSize);
	}
	
	public WebElement twoPillowPackSize() {
		return driver.findElement(TwoPillowPackSize);
	}
	
	public WebElement fourPillowPackSize() {
		return driver.findElement(FourPillowPackSize);
	}
	
	 //Pillow case Xpath and Webelement for different element on product details page
	//Xpath for different Category on product details page of Pillow Cases
    By CloudPillowCaseCategory = By.xpath("//div[@class='attr attr_Scategory ']//li[@data-value='Cloud Pillow Case']");
    By MemoryFoamPillowCaseCategory = By.xpath("//div[@class='attr attr_Scategory ']//li[@data-value='Memory Foam Pillow Case']");
    By CuddlePillowCaseCategory = By.xpath("//div[@class='attr attr_Scategory ']//li[@data-value='Cuddle Pillow Case']");

	
	// Webelement for different Category on product details page of Pillow Cases
	public WebElement cloudPillowCaseCategory() {
		return driver.findElement(CloudPillowCaseCategory);
	}
	
	public WebElement memoryFoamPillowCaseCategory() {
		return driver.findElement(MemoryFoamPillowCaseCategory);
	}
	
	public WebElement cuddlePillowCaseCategory() {
		return driver.findElement(CuddlePillowCaseCategory);
	}
	
	
	//Xpath for different Pack size options on product details page of Pillow Cases
    By TwoPillowCasesPackSize = By.xpath("//div[@class='attr attr_Pack ']//li[@data-value='case-2']");
    By FourPillowCasesPackSize = By.xpath("//div[@class='attr attr_Pack ']//li[@data-value='case-4']");
    By EightPillowCasesPackSize = By.xpath("//div[@class='attr attr_Pack ']//li[@data-value='case-8']");

	
	// Webelement for different Pack size options on product details page of Pillow Cases
	public WebElement twoPillowCasesPackSize() {
		return driver.findElement(TwoPillowCasesPackSize);
	}
	
	public WebElement fourPillowCasesPackSize() {
		return driver.findElement(FourPillowCasesPackSize);
	}
	
	public WebElement eightPillowCasesPackSize() {
		return driver.findElement(EightPillowCasesPackSize);
	}
	
	
	//Pillow cases size section on product details page
	// Size Dropdown option when memory foam pillow case category is selected on Pillow case product details page
	By MemoryFoamFourCases28x18 = By.xpath("//ul[@class='pillow_case']//li[@data-sku='SC-GRPILWCSSET2-S-28x18']");
	//Above xpath can also be used when cm or feet is selected as dimension for 182 x 182 x 17 cm and 6' x 6' x 0.58' feet
				
	By MemoryFoamFourCases33x21 = By.xpath("//ul[@class='pillow_case']//li[@data-sku='SC-GRPILWCSSET2-P-33x21']");
	//Above xpath can also be used when cm or feet is selected as dimension for 190 x 182 x 17 cm and 6.5' x 6' x 0.58' feet
				

	// Webelement when Inch,cm or feet dimension is selected in latex mattress and when category is king
	public WebElement memoryFoamFourCases28x18() {
		return driver.findElement(MemoryFoamFourCases28x18);
	}

	public WebElement memoryFoamFourCases33x21() {
		return driver.findElement(MemoryFoamFourCases33x21);
	}
	
	// Size Dropdown option when Cloud pillow case category is selected on Pillow case product details page
	By CloudPillowTwoCases33x21 = By.xpath("//ul[@class='pillow_case']//li[@data-sku='SC-GRPILWCS-P-33x21'][2]");
	//Above xpath can also be used when cm or feet is selected as dimension for 182 x 182 x 17 cm and 6' x 6' x 0.58' feet
					
	By CloudPillowTwoCases28x18 = By.xpath("//ul[@class='pillow_case']//li[@data-sku='SC-GRPILWCS-S-28x18'][2]");
	//Above xpath can also be used when cm or feet is selected as dimension for 190 x 182 x 17 cm and 6.5' x 6' x 0.58' feet
					

	// Webelement option for size dropdown when Cloud pillow case category is selected on Pillow case product details page
	public WebElement cloudPillowTwoCases33x21() {
		return driver.findElement(CloudPillowTwoCases33x21);
	}

	public WebElement cloudPillowTwoCases28x18() {
		return driver.findElement(CloudPillowTwoCases28x18);
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
	
	//Xpath for President category of cloud pillow cross selling product section
	By CrossSellPresidentCategoryCloudPillow = By.xpath("//*[@id='product_cross_sell_wrap_slider']//span[text()='President']");
	
	// Webelement option for President category of cloud pillow cross selling product section
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
