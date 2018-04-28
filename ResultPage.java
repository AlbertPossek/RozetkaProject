package RozetkaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ResultPage {
	private WebDriver driver;
	public ResultPage(WebDriver driver) {this.driver = driver;}
	
	By mouseOverLocatorLocator = By.xpath("//*[@id='catalog_goods_block']/div/div[1]/div[1]");
	By addToBasketLocator = By.xpath("//*[@id='catalog_goods_block']/div/div[1]/div[1]/div/div/div/div[8]/div/div/div/form/span/button/span");
	By itemNameLocator	= By.xpath("//*[@id='cart-popup']/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/span/span[1]");	

	
	public void mouseOver() {
		Actions builder = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@id='catalog_goods_block']/div/div[1]/div[1]"));
	    builder.moveToElement(element).build().perform();
	}
	
	public void addToBasketFirstResult() {
		driver.findElement(addToBasketLocator).click();
		System.out.println("Click add to basket");
	}
	
	public void assertItemName() {
		System.out.println("The price is: "+driver.findElement(itemNameLocator).getText());
	}

}
