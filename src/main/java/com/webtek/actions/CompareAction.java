package com.webtek.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.webtek.pages.ComparePage;
import com.webtek.pages.ProductPage;

import sample.webtek.helper.Log;
import sample.webtek.test.SelTestCase;

public class CompareAction extends SelTestCase{

	public static void execute() throws Exception{
		try{
		ComparePage.CompareRate.click();
		Log.info("We are now clicking on Compare button");
		}
		catch (Exception e){
		Log.error("Compare button does not found");
		throw e;
	    }
		
	//	Thread.sleep(100);
		
	//Explicit wait	
		ExpectedCondition<Boolean>e= new ExpectedCondition<Boolean>(){
			public Boolean apply(WebDriver driver){
			driver.findElement(By.className("prices-container"));
			return Boolean.valueOf(true);
			}
		};
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(e);
		
		try{
			elements=ProductPage.CasualdressDetails.PrintedDressPricetag;
			for (WebElement element: elements ){
				
			}
		
	}catch (Exception e1){
		
	}
	
	
}
}