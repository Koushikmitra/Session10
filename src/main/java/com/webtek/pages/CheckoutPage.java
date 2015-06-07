package com.webtek.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckoutPage {
	private static WebDriver driver;
	
	//creating constructor
	public CheckoutPage(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using=".//*[@id='center_column']/p[2]/a[1]/span")
	public static WebElement ProceedtoCheckout;
	
	@FindBy(how=How.XPATH, using=".//*[@id='center_column']/form/p/button")
	public static WebElement AddressCheckout;
	
		
}
