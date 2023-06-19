package remoteTestingDocker.DockerValidation;



import org.testng.Assert;
import org.testng.annotations.Test;

public class Googlepage extends LaunchBrowser{
	@Test(priority=1)
	public void verifygooglepage() throws InterruptedException{
		driver.get("https://www.google.com/");
		//String act_title = driver.get("https://www.google.com/");
		Assert.assertEquals(driver.getTitle(), "Google");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
	}
	@Test(priority = 2, dependsOnMethods = "verifygooglepage")
	public void verifyfacebookpage() throws InterruptedException{
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/");
		Assert.assertEquals(driver.getTitle(), "Facebook - log in or sign up");
		System.out.println(driver.getTitle());
	}
}
