package StepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.techtest.base.TestBase;
import com.techtest.pages.HomePage;
import com.techtest.pages.LoginPage;
import com.techtest.pages.RegisterPage;

import io.cucumber.java.en.*;

public class RegisterSteps extends TestBase{
	
	HomePage homePage;
	RegisterPage registerPage;
	LoginPage loginPage;
	
	public RegisterSteps() throws IOException{
		super();   
		
	}
	
	@Given("^user launch the url and authenticate it$")
    public void user_launch_the_url_and_authenticate_it() {
		initialization();	
    }
	
	@When("^on the home page$")
    public void on_the_home_page() {
		HomePage homePage = new HomePage();
		String title = homePage.validateHomePageTitle();
		Assert.assertEquals(title, "QA Automation Testing � Just another WordPress site");
		
    }
	
	@Then("^validate waracle logo$")
    public void validate_waracle_logo() {
		HomePage homePage = new HomePage();
		boolean flag = homePage.validateWaracleLogo();
		Assert.assertTrue(flag);
		
	}
	
	@When("^user click on register link$")
    public void user_click_on_register_link() {
		HomePage homePage = new HomePage();
		homePage.register();
	}
	
	@And("^provide details for (.+) (.+) and (.+)$")
    public void provide_details_for_and(String username, String emailaddress, String password) {
		RegisterPage registerPage = new RegisterPage();
		registerPage.registerUser(username, emailaddress, password);
    }
	
	@And("^click on register$")
    public void click_on_register() {
		RegisterPage registerPage = new RegisterPage();
		registerPage.clickRegister();
		
    }
	
	@Then("^the user should be register $")
    public void the_user_should_be_register() {
		LoginPage loginPage = new LoginPage();
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Log In ‹ QA Automation Testing — WordPress");
		
	}
		
		@And("^I close the browser$")
		public void closeBrowser() throws Throwable{
			driver.close();
			driver.quit();
		
    }
	

	}
