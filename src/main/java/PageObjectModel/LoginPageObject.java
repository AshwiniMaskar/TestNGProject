package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginPageObject {
	
	public WebDriver driver; // This driver dont have scope
	
           By username=By.xpath("//input[@id='username']");
           By password = By.xpath("//input[@id='password']");
           By login = By.xpath("//input[@id='Login']");
           
           By tryForFree=By.xpath("//a[@id='signup_link']");
           
           By errorMessage=By.xpath("//div[@id='error']");
           
           
       public LoginPageObject(WebDriver driver2) 
           {
			this.driver=driver2; 	   
		   }
           
		   public WebElement EnterUserName() 
           {
        	     return driver.findElement(username); 
        	   
           }
           public WebElement EnterPassword() 
           {
        	     return driver.findElement(password); 
        	   
           }
           public WebElement CliclOnLogin() 
           {
        	     return driver.findElement(login); 
        	   
           }
           public WebElement ClickOnTryForFree() 
           {
        	     return driver.findElement(tryForFree); 
        	   
           }

	 	   public WebElement  printerroMessage()
	 	   {
                 return driver.findElement(errorMessage);
	 		   
	       }
	

}
