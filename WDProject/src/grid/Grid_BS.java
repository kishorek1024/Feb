package grid;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_BS {

	public static void main(String[] args) throws Exception{
		
		URL u=new URL("https://kiran593:i5NpTFUEEmhs72CXxs8v@hub-cloud.browserstack.com/wd/hub");

		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability("os", "WINDOWS");
		d.setCapability("os_version", "10");
		d.setCapability("browser", "Chrome");
		d.setCapability("browser_version", "79");
		d.setCapability("browserstack.debug", true);
		
		RemoteWebDriver r=new RemoteWebDriver(u, d);
		WebDriver driver=r;
		
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
