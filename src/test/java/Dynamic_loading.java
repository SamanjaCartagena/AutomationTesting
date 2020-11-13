import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import framework.PageObjectBase;

public class Dynamic_loading extends PageObjectBase{

	protected Dynamic_loading(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
	
	 @FindBy(id="content")
	   WebElement btn;
		public Dynamic_loading navigate() {
		       super.navigate("/dynamic_loading");
				return this;
			}
		
		public void btnClick() throws InterruptedException {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[text()='Example 1: Element on page that is hidden']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()='Start']")).click();
			Thread.sleep(4000);
			driver.navigate().back();
			

			driver.findElement(By.xpath("//a[text()='Example 2: Element rendered after the fact']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()='Start']")).click();
			Thread.sleep(4000);
			driver.navigate().back();
			


		}
		
			
	}

