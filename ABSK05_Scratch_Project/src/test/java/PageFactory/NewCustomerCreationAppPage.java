package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class NewCustomerCreationAppPage extends BaseClass {
	
	WebDriver driver;
	public NewCustomerCreationAppPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='New Customer']")
	WebElement newCustomer;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement cust_Name;
	
	@FindBy(xpath="(//input[@name='rad1'])[1]")
	WebElement gender;
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement dateOfBirth;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement addr;
	
	public void clickNewCustlink()
	{
		newCustomer.click();
	}
	
	
	public void addCustName(String name)
	{
		cust_Name.sendKeys(name);
	}
	
	public void selectgender()
	{
		gender.click();
	}
	
	public void addDOB(String dateofBirth)
	{
		dateOfBirth.sendKeys(dateofBirth);
	}
	
	public void addAddress(String address)
	{
		addr.sendKeys(address);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
