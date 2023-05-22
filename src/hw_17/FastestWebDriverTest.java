package hw_17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FastestWebDriverTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"\\Users\\Anik\\eclipse-workspace\\JaveSeleniumPractice\\driver\\geckodriver.exe");

		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("headless");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.usps.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='menuitem'])[2]")).click();
		Thread.sleep(5000);
		System.out.println("Curent URL is:" + driver.getCurrentUrl());
		driver.quit();

	}

}
