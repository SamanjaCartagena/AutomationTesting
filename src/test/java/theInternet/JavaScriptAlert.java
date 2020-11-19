package theInternet;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.PageObjectBase;

public class JavaScriptAlert extends PageObjectBase{
	protected JavaScriptAlert(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
   
	public JavaScriptAlert navigate() {
	       super.navigate("/javascript_alerts");
			return this;
		}

	public void jsAlerts() throws InterruptedException {
		WebElement js1= driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		js1.click();
		
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(1000);
		WebElement js2= driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		js2.click();
		Thread.sleep(1000);
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		Thread.sleep(1000);
		js2.click();
		Alert a3 = driver.switchTo().alert();
		a3.dismiss();
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		WebElement js3= driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		js3.click();
		Alert a2 = driver.switchTo().alert();
		a2.accept();
		
	}
}
