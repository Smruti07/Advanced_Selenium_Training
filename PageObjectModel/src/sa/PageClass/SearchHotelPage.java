package sa.PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import sa.TestCases.Base;

public class SearchHotelPage {
	
	@FindBy(id="username_show")
	WebElement loginSuccessTxt;
	
	@FindBy(id="location")
	WebElement dropdownLocation;
	
	@FindBy(id="hotels")
	WebElement dropdownHotels;
	
	@FindBy(id="room_type")
	WebElement dropdownRoomType;
	
	@FindBy(id="room_nos")
	WebElement dropdownRoomNos;
	
	@FindBy(id="adult_room")
	WebElement dropdownAdultPerRm;
	
	@FindBy(id="datepick_in")
	WebElement TxtcheckInDate;
	
	@FindBy(id="datepick_out")
	WebElement TxtcheckOutDate;
	
	@FindBy(id="child_room")
	WebElement dropdownChildPerRm;

	@FindBy(id="Submit")
	WebElement btnSearch;
	
	
	public SearchHotelPage()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	
	public String getTxtLoginSuccess()
	{
		return loginSuccessTxt.getAttribute("value");
	}
	
	public String getTxtCheckInDate()
	{
		return TxtcheckInDate.getAttribute("value");
	}
	
	public String getTxtCheckOutDate()
	{
		return TxtcheckOutDate.getAttribute("value");
	}
	
	public void selectLocation(String value)
	{
		 Select element= new Select(dropdownLocation);
		 element.selectByVisibleText(value);
	}
	
	public void selectHotel(String value)
	{
		 Select element= new Select(dropdownHotels);
		 element.selectByVisibleText(value);
	}
	
	public void selectRoomType(String value)
	{
		 Select element= new Select(dropdownRoomType);
		 element.selectByVisibleText(value);
	}
	
	public void selectRoomnbr(String value)
	{
		 Select element= new Select(dropdownRoomNos);
		 element.selectByVisibleText(value);
	}
	
	public void selectAdultPerRoom(String value)
	{
		 Select element= new Select(dropdownAdultPerRm);
		 element.selectByVisibleText(value);
	}
	
	public void selectChildPerRoom(String value)
	{
		 Select element= new Select(dropdownChildPerRm);
		 element.selectByVisibleText(value);
	}

	public void clickSearchButton()
	{
		btnSearch.click();
	}

}
