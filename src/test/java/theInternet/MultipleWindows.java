package theInternet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.PageObjectBase;

public class MultipleWindows extends PageObjectBase{

	protected MultipleWindows(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
	
	public MultipleWindows navigate() {
	       super.navigate("/windows");
               
			return this;
		}
	
	public void mWindows() {
		WebElement clickLink = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickLink.click();
	    driver.navigate().to("http://the-internet.herokuapp.com/windows/new");
	    if(driver.getCurrentUrl().equals("http://the-internet.herokuapp.com/windows/new")) {
	    	System.out.println("Test Just Passed");
	    	System.out.println("This is the new window with title "+driver.getTitle());
	    }
	    else {
	    	System.out.println("Fails");
	    }
		
	}
}
