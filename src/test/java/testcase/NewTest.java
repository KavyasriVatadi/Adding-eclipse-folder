package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SearchHotel;

public class NewTest {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://adactinhotelapp.com/");
	  
	  LoginPage obj = PageFactory.initElements(driver, LoginPage.class);
	  obj.user_name("vasuvespag");
	  obj.password("vasu1234");
	  obj.Login();
	  
	  SearchHotel obj1 = new SearchHotel(driver);
	  obj1.Location("New York");

	  System.out.println("Pushing the code in jenkins");
  }
}
