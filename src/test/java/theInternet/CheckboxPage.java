package theInternet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import framework.PageObjectBase;



public class CheckboxPage extends PageObjectBase {

	public CheckboxPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
	
	@FindBy(id="checkboxes")
	WebElement checkboxElement;
	
	public CheckboxPage navigate() {
		super.navigate("/checkboxes");
		
		return this;
	}

	public CheckboxPage selectCheckboxes(String[] boxesToCheck, boolean isChecked) {
		new CheckboxControlExtension(checkboxElement, driver).setByLabel(boxesToCheck, isChecked);

		return this;
	}

	public String[] getSelectedCheckboxes() {
		return new CheckboxControlExtension(checkboxElement, driver).getLabelsForChecked();
	}
}