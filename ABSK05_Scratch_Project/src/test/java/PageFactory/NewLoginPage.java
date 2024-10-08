package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class NewLoginPage extends BaseClass 
{
	WebDriver driver;
	
	public NewLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement loginButton;
	
	
	
	public void enterUsername(String Username)
	{
		username.sendKeys(Username);
	}
	
	public void enterPassword(String Password)
	{
		password.sendKeys(Password);
	}
	
	public void clickOnSubmit()
	{
		loginButton.click();
	}
	
	
	
	
	
	
	
	

}


