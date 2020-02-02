package packone;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class CallingPO {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\DELL\\Desktop\\WD10Dec\\0128.png"));
		
		
		/*PO_HomePage p=PageFactory.initElements(driver, PO_HomePage.class);
		p.uid1.sendKeys("Kishore");
		p.pwd1.sendKeys("abcdefgh");
		p.link.click();
		
		PO_Registration reg=PageFactory.initElements(driver, PO_Registration.class);
		reg.email1.sendKeys("Kishore");*/
		
		
		
		
		/*PO_HomePage po=new PO_HomePage();
		
		driver.findElement(po.uid).sendKeys("Kishore");
		driver.findElement(po.pwd).sendKeys("abcdefgh");*/
		
		

	}

}
