package test;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import base.Base;

//This project is made to test various functionalities in https://demoqa.com/ website
//Tests are done in Chrome driver using Selenium Web Driver
//Test Cases and Bug Reports are added in TestScheme class

public class TestPage extends Base {

	@BeforeMethod
	public void beforetest() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	// Test scenario - Verify that all elements on homepage are clickable and lead
	// too corresponding pages

	// Verify that Elements card is clickable and leads to Elements page
	@Test(priority = 10)
	public void ElementsCardOnHomepageIsClickable() {

		driver.get("https://demoqa.com/");
		homepage.scrollToCardsFirstRow();
		homepage.elements().click();
		Assert.assertEquals("https://demoqa.com/elements", driver.getCurrentUrl());
		Assert.assertEquals("Elements", elements.headerName().getText());
	}

	// Verify that Forms card is clickable and leads to Forms page
	@Test(priority = 10)
	public void FormsCardOnHomepageIsClickable() {

		driver.get("https://demoqa.com/");
		homepage.scrollToCardsFirstRow();
		homepage.forms().click();
		Assert.assertEquals("https://demoqa.com/forms", driver.getCurrentUrl());
		Assert.assertEquals("Forms", elements.headerName().getText());
	}

	// Verify that Alerts, Frame & Windows card is clickable and leads to Alerts,
	// Frame & Windows page
	@Test(priority = 10)
	public void AlertsCardOnHomepageIsClickable() {

		driver.get("https://demoqa.com/");
		homepage.scrollToCardsFirstRow();
		homepage.alerts().click();
		Assert.assertEquals("https://demoqa.com/alertsWindows", driver.getCurrentUrl());
		Assert.assertEquals("Alerts, Frame & Windows", elements.headerName().getText());
	}

	// Verify that Widgets card is clickable and leads to Widgets page
	@Test(priority = 10)
	public void WidgetsCardOnHomepageIsClickable() {

		driver.get("https://demoqa.com/");
		homepage.scrollToCardsFirstRow();
		homepage.widgets().click();
		Assert.assertEquals("https://demoqa.com/widgets", driver.getCurrentUrl());
		Assert.assertEquals("Widgets", elements.headerName().getText());
	}

	// Verify that Interactions card is clickable and leads to Interactions page
	@Test(priority = 10)
	public void InteractionsCardOnHomepageIsClickable() {

		driver.get("https://demoqa.com/");
		homepage.scrollToCardsFirstRow();
		homepage.interactions().click();
		Assert.assertEquals("https://demoqa.com/interaction", driver.getCurrentUrl());
		Assert.assertEquals("Interactions", elements.headerName().getText());
	}

	// Verify that Book Store card is clickable and leads to Book Store page
	@Test(priority = 10)
	public void BookStoreCardOnHomepageIsClickable() {

		driver.get("https://demoqa.com/");
		homepage.scrollToCardsSecondRow();
		homepage.bookStore().click();
		Assert.assertEquals("https://demoqa.com/books", driver.getCurrentUrl());
		Assert.assertEquals("Book Store", elements.headerName().getText());
	}

	// Test scenario - Verify that Elements menu collapse/uncollapse properly

	// Verify that Elements menu is collapsed when entering Elements page
	@Test(priority = 10)
	public void elementsCardMenuCollapsedWhenElementPageIsOpened() {
		driver.navigate().to("https://demoqa.com/elements");
		Assert.assertEquals(true, elements.elementsMenuListDysplayed());
	}

	// Verify that Element collapse/uncollapse button works properly
	@Test(priority = 10)
	public void elementCardMenuCollapseAndUncollapse() {
		driver.navigate().to("https://demoqa.com/elements");
		// Verify that menu list disappears when clicked uncollapse button
		elements.uncollapseButton().click();
		Assert.assertEquals(false, elements.elementsMenuListDysplayed());
		// Verify that menu list appears when clicked collapse button
		elements.collapseButton().click();
		Assert.assertEquals(true, elements.elementsMenuListDysplayed());
	}

