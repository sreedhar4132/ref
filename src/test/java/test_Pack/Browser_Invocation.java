package test_Pack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Browser_Invocation {

	public Properties pro;
	public FileInputStream fis;
	public WebDriver driver;
	
	
	public WebDriver invocation() throws IOException
	{
		pro=new Properties();
		fis=new FileInputStream(".\\Utilities\\Data.properties");
		pro.load(fis);
		String str1=pro.getProperty("browser");
		
		if(str1.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		else if(str1.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		
		else if(str1.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", ".\\Drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		return driver;
		
	}
	
}
