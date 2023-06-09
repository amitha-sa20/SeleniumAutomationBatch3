package ibm_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage_oldtool_withoutPageFactory {

	WebDriver driver;

	public LoginPage_oldtool_withoutPageFactory(WebDriver rdriver) {

		driver = rdriver;

	}

	// identification
	By txtEmail = By.id("Email");
	By txtPass = By.cssSelector("input#Password");
	By chkRem = By.cssSelector("input#RememberMe");
	By btnLogin = By.tagName("button");
	By btnLogout = By.partialLinkText("ogout");
	
	
	
	
	
	
	// Actions/Methods

	public void enterEmail(String email) {

		driver.findElement(txtEmail).clear();
		driver.findElement(txtEmail).sendKeys(email);
	}

	public void enterPass(String pwd) {

		driver.findElement(txtPass).clear();
		driver.findElement(txtPass).sendKeys(pwd);
	}

	public void clickCheckbox() {

		driver.findElement(chkRem).click();

	}

	public void clickLoginButton() {

		driver.findElement(btnLogin).click();

	}
	
	public void clickLogoutButton() {

		driver.findElement(btnLogout).click();

	}
	
	
	public void login(String email, String pass) {
		
		enterEmail(email);
		enterPass(pass);
		clickLoginButton();
		
	}
	
	
	
	public void verifyApplicationTitle(String expectedValue) throws Exception {
		
		Thread.sleep(4000);
		Assert.assertEquals(driver.getTitle(), expectedValue);
	}

}
