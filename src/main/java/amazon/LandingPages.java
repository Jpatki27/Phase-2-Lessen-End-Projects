package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPages {
	Actions actions;
	
	@FindBy(linkText = "Mobiles")
	private WebElement mobiles;
	
	@FindBy(id = "nav-link-accountList")
	private WebElement helloSignInMenu;
	
	@FindBy(linkText = "Sign in")
	private WebElement signInBtn;
	
	
	public LandingPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}
	
	public void clickMobiles() {
		mobiles.click();
	}
	
	public void hoverOverHelloSignInMenu() {
		actions.moveToElement(helloSignInMenu).build().perform();
	}

	public void clickSignInBtn() {
		signInBtn.click();
	}
}
