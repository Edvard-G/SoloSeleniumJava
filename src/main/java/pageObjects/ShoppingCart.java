package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart {
	public WebDriver driver;
	
	By sizeXS = By.cssSelector("[attribute-code='size'] [index='0']");
	By sizeS = By .cssSelector("[attribute-code='size'] [index='1']");
	By sizeM = By .cssSelector("[attribute-code='size'] [index='2']");
	By sizeL = By .cssSelector("[attribute-code='size'] [index='3']");
	By sizeXL = By .cssSelector("[attribute-code='size'] [index='4']");
	By colorGray = By.cssSelector("[attribute-code='color'] [index='0']");
	By colorGreen = By.cssSelector("[attribute-code='color'] [index='1']");
	By colorPink = By.cssSelector("[attribute-code='color'] [index='2']");
	By quantity = By.id("qty");
	By addToCartBtn = By.id("product-addtocart-button");
	By myCart = By.cssSelector("[data-block] > [data-bind]");
	By proceedToCheckout = By.id("top-cart-btn-checkout");
	By removeItem = By.cssSelector("a[title='Remove item']");
	
	public ShoppingCart(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSizeXS() {
		return driver.findElement(sizeXS);
	}
	
	public WebElement getSizeS() {
		return driver.findElement(sizeS);
	}
	public WebElement getSizeM() {
		return driver.findElement(sizeM);
	}
	public WebElement getSizeL() {
		return driver.findElement(sizeL);
	}
	public WebElement getSizeXL() {
		return driver.findElement(sizeXL);
	}
	public WebElement getColorGray() {
		return driver.findElement(colorGray);
	}
	public WebElement getColorGreen() {
		return driver.findElement(colorGreen);
	}
	public WebElement getColorPink() {
		return driver.findElement(colorPink);
	}
	public WebElement getQuantity() {
		return driver.findElement(quantity);
	}
	public WebElement getAddToCartBtn() {
		return driver.findElement(addToCartBtn);
	}
	public WebElement getMyCart() {
		return driver.findElement(myCart);
	}
	public WebElement getProceedToCheckout() {
		return driver.findElement(proceedToCheckout);
	}
	public WebElement getRemoveItem() {
		return driver.findElement(removeItem);
	}
}