	// Verify that Text Box dialog appears when clicked on Text Box button
	@Test(priority = 20)
	public void textBoxIsClickableAndOpensUserFormWhenClicked() {

		driver.navigate().to("https://demoqa.com/elements");
		elements.textBoxbutton().click();
		Assert.assertEquals("Text Box", elements.headerName().getText());
		Assert.assertEquals(true, textBox.userForm().isDisplayed());
	}

	// Test Scenario - Text Box happy flow examples

	// Verify that user can successfully submit User form by filling correctly all
	// fields and clicking submit button
	@Test(priority = 30)
	public void userFormHappyFlowAllFieldsFilled() {

		driver.navigate().to("https://demoqa.com/elements");
		elements.textBoxbutton().click();
		textBox.userName().clear();
		textBox.userName().click();
		textBox.userName().sendKeys("Name");
		textBox.email().clear();
		textBox.email().click();
		textBox.email().sendKeys("test@test.com");
		textBox.currentAddress().clear();
		textBox.currentAddress().click();
		textBox.currentAddress().sendKeys("Address1");
		textBox.scrollToPermanentaddress();
		textBox.permanentAddress().clear();
		textBox.permanentAddress().click();
		textBox.permanentAddress().sendKeys("Address2");
		textBox.submitButton().click();
		Assert.assertEquals("Name:Name\nEmail:test@test.com\nCurrent Address :Address1\nPermanent Address :Address2",
				textBox.outputField());
		/*
		 * BUG REPORT 1 SEE TestScheme CLASS
		 */
	}

	// Verify that user can successfully submit User form by filling only full name
	// and clicking submit button
	@Test(priority = 30)
	public void userFormHappyFlowOnlyFullNameFilled() {

		driver.navigate().to("https://demoqa.com/elements");
		elements.textBoxbutton().click();
		textBox.userName().clear();
		textBox.userName().click();
		textBox.userName().sendKeys("Name");
		textBox.email().clear();
		textBox.currentAddress().clear();
		textBox.scrollToPermanentaddress();
		textBox.permanentAddress().clear();
		textBox.submitButton().click();
		// Verify that data submited by user are correctly written in the output field
		Assert.assertEquals("Name:Name", textBox.outputField());
	}

	// Verify that user can successfully submit User form by filling only email and
	// clicking submit button
	@Test(priority = 30)
	public void userFormHappyFlowOnlyEmailFilled() {

		driver.navigate().to("https://demoqa.com/elements");
		elements.textBoxbutton().click();
		textBox.userName().clear();
		textBox.email().clear();
		textBox.email().click();
		textBox.email().sendKeys("test@test.com");
		textBox.currentAddress().clear();
		textBox.scrollToPermanentaddress();
		textBox.permanentAddress().clear();
		textBox.submitButton().click();
		// Verify that data submited by user are correctly written in the output field
		Assert.assertEquals("Email:test@test.com", textBox.outputField());
	}

	// Verify that user can successfully submit User form by filling correctly
	// Current Address and clicking submit button
	@Test(priority = 30)
	public void userFormHappyFlowOnlyCurrentAddressFilled() {
		driver.navigate().to("https://demoqa.com/elements");
		elements.textBoxbutton().click();
		textBox.userName().clear();
		textBox.email().clear();
		textBox.currentAddress().clear();
		textBox.currentAddress().click();
		textBox.currentAddress().sendKeys("Address1");
		textBox.scrollToPermanentaddress();
		textBox.permanentAddress().clear();
		textBox.submitButton().click();
		// Verify that data submited by user are correctly written in the output field
		Assert.assertEquals("Current Address :Address1", textBox.outputField());
	}

