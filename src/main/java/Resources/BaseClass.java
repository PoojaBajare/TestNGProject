package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver browserLaunch() throws IOException {
		 //i hv return only browser launch only 1 time base class 
		  //This will help us to read data.properties file

	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
	
	
	// Thisn will access the data.properties
	//javaclass
	   prop=new Properties();
	  
	  prop.load(fis);
                                         //return chrome 	  
	  String browserName =prop.getProperty("browser");
	  
	  if(browserName.equalsIgnoreCase("chrome") ) {
	 
		 WebDriverManager.chromedriver().setup();
		
		 // WebDriverManager.chromedriver().version("102.1.0").setup();  //to run in specific version of chrome
		 driver=new ChromeDriver();
	   
	  }else if(browserName.equalsIgnoreCase("firefox")) {
	   
	   //FireFox code
	  }
	         else if(browserName.equalsIgnoreCase("Edge")) {
	   
	   //edge code
	  }
	         else {
	          System.out.println("please select valid browser");
	         }
	  
	  return driver;
	  
	  
	}
	
	@BeforeMethod
	public void launchBrowser() throws IOException
	{
		browserLaunch();
		//this driver  have scope
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void tearDown() throws IOException, InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
