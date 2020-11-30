package theInternet;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import framework.PageObjectBase;

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
		Alert a= driver.switchTo().alert();
	  a.sendKeys("user");
	  a.sendKeys("admin");
	  a.accept();
		
		
	}
	
}
