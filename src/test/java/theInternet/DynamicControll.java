package theInternet;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
		
	int j=0;
	while(j!=2) {
		List<WebElement> li = driver.findElements(By.tagName("button"));

	for(int i=0; i<li.size(); i++) {
		
		li.get(i).click();
	
	}
//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	j++;
	
	}

	}
	


}
