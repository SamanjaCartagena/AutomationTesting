import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
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
  
  @Test
	public void canInputNumbers() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 String baseUrl ="http://the-internet.herokuapp.com/";
		int expectedNumber = 2;

		int actualNumber = new InputPage(driver, baseUrl)
				.navigate()
				.setInputValue(expectedNumber)
				.getInputValue();

		Assert.assertEquals(actualNumber, expectedNumber);
	}
  
  @Test
  public void formAuthenticate() {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com/";
	 
	 		
	 //Act
      FormAuthentication form= new FormAuthentication(driver,url);    	
    	form.navigate()
    	.login("samanja", "1234");
    	
	 //Assert
  }
  @Test
  public void basicAuth() {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com";
	 
	 //Act
      BasicAuth a = new BasicAuth(driver,url);
          a.navigate()
          .enterData("admin", "admin");
          
    	
	 //Assert
  }
  @Test
  public void forgotPass() {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com";
	 
	 //Act
     ForgotPassword f= new ForgotPassword(driver,url);
     f.navigate()
     .enterEmail("c.samanja09@gmail.com");
          
    	
	 //Assert
  }
  
  @Test
  public void addRemove() throws InterruptedException {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com";
	 
	 //Act
	 Addremove ar= new Addremove(driver,url);
			 
     ar.navigate()
     .btnClick();
    	
	 //Assert
  }
  @Test
  public void challening() throws InterruptedException {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com";
	 
	 //Act
	 ChallengingDom c= new ChallengingDom(driver,url);
			 
     c.navigate()
    .challenge();
    	
	 //Assert
  }
  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
