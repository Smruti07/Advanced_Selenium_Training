package sa.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingConfirmationPage {
	
	@FindBy(id="order_no")
	WebElement valueOrderNum;
	
	@FindBy(id="logout")
	WebElement btnLogout;

}