	// Verify that user can successfully submit User form by filling correctly
	// Permanent Address and clicking submit button
	@Test(priority = 30)
	public void userFormHappyFlowOnlyPermanentAddressFilled() {

		driver.navigate().to("https://demoqa.com/elements");
		elements.textBoxbutton().click();
		textBox.userName().clear();
		textBox.email().clear();
		textBox.currentAddress().clear();
		textBox.scrollToPermanentaddress();
		textBox.permanentAddress().clear();
		textBox.permanentAddress().click();
		textBox.permanentAddress().sendKeys("Address2");
		textBox.submitButton().click();
		// Verify that data submited by user are correctly written in the output field
		Assert.assertEquals("Permanent Address :Address2", textBox.outputField());
		/*
		 * BUG REPORT 1 SEE TestScheme CLASS
		 */
	}

	// Text Box sad flow examples
	@Test(priority = 40)
	public void userFormSadFlowInvalidEmail() {
		driver.navigate().to("https://demoqa.com/elements");
		elements.textBoxbutton().click();
		// Verify that user cannot submit data if email field is filled with
		// test@test.test
		textBox.userName().clear();
		textBox.email().clear();
		textBox.email().click();
		textBox.email().sendKeys("test@test.test");
		textBox.currentAddress().clear();
		textBox.scrollToPermanentaddress();
		textBox.permanentAddress().clear();
		textBox.submitButton().click();
		// Verify that incorrect data aren't submitted
		Assert.assertEquals("", textBox.outputField());
		// Verify that user cannot submit data if email field is filled with test.test
		textBox.scrollToEmail();
		textBox.email().clear();
		textBox.email().click();
		textBox.email().sendKeys("test.test");
		textBox.scrollToPermanentaddress();
		textBox.submitButton().click();
		Assert.assertEquals("", textBox.outputField());
		// Verify that user cannot submit data if email field is filled with test@test
		textBox.scrollToEmail();
		textBox.email().clear();
		textBox.email().click();
		textBox.email().sendKeys("test@test");
		textBox.scrollToPermanentaddress();
		textBox.submitButton().click();
		Assert.assertEquals("", textBox.outputField());
		// Verify that user cannot submit data if email field is filled with test
		textBox.scrollToEmail();
		textBox.email().clear();
		textBox.email().click();
		textBox.email().sendKeys("test");
		textBox.scrollToPermanentaddress();
		textBox.submitButton().click();
		Assert.assertEquals("", textBox.outputField());
	}

	// Test scenario - verify that user can successfully change data in output form

	// Verify that user can successfully change already filled output form by
	// refilling correctly all fields and clicking submit button
	@Test(priority = 1)
	public void userFormSubmitingNewDataUpdatesOutputHappyFlow() {

		userFormHappyFlowAllFieldsFilled();
		textBox.scrollToEmail();
		textBox.userName().clear();
		textBox.userName().click();
		textBox.userName().sendKeys("Name1");
		textBox.email().clear();
		textBox.email().click();
		textBox.email().sendKeys("test1@test.com");
		textBox.currentAddress().clear();
		textBox.currentAddress().click();
		textBox.currentAddress().sendKeys("Address11");
		textBox.scrollToPermanentaddress();
		textBox.permanentAddress().clear();
		textBox.permanentAddress().click();
		textBox.permanentAddress().sendKeys("Address21");
		textBox.submitButton().click();
		Assert.assertEquals(
				"Name:Name1\nEmail:test1@test.com\nCurrent Address :Address11\nPermananet Address :Address21",
				textBox.outputField());
	}
	/*
	 * BUG REPORT 1 SEE TestScheme CLASS
	 */

	// Verify that by refilling incorrectly user form and clicking submit button
	// previous output form is erased
	@Test(priority = 50)
	public void userFormSubmitingNewDataUpdatesOutputSadFlow() {
		userFormHappyFlowAllFieldsFilled();
		textBox.scrollToEmail();
		textBox.userName().clear();
		textBox.userName().click();
		textBox.userName().sendKeys("Name1");
		textBox.email().clear();
		textBox.email().click();
		textBox.email().sendKeys("test1");
		textBox.currentAddress().clear();
		textBox.currentAddress().click();
		textBox.currentAddress().sendKeys("Address11");
		textBox.scrollToPermanentaddress();
		textBox.permanentAddress().clear();
		textBox.permanentAddress().click();
		textBox.permanentAddress().sendKeys("Address21");
		textBox.submitButton().click();
		Assert.assertEquals("", textBox.outputField());
		/*
		 * BUG REPORT 2 SEE TestScheme CLASS
		 */
	}

