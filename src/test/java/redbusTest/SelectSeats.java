package redbusTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import redbus.LandingPages;



public class SelectSeats extends BaseTest{
	
	
@Test
public void buyBusSeats() throws InterruptedException {
	
	// 4) Enter From City
	LandingPages landingPage = new LandingPages(driver);
	landingPage.clickSourceCity();
	
	
	// 5) Enter To City
	landingPage.clickDestCity();
	
	// 6) Select Travel Date from Calendar
	landingPage.clickDateSelect();
	
	// 7) Click Search Buses Button
	landingPage.clickSearchBtn();
	
	// 8) Close Primo Banner
    //	No Primo Banner displayed at the time of writing project

	//	Sleep to allow page to load
	Thread.sleep(3000);
		
	// 9)Click on View Seats for the first search result
	landingPage.clickViewSeatsBtn();

	//Sleep to allow pop-up to load
	Thread.sleep(2000);
	
	// 10) Close Pop-Up
	landingPage.clickClosePopUp();
	
	// 10) Verify user sees the message - "Click on an Available seat to proceed with your transaction."
	String expectedHeader = "Click on an Available seat to proceed with your transaction.";
	String actualHeader = driver.findElement(By.xpath("//span[contains(@class, 'seatSelMsg')]")).getText();
	Assert.assertEquals(actualHeader, expectedHeader);
	
}
}