package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class searchcontinuepage {
	WebDriver driver;

	public searchcontinuepage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "radiobutton_0")
	private WebElement btnradio;
	@FindBy(id = "continue")
	private WebElement btnclick;
	
	public WebElement getBtnradio() {
		return btnradio;
	}
	public WebElement getBtnclick() {
		return btnclick;
	}

}
