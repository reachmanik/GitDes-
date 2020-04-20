package pagepacktestcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Testcaseclass  {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "F:\\Sellllllllll\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://altoconvertpdftojpg.com/");
		
		driver.findElement(By.id("dropzoneInput-label")).click();
		try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
		
		Runtime.getRuntime().exec("C:\\Users\\hp\\Desktop\\Pregnancy\\file_up.exe");
		
		driver.findElement(By.xpath("//button[text()='Convert Now!']")).click();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

		driver.findElement(By.xpath("//a[text()='Download Now']")).click();

		



}

}
