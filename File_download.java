import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.sql.Driver;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class File_download extends PageObjectBase{
	protected File_download(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
	
  WebDriver driver;
  File folder;
  @BeforeMethod
  public void beforeMethod() {
	  folder = new File(UUID.randomUUID().toString());
		folder.mkdir();
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.samanja09\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		 ChromeOptions options = new ChromeOptions();
		 String url ="http://the-internet.herokuapp.com/download";
		 Map<String, Object> prefs= new HashMap<String,Object>();
		 prefs.put("profile.default_content_settings.popups", 0);
		 prefs.put("download.default_directory",folder.getAbsolutePath());
		 
  }
  @Test
  public void f() {
		
	driver.findElement(By.cssSelector(".example a")).click();
	
  }
  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  
  }

}
