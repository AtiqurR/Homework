package hw_16_selenium_methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebBasedAlertMethods {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\Anik\\eclipse-workspace\\JaveSeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		Thread.sleep(3000);
	}

	@Test(enabled = true, priority = 1)
	public void acceptAlertFromWindow() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		System.out.println("The text of the Alert is: " + alert.getText());
		alert.accept();

	}

	@Test(enabled = true, priority = 2)
	public void dismissAlertFromWindow() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}

	@AfterTest
	public void tearUp() {
		driver.quit();

	}

}