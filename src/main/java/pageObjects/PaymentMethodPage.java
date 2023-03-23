package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentMethodPage {
	public WebDriver driver;
	
	By placeOrder = By.cssSelector("button[title='Place Order'] > span");
	By mainContent = By.cssSelector("#maincontent");
	
	public PaymentMethodPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getPlaceOrder() {
		return driver.findElement(placeOrder);
	}
	public WebElement getMainContent() {
		return driver.findElement(mainContent);
	}
}
