package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElements {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("Kishore");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("kumar");
		driver.findElement(By.id("email")).clear();
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("Kishore");
		email.clear();
		email.sendKeys("Kumar");
		
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("abcdefgh");
		pwd.clear();

	}

}
