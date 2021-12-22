package hw_14_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UseOfTestNGAnnotationSendKeys {

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
	public void onlineIDTest() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@class='spa-input-text'])[3]")).sendKeys("Atiqur Rahman");
		Thread.sleep(3000);

	}

	@Test(enabled = true, priority = 2)
	public void passcodeTest() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='tl-private spa-input-text']")).sendKeys("123456789");
		Thread.sleep(3000);

	}

	@Test(enabled = true, priority = 3)
	public void checkBoxTest() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='saveOnlineId']")).click();
		Thread.sleep(3000);

	}

	@Test(enabled = true, priority = 4)
	public void signInTest() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='signIn']")).click();
		Thread.sleep(3000);

	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
