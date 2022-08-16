package shopclues;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products {
	
	@FindBy(xpath = "(//div[contains(@id, 'product')]/div[3]/div[1]/a[2])")
	private WebElement firstProduct;
	
	public Products(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickFirstProduct() {
		firstProduct.click();
	}

}