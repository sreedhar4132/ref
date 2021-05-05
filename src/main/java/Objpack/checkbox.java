package Objpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkbox {
	WebDriver driver;
	public checkbox(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="isAgeSelected")
	WebElement age;
	
	@FindBy(id="txtAge")
	WebElement txtAge;
	
	public void isAgeSelected1()
	{
		age.click();
	}
	
	public boolean txtAge1()
	{
		return txtAge.isDisplayed();
	}
	
	public String txtAge2()
	{
		String s=txtAge.getText();
		return s;
	}
}
