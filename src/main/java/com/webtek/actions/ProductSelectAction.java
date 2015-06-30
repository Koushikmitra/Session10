package com.webtek.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.webtek.pages.DashboardPage;
import com.webtek.pages.ProductPage;

import sample.webtek.helper.Log;
import sample.webtek.test.SelTestCase;

public class ProductSelectAction extends SelTestCase {

	public static void execute() throws Exception{
		
		// mouse hover action
		Thread.sleep(100);
		try{
			Actions action= new Actions(driver);
			WebElement mainMenu=DashboardPage.SelectmainMenu;
			action.moveToElement(mainMenu).moveToElement(DashboardPage.SubmenuCasual).click().build().perform();
			Log.info("Selecting Casual dresses navigating from main menu Dresses");
			Reporter.log("Selecting Casual dresses navigating from main menu Dresses");
		}
		catch (Exception e){
			Log.error("Casual dress submenu does not found");
			Reporter.log("Casual dress submenu does not found");
			throw e;
		}
		
		
		try{
			ProductPage.CasualdressDetails.SelectListView1.click();
			Log.info("Clicking on List view for casual product");
		}
	catch (Exception e){
		Log.error("Element List view does not found");
		throw e;
	}
		
		try{
			ProductPage.CasualdressDetails.AddtoCompare1.click();
			Log.info("Clicking on Add to compare");
		}
		catch(Exception e){
			Log.error("Add to compare does not found");
			throw e;
		}
		
	Thread.sleep(100);
	/*WebDriverWait wait=new WebDriverWait(driver,100);
	wait.until(ExpectedConditions.elementToBeClickable())).click();.*/
	
	//Scroll up
			JavascriptExecutor jse = (JavascriptExecutor )driver;
			jse.executeScript("scroll(15, 0)");
			
			try{
				Actions action= new Actions(driver);
				WebElement mainMenu=DashboardPage.SelectmainMenu;
				action.moveToElement(mainMenu).moveToElement(DashboardPage.SubmenuSummer).click().build().perform();
				Log.info("Selecting Summer dresses navigating from main menu Dresses");		
			
	}
			catch (Exception e){
				Log.error("Summer menu does not found");
				throw e;
			}
			
			
			try{
				ProductPage.SummerdressDetails.SelectListView2.click();
				Log.info("Clicking on List view for Summer product");
			}
			catch(Exception e){
			Log.error("Webelement List view does not found");	
			throw e;
			}
			
			try{
			ProductPage.SummerdressDetails.AddtoCompare2.click();
			Log.info("Adding another item to compare list");
			}
			catch(Exception e){
			Log.error("Add to compare element does not found");	
			throw e;
			}
	}
	
	
}
