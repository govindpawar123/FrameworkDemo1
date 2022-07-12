package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.SighnUpObject;
import Resources.BaseClass;

public class VerifySighnUp extends BaseClass {
	
	
	
	@Test
	public void SighnUp() throws IOException, InterruptedException {
		
		
		  
		  LoginPageObject cd=new LoginPageObject(driver);

		  cd.TryFree().click();
		  
		  SighnUpObject sp=new SighnUpObject(driver);
		  Thread.sleep(5000);
		  
		 sp.EnterFirstName().sendKeys("govind");
		// Thread.sleep(5000);
		 
		 sp.EnterLastName1().sendKeys("pawar");
		 
		 sp.MailId().sendKeys("pawar09@gmail.com");
	
		Select s=new Select(sp.SelectJobTitle());
		 s.selectByIndex(3);
		 
		 sp.CompanyName().sendKeys("TWEEE");
		 
		 Select p=new Select(sp.SelectCompanyEmployees());
		 p.selectByIndex(3);
		 
		 sp.putmobilenumber().sendKeys("9975740765");
		
		 Select q=new Select(sp.SelectCountry());
		q.selectByVisibleText("Dominica");
		 
	}
		
	}
	



