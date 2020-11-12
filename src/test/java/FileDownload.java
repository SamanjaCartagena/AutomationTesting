import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileDownload extends PageObjectBase{
	protected FileDownload(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
	public FileDownload navigate() {
	       super.navigate("/download");
			return this;
		}

	
	public void fileDown() {
		driver.findElement(By.cssSelector(".example a")).click();
	}
}
