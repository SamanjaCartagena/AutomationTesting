package theInternet;
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
import framework.TestBase;
import foundation.TheInternetTestBase;
public class TheInternet extends TheInternetTestBase {
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
  //Works properly
  @Test
  public void formAuthenticate() {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com/";
	 
	 		
	 //Act
        new FormAuthentication(driver,url)
    	.navigate()
    	.login("samanja", "1234");

    
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
          .enterData("user", "admin");
          
    	
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
  //Works properly number 3
  @Test
  public void challenging() throws InterruptedException {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com";
	 
	 //Act
	 ChallengingDom c= new ChallengingDom(driver,url);
			 
     c.navigate()
    .challenge();
     
   
  }
  //number 5
  //Works properly
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
  //Works properly number 6
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
  
  //Works properly number 7
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
  
  //Works Number 9
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
  //Works properly Number 10
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
  //Does not work It worked before !! Number 11 :(
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

  //Works properly Number 14
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
     String cURL = driver.getCurrentUrl();
     Assert.assertEquals(cURL, "http://the-internet.herokuapp.com/upload");
  }
  //Number 17 Works properly
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
  //Works properly but I cannot make it slide to the max
  //Number 18
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
  //Works properly
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
  
  //Works properly
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
  //Works properly
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
  //Works properly
  @Test
  public void presses() throws InterruptedException {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com";
	 
	 //Act
	KeyPresses k= new KeyPresses(driver,url);
	k.navigate()
    .press();
	
  }
  //Works properly
  @Test
  public void redirectLink() throws InterruptedException {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com";
	 
	 //Act
	Redirector r= new Redirector(driver,url);
	r.navigate()
    .linking();
	
  }
  //Works properly
  @Test
  public void fileDown() throws InterruptedException {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com";
	 
	 //Act
	FileDownload r= new FileDownload(driver,url);
	r.navigate()
    .fileDown();
	
  }
//Works properly
  @Test
  public void forgot() throws InterruptedException {
	  //Arrange
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url ="http://the-internet.herokuapp.com";
	 
	 //Act
	ForgotPassword r= new ForgotPassword(driver,url);
	r.navigate()
    .enterEmail("c.samanja09@gmail.com");
	
  }
  
  //Works partially
  @Test
  public void demoqaSite() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 String url ="https://demoqa.com";
		 
		 //Act
	   Demoqa d = new Demoqa(driver,url);
	   d.navigate()
	   .formFilling();
		
	  }
	  
	  
  

	
  
  @BeforeTest
  public void beforeTest() {
	//  super.beforeTest();
	  
  }

  @AfterTest
  public void afterTest() {
	//  super.afterTest();
}

}
