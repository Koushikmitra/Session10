package com.webtek.actions;

import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.webtek.pages.HomePage;
import com.webtek.pages.LoginPage;
import com.webtek.pages.SignUpPage;

import sample.webtek.helper.Log;
import sample.webtek.test.SelTestCase;

public class SignupRegistration extends SelTestCase {
	
	
	public static void execute(String Email,String Firstname,String Lastname,String Password,String AddressfirstName,String AddresslastName,
			String CompanyName,String AddressFirstline,String AddressSecondline,String MyCity,String MylandNumber,String MymobileNumber
			,String MyaliasAddress)  throws Exception	{
		
		try{
		HomePage.SignIn.click();
		Log.info("We are clicking on Signin link in Home page");
	     }
		catch(Exception e){
		Log.error("Signin Link does not found in Home page");	
		}
		
	try{
		LoginPage.EmailCreate.sendKeys(Email);
		Log.info("We entering email for sign up");
	}
	catch (Exception e){
	Log.error("Web element Emailcreate does not found");	
	}
	
	
	try{
		LoginPage.SubmitemailCreate.click();
		Log.info("Clicking on submit button for signup next step");
	}
	catch(Exception e){
	Log.error("SubmitmailCreate button does not found");	
	}
	
	try{
		SignUpPage.TitleMr.click();
		Log.info("Clicking on radio button Mr.");
	}
	catch(Exception e){
	Log.error("Gender Radio button does not found");	
	}
	
	try{
		SignUpPage.Firstname.sendKeys(Firstname);
		Log.info("Entering Firstname");
	}
	catch(Exception e){
	Log.error("Firstname does not found");	
	}
	
	try{
		SignUpPage.Lastname.sendKeys(Lastname);
		Log.info("Entering Last name");
	}
	catch(Exception e){
	Log.error("Last name does not found");	
	}
	
	try{
		SignUpPage.Password.sendKeys(Password);
		Log.info("Entering password");
	}
	catch(Exception e){
	Log.error("Password does not found");	
	}
	// selecting values for days,months,year from Date of birth drop down.
	Select dropDownDays = new Select(SignUpPage.BirthDay);
	dropDownDays.selectByVisibleText("19");
	Log.info("Selecting days for Date of birth form the Dropdown");
	
	Select dropDownMonths = new Select(SignUpPage.BirthMonth);
	dropDownMonths.selectByVisibleText("August");
	Log.info("Selecting month for Date of birth form the Dropdown");
	
	Select dropDownYear = new Select(SignUpPage.BirthYear);
	dropDownYear.selectByVisibleText("1984");;
	Log.info("Selecting Year for Date of birth form the Dropdown");
	
	try{
		SignUpPage.NewsLetter.click();
		Log.info("Clicking for NewsLetter");
	}
	catch(Exception e){
	Log.error("Newsletter webelement does not found");	
	
	}
	try{
		SignUpPage.AddressfirstName.sendKeys(AddressfirstName);
		Log.info("Entering Firstname for Address");
	}
	catch(Exception e){
	Log.error("Addressfirstname does not found");	
	}
	

	try{
		SignUpPage.AddresslastName.sendKeys(AddresslastName);
		Log.info("Entering lastname for Address");
	}
	catch(Exception e){
	Log.error("Addresslastname does not found");	
	}
	
	try{
		SignUpPage.CompanyName.sendKeys(CompanyName);
		Log.info("Entering working company name");
	}
	catch(Exception e){
	Log.error("Company name does not found");	
	}
	
	try{
		SignUpPage.AddressFirstline.sendKeys(AddressFirstline);
		Log.info("Entering Address first line");
	}
	catch(Exception e){
	Log.error("Address first line does not found");	
	}
	
	try{
		SignUpPage.AddressSecondline.sendKeys(AddressSecondline);
		Log.info("Entering Address second line");
	}
	catch(Exception e){
	Log.error("Address second line does not found");	
	}
	
	try{
		SignUpPage.MyCity.sendKeys(MyCity);
		Log.info("Entering value to City");
	}
	catch(Exception e){
	Log.error("City does not found");	
	}
	
	Select dropDownState = new Select(SignUpPage.MyState);
	dropDownState.selectByVisibleText("California");
	Log.info("Selecting state form the Dropdown");
	
	try{
		SignUpPage.MyZip.sendKeys("LA34567");
		Log.info("Entering value to Zipcode");
	}
	catch(Exception e){
	Log.error("Zipcode does not found");	
	}
	
	Select dropDownCountry = new Select(SignUpPage.MyCountry);
	dropDownCountry.selectByVisibleText("United States");
	Log.info("Selecting Country form the Dropdown");

	try{
		SignUpPage.AdditionalInformation.sendKeys("Test information");
		Log.info("Entering value to Additional Infrmation");
	}
	catch(Exception e){
	Log.error("Addtional Information does not found");	
	}
	
	try{
		SignUpPage.MylandNumber.sendKeys(MylandNumber);
		Log.info("Entering value to Home Phone");
	}
	catch(Exception e){
	Log.error("Home Phone does not found");	
	}
	
	try{
		SignUpPage.MymobileNumber.sendKeys(MymobileNumber);
		Log.info("Entering value to Mobile number");
	}
	catch(Exception e){
	Log.error("Mobile does not found");	
	}
	
	try{
		SignUpPage.MyaliasAddress.sendKeys(MyaliasAddress);
		Log.info("Entering value to Alias Address");
	}
	catch(Exception e){
	Log.error("Alias address does not found");	
	}
	
	try{
		SignUpPage.SubmitRegister.click();;
		Log.info("We are now submitting Sign up information");
	}
	catch(Exception e){
	Log.error("Submit button does not found");	
	}
	
	
		
}
	
	
	}
	


