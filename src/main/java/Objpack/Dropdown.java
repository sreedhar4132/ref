package Objpack;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Dropdown {

	WebDriver driver;
	public Dropdown(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="select-demo")
	WebElement slc;
	
	@FindBy(xpath="//*[@id='multi-select']/option")
	List<WebElement> sele;
	
	public WebElement sele()
	{
		return slc;
	}
	
	public List<WebElement> test33()
	{
		return sele;
	}
}
