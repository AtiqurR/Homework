package hw_16_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mouse_hover_action {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\Anik\\eclipse-workspace\\JaveSeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.usps.com/");
		Thread.sleep(3000);
	}

	@Test
	public void mouseHoverActionOnShopTest() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement shop = driver.findElement(By.xpath("(//a[@class='menuitem'])[3]"));
		actions.moveToElement(shop).build().perform();
		Thread.sleep(3000);
		System.out.println("The text of this web element is: " + shop.getText());

	}

	@AfterTest
	public void tearUp() {
		driver.quit();

	}

}
