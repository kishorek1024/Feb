package packone;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertss {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("proceed")).click();
		
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(5000);
		a.dismiss();
		
		/*System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();*/

	}

}
