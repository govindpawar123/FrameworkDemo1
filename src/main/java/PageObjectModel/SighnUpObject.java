package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SighnUpObject  {
	

	public WebDriver driver;
	
	  By FirstName=By.xpath("//input[@name='UserFirstName']");
	  
	  By LastName=By.xpath("(//input[@type='text'])[3]");
	
	  By gmail=By.xpath("//input[@type='email']");
	  
	  By JobTitle=By.xpath("//select[@name='UserTitle']");
	  
	  By CompanyName=By.xpath("//input[@name='CompanyName']");
	  
	By Employees=By.xpath("//select[@name='CompanyEmployees']");
	
	By Mobile=By.xpath("//input[@name='UserPhone']");
	
	By Country=By.xpath("//select[@name='CompanyCountry']");
	
	//select[@name='CompanyCountry']
	  
	  public SighnUpObject(WebDriver driver2) {
			this.driver=driver2;
			// TODO Auto-generated constructor stub
		}


		public WebElement EnterFirstName() {
		return driver.findElement(FirstName);
	
		}
		
        public WebElement EnterLastName1() {
		return driver.findElement(LastName); 

        }
        public WebElement MailId() {
		return driver.findElement(gmail); 
        
        }    
        public WebElement SelectJobTitle() {
    		return driver.findElement(JobTitle); 
  
        }
        
        public WebElement CompanyName() {
    		return driver.findElement(CompanyName); 
    		
        } 		
        
        public WebElement SelectCompanyEmployees() {
    		return driver.findElement(Employees);
        }  
        public WebElement putmobilenumber() {
    		return driver.findElement(Mobile);
        }  
        
        public WebElement SelectCountry() {
    		return driver.findElement(Country);
    		
        }     
}
