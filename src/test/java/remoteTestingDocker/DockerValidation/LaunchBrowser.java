package remoteTestingDocker.DockerValidation;

import org.testng.annotations.Test;


import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.AfterClass;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class LaunchBrowser {
	public static RemoteWebDriver driver=null;
	@Parameters({ "browser" }) // Used TestNg parameterization concept 
	@BeforeClass 
	public void opendriver(String browser)  throws MalformedURLException { 
		System.out.println("browser passed as :- " + browser);
		if(browser.equalsIgnoreCase("Chrome")) {
			ChromeOptions options = new ChromeOptions();
			URL u=new URL("http://localhost:4444/wd/hub");
			//URL u=new URL("http://localhost:4441/wd/hub");
			driver = new RemoteWebDriver (u,options);	
		}
		if(browser.equalsIgnoreCase("firefox")) {
			FirefoxOptions foptions =new FirefoxOptions();
			URL u=new URL("http://localhost:4444/wd/hub");
			//URL u=new URL("http://localhost:4442/wd/hub");
			driver = new RemoteWebDriver(u,foptions);	
			}
		if(browser.equalsIgnoreCase("Edge")) {
			EdgeOptions Eoptions =new EdgeOptions();
			URL u=new URL("http://localhost:4444/wd/hub");
			//URL u=new URL("http://localhost:4442/wd/hub");
			driver = new RemoteWebDriver(u,Eoptions);	
			}
	} 
  @AfterClass
  public void terminateBrowser(){
      driver.close();			///Closing browser
	}
}
