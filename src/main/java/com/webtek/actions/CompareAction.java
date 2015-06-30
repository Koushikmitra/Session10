package com.webtek.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.webtek.pages.ComparePage;

import sample.webtek.helper.Log;
import sample.webtek.test.SelTestCase;

public class CompareAction extends SelTestCase{

	public static void execute() throws Exception{
		
		Thread.sleep(1000);
		try{
		ComparePage.CompareRate.click();
		Log.info("We are now clicking on Compare button");
		}
		catch (Exception e){
		Log.error("Compare button does not found");
		throw e;
	    }
		
			
	//Explicit wait	
		ExpectedCondition<Boolean>e= new ExpectedCondition<Boolean>(){
			public Boolean apply(WebDriver driver){
			driver.findElement(By.className("prices-container"));
			return Boolean.valueOf(true);
			}
		};
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(e);
		
		
		String price1=ComparePage.FirstproductPrice.getText().replace("$", "").replace(",", "");
		System.out.println("---------------------------------------->"+price1);
		
		String price2=ComparePage.SecondproductPrice.getText().replace("$", "").replace(",", "");
		System.out.println("---------------------------------------->"+price2);
		
		
		double dprice1=Double.parseDouble(price1);
		double dprice2=Double.parseDouble(price2);
		
		if(dprice1>dprice2){
			
			ComparePage.AddtocartProduct1.click();
			System.out.println(dprice1);
			Log.info("We are adding First product to cart");
						
		}
		else{
			ComparePage.AddtocartProduct2.click();
			System.out.println(dprice2);
			Log.info("We are adding Second product to cart");
		}
		
		Thread.sleep(1000);
		
		
	}
	
	
}
