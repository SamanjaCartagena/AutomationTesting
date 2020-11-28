package theInternet;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.PageObjectBase;

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
		WebElement gallery;
	/*	driver.findElement(By.xpath("//a[text()='Home']")).click();
		Thread.sleep(400);
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(400);
		driver.findElement(By.xpath("//a[text()='About']")).click();
		Thread.sleep(400);
		driver.navigate().back();
		driver.navigate().refresh();

		Thread.sleep(400);
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		Thread.sleep(400);
		driver.navigate().back();
		Thread.sleep(400);
		driver.findElement(By.xpath("//a[text()='Portfolio']")).click();
		Thread.sleep(400);
		driver.navigate().back();
		**/
		List<WebElement> li = driver.findElements(By.tagName("li"));
        
		if(li.size()<5) {
			driver.navigate().refresh();
		}
		else {
         gallery =driver.findElement(By.xpath("//a[text()='Gallery']"));
    	 
    	 
    		gallery.click();
    //	  }
		}	
    	  
    	 
        
	}		
}
