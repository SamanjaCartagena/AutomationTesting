package theInternet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.PageObjectBase;

public class ChallengingDom extends PageObjectBase{
	protected ChallengingDom(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
	@FindBy(how=How.CLASS_NAME,using="button")
	WebElement btn1;
	@FindBy(how=How.CLASS_NAME,using="button alert")
	WebElement btn2;
	@FindBy(how=How.CLASS_NAME,using="button success")
	WebElement btn3;
	
	public ChallengingDom navigate() {
	       super.navigate("/challenging_dom");
               
			return this;
		}
	
	public void challenge() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='baz']")).click();

		Thread.sleep(400);
		driver.findElement(By.xpath("//a[text()='qux']")).click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//a[text()='bar']")).click();
		
	}
	
	
  

}
