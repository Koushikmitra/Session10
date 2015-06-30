package com.webtek.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	private WebDriver driver;
	
	//creating a constructor.
	public LoginPage(WebDriver driver){ 
		this.driver=driver;
	}
	
	@FindBy(how=How.ID, using="email")
	public static WebElement EnteruserID;
	
	@FindBy(how=How.ID, using="passwd")
	public static WebElement EnterPassword;
	
	@FindBy(how=How.ID, using="SubmitLogin")
	public static WebElement SubmitSignin;
	
	@FindBy(how=How.ID,using="email_create")
	public static WebElement EmailCreate;
	
	@FindBy(how=How.ID,using="SubmitCreate")
	public static WebElement SubmitemailCreate;
	
    			
}
