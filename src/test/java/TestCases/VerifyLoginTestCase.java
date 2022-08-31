package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LogInPageObjects;
import Resources.BaseClass;
import Resources.TestCaseData;
import Resources.commonUtilities;

//login page with framework
public class VerifyLoginTestCase extends BaseClass {
    
	//diff package
	//we have achieve inheritance
	@Test
	public void login() throws IOException
	{
		
	
		LogInPageObjects lpo=new LogInPageObjects(driver);
		lpo.EnterUsername().sendKeys(TestCaseData.username);
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		lpo.ClickLogin().click();
		String expected="Please check your username and password . If you still can't log in, contact your Salesforce administrator.";
	    String actual=driver.findElement(By.xpath("//div[@id='error']")).getText();
		commonUtilities.HandleAssert(actual, expected);
		
		/*
		String expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
	//using xpath i will do get text
	    String actual=driver.findElement(By.xpath("//div[@id='error']")).getText();
	   
	    SoftAssert assertion =new SoftAssert();
		Assert.assertEquals(actual, expected);
		
		assertion.assertAll();
	    //String expected="Please check your username . If you still can't log in, contact your Salesforce administrator.";
	//if do this it will give error sms it was expecting Please check your username and password. If you still can't log in, contact your Salesforce administrator."; but password was missibg so using softasser i m using validation point manually work 
		//this is what validation maunall testing
	
	
	*/
		
	}
	
}
