package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TestBase;

public class LoginPageTest extends TestBase{

	LoginPage loginpageobj;
	
	@BeforeMethod
	public void setUp() {
		
		init();
		loginpageobj = PageFactory.initElements(driver, LoginPage.class);
	}
	
	@Test
	public void loginTest() throws Throwable {
		
		loginpageobj.enterUsername("demo@techfios.com");
		loginpageobj.enterPassword("abc123");
		loginpageobj.ClickSignInButton();
		screenshotMethod(driver);
		
	}
	
	@Test
	public void pageTitleTest() throws Throwable {
		
		loginpageobj.enterUsername("demo@techfios.com");
		loginpageobj.enterPassword("abc123");
		loginpageobj.ClickSignInButton();
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginpageobj.getPageTitleText();
		Assert.assertEquals(actualTitle, expectedTitle);
		screenshotMethod(driver);
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
		driver.quit();
	}
}
