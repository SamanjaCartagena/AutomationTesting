package theInternet;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import framework.PageObjectBase;

public class Addremove extends PageObjectBase {

	protected Addremove(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
   @FindBy(id="content")
   WebElement btn;
	public Addremove navigate() {
	       super.navigate("/add_remove_elements/");
			return this;
		}
	
	public void btnClick() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Add Element']")).click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//button[text()='Delete']")).click();

	}
	
		
}
