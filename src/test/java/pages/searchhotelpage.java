package pages;
import java.util.List;
import org.apache.xmlbeans.xml.stream.Location;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class searchhotelpage {
	WebDriver driver;
	public searchhotelpage(WebDriver driver) {
			this.driver= driver;
}
	//Using FindBy for locating elements 
	@FindBy(id="location")
	private WebElement txtlocation;
	
	@FindBy(id="hotels")
	private WebElement txthotels;
	
	@FindBy(id="room_type")
	private WebElement txtroom_type;
	
	@FindBy(id="room_nos")
	private WebElement txtroom_nos;
	
	@FindBy(id="datepick_in")
	private WebElement txtdatepick_in;
	
	@FindBy(id="datepick_out")
	private WebElement txtatepick_out;
	
	@FindBy(id="adult_room")
	private WebElement txtadult_room;
	
	@FindBy(id="child_room")
	private WebElement txtchild_room;
	
	@FindBy(id="Submit")
	private WebElement btnclick;
	
	public WebElement getTxtlocation() {
		return txtlocation;
	}
	public WebElement getTxthotels() {
		return txthotels;
	}
	public WebElement getTxtroom_type() {
		return txtroom_type;
	}
	public WebElement getTxtroom_nos() {
		return txtroom_nos;
	}
	public WebElement getTxtdatepick_in() {
		return txtdatepick_in;
	}
	public WebElement getTxtatepick_out() {
		return txtatepick_out;
	}
	public WebElement getTxtadult_room() {
		return txtadult_room;
	}
	public WebElement getTxtchild_room() {
		return txtchild_room;
	}
	public WebElement getBtnclick() {
		return btnclick;
	}

}
