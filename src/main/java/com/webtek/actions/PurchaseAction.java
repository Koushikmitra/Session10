package com.webtek.actions;

import com.webtek.pages.CheckoutPage;
import com.webtek.pages.PaymentPage;
import com.webtek.pages.ShippingPage;

import sample.webtek.helper.Log;
import sample.webtek.test.SelTestCase;

public class PurchaseAction extends SelTestCase{

public static void execute() throws Exception{
	
	Thread.sleep(2000);
	
	try{
		CheckoutPage.ProceedtocheckoutAftercompare.click();
		Log.info("Proceed to checking out after compare");
	}
	catch(Exception e){
	Log.error("Checkout out didn't found");
	throw e;
	}
	
	try{
		CheckoutPage.AddressCheckout.click();
		Log.info("Proceed to checking out with address given");
	}
	catch(Exception e){
	Log.error("AddressCheckout out didn't found");	
	throw e;
	}
	
	
	
	try{
		ShippingPage.CheckTermsofServices.click();
		Log.info("Terms of services checkbox found");
	}
	catch (Exception e){
		Log.error("Terms of services checkbox does not found");
		throw e;
	}
	
	
	
	try{
		PaymentPage.PaybyCheck.click();
		Log.info("Making payments by bank chque");
	}
	catch (Exception e){ 
		Log.error("Bank chque are does not found");
		throw e;
	
}
	
	try{
		PaymentPage.ConfirmOrder.click();
		Log.info("We are now confirming tthe order");
	}
	catch (Exception e){ 
		Log.error("Order could not be confirmed");
		throw e;
	
}
	
	
	

 }


}
