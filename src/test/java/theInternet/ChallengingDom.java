package theInternet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;

import framework.PageObjectBase;

public class ChallengingDom extends PageObjectBase{
	protected ChallengingDom(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
	
	public ChallengingDom navigate() {
	       super.navigate("/challenging_dom");
               
			return this;
		}
	
	public void challenge() throws InterruptedException {
		for(int i=0; i<3; i++) {
		driver.findElement(By.className("button")).click();
	//	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
		}
	}
	
	
  

}
