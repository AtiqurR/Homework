package hw_16_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dropdown_selectByIndex_method {

	ChromeDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\Anik\\eclipse-workspace\\JaveSeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.bestbuy.com/");
		Thread.sleep(3000);

	}

	@Test ()
	public void selectByIndexTest() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("(//span[@class='plButton-label utility-nav-drawer-btn-label'])[1]"));
		Select select = new Select(dropdown);
		select.selectByIndex(5);
		Thread.sleep(3000);

	}

	@AfterTest
	public void tearUp() {
		driver.close();
	}

}
