package remoteTestingDocker.DockerValidation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*; 
public class Chromestanalonetest {
	
WebDriver driver = null;
	
	@BeforeClass 
	public void setup() throws MalformedURLException { 
		String browser = System.getProperty("browser");
	    System.out.println("BeforeSuite:Initiate database connection"); 
	    DesiredCapabilities cap = new DesiredCapabilities();
	    if (browser.contains("chrome")){
	    	cap.setBrowserName("chrome");
	    	URL url=new URL("http://localhost:4444/wd/hub");
			RemoteWebDriver driver = new RemoteWebDriver(url,cap);	
			driver.get("https://rancherdesktop.io/");
			System.out.println(driver.getTitle());
	    }
	    	
	} 
	public void code() throws MalformedURLException {
		// TODO Auto-generated method stub
		//ChromeOptions options = new ChromeOptions();
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		DesiredCapabilities cap = new DesiredCapabilities();
		
		URL u=new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(u,capabilities);		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
	}

}
