package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITT {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://transfer.pcloud.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='recipients']/div/div/div[1]/div[3]/input")).sendKeys("lokeshpavan09@gmail.com");
		driver.findElement(By.xpath("//*[@id='sendermail']")).sendKeys("kishore.k1024@gmail.com");
		driver.findElement(By.xpath("//*[@id='message']")).sendKeys("Hi");
		driver.findElement(By.xpath("//*[@id='ppaccepted']")).click();
				
		
		driver.findElement(By.xpath("//img[@src='//pcdn-transfer.pcloud.com/Zfb/img/add_files_ico.png']")).click();
		Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\WD8Nov\\1226.exe");

		driver.findElement(By.xpath("//*[@id='begin-transfer']")).click();
	}

}
