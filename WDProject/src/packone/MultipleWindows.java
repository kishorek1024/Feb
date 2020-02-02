package packone;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		// Click on DataPolicy Link
		driver.findElement(By.id("privacy-link")).click();
		// CLick on Cookie Policy Link
		driver.findElement(By.id("cookie-use-link")).click();
		
		// Counting Numbar Of Windows
		Set<String> a=driver.getWindowHandles();
		ArrayList windows=new ArrayList(a);
		
		int i;
		
		for(i=0; i<windows.size(); i++){
			System.out.println(driver.switchTo().window((String)windows.get(i)).getTitle());
			List<WebElement> links=driver.switchTo().window((String)windows.get(i)).findElements(By.tagName("a"));
			System.out.println(links.size());
			driver.switchTo().window((String)windows.get(i)).close();
		}
		
		WebDriver driver1=driver.switchTo().window((String)windows.get(i));

	}

}
