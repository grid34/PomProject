package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class AddCustomerPage extends BasePage {

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5")
	WebElement ADD_CONTACT_HEADER_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement FULLNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement COMPANY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement COUNTRY_ELEMENT;

	public void verifyAddContactPage(String addContactHeader) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ADD_CONTACT_HEADER_HEADER_ELEMENT));
		Assert.assertEquals("Wrong Page !!", addContactHeader, ADD_CONTACT_HEADER_HEADER_ELEMENT.getText());

	}

	public void insertFullName(String fullName) {

		FULLNAME_ELEMENT.sendKeys(fullName + generateRandomNumber(999));

	}

	public void selectCompany(String company) {

		selectFromDrowdown(COMPANY_ELEMENT, company);
	}

	public void selectContry(String country) {

		selectFromDrowdown(COUNTRY_ELEMENT, country);
	}

	public void insertEmail(String email) {

		EMAIL_ELEMENT.sendKeys(generateRandomNumber(999) + email);
	}
	
	public void insertPhone(String phone) {
		
		PHONE_ELEMENT.sendKeys(phone+generateRandomNumber(9999));
	}
	
	public void validateMaxLenght() {
		
		String typedValue=PHONE_ELEMENT.getAttribute("value");
		
		int size=typedValue.length();
		System.out.println("Your Length is : "+ size);
		if (size==10) {
			
			System.out.println("Max Characters is woring fine");
		}
		else {
			System.out.println("No limit is set");
		}
	}

}
