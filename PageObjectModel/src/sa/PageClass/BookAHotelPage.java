package sa.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookAHotelPage {
	
	@FindBy(id="first_name")
	WebElement txtBoxFirstName;
	
	@FindBy(id="last_name")
	WebElement txtBoxLastName;
	
	@FindBy(id="address")
	WebElement txtBoxBillingAddress;
	
	@FindBy(id="cc_num")
	WebElement txtBoxCCNum;
	
	@FindBy(id="cc_type")
	WebElement dropdownCCType;
	
	@FindBy(id="cc_exp_month")
	WebElement dropdownCCExpiryMonth;
	
	@FindBy(id="cc_exp_year")
	WebElement dropdownCCExpiryYear;
	
	@FindBy(id="cc_cvv")
	WebElement txtBoxCVVNum;
	
	@FindBy(id="book_now")
	WebElement BtnBookNow;

}
