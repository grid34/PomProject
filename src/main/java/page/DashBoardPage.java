package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashBoardPage {

	WebDriver driver;
	
	public DashBoardPage(WebDriver driver) {

	this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[2]/div/h2")WebElement DASHBOARD_HEADER_ELEMENT; 
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[3]/a")WebElement ICON_ELEMENT;
	//@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[3]/a/span[1]")WebElement CUSTOMERS_ELEMENT; 
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")WebElement ADD_CUSTOMERS_MENU_ELEMENT; 
	
	
	
	public void verifyDashboardPage(String dashboardTest) {
	
		Assert.assertEquals("wrong", dashboardTest, DASHBOARD_HEADER_ELEMENT.getText());
	}
	
	public void clickOnCustomer() {
		
		//CUSTOMERS_ELEMENT.click();
		
		
	}
	public void clickOnIconMenu() {
		
		ICON_ELEMENT.click();

	}
	
	public void clickOnAddCustomer() {
		
		ADD_CUSTOMERS_MENU_ELEMENT.click();
		
		
	}
	
}
