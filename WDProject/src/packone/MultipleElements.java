package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleElements {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
	    Point a=driver.findElement(By.id("email")).getLocation();
	    
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		int i;
		
		for(i=0; i<links.size(); i++){
			System.out.println(links.get(i).getText() + "-" + links.get(i).getAttribute("href"));
			
			
			//System.out.println(links.get(i).getText());
			/*String linkname=links.get(i).getText();
			if(linkname.startsWith("P")==true)
				System.out.println(linkname);*/
		}
		
		//System.out.println(links.size());
		
		
		
		

	}

}
































