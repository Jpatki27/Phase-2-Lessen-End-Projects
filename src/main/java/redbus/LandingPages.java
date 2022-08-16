package redbus;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LandingPages {
	Actions actions;
	
	@FindBy(id = "src")
	private WebElement sourceCity;
	
	@FindBy(id = "dest")
	private WebElement destCity;
	
	@FindBy(xpath = "//table[contains(@class, 'rb-monthTable')]/tbody[1]/tr[6]/td[6]")
	private WebElement dateSelect;
	
	@FindBy(id = "search_btn")
	private WebElement searchBtn;
	
	@FindBy(xpath = "//div[contains(@class, 'button view-seats fr')]")
	private WebElement viewSeatsBtn;
	
	@FindBy(xpath = "//div[contains(@class, 'modalClose')][1]/i[1]")
	private WebElement closePopUp;
	
	public LandingPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}

	public void clickSourceCity() throws InterruptedException {
		sourceCity.click();
		sourceCity.clear();
		sourceCity.sendKeys("Sion, Mumbai");
		Thread.sleep(1000);
		sourceCity.sendKeys(Keys.RETURN);
		Thread.sleep(1000);
	}
	
		
	public void clickDestCity() throws InterruptedException {
		destCity.click();
		destCity.clear();
		destCity.sendKeys("Kashmiri Gate, Delhi");
		Thread.sleep(1000);
	    destCity.sendKeys(Keys.RETURN);
	    Thread.sleep(1000);
	}
	
	public void clickDateSelect() {
		dateSelect.click();
	}

	public void clickSearchBtn() {
		searchBtn.click();
	}
	
	public void clickViewSeatsBtn() {
		viewSeatsBtn.click();
	}
	
	public void clickClosePopUp() {
		closePopUp.click();
	}
}
