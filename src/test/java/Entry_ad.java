import java.awt.image.AreaAveragingScaleFilter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Entry_ad extends PageObjectBase {
	protected Entry_ad(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="modal")
	WebElement surprise;
	@FindBy(id="content")
	WebElement area;
	@FindBy(id="restart-ad")
	WebElement clicking;
	public Entry_ad navigate() {
	       super.navigate("/entry_ad");
			return this;
		}
	
	public void modal1() {
		
		clicking.click();
    if(surprise.isDisplayed()) {
    	Actions a = new Actions(driver);
    System.out.println(a);
    }
 System.out.println("===========================");
     
}

}