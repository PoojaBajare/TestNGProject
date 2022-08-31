package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LogInPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.BaseClass;
import Resources.TestCaseData;
import Resources.commonUtilities;

public class VerifySignUpTestCases extends BaseClass {

	@Test
	public void SignUp() throws IOException, InterruptedException
	{
		
		LogInPageObjects lpo=new LogInPageObjects(driver);
		lpo.ClickOnTryForFree().click();
		
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		String expectedTitle="Free CRM Trial: Salesforce 30-Day Trial - Salesforce IN";
		String actualTitle=driver.getTitle();
		commonUtilities.HandleAssert(actualTitle, expectedTitle);
		
		
		SignUpPageObjects spo=new SignUpPageObjects(driver);
		spo.EnterFirstName().sendKeys(TestCaseData.firstName);
	/*
		Select s=new Select(spo.SelectJobTitle());
		s.selectByIndex(1);
	*/	
		spo.EnterLastName().sendKeys(TestCaseData.lastname);
		spo.EnterEmail().sendKeys(TestCaseData.email);
		spo.EnterCompany().sendKeys(TestCaseData.company);
		spo.EnterPhoneNumber().sendKeys(TestCaseData.phone_number);
		
		
		commonUtilities.dropdownHandle(spo.SelectJobTitle(),1);
		
		commonUtilities.dropdownHandle(spo.SelectEmployees(),2);
	
	commonUtilities.dropdownHandle(spo.SelectCountry(),1);
	

	
	}
	
	
	
	
	
	
}
