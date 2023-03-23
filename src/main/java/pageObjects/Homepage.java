package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage { // https://magento.softwaretestingboard.com/

	public WebDriver driver;

	By whatsNewLink = By.cssSelector("[data-action] > [role] > [role='presentation']:nth-of-type(1) span");
	By signinLink = By.linkText("Sign In");
	By womenDropdown = By.linkText("Women");
	By womenTopsDropdown = By.linkText("Tops");
	By womenJackets = By.cssSelector(
			"li:nth-of-type(2) > ul[role='menu'] > li:nth-of-type(1) > ul[role='menu'] > li:nth-of-type(1) > a[role='menuitem'] > span");
	By womenHoodiesSweatshirt = By.cssSelector(
			"li:nth-of-type(2) > ul[role='menu'] > li:nth-of-type(1) > ul[role='menu'] > li:nth-of-type(2) > a[role='menuitem'] > span");
	By womenTees = By.cssSelector(
			"[data-action] [role='presentation']:nth-of-type(2) [role='presentation']:nth-of-type(3) span");
	By womenBrasAndTanks = By.cssSelector(
			"[data-action] [role='presentation']:nth-of-type(2) [role='presentation']:nth-of-type(4) span");
	By womenBottomDropDown = By.cssSelector(
			"li:nth-of-type(2) > ul[role='menu'] > li:nth-of-type(2) > a[role='menuitem'] > span:nth-of-type(2)");
	By womenShorts = By.cssSelector(
			"li:nth-of-type(2) > ul[role='menu'] > li:nth-of-type(2) > ul[role='menu'] > li:nth-of-type(2) > a[role='menuitem'] > span");
	By womenPants = By.cssSelector(
			"li:nth-of-type(2) > ul[role='menu'] > li:nth-of-type(2) > ul[role='menu'] > li:nth-of-type(1) > a[role='menuitem'] > span");
	By menDropdown = By.cssSelector("li:nth-of-type(3) > a[role='menuitem'] > span:nth-of-type(2)");
	By menTopsDropdown = By.cssSelector(
			"li:nth-of-type(3) > ul[role='menu'] > li:nth-of-type(1) > a[role='menuitem'] > span:nth-of-type(2)");
	By menJackets = By.cssSelector(
			"li:nth-of-type(3) > ul[role='menu'] > li:nth-of-type(1) > ul[role='menu'] > li:nth-of-type(1) > a[role='menuitem'] > span");
	By menHoodiesSweatshirt = By.cssSelector(
			"li:nth-of-type(3) > ul[role='menu'] > li:nth-of-type(1) > ul[role='menu'] > li:nth-of-type(2) > a[role='menuitem']");
	By menTees = By.cssSelector(
			"li:nth-of-type(3) > ul[role='menu'] > li:nth-of-type(1) > ul[role='menu'] > li:nth-of-type(3) > a[role='menuitem']");
	By menTanks = By.cssSelector(
			"li:nth-of-type(3) > ul[role='menu'] > li:nth-of-type(1) > ul[role='menu'] > li:nth-of-type(4) > a[role='menuitem']");
	By menBottomDropDown = By.cssSelector(
			"li:nth-of-type(3) > ul[role='menu'] > li:nth-of-type(2) > a[role='menuitem'] > span:nth-of-type(2)");
	By menShorts = By.cssSelector(
			"li:nth-of-type(3) > ul[role='menu'] > li:nth-of-type(2) > ul[role='menu'] > li:nth-of-type(2) > a[role='menuitem']");
	By menPants = By.cssSelector(
			"li:nth-of-type(2) > ul[role='menu'] > li:nth-of-type(2) > ul[role='menu'] > li:nth-of-type(1) > a[role='menuitem'] > span");
	By gearDropdown = By.cssSelector("li:nth-of-type(4) > a[role='menuitem'] > span:nth-of-type(2)");
	By trainingDropdown = By.cssSelector("li:nth-of-type(5) > a[role='menuitem'] > span:nth-of-type(2)");
	By sale = By.cssSelector("li:nth-of-type(6) > a[role='menuitem'] > span");

	public Homepage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSigninLink() {
		return driver.findElement(signinLink);
	}
	public WebElement getWhatsNew() {
		return driver.findElement(whatsNewLink);
	}

	public WebElement getWomenLink() {
		return driver.findElement(womenDropdown);
	}

	public WebElement getWomenTopsDropdown() {
		return driver.findElement(womenTopsDropdown);
	}

	public WebElement getWomenJackets() {
		return driver.findElement(womenJackets);
	}

	public WebElement getWomenHoodiesSweatshirt() {
		return driver.findElement(womenHoodiesSweatshirt);
	}

	public WebElement getWomenTees() {
		return driver.findElement(womenTees);
	}

	public WebElement getWomenBrasAndTanks() {
		return driver.findElement(womenBrasAndTanks);
	}

	public WebElement getWomenBottomDropdown() {
		return driver.findElement(womenBottomDropDown);
	}

	public WebElement getWomenShorts() {
		return driver.findElement(womenShorts);
	}

	public WebElement getWomenPants() {
		return driver.findElement(womenPants);
	}

	public WebElement getMenLink() {
		return driver.findElement(menDropdown);
	}
	

	public WebElement getMenTopsDropdown() {
		return driver.findElement(menTopsDropdown);
	}

	public WebElement getMenJackets() {
		return driver.findElement(menJackets);
	}

	public WebElement getMenHoodiesSweatshirt() {
		return driver.findElement(menHoodiesSweatshirt);
	}

	public WebElement getMenTees() {
		return driver.findElement(menTees);
	}

	public WebElement getMenBrasAndTanks() {
		return driver.findElement(menTanks);
	}

	public WebElement getMenBottomDropdown() {
		return driver.findElement(menBottomDropDown);
	}

	public WebElement getMenShorts() {
		return driver.findElement(menShorts);
	}

	public WebElement getMenPants() {
		return driver.findElement(menPants);
	}

	public WebElement getGear() {
		return driver.findElement(gearDropdown);
	}

	public WebElement getTraining() {
		return driver.findElement(trainingDropdown);
	}

	public WebElement getSale() {
		return driver.findElement(sale);
	}
}
