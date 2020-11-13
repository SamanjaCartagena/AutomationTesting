import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
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
  @Test
  public void context() throws InterruptedException {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com";
	 
	 //Act
	 ContextMenu c= new ContextMenu(driver,url);
			 
     c.navigate()
     .popUp();
    	
	 //Assert
  }
  @Test
  public void disappear() throws InterruptedException {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com";
	 
	 //Act
	 DisappearingElements d= new DisappearingElements(driver,url);
			 
     d.navigate()
     .btnClick();
    	
	 //Assert
  }
  @Test
  public void drag() throws InterruptedException {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com";
	 
	 //Act
	 DragDrop d= new DragDrop(driver,url);
			 
     d.navigate()
     .dragdrop();
    	
	 //Assert
  }
  @Test
  public void onClick() throws InterruptedException {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com";
	 
	 //Act
	 DynamicControll d= new DynamicControll(driver,url);
			 
     d.navigate()
     .btnClick();
	 //Assert
  }
  @Test
  public void dynamic() throws InterruptedException {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com";
	 
	 //Act
	 Dynamic_loading d= new Dynamic_loading(driver,url);
			 
     d.navigate()
     .btnClick();
	 //Assert
  }
  @Test
  public void modaldialogue() throws InterruptedException {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com";
	 
	 //Act
    Entry_ad e = new Entry_ad(driver,url);
     e.navigate()
     .modal1();
	 //Assert
  }
  @Test
  public void file() throws InterruptedException {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com";
	 
	 //Act
    Entry_ad e = new Entry_ad(driver,url);
     e.navigate()
     .modal1();
	 //Assert
  }
  
  @Test
  public void fileUp() throws InterruptedException {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com";
	 
	 //Act
     File_Upload f = new File_Upload(driver,url);
     f.navigate()
     .findFile();
  }
  
  @Test
  public void checkFrame() throws InterruptedException {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com";
	 
	 //Act
     Frames f = new Frames(driver,url);
     f.navigate()
     .checkFrame();
  }
  @Test
  public void slid() throws InterruptedException {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com";
	 
	 //Act
   HorizontalSlider hs= new HorizontalSlider(driver,url);
   hs.navigate()
   .slide();
  }
  
  @Test
  public void hove() throws InterruptedException {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com";
	 
	 //Act
   Hovers h= new Hovers(driver,url);
   h.navigate()
   .hovered();
  }
  @Test
  public void jsalert() throws InterruptedException {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com";
	 
	 //Act
	 JavaScriptAlert js= new JavaScriptAlert(driver,url);
   js.navigate()
   .jsAlerts();
  }
  @Test
  public void open() throws InterruptedException {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com";
	 
	 //Act
	MultipleWindows mw= new MultipleWindows(driver,url);
	mw.navigate()
	.mWindows();
	
  }
  
	
  
  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
