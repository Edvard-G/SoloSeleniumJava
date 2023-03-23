package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	public WebDriver driver;
	
	By emailAddress = By.id("customer-email");
	By password = By.id("customer-password");
	By firstName = By.id("OOR4LN5");
	By lastName = By.id("INJC466");
	By streetAddress = By.id("OLWCP4X");
	By city = By.id("D3LGW9V");
	By state = By.id("SUVT2HN");
	By zipCode = By.id("A06RE4A");
	By country = By.id("XD11495");
	By phoneNumber = By.id("NYXKK3L");
	By shipMethodRadioOne = By.xpath("///input[@name='ko_unique_1']");
	By shipMethodRadioTwo = By.xpath("///input[@name='ko_unique_2']");
	By submitNextBtn = By.cssSelector("[data-bind='i18n\\: \\'Next\\'']");
	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getEmailAddress() {
		return driver.findElement(emailAddress);
	}
	
	public WebElement getFirstName() {
		return driver.findElement(firstName);
	}
	
	public WebElement getLastName() {
		return driver.findElement(lastName);
	}
	
	public WebElement getStreetAddress() {
		return driver.findElement(streetAddress);
	}
	
	public WebElement getCity() {
		return driver.findElement(city);
	}
	
	public WebElement getState() {
		return driver.findElement(state);
	}
	
	public WebElement getZipCode() {
		return driver.findElement(zipCode);
	}
	
	public WebElement getCountry() {
		return driver.findElement(country);
	}
	
	public WebElement getPhoneNumber() {
		return driver.findElement(phoneNumber);
	}
	
	public WebElement getShipMethodRadioOne() {
		return driver.findElement(shipMethodRadioOne);
	}
	
	public WebElement getShipMethodRadioTwo() {
		return driver.findElement(shipMethodRadioTwo);
	}
	
	public WebElement getSubmitNext() {
		return driver.findElement(submitNextBtn);
	}
	
}


















