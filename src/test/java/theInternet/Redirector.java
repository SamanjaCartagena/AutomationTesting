package theInternet;
import org.openqa.selenium.WebDriver;

import framework.PageObjectBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Redirector extends PageObjectBase{
	protected Redirector(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="redirect")
	WebElement redirectLink;
	public Redirector navigate() {
	       super.navigate("/redirector");
			return this;
		}
	
	public void linking() throws InterruptedException {
		redirectLink.click();
		driver.navigate().to("http://the-internet.herokuapp.com/status_codes");
		Thread.sleep(2000);
		WebElement status200=driver.findElement(By.xpath("//a[text()='200']"));
		status200.click();
		Thread.sleep(1000);
	   driver.navigate().back();
		WebElement status301=driver.findElement(By.xpath("//a[text()='301']"));
		status301.click();
		Thread.sleep(1000);
		driver.navigate().back();
		WebElement status404=driver.findElement(By.xpath("//a[text()='404']"));
		status404.click();
		Thread.sleep(1000);
		driver.navigate().back();
		WebElement status500=driver.findElement(By.xpath("//a[text()='500']"));
		status500.click();
		Thread.sleep(1000);
		driver.navigate().back();



	   
	   
	}
	
	

}
