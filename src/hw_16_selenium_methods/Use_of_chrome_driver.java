package hw_16_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_chrome_driver {

	ChromeDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\Anik\\eclipse-workspace\\JaveSeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.fedex.com/en-us/home.html");
		Thread.sleep(3000);

	}

	@Test
	public void logInTest() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Sign Up or Log In ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='fxg-link  js-fxgc-init  fxg-link--blue         '])[6]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='userId']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("Anik");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
		driver.findElement(By.id("login-btn")).click();
		Thread.sleep(3000);

	}

	@AfterTest
	public void tearUp() {
		driver.close();
	}

}
