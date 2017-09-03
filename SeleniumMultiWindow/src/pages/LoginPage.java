package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {


	 
	 @FindBy(id = "username") private WebElement uname;
	 @FindBy(id = "password") private WebElement pass;
	 @FindBy(id = "login") private WebElement _login;
	 @FindBy(id = "error-msg") private WebElement _error;
	 
	 
	public void enterUsername(String username, String password) {
		uname.sendKeys(username);
	 }
	 
	public void enterPassword(String username, String password) {
		 pass.sendKeys(password);
	 }
		 
	
	public void clickSignin(String username, String password) {
		 _login.submit();
	 }
		 
	
}
