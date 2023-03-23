package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninPage {
	public WebDriver driver;

	By email = By.id("email");
	By password = By.id("pass");
	By signIn = By.id("send2");

	public SigninPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement getSignIn() {
		return driver.findElement(signIn);
	}
}
