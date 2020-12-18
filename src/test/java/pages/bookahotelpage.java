package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class bookahotelpage {
	WebDriver driver;

	public bookahotelpage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "first_name")
	private WebElement fname;

	@FindBy(id = "last_name")
	private WebElement lname;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement ccnum;

	@FindBy(id = "cc_type")
	private WebElement cctype;

	@FindBy(id = "cc_exp_month")
	private WebElement expmon;

	@FindBy(id = "cc_exp_year")
	private WebElement expyr;

	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement click;
	
	@FindBy(xpath="//input[@name='order_no']")
	private WebElement orderno;
	

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpmon() {
		return expmon;
	}

	public WebElement getExpyr() {
		return expyr;
	}

	public WebElement getCvv() {
		return cvv;
	}
	
	public WebElement getClick() {
		return click;
	}
public WebElement getOrderno() {
	return orderno;
}
}
