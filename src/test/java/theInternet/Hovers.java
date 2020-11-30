package theInternet;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.PageObjectBase;

public class Hovers extends PageObjectBase {
	protected Hovers(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
	@FindBy(how=How.CLASS_NAME,using="figure")
	WebElement element;
	public Hovers navigate() {
	       super.navigate("/hovers");
			return this;
		}
	public void hovered() throws InterruptedException {
		List<WebElement> figure = driver.findElements(By.className("figure"));
		System.out.println(figure.size());
		
		for(int i=0; i<figure.size(); i++) {
			Thread.sleep(3000);
			figure.get(i).click();
		}

	/**	WebElement images= driver.findElement(By.class("figure"))
		Actions action = new Actions(driver);
		
		action.moveToElement(element).build().perform();
		**/
	}
	
}
