package hw_15_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UseOfTestNGAnnotationClearAndEnterKeyMethod {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\Anik\\eclipse-workspace\\JaveSeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://abcnews.go.com/");
		Thread.sleep(3000);

	}

	@Test(enabled = false, priority = 2)
	public void searchTest() throws InterruptedException {
		driver.get("https://www.mountsinai.org/");
		driver.findElement(By.xpath("(//i[@class='fa fa-search'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='js-yext-query yxt-SearchBar-input'])[2]"))
				.sendKeys("appointment");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='Icon Icon--magnifying_glass '])[2]")).click();
		Thread.sleep(3000);
		System.out.println("Current URL is: " + driver.getCurrentUrl());
		driver.findElement(By
				.xpath("//input[@class='js-yext-query yxt-SearchBar-input' and @id='yxt-SearchBar-input--SearchBar']"))
				.clear();
		Thread.sleep(3000);

	}

	@Test(enabled = true, priority = 1)
	public void searchTest01() throws InterruptedException {
		driver.get("https://abcnews.go.com/");
		driver.findElement(By.xpath("//span[@class='search__trigger search__trigger--default']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='search__input']")).sendKeys("Todays News", Keys.ENTER);
		Thread.sleep(3000);
		System.out.println("Current URL is: " + driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@class='SearchInput__Input']")).clear();
		Thread.sleep(3000);

	}


	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
