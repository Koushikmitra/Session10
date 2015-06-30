package sample.webtek.test;

//import java.io.File;
//import java.io.IOException;

import java.io.File;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import sample.webtek.helper.Excelutils;
import sample.webtek.helper.Log;

import com.webtek.actions.SignupRegistration;
import com.webtek.pages.HomePage;
import com.webtek.pages.LoginPage;
import com.webtek.pages.SignUpPage;

public class SanityTest2 extends SelTestCase {

	@Test(dataProvider = "SignUpUser")
	public void SignUpUser(String Email,String Firstname, String Lastname, String Password,
			String AddressfirstName, String AddresslastName,
			String CompanyName, String AddressFirstline,
			String AddressSecondline, String MyCity, String MylandNumber,
			String MymobileNumber, String MyaliasAddress) {
		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, LoginPage.class);
		PageFactory.initElements(driver, SignUpPage.class);

		try {
			SignupRegistration.execute(Email,Firstname, Lastname, Password,
					AddressfirstName, AddresslastName, CompanyName,
					AddressFirstline, AddressSecondline, MyCity, MylandNumber,
					MymobileNumber, MyaliasAddress);
			Log.info("Registration Process has been done successfully");
		} catch (Exception e) {
			Log.error("Registration Proces has been failed");
			e.printStackTrace();
		}

	}

	@DataProvider(name = "SignUpUser")
	public Object[][] getRegistrationData() throws Exception {

		System.out.println(new File(".").getAbsolutePath());
		Object[][] cellData = Excelutils.getInstance().readData( "src/test/resources/Registration.xls", 0);
		System.out.println("MMMMMM : " + cellData);
		return cellData;

	}

}
