package theInternet;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  //Arrange
	  //Act
	  //Assert
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="https://www.google.com/";
	 driver.navigate().to(url);
	 String currentURL = driver.getCurrentUrl();
	 Assert.assertEquals(currentURL, url);
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
