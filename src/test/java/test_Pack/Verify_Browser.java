package test_Pack;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Objpack.checkbox;
import Objpack.enter_field_obj;
import junit.framework.Assert;

public class Verify_Browser extends Browser_Invocation {

	//@SuppressWarnings("deprecation")
	//@Test
	public void browserrr1() throws IOException
	{
		invocation();
		driver.get(pro.getProperty("url"));
		
		if(driver.findElement(By.id("at-cv-lightbox-close")).isDisplayed())
		{
		driver.findElement(By.id("at-cv-lightbox-close")).click();
		}
		enter_field_obj eb=new enter_field_obj(driver);
		eb.usermsg(pro.getProperty("username"));
		eb.showmsg();
		
		
		Assert.assertEquals("sreedhar", eb.msgdisplay1().getText());
		driver.close();
	}
	

	
	//@Test
	public void data2() throws IOException, InterruptedException
	{
		invocation();
		driver.get(pro.getProperty("url"));
		Thread.sleep(2000);

		checkbox ch=new checkbox(driver);
		boolean b1=ch.txtAge1();
		System.out.println(b1);
		ch.isAgeSelected1();
		boolean b2=ch.txtAge1();
		System.out.println(b2);
		System.out.println(ch.txtAge2());
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.open(arguments[0])", "https://www.google.co.in/");
		System.out.println(driver.getTitle());
	
	}
	
	//@Test
	public void test2() throws IOException
	{
		invocation();
		driver.get("https://touch.facebook.com/?_rdr");
		Excel ex=new Excel();
		driver.findElement(By.id("m_login_email")).sendKeys(ex.excel("Sheet1",1,1));
	}

	@DataProvider
	public Object[][] test3()
	{
		Object[][] ob=new Object[2][2];
		ob[0][0]=1;
		ob[0][1]=2;
		ob[1][0]=2;
		ob[1][1]=2;
		
		return ob;
	}
	@Test(dataProvider="test3")
	public void test(int i, int j)
	{
		System.out.println(i);
		System.out.println(j);
	}
}
