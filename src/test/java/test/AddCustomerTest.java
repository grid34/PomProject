package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;

	@Test
	public void validUserShouldBeAbleToCreateCustomer() throws InterruptedException {

		driver = BrowserFactory.init();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login("demo@techfios.com", "abc123");

		DashBoardPage dashboardPAge = PageFactory.initElements(driver, DashBoardPage.class);

		 dashboardPAge.verifyDashboardPage("Dashboard");

		// dashboardPAge.clickOnCustomer();
		dashboardPAge.clickOnIconMenu();

		dashboardPAge.clickOnAddCustomer();

		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		
		addCustomerPage.verifyAddContactPage("Add Contact");
		
		addCustomerPage.insertFullName("abdou test");
		addCustomerPage.selectCompany("Uber");
		addCustomerPage.insertEmail("test@gmail.com");
		addCustomerPage.selectContry("Yemen");
		addCustomerPage.insertPhone("+1.888.888.");
		addCustomerPage.validateMaxLenght();
		
		

	}

}
