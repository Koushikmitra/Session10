package com.webtek.actions;

import com.webtek.pages.DashboardPage;

import sample.webtek.helper.Log;
import sample.webtek.test.SelTestCase;

public class SignoutAction extends SelTestCase {
	
	public static void execute() throws Exception{
		try{
			DashboardPage.SingoutLink.click();
			Log.info("Element sign out does not found");
		}
		catch (Exception e){
		Log.error("Sign out link does not found");	
		throw e;
		}
	}

}
