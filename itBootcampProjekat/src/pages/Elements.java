package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class Elements {
	public WebDriver driver;
	
	public Elements (WebDriver driver) {
		this.driver=driver;
	}
	
	//Header name locator can be used for all menu fields to get text
	public WebElement headerName() {
		return driver.findElement(By.className("main-header"));
	}
	
	//This method returns true if menu list for elements card is opened
	public boolean elementsMenuListDysplayed() {
	    try {
	        driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-3:nth-child(1) div.left-pannel div.accordion div.element-group:nth-child(1) > div.element-list.collapse.show"));
	        return true;
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        return false;
	    }
	}
	
	public WebElement uncollapseButton() {
		return driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-3:nth-child(1) div.left-pannel div.accordion div.element-group:nth-child(1) span.group-header div.header-wrapper div.header-right div.icon > svg:nth-child(1)"));
	}
	
	public WebElement collapseButton() {
		return driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-3:nth-child(1) div.left-pannel div.accordion div.element-group:nth-child(1) span.group-header div.header-wrapper div.header-right div.icon > svg:nth-child(1)"));
	}
	
	public WebElement textBoxbutton() {
		return driver.findElement(By.cssSelector(".show > ul:nth-child(1) > li:nth-child(1) > span:nth-child(2)"));
	}
	
	public WebElement RadioButtonbutton() {
		return driver.findElement(By.cssSelector(".show > ul:nth-child(1) > li:nth-child(3) > span:nth-child(2)"));
	}
	
	public WebElement buttonsButton() {
		return driver.findElement(By.cssSelector(".show > ul:nth-child(1) > li:nth-child(5)"));	
	}
	
	
		
	
	
	
	
	

	
	
	
	
	

}

