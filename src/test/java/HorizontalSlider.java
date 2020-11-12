



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSlider extends PageObjectBase{
	
	protected HorizontalSlider(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
	
	public HorizontalSlider navigate() {
	       super.navigate("/horizontal_slider");
			return this;
		}

	public void slide() {
		WebElement min= driver.findElement(By.xpath("//input[@min='0.0']"));
		WebElement max= driver.findElement(By.xpath("//input[@max='5.0']"));
	WebElement slider=driver.findElement(By.xpath("//input[@type='range']"));
	Actions a = new Actions(driver);
	Action action= a.dragAndDrop(min,max).build();
	action.perform();
	
	}
}
