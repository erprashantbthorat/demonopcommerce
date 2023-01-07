package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	@FindBy(name="Email")
	@CacheLookup
	WebElement txtUsername;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@class='button-1 login-button']")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="//a[@href='/logout']")
	@CacheLookup		
	WebElement btnLogout;
	
	public void setUsername(String email)
	{
		
		//txtUsername.clear();
		txtUsername.sendKeys(email);
		System.out.println("Webelement"+txtUsername);
	}
	
	public void SetPassword(String pass)
	{
		txtPassword.clear();
		txtPassword.sendKeys(pass);
	}
	
	public void btnLogin()
	{
		btnLogin.click();
	}
	
	public void btnLogout()
	{
		btnLogout.click();
	}
	
}
