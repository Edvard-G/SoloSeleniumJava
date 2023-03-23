package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WomenShopProductPage {
	WebDriver driver;

	By titlePage = By.cssSelector("[data-ui-id]");
	By prodOnePic = By.cssSelector(".product-item:nth-of-type(1) [max-width]");
	By prodOneAddBtn = By.cssSelector(".product-item:nth-of-type(1) .actions-primary span");
	By prodTwoPic = By.cssSelector(".product-item:nth-of-type(2) [max-width]");
	By prodTwoAddBtn = By.cssSelector(".product-item:nth-of-type(2) .actions-primary span");
	By prodThreePic = By.cssSelector(".product-item:nth-of-type(3) [max-width]");
	By prodThreeAddBtn = By.cssSelector(".product-item:nth-of-type(3) .actions-primary span");
	By prodFourPic = By.cssSelector(".product-item:nth-of-type(4) [max-width]");
	By prodFourAddBtn = By.cssSelector(".product-item:nth-of-type(4) .actions-primary span");
	By styleDropdown = By.cssSelector("[role='presentation']:nth-of-type(1) [role='tab']");
	By styleFullZip = By.partialLinkText("Full Zip");
	By styleSweatShirt = By.partialLinkText("Sweatshirt");
	By colorDropdown = By.cssSelector("div:nth-of-type(4) > div[role='tab']");
	By colorBlue = By.cssSelector("a:nth-of-type(1) > .color.swatch-option");
	By colorRed = By.cssSelector("a:nth-of-type(6) > .color.swatch-option");

	public WomenShopProductPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getTitleOfPage() {
		return driver.findElement(titlePage);
	}

	public WebElement getProdOnePic() {
		return driver.findElement(prodOnePic);
	}

	public WebElement getProdOneAddBtn() {
		return driver.findElement(prodOneAddBtn);
	}

	public WebElement getProdTwoPic() {
		return driver.findElement(prodTwoPic);
	}

	public WebElement getProdTwoAddBtn() {
		return driver.findElement(prodTwoAddBtn);
	}

	public WebElement getProdThreePic() {
		return driver.findElement(prodThreePic);
	}

	public WebElement getProdThreeAddBtn() {
		return driver.findElement(prodThreeAddBtn);
	}

	public WebElement getProdFourPic() {
		return driver.findElement(prodFourPic);
	}

	public WebElement getProdFourAddBtn() {
		return driver.findElement(prodFourAddBtn);
	}

	public WebElement getStyleDropdown() {
		return driver.findElement(styleDropdown);
	}
	
	public WebElement getStyleFullZip() {
		return driver.findElement(styleFullZip);
	}
	
	public WebElement getStyleSweatShirt() {
		return driver.findElement(styleSweatShirt);
	}
	
	public WebElement getColorDropdown() {
		return driver.findElement(colorDropdown);
	}
	
	public WebElement getColorBlue() {
		return driver.findElement(colorBlue);
	}
	
	public WebElement getColorRed() {
		return driver.findElement(colorRed);
	}
}




















