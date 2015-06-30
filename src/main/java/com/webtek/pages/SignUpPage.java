package com.webtek.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPage {

	private WebDriver driver;
	
	//creating constructor
	public SignUpPage (WebDriver driver){
		
		this.driver=driver;	
	}
	
	@FindBy(how=How.ID,using="id_gender1")
	public static WebElement TitleMr;
	
	@FindBy(how=How.ID,using="id_gender2")
	public static WebElement TitleMrs;
	
	@FindBy(how=How.ID,using="customer_firstname")
	public static WebElement Firstname;
	
	@FindBy(how=How.ID,using="customer_lastname")
	public static WebElement Lastname;
	
	@FindBy(how=How.ID,using="passwd")
	public static WebElement Password;
	
	@FindBy(how=How.ID,using="days")
	public static WebElement BirthDay;
	
	@FindBy(how=How.ID,using="months")
	public static WebElement BirthMonth;
	
	@FindBy(how=How.ID,using="years")
	public static WebElement BirthYear;
	
	@FindBy(how=How.ID,using="newsletter")
	public static WebElement NewsLetter;
	
	@FindBy(how=How.ID,using="firstname")
	public static WebElement AddressfirstName;
	
	@FindBy(how=How.ID,using="lastname")
	public static WebElement AddresslastName;
	
	@FindBy(how=How.ID,using="company")
	public static WebElement CompanyName;
	
	@FindBy(how=How.ID,using="address1")
	public static WebElement AddressFirstline;
	
	@FindBy(how=How.ID,using="address2")
	public static WebElement AddressSecondline;
	
	@FindBy(how=How.ID,using="city")
	public static WebElement MyCity;
	
	@FindBy(how=How.ID,using="id_state")
	public static WebElement MyState;
	
	@FindBy(how=How.ID,using="postcode")
	public static WebElement MyZip;
	
	@FindBy(how=How.ID,using="id_country")
	public static WebElement MyCountry;
	
	@FindBy(how=How.ID,using="other")
	public static WebElement AdditionalInformation;
	
	@FindBy(how=How.ID,using="phone")
	public static WebElement MylandNumber;
	
	@FindBy(how=How.ID,using="phone_mobile")
	public static WebElement MymobileNumber;
	
	@FindBy(how=How.ID,using="alias")
	public static WebElement MyaliasAddress;
	
	@FindBy(how=How.ID,using="submitAccount")
	public static WebElement SubmitRegister;
	
		
}
