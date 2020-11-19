package theInternet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import framework.PageObjectBase;

public class DynamicControll extends PageObjectBase{

	protected DynamicControll(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
   @FindBy(id="checkbox-example")
   WebElement frm;
	public DynamicControll navigate() {
	       super.navigate("/dynamic_controls");
			return this;
		}
	
	public void btnClick() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		Thread.sleep(400);
	



	}
	public void btnClick2() throws InterruptedException{
		driver.findElement(By.xpath("//button[text()='Add']")).click();

	}
		


}
