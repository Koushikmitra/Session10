package sample.webtek.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import sample.webtek.helper.Log;

import com.webtek.actions.CompareAction;
import com.webtek.actions.ProductSelectAction;
import com.webtek.actions.PurchaseAction;
import com.webtek.actions.SinginAction;
import com.webtek.pages.CheckoutPage;
import com.webtek.pages.ComparePage;
import com.webtek.pages.DashboardPage;
import com.webtek.pages.HomePage;
import com.webtek.pages.LoginPage;
import com.webtek.pages.PaymentPage;
import com.webtek.pages.ProductPage;
import com.webtek.pages.ShippingPage;

public class SanityTest1 extends SelTestCase {

	// @Test(dependsOnMethods="userSignIn", priority=2)
	public void signUser() throws InterruptedException {

		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, LoginPage.class);

		try {
			SinginAction.execute();
			Log.info("SignInAction performed succesfully");
		} catch (Exception e) {
			Log.error("SignInAction dose not perform succesfully");
			e.printStackTrace();
		}

	}

	@Test
	public void userSignIn() {
		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, LoginPage.class);
		PageFactory.initElements(driver, DashboardPage.class);

		try {
			Log.startTestCase("sTestCaseName");
			SinginAction.execute();
		} catch (Exception e) {
			Log.error("failed to login");
			e.printStackTrace();
		}

		/*
		 * try{ SignoutAction.execute(); Log.info("We are now logged out"); }
		 * catch (Exception e){ Log.error("Sign out action could not be done");
		 * e.printStackTrace(); }
		 */
	}

	@Test(priority = 3)
	public void ProductCheckOut() throws InterruptedException {
		PageFactory.initElements(driver, DashboardPage.class);
		PageFactory.initElements(driver, ComparePage.class);
		PageFactory.initElements(driver, CheckoutPage.class);
		PageFactory.initElements(driver, ProductPage.class);
		PageFactory.initElements(driver, ShippingPage.class);
		PageFactory.initElements(driver, PaymentPage.class);

		try {
			ProductSelectAction.execute();
			Log.info("Product selection has been done successfully");
		} catch (Exception e) {
			Log.error("Product selection has been failed");
		}

		try {
			CompareAction.execute();
			Log.info("Comapare rates action has been done successfully");
		}

		catch (Exception e) {
			Log.error("Compare rate could not be done");
		}

		try {
			PurchaseAction.execute();
		} catch (Exception e) {

		}
	}
}
