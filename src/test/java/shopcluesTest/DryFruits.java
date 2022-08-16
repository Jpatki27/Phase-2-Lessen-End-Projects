package shopcluesTest;

import org.testng.annotations.Test;
import java.util.ArrayList;

import org.testng.Assert;


import shopclues.BuyNow;
import shopclues.Essentials;
import shopclues.Products;

public class DryFruits extends BaseTest{
	
@Test
public void buyProduct() throws InterruptedException {
	
		
	String oldTab = driver.getWindowHandle();
	
	// 4) Click on "Don't Allow" notification button
	Essentials essentials = new Essentials(driver);
	essentials.closeNotifications();

	
	// 5) Hover the pointer over 'Essentials'
	
	essentials.hoverOverEssentials();
	
	// 6) Click on 'Dry Fruits Nuts & Seeds' in the sub-menu
	essentials.clickDryFruits();
	
	//6.1)Switch to new tab
	
    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	tabs.remove(oldTab);
	driver.switchTo().window(tabs.get(0));
		
	// 7) Click on the first available phone
	Products products = new Products (driver);
	products.clickFirstProduct();
	
	// 8) Switch focus to new tab
	ArrayList<String> tab3 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tab3.get(2));
		
	// 9)Click 'Buy Now' Button
	Thread.sleep(3000);
	BuyNow buyNow = new BuyNow(driver);
	buyNow.clickBuyNowBtn();
	
	// 10) Verify user is on 'Sign-In page'
	Thread.sleep(3000);
	String expectedTitle = "SIGNUP";
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	
  }
}