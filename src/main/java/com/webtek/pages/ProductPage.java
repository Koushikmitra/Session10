package com.webtek.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPage {

private WebDriver driver;

public ProductPage(WebDriver driver){
this.driver=driver;
}

public static class CasualdressDetails{
	@FindBy(how=How.XPATH, using=".//*[@id='list']/a/i")
	public static WebElement SelectListView1;
	
	@FindBy(how=How.XPATH, using=".//*[@id='center_column']/ul/li/div/div/div[3]/div/div[3]/div[2]/a")
	public static WebElement AddtoCompare1;
	
	@FindBy(how=How.XPATH, using=".//*[@id='center_column']/ul/li/div/div/div[3]/div/div[1]/span")
	public static List<WebElement> PrintedDressPricetag;

}

public static class SummerdressDetails{
	@FindBy(how=How.XPATH, using=".//*[@id='list']/a/i")
	public static WebElement SelectListView2;
	
	@FindBy(how=How.XPATH, using=".//*[@id='center_column']/ul/li[1]/div/div/div[3]/div/div[3]/div[2]/a")
	public static WebElement AddtoCompare2;
	
	@FindBy(how=How.XPATH, using=".//*[@id='center_column']/ul/li[1]/div/div/div[3]/div/div[1]/span[1]")
	public static List<WebElement> SummerPrinteddressPriceTag;
}
}
