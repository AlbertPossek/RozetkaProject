package RozetkaPackage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainPage {
	private WebDriver driver;
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	By signInButtonLocator = By.xpath("//a[@name='signin']");
	By emailInputLocator = By.xpath("//input[@name='login']");
	By passwordInputLocator = By.xpath("//div[contains(text(), 'Пароль')]//following-sibling::input");
	By submitButtonLocator = By.xpath("//button[@name='auth_submit']");
	By closeSosialPopUpLocator = By.xpath("//a[text()='Закрыть']");
	By userNameLocator = By.xpath("//span[@id='header_user_menu_parent']//child::a[@name='profile']");
	By searchInputLocator = By.xpath("//*[@class='rz-header-search-input-text passive']");
	By searchButtonLocator = By.xpath("//button[text()='Найти']");
	
	public void clickSignInButton() {
		driver.findElement(signInButtonLocator).click();;
	}
	
	public void typeEmail(String email) {
		WebElement login = driver.findElement(emailInputLocator);
		login.click();
		login.clear();
		login.sendKeys(email);
	}
	
	public void typePassword(String password) {
		WebElement login = driver.findElement(passwordInputLocator);
		login.click();
		login.clear();
		login.sendKeys(password);
		
	}
	
	public void clickSubmitButton() {
		driver.findElement(submitButtonLocator).click();
	}
	
	public void login (String email, String password) {
		typeEmail(email);
		typePassword(password);
		clickSubmitButton();
		System.out.println("Login OK");
	}
	
	public void closeSosialPopUpLocator() {
		driver.findElement(closeSosialPopUpLocator).click();		
	}
	
	public void assertUserName() {
		Assert.assertEquals("Wrong user name", driver.findElement(userNameLocator).getText(), "Абраша");
		System.out.println("Username is OK");
	}
	
	public void searchMacbook() {
		WebElement input = driver.findElement(searchInputLocator);
		input.click();
		input.clear();
		input.sendKeys("macbook");
		System.out.println("mackbook entered");
	}
	
	public ResultPage clickSearchButton() {
		driver.findElement(searchButtonLocator).click();
		return new ResultPage(driver);
	}
}
