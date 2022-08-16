package amazonTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import amazon.LandingPages;
import amazon.SignIn;



public class VerifyErrorMessage {
	
WebDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		
		// 1) Open the Browser
		driver = new ChromeDriver();
		
		// 2) Maximize It
		driver.manage().window().maximize();
		
		// 3) Navigate to application
		
		driver.get("https://amazon.in");
	
	}
	
	@Test
	
	public void verifyErrorMessage() {
	//4) Hover over "Hello, Sign in" menu
	LandingPages landingPage = new LandingPages(driver);
	landingPage.hoverOverHelloSignInMenu();
	
	
	//5) Click on 'Sign in' Button
	landingPage.clickSignInBtn();
	
	//6) Enter an invalid username in text box
	SignIn signIn = new SignIn(driver);
	signIn.enterUsername("batman554466@gmail.com");
	
	//7) Click on 'Continue' button
	signIn.clickContinueBtn();
	
	//8) Verify the error message - 'We cannot find an account with that email address' is displayed to the user.
	String expectedErrMsg = "We cannot find an account with that email address";
	String actualErrMsg = signIn.getErrMsg();
	Assert.assertEquals(actualErrMsg, expectedErrMsg);
			
	}	
	@AfterTest
	public void closeBrowser(){
	//9) Close the browser
	driver.quit();
	}
}