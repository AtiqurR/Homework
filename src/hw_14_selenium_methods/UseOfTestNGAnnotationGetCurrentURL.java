package hw_14_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UseOfTestNGAnnotationGetCurrentURL {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\Anik\\eclipse-workspace\\JaveSeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.bankofamerica.com/");
		Thread.sleep(3000);

	}

	@Test(enabled = true, priority = 1)
	public void currentURLTest() {
		driver.findElement(By.xpath("//A[@ID='NAV_ABOUT_US']")).click();
		System.out.println("The current URL ia : " + driver.getCurrentUrl());

	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
