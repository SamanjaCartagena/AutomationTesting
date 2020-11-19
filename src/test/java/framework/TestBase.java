package framework;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TestBase {
	protected ChromeDriver webDriver;
	protected String baseUrl;

	protected void beforeTest() {
		LoadConfigurations();
	}

	protected void afterTest() {
		this.webDriver.quit();
	}
	
	private void LoadConfigurations() {
		URL url = ClassLoader.getSystemResource("chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", url.getFile());

		this.webDriver = new ChromeDriver();

		HashMap<String, String> configs = null;

		try {
			configs = new ConfigurationProvider().getPropertiesFromResourceFile("config.properties");
		} catch (IOException e) {
			throw new RuntimeException("Config file does not exist.");
		}

		this.baseUrl = configs.get(ConfigurationParameters.Url);		
	}
}