package pageObjectRep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RediffLoginPage {

	WebDriver driver;
	
	public RediffLoginPage(WebDriver driver)
	{
		this.driver = driver;
	}

	
	
	By username = By.id("login1");
	By password = By.id("password");
	By submitbutton = By.className("signinbtn");
	By rediff = By.linkText("rediff.com");
	
	
	public WebElement username()
	{
		return driver.findElement(username);
	}
	public WebElement password()
	{
		return driver.findElement(password);
	}
	public WebElement submitbutton()
	{
		return driver.findElement(submitbutton);
	}
	public WebElement rediff()
	{
		return driver.findElement(rediff);
	}
}
