package hw_15_selenium_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_manage_by_driver_getsize_setsize_methods {

WebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\Anik\\eclipse-workspace\\JaveSeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
  
	@Test (enabled = true, priority = 1)
	public void maximizeWindowTest() throws InterruptedException {
		driver.get("https://www.walgreens.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}
	
	@Test (enabled = true, priority = 2)
	public void fullscreenWindowTest() throws InterruptedException {
		driver.get("https://www.walmart.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
	}
	
	@Test (enabled = true, priority = 2)
	public void sizeOfWindowTest() throws InterruptedException {
		driver.get("https://www.optimum.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		System.out.println("The size of the screen is:"+ driver.manage().window().getSize());
	}
	
	@Test(enabled = true, priority = 4)
	public void deleteCookies() {
		driver.manage().window().maximize();		
		driver.manage().deleteAllCookies();
		driver.get("https://www.lycamobile.us/en/");		
	}
	
	
	@Test (enabled = true, priority = 5)
	public void setASpecificSizeOfWindow() throws InterruptedException {
		Dimension dimension = new Dimension(1000, 720);
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().setSize(dimension);
		driver.manage().deleteAllCookies();
		driver.get("https://www.montefiore.org/");
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		driver.manage().window().setSize(dimension);
		Thread.sleep(3000);
	}
	
	
	@AfterTest
	public void tearUp() {
		driver.quit();
		
	}
	
	
		
}
