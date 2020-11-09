import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes extends TheInternet {

	@Test
	public void canUnCheck() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 String url ="http://the-internet.herokuapp.com/";
		String[] boxesToUnCheck = { "checkbox 2" };
		String[] boxesToCheck = { "checkbox 1" };

		String[] selectedCheckboxes = new CheckboxPage(driver, url)
				.navigate()
				.selectCheckboxes(boxesToCheck, true)
				.selectCheckboxes(boxesToUnCheck, false)
				.getSelectedCheckboxes();

		Assert.assertEquals(boxesToCheck, selectedCheckboxes);
	}
	
	@Test
	public void canToggle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 String url ="http://the-internet.herokuapp.com/";
		String[] boxesToCheck = { "checkbox 1", "checkbox 2" };

		String[] selectedCheckboxes = new CheckboxPage(driver, url)
				.navigate()
				.selectCheckboxes(boxesToCheck, true)
				.selectCheckboxes(boxesToCheck, false)
				.getSelectedCheckboxes();

		Assert.assertEquals(selectedCheckboxes.length, 0);
	}

	@BeforeTest
	public void beforeTest() {
		super.beforeTest();
	}

	@AfterTest
	public void afterTest() {
		super.afterTest();
	}
}