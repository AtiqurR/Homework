package hw_14_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UseOfTestNGAnnotationIsDisplayed {

	
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
	public void openAcountTest() {
		boolean elementDisplayed = driver.findElement(By.className("logo-container")).isDisplayed();
		System.out.println("Open Acount is Displayed? Ans: " + elementDisplayed);

	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
		
	}


