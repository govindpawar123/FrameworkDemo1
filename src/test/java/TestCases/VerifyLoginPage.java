package TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import Resources.BaseClass;

public class VerifyLoginPage extends BaseClass {
	
	@Test(dataProvider="testData1")
	public void LoginVerification(String Username,String Password) throws IOException {
		
		//bowser launc>URL Launc>username>password>click
		
		
		
		  
		  LoginPageObject cd=new LoginPageObject(driver);
		  cd.EnterUsername().sendKeys(Username);
		  cd.Enterpassword().sendKeys(Password);
		//  cd.ClickOnlogIn().click();
		 
		  
		// cd.TryFree().click();
		
	}
	 @DataProvider
	 public Object[][] testData1() {                 
	  Object[][] data=new Object[2][2];
	  data[0][0]="testuser1";
	  data[0][1]="secure123";
	  data[1][0]="testuser2";
	  data[1][1]="secure345";
	return data;
	  
	 }
}
