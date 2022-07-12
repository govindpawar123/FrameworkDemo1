package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver ;
	public Properties prop ;
	
	             //Method
	public WebDriver DriverIntitialisation() throws IOException {
		
		 // To read file data.properties and psss location of data.properties file here
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		
	     //to acces data.properties file
		//Properties prop=new Properties();
		
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			
			//WebDriverMAnager.chromDriver.version("79.0.9").setup() //This will run with specifci browser version
			
			WebDriverManager.chromedriver().setup();   //This will run in current browser
			
		//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Desktop\\Chorme driver\\chromedriver.exe");
			
	         driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			   
			   //Firefox code
			  }
			  else if(browserName.equalsIgnoreCase("edge")) {
			   
			   //Edge code
			  }
			  else {
			   
			      System.out.println("please enter valid browser name");
			  }
			  
			  return driver; 
			  
		}
	    @BeforeMethod
		public void BrowserLaunc () throws IOException {
	    	
	    	DriverIntitialisation();
	    	//This drive has scope
	    	  driver.get(prop.getProperty("url"));
			
		}
		

}
	
