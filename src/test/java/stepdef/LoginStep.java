package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageobjects.LoginPage;

public class LoginStep {
	public WebDriver driver;
	LoginPage lp = new LoginPage(driver);
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
	   WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}
	
	@When("User Enters URl {string}") 
	public void user_enters_u_rl(String url) {
	    driver.get(url);
	    
	}

	@When("User Enters Email as {string} Password as {string}")
	public void user_enters_email_as_password_as(String uname, String pass) {
	  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lp.setUsername(uname);
	   lp.SetPassword(pass);
	}

	@When("Click on Login")
	public void click_on_login() {
	   lp.btnLogin();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
	   if(driver.getPageSource().contains("Login was unsuccessful."))
	   {
		   driver.close();
		   Assert.assertTrue(false);
	   }
	   
	   else
	   {
		   Assert.assertEquals(title,driver.getTitle() );
	   }
	}

	@Then("Click on Logout Link")
	public void click_on_logout_link() {
	    lp.btnLogout();
	}

//	@Then("Page title should be {string}")
//	public void page_title_should_be(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@Then("User close browser")
	public void user_close_browser() {
	 driver.close();  
	}
}
