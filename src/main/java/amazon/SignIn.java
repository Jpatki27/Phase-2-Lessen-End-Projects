package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	
	@FindBy (id = "ap_email")
	private WebElement email;
	
	
	@FindBy(id = "continue")
	private WebElement continueBtn;
	
	@FindBy(xpath = "//span[contains(@class,'a-list-item')]")
	private WebElement errMsg;
	
	public SignIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username)	{
		email.clear();
		email.sendKeys(username);
	}

	public void clickContinueBtn() {
	continueBtn.click();
	}
	
	public String getErrMsg()	{
		String errMsgTxt = errMsg.getText();
		return errMsgTxt;		
	}
	
	
}