package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("html/body/div[2]/div[1]/div[2]/a[1]")).click();
		
		List<WebElement> links=driver.findElements(By.xpath("//select[@id='day']/preceding::a"));
		System.out.println(links.size());
		
		/*List<WebElement> elements=driver.findElements(By.xpath("//*[contains(@id,'d')]"));
		//System.out.println(elements.size());
		
		int i;
		for(i=0; i<elements.size(); i++){
			System.out.println(elements.get(i).getAttribute("id"));
		}*/

	}

}
