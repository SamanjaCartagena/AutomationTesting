package theInternet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.PageObjectBase;

public class FormAuthentication extends PageObjectBase {

	protected FormAuthentication(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="username")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="login")
	WebElement submitBtn;
	@FindBy(how=How.ID,using="flash")
	WebElement message;
	public FormAuthentication navigate() {
       super.navigate("/login");
		return this;
	}
	
	
	public void login(String uid, String pass) {
		username.sendKeys(uid);
		password.sendKeys(pass);
		submitBtn.submit();
		
	}
	


}
