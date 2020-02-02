package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validations {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		String a=driver.findElement(By.id("email")).getAttribute("class");
		System.out.println(a);
		System.out.println(driver.findElement(By.id("email")).getTagName());
		System.out.println(driver.findElement(By.id("email")).getSize());
		System.out.println(driver.findElement(By.id("email")).getLocation());
		
		String b=driver.getTitle();
		System.out.println(b);
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("");
		
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		//driver.manage().window().setSize("");
		
		/*driver.findElement(By.id("email")).sendKeys("Kishore");
		boolean a=driver.findElement(By.id("pass")).isDisplayed();
		if(a==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		boolean b=driver.findElement(By.id("pass")).isEnabled();
		if(b==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");*/

	}

}
