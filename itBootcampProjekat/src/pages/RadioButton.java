package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButton {
	public WebDriver driver;
	
	public RadioButton (WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement yesButton() {
		return driver.findElement(By.cssSelector("div.custom-control:nth-child(2) > label:nth-child(2)"));
	}
	
	public WebElement impressiveButton() {
		return driver.findElement(By.cssSelector("div.custom-control:nth-child(3) > label:nth-child(2)"));
	}
	
	public WebElement noButton() {
		return driver.findElement(By.cssSelector("html body div#app div.body-height div.container.playgound-body div.row div.col-12.mt-4.col-md-6 div div.custom-control.disabled.custom-radio.custom-control-inline input#noRadio.custom-control-input.disabled"));
	}
	
	public String message () {
		return driver.findElement(By.cssSelector(".mt-3")).getText();
	}
	
	public boolean yesButtonIsClickable() {
	    try
	    {
	    	WebElement yesButton = driver.findElement(By.cssSelector("div.custom-control:nth-child(2) > label:nth-child(2)"));
	    	WebDriverWait wait = new WebDriverWait(driver, 5);
	        wait.until(ExpectedConditions.elementToBeClickable(yesButton));
	        return true;
	    }
	    catch (Exception e)
	    {
	        return false;
	    }
	}
	
	public boolean impressiveButtonIsClickable() {
	    try
	    {
	    	WebElement impressiveButton = driver.findElement(By.cssSelector("div.custom-control:nth-child(3) > label:nth-child(2)"));
	    	WebDriverWait wait = new WebDriverWait(driver, 5);
	        wait.until(ExpectedConditions.elementToBeClickable(impressiveButton));
	        return true;
	    }
	    catch (Exception e)
	    {
	        return false;
	    }
	}
	
	public boolean noButtonIsClickable() {
	    try
	    {
	    	WebElement impressiveButton = driver.findElement(By.cssSelector("html body div#app div.body-height div.container.playgound-body div.row div.col-12.mt-4.col-md-6 div div.custom-control.disabled.custom-radio.custom-control-inline input#noRadio.custom-control-input.disabled"));
	    	WebDriverWait wait = new WebDriverWait(driver, 5);
	        wait.until(ExpectedConditions.elementToBeClickable(impressiveButton));
	        return true;
	    }
	    catch (Exception e)
	    {
	        return false;
	    }
	}

}
