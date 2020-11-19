package theInternet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.PageObjectBase;

public class DragDrop extends PageObjectBase{

	protected DragDrop(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
  @FindBy(how=How.ID,using="column-a")
  WebElement box1;
  @FindBy(how=How.ID,using="column-b")
  WebElement box2;
  
	public DragDrop navigate() {
	       super.navigate("/drag_and_drop");
			return this;
		}
	
	public void dragdrop() throws InterruptedException {

		Actions builder = new Actions(driver);
		builder.dragAndDrop(box1, box2).build().perform();
		Thread.sleep(400);
      //  builder.dragAndDrop(box2, box1).build().perform();
	}
	
		


}
