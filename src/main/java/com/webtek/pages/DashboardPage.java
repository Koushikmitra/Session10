package com.webtek.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {

	private static WebDriver driver;

	// Creating Constructor
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.LINK_TEXT, using = "Sign out")
	public static WebElement SingoutLink;

	@FindBy(how = How.XPATH, using = ".//*[@id='block_top_menu']/ul/li[2]/a")
	public static WebElement SelectmainMenu;

	@FindBy(how = How.CSS, using = "#block_top_menu>ul>li:nth-of-type(2)>ul>li:nth-of-type(3)>a")
	public static WebElement SubmenuCasual;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='block_top_menu']/ul/li[2]/a")
	public static WebElement mainManu;

	@FindBy(how = How.CSS, using = "#block_top_menu>ul>li:nth-of-type(2)>ul>li:nth-of-type(3)>a")
	public static WebElement subMenu;

	@FindBy(how = How.XPATH, using = ".//*[@id='block_top_menu']/ul/li[2]/ul/li[3]/a")
	public static WebElement SubmenuSummer;

}
