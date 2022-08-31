package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {

	
	//this driver dont have scope
	public WebDriver driver;
	//driver.findElement(By.xpath(""))
	//we have achieve encapsulation
private	By Firstname=By.xpath("//input[@name='UserFirstName']");
//private	By password=By.xpath("//input[@name='UserLastName']");
private By JobTitle=By.xpath("//select[@name='UserTitle']");
private By Lastname=By.xpath("//input[@name='UserLastName']");
private By WorkEmail=By.xpath("//input[@name='UserEmail']");
private By Company=By.xpath("//input[@name='CompanyName']");
private By PhoneNumber=By.xpath("//input[@name='UserPhone']");
private By Employees=By.xpath("//select[@name='CompanyEmployees']");
private By Country=By.xpath("//Select[@name='CompanyCountry']");

public SignUpPageObjects(WebDriver driver2) {
	this.driver=driver2;
}


public WebElement EnterFirstName()
{
	//it cannot invoke so its return null (return driver.findElement(username);)
	return driver.findElement(Firstname);
}

public WebElement SelectJobTitle()
{
		return driver.findElement(JobTitle);
}

public WebElement EnterLastName()
{
	
	return driver.findElement(Lastname);
}



public WebElement EnterEmail()
{
	
	return driver.findElement(WorkEmail);
}


public WebElement EnterPhoneNumber()
{

	return driver.findElement(PhoneNumber);
}
public WebElement EnterCompany()
{
		return driver.findElement(Company);
}

public WebElement SelectEmployees()
{
		return driver.findElement(Employees);
}

public WebElement SelectCountry()
{
		return driver.findElement(Country);
}



}
