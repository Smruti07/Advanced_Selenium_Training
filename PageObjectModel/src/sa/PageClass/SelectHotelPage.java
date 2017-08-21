package sa.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotelPage {
	
	@FindBy(xpath="//table[@cellspacing='1']")
	WebElement tableHotelDetails;
	
	@FindBy(id="radiobutton_0")
	WebElement btnSelectHotel;
	
	@FindBy(id="hotel_name_0")
	WebElement valueHotelName;
	
	@FindBy(id="location_0")
	WebElement valueLocation;
	
	@FindBy(id="rooms_0")
	WebElement valueNoOfRooms;
	
	@FindBy(id="arr_date_0")
	WebElement valueArrivalDate;
	
	@FindBy(id="dep_date_0")
	WebElement valueDepartureDate;
	
	@FindBy(id="no_days_0")
	WebElement valueNoOfDays;
	
	@FindBy(id="room_type_0")
	WebElement valueRoomType;
	
	@FindBy(id="price_night_0")
	WebElement valuePricePerNight;
	
	@FindBy(id="total_price_0")
	WebElement valueTotalPrice;
	
	@FindBy(id="continue")
	WebElement btnContinue;
	

}
