package redbusTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	WebDriver driver;

	@BeforeClass
	public void launchApplication() {
		// 1) Open the browser
		//System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");// For local machine only
		driver = new ChromeDriver();

		// 2) Maximize it
		driver.manage().window().maximize();

		// 3) Navigate to the application
		driver.get("https://www.redbus.in/");
	}

	// 9) Close the browser
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
