package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel {
WebDriver driver;
	
	public SearchHotel(WebDriver driver) {
		this.driver = driver;
	}
	
	By select_location = By.id("location");
	
	public void Location(String locationcity) {
		
		WebElement dropdown = driver.findElement(select_location);
		Select drop = new Select(dropdown);
		drop.selectByVisibleText(locationcity);
			
	}
}
