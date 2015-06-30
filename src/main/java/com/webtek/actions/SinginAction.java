package com.webtek.actions;



import com.webtek.pages.HomePage;
import com.webtek.pages.LoginPage;

import sample.webtek.helper.Log;
import sample.webtek.test.SelTestCase;

public class SinginAction extends SelTestCase {

	public static void execute() throws Exception{
		try{
			HomePage.SignIn.click();
			Log.info("Signin Link found");
			} 
		catch (Exception e){
				Log.error("Signin Link does not found");
				throw (e);
			}
		
		
		try {
			LoginPage.EnteruserID.sendKeys("itskoushik.mitra@gmail.com");
			Log.info("Entering values to user id");
		}
		catch(Exception e){
			Log.error("User id element does not found");
			throw (e);
		}
		
		
		try{
			LoginPage.EnterPassword.sendKeys("123456");
			Log.info("Entering Password");
		}
		catch (Exception e){
			Log.error("Password element does not found");
			throw (e);
		}
		
		
		try{
		LoginPage.SubmitSignin.click();
		Log.info("Clicking on submit button");
		}
		catch (Exception e){
			Log.error("Submit button does not found");
			throw (e);
		}
		
		
	}
	
		
	}
