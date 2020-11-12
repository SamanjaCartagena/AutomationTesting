import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class File_Upload extends PageObjectBase{
	protected File_Upload(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
	
    @FindBy(id="file-upload")
    WebElement fileUpload;
    @FindBy(id="file-submit")
    WebElement fileSubmit;
	public File_Upload navigate() {
	       super.navigate("/upload");
			return this;
		}
	
	public void findFile() throws InterruptedException {
		fileUpload.sendKeys("C:\\Users\\c.samanja09\\Desktop\\ManualTests\\case6.txt");
		String expectedFile = fileUpload.getAttribute("value");
		Thread.sleep(2000);
	    fileSubmit.click();
	}
}
