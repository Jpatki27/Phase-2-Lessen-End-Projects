package shopclues;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyNow {

	@FindBy(xpath = ("//html/body/div[5]/div[1]/div[1]/div[2]/div[2]/div[9]/button[2]"))
	private  WebElement buyNowBtn;
	
	public BuyNow(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public void clickBuyNowBtn() {
		
		buyNowBtn.click();
		
	}
}