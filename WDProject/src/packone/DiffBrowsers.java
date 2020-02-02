package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DiffBrowsers {

	public static void main(String[] args) {
		
		/*WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();*/
		
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\WD10Dec\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();*/
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\DELL\\Desktop\\WD10Dec\\Jars\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://yahoomail.com");
		driver.manage().window().maximize();
		
		

	}

}
