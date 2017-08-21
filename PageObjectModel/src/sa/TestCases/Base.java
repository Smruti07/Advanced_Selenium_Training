package sa.TestCases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base {
	
	public static WebDriver driver;
	
	
	public static void openBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:/Users/Hvuser/Downloads/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public static void navigateToUrl()
	{
		driver.get("http://www.adactin.com/HotelApp/index.php");
	}
	

}
