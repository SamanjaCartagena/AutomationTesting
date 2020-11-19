package theInternet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import framework.PageObjectBase;

public class ForgotPassword extends PageObjectBase{
	
	
	protected ForgotPassword(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
    @FindBy(id="email")
    WebElement email;
    @FindBy(id="form_submit")
    WebElement subBtn;
    
    public ForgotPassword navigate() {
        super.navigate("/forgot_password");
 		return this;
 	}
 	public void enterEmail(String e) {
 		email.sendKeys(e);
 		subBtn.submit();
 	}
}
