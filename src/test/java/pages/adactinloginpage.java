package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class adactinloginpage {
	public WebDriver driver;
	public adactinloginpage(WebDriver driver) {
			this.driver= driver;
}
	//Using FindBy for locating elements 
	@FindBy(id="username")
	private WebElement txtusername;
	
	@FindBy(id="password")
	private WebElement txtpassword;
	
	@FindBy(id="login")
	private WebElement btnlogin;
	

	
	public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
}
