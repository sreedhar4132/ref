package test_Pack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Objpack.Dropdown;

public class strr extends Browser_Invocation {

	
	//@Test
	public void drop() throws IOException
	{
		invocation();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Dropdown dw=new Dropdown(driver);
		Select st=new Select(dw.sele());
		int it=st.getOptions().size();
		for(int i=0;i<it;i++)
		{
			System.out.println(st.getOptions().get(i).getText());
			if(st.getOptions().get(i).getText().equals("Tuesday"))
			{
				st.selectByIndex(i);
			}
		}
	}
	//@Test
	public void test() throws IOException
	{
		invocation();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		int it=driver.findElements(By.xpath("//*[@id='multi-select']/option")).size();
		System.out.println(it);
		for(int i=0;i<it;i++)
		{
			String ss=driver.findElements(By.xpath("//*[@id='multi-select']/option")).get(i).getText();
			if(ss.equals("Pennsylvania"))
			{
				driver.findElements(By.xpath("//*[@id='multi-select']/option")).get(i).click();
				driver.findElement(By.id("printMe")).click();
				
			}
		}
	}
	
	//@Test
	public void test3() throws IOException
	{
		invocation();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Dropdown dw=new Dropdown(driver);
		int it=dw.test33().size();
		Actions act=new Actions(driver);
		
		for(int i=0;i<it;i++)
		{
			String ss=dw.test33().get(i).getText();
			if(ss.equals("Florida"))
			{
				dw.test33().get(i).click();
				driver.findElement(By.id("printMe")).click();
				
			}
		}
		}
	
	//@Test
	public void mtd5() throws IOException
	{
		invocation();
		driver.get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
		driver.findElement(By.xpath("(//*[@class='select2-selection__arrow']/b)[1]")).click();
		driver.findElement(By.xpath("(//*[@class='select2-search__field'])[2]")).sendKeys("india");
		driver.findElement(By.xpath("(//*[@class='select2-search__field'])[2]")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("(//*[@class='select2-search__field'])[2]")).sendKeys(Keys.ENTER);
	}
	
	@Test
	public void test1()
	{
		System.out.println("this is test1");
	}
	
}
