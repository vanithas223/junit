package test_cases;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.adactinloginpage;
import pages.bookahotelpage;
import pages.searchcontinuepage;
import pages.searchhotelpage;

public class adactinlogintest extends testbase {
	@Test
	public void login() throws Exception {
		PageTitle();
		PageUrl();
		adactinloginpage l = PageFactory.initElements(driver, adactinloginpage.class);
		WebElement user = l.getTxtusername();
		fill(user, readFromExcel(0, 1));
		WebElement pass = l.getTxtpassword();
		fill(pass, readFromExcel(1, 1));

		WebElement btnlogin = l.getBtnlogin();
		btnClick(btnlogin);
		Thread.sleep(2000);

		searchhotelpage s = PageFactory.initElements(driver, searchhotelpage.class);
		WebElement locate = s.getTxtlocation();
		fill(locate, readFromExcel(3, 1));

		WebElement hotel = s.getTxthotels();
		fill(hotel, readFromExcel(4, 1));

		WebElement roomtype = s.getTxtroom_type();
		fill(roomtype, readFromExcel(5, 1));

		WebElement noofrooms = s.getTxtroom_nos();
		fill(noofrooms, readFromExcel(6, 1));

		WebElement checkin = s.getTxtdatepick_in();
		fill(checkin, readFromExcel(7, 1));

		WebElement checkout = s.getTxtatepick_out();
		fill(checkout, readFromExcel(8, 1));

		WebElement adultperroom = s.getTxtadult_room();
		fill(adultperroom, readFromExcel(9, 1));

		WebElement childperroom = s.getTxtchild_room();
		fill(childperroom, readFromExcel(10, 1));

		WebElement btnclick = s.getBtnclick();
		btnclick.click();

		searchcontinuepage c = PageFactory.initElements(driver, searchcontinuepage.class);
		WebElement btnradio = c.getBtnradio();
		btnradio.click();

		WebElement btnclick2 = c.getBtnclick();
		btnclick2.click();

		bookahotelpage b = PageFactory.initElements(driver, bookahotelpage.class);

		WebElement fname = b.getFname();
		fill(fname, readFromExcel(12, 1));

		WebElement lname = b.getLname();
		fill(lname, readFromExcel(13, 1));

		WebElement address = b.getAddress();
		fill(address, readFromExcel(14, 1));

		WebElement ccnum = b.getCcnum();
		fill(ccnum, readFromExcel(15, 1));

		WebElement cctype = b.getCctype();
		fill(cctype, readFromExcel(16, 1));

		WebElement expmon = b.getExpmon();
		fill(expmon, readFromExcel(17, 1));

		WebElement expyr = b.getExpyr();
		fill(expyr, readFromExcel(18, 1));

		WebElement cvv = b.getCvv();
		fill(cvv, readFromExcel(19, 1));

		WebElement click = b.getClick();
		click.click();
		Thread.sleep(5000);
		WebElement orderno = b.getOrderno();
		System.out.println(orderno.getAttribute("value"));

	}

}
