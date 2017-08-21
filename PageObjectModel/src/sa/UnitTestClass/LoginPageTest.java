package sa.UnitTestClass;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sa.PageClass.LoginPage;

public class LoginPageTest {
	
	LoginPage loginPage;
	
	@BeforeClass
	public void initPage()
	{
		loginPage= new LoginPage();
		
	}
	
	
	@Test
	public void txtUsernameTest()
	{
		loginPage.setTxtUsername("Smita1234");
		Assert.assertEquals("Smita1234", loginPage.getTxtUsername());
	}
	
	@Test
	public void txtPasswordTest()
	{
		loginPage.setTxtPassword("89NZ56");
		Assert.assertEquals("89NZ56", loginPage.getTxtPassword());
	}

}
