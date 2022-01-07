package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

		WebDriver driver;
		
		public LoginPage(WebDriver driver) {
			this.driver = driver;
		}
	//Stored WebElements
	
	@FindBy (how = How.XPATH, using = "//input[@id='username']") WebElement USERNAME;
	@FindBy (how = How.XPATH, using = "//input[@id='password']") WebElement PASSWORD;
	@FindBy (how = How.XPATH, using = "//button[@name='login']") WebElement CLICK_SIGN_IN_BUTTON;
	
	
	//Stored Methods
	
	public void enterUsername(String username) {
		USERNAME.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		PASSWORD.sendKeys(password);
	}
	
	public void ClickSignInButton() {
		CLICK_SIGN_IN_BUTTON.click();
	}
	
	public String getPageTitleText() {
		return driver.getTitle();
	}
	
	
}
