package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id="username")WebElement uname;
	@FindBy(id="password")WebElement pwd;
	@FindBy(id="login")WebElement login;
	
	//@FindBys(id="login"),@FindBys(name="");
	
//	By uname = By.id("username");
//	By pwd = By.id("password");
//	By login = By.id("login");
	
	public void user_name(String username) {
		uname.sendKeys(username);
	}
	
	public void password(String password) {
		pwd.sendKeys(password);
	}
	
	public void Login() {
		login.click();
	}

}
