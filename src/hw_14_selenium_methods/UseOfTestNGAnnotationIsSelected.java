package hw_14_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UseOfTestNGAnnotationIsSelected {

	WebDriver driver;

	@BeforeTest
	public void start() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\Anik\\eclipse-workspace\\JaveSeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get("https://www.bankofamerica.com/");
		Thread.sleep(3000);

	}

	@Test
	public void checkBoxTest() {
		boolean checkBox = driver.findElement(By.xpath("//input[@id='saveOnlineId']")).isSelected();
		System.err.println("Is Check Box is Selected? Ans: " + checkBox);

	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
