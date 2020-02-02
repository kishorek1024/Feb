package grid;

import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_Sample {

	public static void main(String[] args) throws Exception{
		
	   URL u=new URL("http://localhost:6666/wd/hub");
	   
	   DesiredCapabilities d=new DesiredCapabilities().firefox();
	   
	   RemoteWebDriver r=new RemoteWebDriver(u, d);
	   
	   WebDriver driver=r;
	   
	   driver.get("http://facebook.com");
	   driver.manage().window().maximize();
	   System.out.println(driver.getTitle());
	   
	  // RemoteWebDriver r1=new RemoteWebDriver(new URL(""), new DesiredCapabilities().firefox());
	   

	}

}
