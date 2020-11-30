package theInternet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import framework.PageObjectBase;

public class Frames extends PageObjectBase {
	protected Frames(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="mce_0_ifr")
	WebElement iframe;
	public Frames navigate() {
	       super.navigate("/frames");
			return this;
		}
	
	public void checkFrame() throws InterruptedException  {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='iFrame']")).click();
	
		iframe.sendKeys("   Hi How are you doing?");
		
	}
}
