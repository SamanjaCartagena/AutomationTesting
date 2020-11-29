package theInternet;

import java.sql.DriverAction;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.browser.Browser;
import org.openqa.selenium.support.FindBy;

import framework.PageObjectBase;

public class Demoqa extends PageObjectBase {
	protected Demoqa(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
	
	  @FindBy(id="firstName")
	   WebElement inputName1;
	  @FindBy(id="lastName")
	  WebElement inputName2;
	  @FindBy(id="userEmail")
	  WebElement email;
	  @FindBy(id="gender-radio-2")
	  WebElement wgender;
	  @FindBy(id="userNumber")
	  WebElement phone;
	  @FindBy(id="dateOfBirthInput")
	  WebElement birthdate;
	  @FindBy(id="city")
	  WebElement selectCity;
	  @FindBy(id="submit")
	  WebElement submitBtn;
		public Demoqa navigate() {
		       super.navigate("/automation-practice-form");
				return this;
			}

		
		public void formFilling() throws InterruptedException {
			inputName1.sendKeys("Samanja");
			inputName2.sendKeys("Cartagena");
			email.sendKeys("c.samanja09@gmail.com");
			 WebElement radio = driver.findElement(By.xpath("//input[@id='gender-radio-2']"));
			 ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radio);
		 
			phone.sendKeys("827346872346723");
			birthdate.sendKeys(Keys.CLEAR);
			Thread.sleep(1000);
			birthdate.sendKeys("9 June 1988");
			selectCity.isEnabled();
        
			List<WebElement> inputs = driver.findElements(By.tagName("input"));
			for (WebElement input : inputs) {
			    ((JavascriptExecutor) driver).executeScript(
			                "arguments[0].removeAttribute('disabled','disabled')",input);
			}
          submitBtn.submit();

			
			
		}
}
