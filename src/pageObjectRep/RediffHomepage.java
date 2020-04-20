package pageObjectRep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RediffHomepage {

	WebDriver driver;
	
	public RediffHomepage(WebDriver driver)
	{
		this.driver = driver;
	}

	
	
	By searchbox = By.id("srchword");

	public WebElement searchbox()
	{
		return driver.findElement(searchbox);
	}


}
