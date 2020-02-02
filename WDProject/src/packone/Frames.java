package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		
		WebElement f1=driver.findElement(By.name("packageListFrame"));
		WebElement f2=driver.findElement(By.name("packageFrame"));
		
		List<WebElement> links=driver.switchTo().frame(f1).findElements(By.tagName("a"));
		
		int i;
		
		for(i=1; i<links.size(); i++){
			links.get(i).click();			
			driver.switchTo().parentFrame();
			List<WebElement> l=driver.switchTo().frame(f2).findElements(By.tagName("a"));
			System.out.println(l.size());	
			driver.switchTo().parentFrame();
			driver.switchTo().frame(f1);
		}
		
		
		//List<WebElement> frames=driver.findElements(By.tagName("frame"));
		
		
		
		/*int i; int j;
		
		
		for(i=0; i<frames.size(); i++){
			List<WebElement> links=driver.switchTo().frame(i).findElements(By.tagName("a"));
			for(j=0; j<links.size(); j++){
				System.out.println(links.get(j).getText());
			}
			System.out.println("--------------------------------------");
			driver.switchTo().parentFrame();
		}*/
		
		/*WebElement f1=driver.findElement(By.name("packageListFrame"));
		driver.switchTo().frame(f1).findElement(By.xpath("/html/body/div[2]/ul/li[1]/a")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/ul/li[1]/a"));
		
		driver.switchTo().parentFrame();
		
		WebElement f2=driver.findElement(By.name("packageFrame"));
		driver.switchTo().frame(f2).findElement(By.xpath("/html/body/div/ul[1]/li[2]/a/i")).click();*/

		
	}

}
