package sa.dataDriven;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AdactinLoginDataProvider {
	
	static WebDriver driver;
	
	@DataProvider(name="loginData")
	Object[][] dataProvider()
	{
		return ExcelOperations.readAll();
			
	}
	
	@BeforeClass
	void beforeClass() throws InvalidFormatException, IOException
	{
		openHotelApp();
		ExcelOperations.openExcelForReading("D:\\Credentilas.xlsx");
		ExcelOperations.loadSheet(0);
   	}

	@Test(dataProvider="loginData")
	void main(String usernameData, String passwordData) throws InvalidFormatException, IOException {

		ExcelOperations.loadSheet(0);
        	login(usernameData,passwordData);
        	Assert.assertTrue(isExist("username_show"));	      
        ExcelOperations.closeWorkbook();
	}
	
	@Test
	void main1() throws InvalidFormatException, IOException {
		ExcelOperations.loadSheet(0);
        	login(ExcelOperations.read(1, 0),ExcelOperations.read(1, 1));
        	Assert.assertTrue(isExist("username_show"));        	
        	
        ExcelOperations.closeWorkbook();
	}
	
	@Test
	void main2() throws InvalidFormatException, IOException {
		ExcelOperations.loadSheet(0);
        	login(ExcelOperations.read(2, 0),ExcelOperations.read(2, 1));
        	Assert.assertTrue(isExist("username_show"));
        ExcelOperations.closeWorkbook();
	}

	public static void openHotelApp()
	{
		System.setProperty("webdriver.gecko.driver", "C:/Users/Hvuser/Downloads/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public static void login(String userName, String password)
	{
		driver.get("http://www.adactin.com/HotelApp/index.php");
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();
	}
	
	boolean isExist(String inputId)
	{
	try{
		WebElement element= driver.findElement(By.id(inputId));
		return true;
	}catch(NoSuchElementException e)
	{
		return false;
	}
	}
}
