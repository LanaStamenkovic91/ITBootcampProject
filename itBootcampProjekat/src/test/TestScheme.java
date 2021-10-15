package test;

public class TestScheme {
/*TEST SCENARIOS AND TEST CASES
 
 * Test scenario - Verify that all elements on homepage are clickable and lead too corresponding pages
	TC1 Verify that Elements card is clickable and leads to Elements page
	TC2 Verify that Forms card is clickable and leads to Forms page
	TC3 Verify that Alerts, Frame & Windows card is clickable and leads to Alerts, Frame & Windows page
	TC4 Verify that Widgets card is clickable and leads to Widgets page
	TC5 Verify that Interactions card is clickable and leads to Interactions page
	TC6 Verify that Book Store card is clickable and leads to Book Store page
	
 * Test scenario - Verify that Elements menu collapse/uncollapse properly
    TC7 Verify that Elements menu is collapsed when entering Elements page
    TC8 Verify that Element collapse/uncollapse button works properly
 
 * Test Scenario - Text Box happy flow examples
    TC9 Verify that Text Box dialog appears when clicked on Text Box button
    TC10 Verify that user can successfully submit User form by filling correctly all fields and clicking submit button
    TC11 Verify that user can successfully submit User form by filling only full name and clicking submit button
    TC12 Verify that user can successfully submit User form by filling only email and clicking submit button
    TC13 Verify that user can successfully submit User form by filling correctly Current Address and clicking submit button
    TC14 Verify that user can successfully submit User form by filling correctly Permanent Address and clicking submit button
    
 * Test Scenario - text box sad flow
    TC15 Text Box sad flow examples
 
 * Test scenario - verify that user can successfully change data in output form
    TC16 Verify that user can successfully change already filled output form by refilling correctly all fields and clicking submit button
    TC17 Verify that by refilling incorrectly user form and clicking submit button previous output form is erased  
 
 * Test scenario - verify that Radio Buttons are clickable and display valid message when clicked 
     TC18 Verify that Radio Button dialog appears when clicked on Radio Button button
 	 TC19 Verify that yes radio button is clickable and displays "You have selected Yes" when clicked
 	 TC20 Verify that impressive radio button is clickable and displays "You have selected Impressive" when clicked
 	 TC21 Verify that yes radio button is clickable and displays "You have selected No" when clicked
 
 *Test scenario - verify that all buttons in Buttons page work
     TC22 Verify that Buttons page appears when clicked on Buttons button
 	 TC23 Verify that Double Click Me button work
 	 TC24 Verify that Right Click Me button work
 	 TC25 Verify that Click Me dynamic button work
 */
	
	
 /*
  * Bug Report 1:
    Output form that appears after submitting Text Box contains typo - "Permananet" address, and should be Permanent Address
    Description: After entering data in Permanent Address field in the Text Box (Elements card) and submitting, 
    in the output form is written Permananet address :(data entered by user), and should be Permanent Address :(data entered by user);
    
  * Bug Report 2:
    After reentering user form (elements/ text box) using invalid email and submitting, old data are written in output form
    Description: if user submits valid user form and then changes it using invalid email, after pressing submit button
    in the output field are shown data from previous submitting and there is no any error/input not accepted notification
    
  * Bug Report 3:
    Radio button No in Radio button page is not clickable
  */
}
