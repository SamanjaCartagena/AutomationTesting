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
		
     if(modalId.isDisplayed()== true) {
    		 System.out.println("This is a modal window");
    		 String title=""+modalClass.getText();
    		 System.out.println(title);
    		 Thread.sleep(1000);
    		 modalFooter.click();
    		Thread.sleep(2000);
    		restartBtn.click();
    		Thread.sleep(1000);
    		modalFooter.click();
    		
     }
    
     
   
 
    
     
 System.out.println("===========================");
     
}
	public void modal2() {
		restartBtn.click();
	}

}