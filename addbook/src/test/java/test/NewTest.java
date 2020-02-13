package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	
	  @Test
	  public void launch() {
		  
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\bhargavi.p\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver(); 
		  driver.get("http://18.191.155.135:32768/addressbook/");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
		  driver.close();
		  
}
}


