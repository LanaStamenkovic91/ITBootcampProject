package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBox {
	public WebDriver driver;
	
	public TextBox (WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement userForm() {
		return driver.findElement(By.id("userForm"));
	}
	
	public WebElement userName() {
		return driver.findElement(By.cssSelector("#userName"));
	}
	
	public WebElement email() {
		return driver.findElement(By.cssSelector("#userEmail"));
	}
	
	public WebElement currentAddress() {
		return driver.findElement(By.cssSelector("#currentAddress-wrapper > div:nth-child(2) > textarea:nth-child(1)"));
	}
	
	public Object scrollToPermanentaddress() {
		WebElement permanentaddress = driver.findElement(By.cssSelector("#permanentAddress-wrapper > div:nth-child(2) > textarea:nth-child(1)"));
		return ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", permanentaddress);
	}
	
	public Object scrollToEmail() {
		WebElement email = driver.findElement(By.cssSelector("#userEmail"));
		return ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", email);
	}
	
	public WebElement permanentAddress() {
		return driver.findElement(By.cssSelector("#permanentAddress-wrapper > div:nth-child(2) > textarea:nth-child(1)"));
	}
	
	public WebElement submitButton() {
		return driver.findElement(By.id("submit"));
	}
	
	//This method returns text from output field
	public String outputField() {
		return driver.findElement(By.id("output")).getText();
	}
	
}