	// Verify that Radio Button dialog appears when clicked on Radio Button button
	@Test(priority = 20)
	public void radioButtonIsClickableAndOpensRadioButtonsWhenClicked() {

		driver.navigate().to("https://demoqa.com/elements");
		elements.RadioButtonbutton().click();
		Assert.assertEquals("Radio Button", elements.headerName().getText());
	}

	// Test scenario - verify that Radio Buttons are clickable and display valid
	// message when clicked

	// Verify that yes radio button is clickable and displays "You have selected
	// Yes" when clicked
	@Test(priority = 30)
	public void yesButtonIsClicable() {
		driver.navigate().to("https://demoqa.com/elements");
		elements.RadioButtonbutton().click();
		Assert.assertEquals(true, radioButton.yesButtonIsClickable());
		radioButton.yesButton().click();
		Assert.assertEquals("You have selected Yes", radioButton.message());
	}

	// Verify that impressive radio button is clickable and displays "You have
	// selected Impressive" when clicked
	@Test(priority = 30)
	public void impressiveButtonIsClicable() {
		driver.navigate().to("https://demoqa.com/elements");
		elements.RadioButtonbutton().click();
		Assert.assertEquals(true, radioButton.impressiveButtonIsClickable());
		radioButton.impressiveButton().click();
		Assert.assertEquals("You have selected Impressive", radioButton.message());
	}

	// Verify that no radio button is clickable and displays "You have selected No"
	// when clicked
	@Test(priority = 30)
	public void noButtonIsClicable() {
		driver.navigate().to("https://demoqa.com/elements");
		elements.RadioButtonbutton().click();
		Assert.assertEquals(true, radioButton.noButtonIsClickable());
		radioButton.noButton().click();
		Assert.assertEquals("You have selected No", radioButton.message());
	}
	/*
	 * BUG REPORT 3 SEE TestScheme CLASS
	 */

	// Verify that Buttons page appears when clicked on Buttons button
	@Test(priority = 20)
	public void buttonsIsClickableAndOpensButtonsPageWhenClicked() {

		driver.navigate().to("https://demoqa.com/elements");
		buttons.scrollToButtons();
		elements.buttonsButton().click();
		Assert.assertEquals("Buttons", elements.headerName().getText());
	}

	// Test scenario - verify that all buttons in Buttons page work

	// Verify that Double Click Me button work
	@Test(priority = 30)
	public void clickabilityOfDoubleClickMeButton() {
		driver.navigate().to("https://demoqa.com/elements");
		buttons.scrollToButtons();
		elements.buttonsButton().click();
		Actions action = new Actions(driver);
		action.doubleClick(buttons.doubleClickMe()).perform();
		Assert.assertEquals("You have done a double click", buttons.doubleClickMessage().getText());
	}

	// Verify that Right Click Me button work
	@Test(priority = 30)
	public void clickabilityOfRightClickMeButton() {
		driver.navigate().to("https://demoqa.com/elements");
		buttons.scrollToButtons();
		elements.buttonsButton().click();
		Actions action = new Actions(driver);
		action.contextClick(buttons.rightClickMe()).perform();
		Assert.assertEquals("You have done a right click", buttons.rightClickMessage().getText());

	}

	// Verify that Click Me dynamic button work
	@Test(priority = 1)
	public void clickabilityOfClickMeButton() {
		driver.navigate().to("https://demoqa.com/elements");
		buttons.scrollToButtons();
		elements.buttonsButton().click();
		buttons.clickMe1(2);
		Assert.assertEquals("You have done a dynamic click", buttons.dynamicClickMessage().getText());
	}

	@AfterMethod
	public void afterTest() {
		driver.manage().deleteAllCookies();
	}

}
