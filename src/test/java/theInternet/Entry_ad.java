package theInternet;
import java.awt.image.AreaAveragingScaleFilter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.PageObjectBase;

public class Entry_ad extends PageObjectBase {
	protected Entry_ad(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="modal")
	WebElement modalId;
	@FindBy(how=How.CLASS_NAME,using="modal")
	WebElement modalClass;
	@FindBy(id="restart-ad")
	WebElement restartBtn;
	@FindBy(how=How.CLASS_NAME,using="modal-footer")
	WebElement modalFooter;
   
	public Entry_ad navigate() {
	       super.navigate("/entry_ad");
			return this;
		}

	public void modal1() throws InterruptedException {
		
    WebElement modalDialogue = driver.findElement(By.className("modal"));
   
    Actions action = new Actions(driver);
    action.moveToElement(modalDialogue).perform();
    modalFooter.click();		
	}
    
     
  
}