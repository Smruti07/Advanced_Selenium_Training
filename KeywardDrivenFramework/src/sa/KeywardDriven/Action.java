package sa.KeywardDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Action {
	
	static WebDriver driver;
	static void initDriver()
	{
		System.setProperty("webdriver.gecko.driver", "C:/Users/Hvuser/Downloads/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.adactin.com/HotelApp/index.php");
	}
	
	static void EnterText(String LocatorType, String Locator, String ActionValue)
	{
		if(LocatorType.equalsIgnoreCase("id"))
		{
		driver.findElement(By.id(Locator)).sendKeys(ActionValue);
		}
	}
	
	static void Click(String LocatorType, String Locator)
	{
		if(LocatorType.equalsIgnoreCase("id"))
		{
		driver.findElement(By.id(Locator)).click();
		}
	}
	
	static void Select(String LocatorType, String Locator, String ActionValue)
	{
		if(LocatorType.equalsIgnoreCase("id"))
		{
	 Select element= new Select(driver.findElement(By.id(Locator)))	;
	 element.selectByVisibleText(ActionValue);
		}
	 
	}

}
