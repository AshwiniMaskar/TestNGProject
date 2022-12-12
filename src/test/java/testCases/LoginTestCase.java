package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constant;

public class LoginTestCase extends BaseClass {
	
	@Test
	public void login() throws IOException
	{
		
		LoginPageObject LPO=new LoginPageObject(driver);
		
		LPO.EnterUserName().sendKeys(Constant.username);
		LPO.EnterPassword().sendKeys(Constant.password);
		LPO.CliclOnLogin().click();
		//Assertion
	    CommonMethods.handleAssertion(LPO.printerroMessage().getText(),Constant.erroMessage);
	    
	}
	

}
