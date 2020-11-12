

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Hovers extends PageObjectBase {
	protected Hovers(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
	@FindBy(how=How.CLASS_NAME,using="figure")
	WebElement element;
	public Hovers navigate() {
	       super.navigate("/hovers");
			return this;
		}
	public void hovered() throws InterruptedException {
		Actions action = new Actions(driver);
		
		action.moveToElement(element).build().perform();
	}
	
}
