package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 {
	//declaration
	@FindBy(xpath="//input[@id='email']")private WebElement username;
	@FindBy(xpath="//input[@id='pass']")private WebElement password;
	@FindBy(xpath="//button[@name='login']")private WebElement login;
	//initializtion
	POM1(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	//usage
	public void enterusername() {
		username.sendKeys("tester2");
		
		
	}
	public void enterpassword(){
		password.sendKeys("1234");
		
	}
	public void clickonlog() {
		login.click();
	}
	
	
	
	
	
	
		
	


		
}
	
	


