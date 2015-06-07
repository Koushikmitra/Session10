package com.webtek.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentPage {
	private WebDriver driver;
	
	//creating constructor
	public PaymentPage(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using=".//*[@id='HOOK_PAYMENT']/div[2]/div/p/a")
	public static WebElement PaybyCheck;
	
	@FindBy(how=How.XPATH, using=".//*[@id='cart_navigation']/button")
	public static WebElement ConfirmOrder;
	
	

}
