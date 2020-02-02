package packtwo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import packone.PO_HomePage;

public class Sample {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		PO_HomePage p=PageFactory.initElements(driver, PO_HomePage.class);
		p.uid1.sendKeys("dfghjk");
		

	}

}
