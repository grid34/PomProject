package test ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest  {

	WebDriver driver;
	@Test
	public void validUserShouldBeAbleToLogin() {
		
		 driver=BrowserFactory.init();
		 
		
		 LoginPage LoginPage= PageFactory.initElements(driver, LoginPage.class);
		 LoginPage.insertUserName("demo@techfios.com");
		 LoginPage.insertPassword("abc123");
		 LoginPage.clickOnSigninButton();
		 
		 DashBoardPage dashboardPage= PageFactory.initElements(driver, DashBoardPage.class);	 
		 dashboardPage.verifyDashboardPage("Dashboard");
		 

		
		 
		 
		 
		// BrowserFactory.tearDown();
	}
}
