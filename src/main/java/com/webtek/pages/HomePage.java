package com.webtek.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	WebDriver driver;
	
	// creating a constructor
	public HomePage (WebDriver driver){
		this.driver=driver;
	}
	
@FindBy(how=How.CSS, using="#header>div:nth-of-type(2)>div>div>nav>div:nth-of-type(1)>a")
public static WebElement SignIn;

@FindBy(how=How.LINK_TEXT, using="Contact Us")
public static WebElement ContactUs;

@FindBy(how=How.CSS, using=".logo.img-responsive")
public static WebElement SiteLogo;

@FindBy(how= How.XPATH,using=".//*[@class='products']/dt[starts-with(@data-id,'cart_block_product_')]/div/span")
public static WebElement PriceOnCart;



public static class HeaderPage{
	
	@FindBy(how=How.CSS, using="#block_top_menu>ul>li:nth-of-type(2)>a")
	public static WebElement SelectDresses;
	
	@FindBy(how=How.CSS, using="#block_top_menu>ul>li:nth-of-type(2)>ul>li:nth-of-type(1)>a")
	public static WebElement CasualDresses;
	
	@FindBy(how=How.CSS, using="#block_top_menu>ul>li:nth-of-type(2)>ul>li:nth-of-type(3)>a")
	public static WebElement SummerDresses;
	
	}

public static class CategoryPage {
	
	
}

	

}
