package testCases;

import java.io.IOException;

//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.SignUpPageObject;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constant;

public class SignUpTestCase extends BaseClass{

	@Test
	public void SignUp() throws IOException, InterruptedException {
		
		LoginPageObject LPO=new LoginPageObject(driver);
		LPO.ClickOnTryForFree().click();
		
		SignUpPageObject SPO=new SignUpPageObject(driver);
		
		Thread.sleep(6000);
		SPO.EnterFirstName().sendKeys(Constant.FirstName);
		SPO.EnterLastName().sendKeys(Constant.LastName);
		SPO.EnterEmailId().sendKeys(Constant.Email);
		SPO.EnterCompany().sendKeys(Constant.EnterCompanyName);
		SPO.EnterPhNo().sendKeys(Constant.EnterPhoneNo);
		SPO.ClickOnCheckbox().click();
		//used common method to select multiple dropdown 
		CommonMethods.SelectDropdown(SPO.SelectEmployeeName(),1);
		
		CommonMethods.SelectDropdown(SPO.SelectJobtitle(), 2);
		
		CommonMethods.SelectDropdown(SPO.SelectCountryName(), 1);
		
		//Select s=new Select(SPO.SelectEmployeeName());
		//s.selectByIndex(1);
		
		//Select s1=new Select(SPO.SelectJobtitle());
		//s1.selectByIndex(2);
			
		/*Select s2=new Select(SPO.SelectCountryName());
		s2.selectByIndex(1);*/
		
		
		
	}
	

}
