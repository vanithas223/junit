package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
                    //base class
public class data {
	public static WebDriver driver;
	public static Actions a;

	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanit\\eclipse-workspace\\Junit\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void MaxBrowser() {
		driver.manage().window().maximize();
	}
	public static void PageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void fill(WebElement e, String value) {
		e.sendKeys(value);
	}
	
	public static void btnClick(WebElement login) {
		login.click();	
		}

	
	public static void PageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	public static void clickdouble(WebElement ref) {
		a = new Actions(driver);
		a.doubleClick(ref).perform();
	}
	public static void rigtClick(WebElement element) {
		a.contextClick().perform();
	}
	public static String readFromExcel(int rowNo, int cellNo) throws IOException {
		File f = new File("C:\\Users\\vanit\\eclipse-workspace\\Junit\\excel\\Book1.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sh = book.getSheet("adactin");
		Row r = sh.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		int type = c.getCellType();
		String name = "";
		if (type == 1) {
			name = c.getStringCellValue();
		} else {
			if (DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat form = new SimpleDateFormat("dd-MMM-YYYY");
				name = form.format(d);
			} else {
				double d = c.getNumericCellValue();
				long lo = (long) d;
				name = String.valueOf(lo);
			}
		}
		return name;
	}
}
