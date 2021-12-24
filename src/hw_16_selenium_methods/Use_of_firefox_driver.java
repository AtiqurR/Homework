package hw_16_selenium_methods;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_firefox_driver {

	FirefoxDriver driver;
	

	
	@BeforeTest
	public void setUp() throws InterruptedException {
	System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Anik\\eclipse-workspace\\JaveSeleniumPractice\\driver\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.usps.com/");
    Thread.sleep(3000);
		
	}
	

	@Test
	public void loginButtonTest() throws InterruptedException{
		driver.findElement(By.xpath("//a[@class='nav-first-element menuitem']")).click();
		Thread.sleep(8000); 
	}
	
	@AfterTest
	public void tearUp() {
		driver.close();
		
	}
	
	
}
