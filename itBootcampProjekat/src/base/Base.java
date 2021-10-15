package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.Buttons;
import pages.Elements;
import pages.Homepage;
import pages.RadioButton;
import pages.TextBox;

public class Base {

	public WebDriver driver;
	public Homepage homepage;
	public Elements elements;
	public TextBox textBox;
	public RadioButton radioButton;
	public Buttons buttons;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		homepage = new Homepage (driver);
		elements = new Elements (driver);
		textBox = new TextBox (driver);
		radioButton = new RadioButton (driver);
		buttons = new Buttons (driver);
	}

	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}