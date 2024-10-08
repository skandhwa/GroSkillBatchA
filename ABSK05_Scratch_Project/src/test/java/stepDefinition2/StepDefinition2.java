package stepDefinition2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageFactory.NewCustomerCreationAppPage;
import PageFactory.NewLoginPage;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition2 extends BaseClass {
	
	WebDriver driver=BaseClass.initializeDriver();
	NewLoginPage obj1=new NewLoginPage(driver);
	NewCustomerCreationAppPage obj2=new NewCustomerCreationAppPage(driver);
	
	
	@Given("User opens the URL of the application")
	public void user_opens_the_url_of_the_application() {
		
		System.out.println("Application Launched");
	   
	}

	@Given("User will enter the username with {string}")
	public void user_will_enter_the_username_with(String username) {
		
		obj1.enterUsername(username);
		
		
	   
	}

	@Given("User will enter the password with {string}")
	public void user_will_enter_the_password_with(String password) {
	  
		obj1.enterPassword(password);
		
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		
		obj1.clickOnSubmit();
	    
	}

	@Then("User will be able to login to the application")
	public void user_will_be_able_to_login_to_the_application() throws IOException {
		
		getTitle();
		takescreenshot();
		
		
		
	   
	}
	
	

	@Then("User will click on the add new Customer link in the app")
	public void user_will_click_on_the_add_new_customer_link_in_the_app() throws InterruptedException, IOException {
		
		obj2.clickNewCustlink();
		addHardCodedwait();
		takescreenshot();
		
	   
	}

	@Then("User will enter the customer name in app as {string}")
	public void user_will_enter_the_customer_name_in_app_as(String Customer_Name) {
		
		obj2.addCustName(Customer_Name);
		//scrollDown();
		
	    
	}

	@Then("User will select the gender in app")
	public void user_will_select_the_gender_in_app() {
		
		obj2.selectgender();
	    
	}

	@Then("User will enter the dOB in app as {string}")
	public void user_will_enter_the_d_ob_in_app_as(String DOB) {
		
		obj2.addDOB(DOB);
		
	    
	}

	@Then("User will enter the address in app as {string}")
	public void user_will_enter_the_address_in_app_as(String Address) throws IOException, InterruptedException {
		
		obj2.addAddress(Address);
		Thread.sleep(3000);
		System.out.println("Taking Screenshot");
		takescreenshot();
	    
	}
	
	

	

}
