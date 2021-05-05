package Objpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class enter_field_obj {
	
	WebDriver driver;
	public enter_field_obj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-message")
	WebElement username;
	
	@FindBy(xpath="(//*[@type='button'])[2]")
	WebElement showmsg;
	
	@FindBy(xpath="//*[@id='user-message']/span[1]")
	WebElement msgdisplay;
	
	
	public WebElement usermsg(String str)
	{
		username.sendKeys(str);
		return msgdisplay;
			
	}
	
	public WebElement showmsg()
	{
		showmsg.click();
		return msgdisplay;
	
	}
	
	public WebElement msgdisplay1()
	{
	return msgdisplay;
		
	}

}
