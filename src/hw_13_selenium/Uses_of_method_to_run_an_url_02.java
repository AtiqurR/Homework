package hw_13_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Uses_of_method_to_run_an_url_02 {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anik\\eclipse-workspace\\JaveSeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.verizon.com/");
//		Thread.sleep(3000);

	}

	@Test
	public void buttonTest() {
		driver.findElement(By.xpath("(//button[@id='detailedOverlayClose'])[1]")).click();
		driver.findElement(By.xpath("//button[@id='gnav20-search-icon']")).click();
		

	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
