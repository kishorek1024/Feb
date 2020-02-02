package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {
	public WebDriver driver;
	
	public void launchApp(String url){
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void closeApp(){
		driver.close();
	}
	public void elementAvailable(String elementLoc, boolean exp){
		boolean a=driver.findElement(By.id(elementLoc)).isDisplayed();
		if(a==exp)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
	public void elementsCount(String loc, int exp){
		List<WebElement> elements=driver.findElements(By.tagName(loc));
		if(elements.size()==exp)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}

}
