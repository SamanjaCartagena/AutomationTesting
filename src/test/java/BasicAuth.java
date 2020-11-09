import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.page.model.Frame;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BasicAuth extends PageObjectBase {
    
	
	protected BasicAuth(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
	
	public BasicAuth navigate() {
	       super.navigate("/basic_auth");
                  
			return this;
		}
     
	public void enterData(String name, String pass) {
		Alert confirmAlert = driver.switchTo().alert();
		
	}
	
}
