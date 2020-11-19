package theInternet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import framework.PageObjectBase;


public class InputPage extends PageObjectBase {

	public InputPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
	
	@FindBy(tagName="input")
	WebElement numericInput;

	public InputPage navigate() {
		super.navigate("/inputs");
		
		return this;
	}

	public InputPage setInputValue(int number) {
		numericInput.sendKeys(Integer.toString(number));

		return this;
	}

	public int getInputValue() {
		String numericInputValue = numericInput.getAttribute("value");
		
		return Integer.parseInt(numericInputValue);
	}
}
