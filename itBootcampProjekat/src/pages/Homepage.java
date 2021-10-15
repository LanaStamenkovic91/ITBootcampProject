package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	public WebDriver driver;

	public Homepage (WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement elements() {
		return driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards > div.card.mt-4.top-card:nth-child(1)"));
	}
	
	public WebElement forms() {
		return driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards > div.card.mt-4.top-card:nth-child(2)"));
	}
	
	public WebElement alerts() {
		return driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards > div.card.mt-4.top-card:nth-child(3)"));
	}
	
	public WebElement widgets() {
		return driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards > div.card.mt-4.top-card:nth-child(4)"));
	}
	
	public WebElement interactions() {
		return driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards > div.card.mt-4.top-card:nth-child(5)"));
	}
	
	public WebElement bookStore() {
		return driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards > div.card.mt-4.top-card:nth-child(6)"));
	}

	//This object scrolls to first row of cards
	public Object scrollToCardsFirstRow() {
		WebElement cards = driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards > div.card.mt-4.top-card:nth-child(1)"));
		return ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cards);
	}
	
	//This object scrolls to second row of cards
	public Object scrollToCardsSecondRow() {
		WebElement cards = driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards > div.card.mt-4.top-card:nth-child(6)"));
		return ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cards);
	}
	
	
	
	
	
	
}
