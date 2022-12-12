package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {

	public WebDriver driver;
	
	By FirstName=By.xpath("//input[@name='UserFirstName']");
	By LastName=By.xpath("//input[@name='UserLastName']");
	By Email=By.xpath("//input[@name='UserEmail']");
	By EnterCompanyName=By.xpath("//input[@name='CompanyName']");
	By EnterPhoneNo=By.xpath("//input[@name='UserPhone']");
	By SelectCountry=By.xpath("//select[@name='CompanyCountry']");
	By SelectEmployee=By.xpath("//select[@name='CompanyEmployees']");
	By SelectJobTitle=By.xpath("//select[@name='UserTitle']");
	By SelectCheckBox=By.xpath("(//div[@class='checkbox-ui'])[1]");
	
	
public SignUpPageObject(WebDriver driver2)
	{
		this.driver=driver2;
	}
	
	public WebElement EnterFirstName() 
	{
		return driver.findElement(FirstName);
		
	}
	public WebElement EnterLastName() 
	{
		return driver.findElement(LastName);
		
	}
	public WebElement EnterEmailId() 
	{
		return driver.findElement(Email);
		
	}
	public WebElement SelectEmployeeName() 
	{
		return driver.findElement(SelectEmployee);
		
	}
	public WebElement SelectJobtitle() 
	{
		return driver.findElement(SelectJobTitle);
		
	}
	public WebElement SelectCountryName() 
	{
		return driver.findElement(SelectCountry);
		
	}
	public WebElement EnterCompany() 
	{
		return driver.findElement(EnterCompanyName);
		
	}
	public WebElement EnterPhNo() 
	{
		return driver.findElement(EnterPhoneNo);
		
	}
	
	public WebElement ClickOnCheckbox() 
	{
		return driver.findElement(SelectCheckBox);
		
	}
	
	
	
}
