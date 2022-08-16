package shopcluesTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	
	WebDriver driver;

	@BeforeClass
	public void launchApplication() {
		// 1) Disable Notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		// 2) Open Browswer with options enabled
		driver = new ChromeDriver(options);

		// 3) Maximize it
		driver.manage().window().maximize();

		// 4) Navigate to the application
		driver.get("https://bazaar.shopclues.com/");
	}

		// 5) Close the browser
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}