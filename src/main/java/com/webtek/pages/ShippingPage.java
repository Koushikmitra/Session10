package com.webtek.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShippingPage {
private WebDriver driver;

//crating constructor

public ShippingPage(WebDriver driver){
	this.driver=driver;
}

@FindBy(how=How.XPATH, using=".//*[@id='form']/p/button")
public static WebElement ShippingCheckOut;

@FindBy(how=How.ID, using="cgv")
public static WebElement CheckTermsofServices;

/*@FindBy(how=How.XPATH, using=".//*[@id='form']/p/button")
public static WebElement ClickingonbuttonProceed;*/

}
