
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DisappearingElements extends PageObjectBase {

	protected DisappearingElements(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
   
	public DisappearingElements navigate() {
	       super.navigate("/disappearing_elements");
			return this;
		}
	
	public void btnClick() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		Thread.sleep(400);
		driver.navigate().back();
		Thread.sleep(400);
		driver.findElement(By.xpath("//a[text()='About']")).click();
		Thread.sleep(400);
		driver.navigate().back();
		Thread.sleep(400);
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		Thread.sleep(400);
		driver.navigate().back();
		Thread.sleep(400);
		driver.findElement(By.xpath("//a[text()='Portfolio']")).click();
		Thread.sleep(400);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Gallery']")).click();
		Thread.sleep(400);
		driver.navigate().back();

	}
	
		
}
