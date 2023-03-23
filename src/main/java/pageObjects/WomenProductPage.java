package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WomenProductPage {
	public WebDriver driver;
	
	By tops = By.linkText("Tops");
	By bottoms = By.linkText("Bottoms");
	By hoodiesSweatshirts = By.linkText("Hoodies & Sweatshirts");
	By jackets = By.linkText("Jackets");
	By brasTanks = By.linkText("Bras & Tanks");
	By pants = By.linkText("Pants");
	By shorts = By.linkText("Shorts");
	
	
	public WomenProductPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getTops() {
		return driver.findElement(tops);
	}
	
	public WebElement getBottoms() {
		return driver.findElement(bottoms);
	}
	
	public WebElement getHoodiesSweatshirt() {
		return driver.findElement(hoodiesSweatshirts);
	}
	
	public WebElement getJackets() {
		return driver.findElement(jackets);
	}
	
	public WebElement getBrasTanks() {
		return driver.findElement(brasTanks);
	}
	
	public WebElement getPants() {
		return driver.findElement(pants);
	}
	
	public WebElement getShorts() {
		return driver.findElement(shorts);
	}
}











