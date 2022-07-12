package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public WebDriver driver;
	
	// we Have to used encapsulation Here
	
	
	By UserName=By.xpath("//input[@id='username']");
	
	By PassWord=By.xpath("//input[@id='password']");
	
	By logIn=By.xpath("//input[@id='Login']");
	
	By TryFree=By.xpath("//a[@class='button secondary']");
	
	

             // tis come from driver by direct click
	public LoginPageObject(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}


	public WebElement EnterUsername() {
		
		return driver.findElement(UserName);
	}

	
     public WebElement Enterpassword() {
		
		return driver.findElement(PassWord);
		
}
     public WebElement ClickOnlogIn() {
 		
 		return driver.findElement(logIn);
     
     } 
     
     public WebElement TryFree() {
  		
  		return driver.findElement(TryFree);
     
     }


	public WebElement EnterFirstName() {
		// TODO Auto-generated method stub
		return null;
	}


	

}
