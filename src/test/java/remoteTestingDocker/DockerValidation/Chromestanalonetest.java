package remoteTestingDocker.DockerValidation;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*; 
public class Chromestanalonetest {
	
WebDriver driver = null;
	
public static void main(String[] args) throws MalformedURLException {
	// TODO Auto-generated method stub
	//ChromeOptions options = new ChromeOptions();
	FirefoxOptions options = new FirefoxOptions();
	DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	URL url=new URL("http://localhost:4442/wd/hub");
	RemoteWebDriver driver = new RemoteWebDriver(url,capabilities);		
	driver.get("https://www.google.com/");
	System.out.println(driver.getTitle());
	
	}
}
