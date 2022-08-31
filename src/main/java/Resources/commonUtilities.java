package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class commonUtilities {

	
	public static void  dropdownHandle(WebElement dropdownXpath,int dropdown_value)
	{
		
		Select s=new Select(dropdownXpath);
		s.selectByIndex(dropdown_value);
			
		
	}
	
	public static void HandleAssert(String actual,String expected)
	{
		 SoftAssert assertion =new SoftAssert();
			Assert.assertEquals(actual, expected);
			assertion.assertAll();
	}
	
	
}
