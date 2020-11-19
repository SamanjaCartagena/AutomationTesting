package theInternet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import framework.PageObjectBase;

public class DropDownPage extends PageObjectBase {

	
	
	public DropDownPage(WebDriver driver, String url) {
		super(driver,url);
		
	}
	
	
	
	@FindBy(id="dropdown")
	WebElement dropDownList;
	public DropDownPage navigate() {
       super.navigate("/dropdown");
		return this;
	}
	public DropDownPage select(String selection) {
	    new Select(dropDownList).selectByVisibleText(selection);
		return this;
	}
	
	public String getOption() {
		
		return new Select(dropDownList).getFirstSelectedOption().getText();
	}
}
