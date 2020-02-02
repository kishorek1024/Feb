package packone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synch {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Email")).sendKeys("kishore.k1024");
		driver.findElement(By.id("next")).click();
		
		WebDriverWait ww=new WebDriverWait(driver, 20);
		//ww.until(ExpectedConditions.urlContains("dfghjkhljk"));
		ww.until(ExpectedConditions.titleContains("abcd"));
		ww.until(ExpectedConditions.numberOfElementsToBe(By.tagName("a"), 50));
		ww.until(ExpectedConditions.numberOfElementsToBeLessThan(By.tagName("img"), 10));
		ww.until(ExpectedConditions.elementToBeClickable(By.id("ok")));
		//Thread.sleep(20000);
		driver.findElement(By.id("Passwd")).sendKeys("abcdefgh");

	}

}
