package hw_16_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dropdown_selectByValue_method {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\Anik\\eclipse-workspace\\JaveSeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.mountsinai.org/");
	}

	@Test
	public void selectByValueTest() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='goog-te-combo']"));
		Select select = new Select(dropdown);
		select.selectByValue("bn");
		Thread.sleep(3000);
	}

	@AfterTest
	public void tearUp() {
		driver.close();
	}
}
