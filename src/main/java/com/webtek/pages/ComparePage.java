package com.webtek.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ComparePage {
private static WebDriver driver;

// creating constructor
public ComparePage(WebDriver driver){
this.driver=driver;	
}
@FindBy(how=How.CSS,using="#center_column>div:nth-of-type(2)>div:nth-of-type(2)>form>button")
public static WebElement CompareRate;

@FindBy(how=How.XPATH,using=".//*[@id='product_comparison']/tbody/tr[1]/td[2]/div[3]/span")
public static WebElement FirstproductPrice;

@FindBy(how=How.XPATH,using=".//*[@id='product_comparison']/tbody/tr[1]/td[2]/div[5]/div/div/a[1]/span")
public static WebElement AddtocartProduct1;

@FindBy(how=How.XPATH,using=".//*[@id='product_comparison']/tbody/tr[1]/td[3]/div[3]/span[1]")
public static WebElement SecondproductPrice;

@FindBy(how=How.XPATH,using=".//*[@id='product_comparison']/tbody/tr[1]/td[3]/div[5]/div/div/a[1]/span")
public static WebElement AddtocartProduct2;

@FindBy(how=How.XPATH,using=".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
public static WebElement ProceedtoCheckout;


}
