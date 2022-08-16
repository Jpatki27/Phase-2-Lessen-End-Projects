package shopclues;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Essentials {
	
	Actions actions;
	WebDriverWait wait;
	
	@FindBy(xpath = ("//html/body/div/div/div/div[3]/div/button[1]"))
	private WebElement notifications;
	
	@FindBy(id = "nav_82")
	private WebElement essentials;
	
	@FindBy(linkText = "Dry Fruits Nuts & Seeds")
	private WebElement dryFruits;
	
	public Essentials (WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}

	public void closeNotifications(){		
		notifications.click();		
	}
	
	public void hoverOverEssentials() {
		actions.moveToElement(essentials).build().perform();
	}
	
	public void clickDryFruits() {
		dryFruits.click();
	}
}
