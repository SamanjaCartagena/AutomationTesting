import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TheInternet {
  @Test
  public void f() {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com/";
	 //Act
	 driver.navigate().to(url);
	 String currentURL = driver.getCurrentUrl();
	 
	 //Assert
	 Assert.assertEquals(currentURL, url);
  }
  @Test
  public void canNavigateToIndexPage() {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com/";
	 String expectedPageTitle="The Internet";
	 //Act
	String actualPageTitle= new IndexPage(driver,url).navigate().getTitle();
	 
	 //Assert
	 Assert.assertEquals(actualPageTitle, expectedPageTitle);
  }
  @Test
  public void canSelectDropDownList() {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com/";
	 String expectedSelection="Option 2";
	 //Act
    String selectedOption = new DropDownPage(driver,url)
    		.navigate()
    		.select(expectedSelection)
    		.getOption();	 
	 //Assert
	 Assert.assertEquals(selectedOption, expectedSelection);
  }
  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
