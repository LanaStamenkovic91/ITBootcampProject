package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Buttons {
	public WebDriver driver;
	public WebElement clickMe;
	
	//making list of all buttons 
	public List<WebElement> getClickMe() {
		return driver.findElements(By.cssSelector(".btn.btn-primary"));
	}

	public Buttons (WebDriver driver) {
		this.driver=driver;	
	}
	
	//This object scrolls to buttons
		public Object scrollToButtons() {
			WebElement buttons = driver.findElement(By.cssSelector(".show > ul:nth-child(1) > li:nth-child(5)"));
			return ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", buttons);
		}
		
	public WebElement doubleClickMe () {
		return driver.findElement(By.id("doubleClickBtn"));
	}
	
	public WebElement rightClickMe () {
		return driver.findElement(By.id("rightClickBtn"));
	}
	
	//getting 3rd button from list - Click me button
	public void clickMe1 (int i) {
		this.getClickMe().get(i).click();
	}
	
	public WebElement doubleClickMessage () {
		return driver.findElement(By.id("doubleClickMessage"));
	}
	
	public WebElement rightClickMessage () {
		return driver.findElement(By.id("rightClickMessage"));
	}
	
	public WebElement dynamicClickMessage () {
		return driver.findElement(By.id("dynamicClickMessage"));
	}
	
	

	
}