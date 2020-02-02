package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Create Webelement for Companies Link
		// WebElement companies=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/a/div"));
		
		// Importing Actions Class
		Actions actions_Obj=new Actions(driver);
		
		driver.findElement(By.id("email")).sendKeys("Kishore");
		driver.findElement(By.id("pass")).sendKeys("abcdefgh");
		
		
		WebElement email=driver.findElement(By.id("email"));
		
		actions_Obj.contextClick(email).build().perform();
		
		int i;
		for(i=1; i<9; i++){
		actions_Obj.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		}
		actions_Obj.sendKeys(Keys.ENTER).build().perform();
		
		
		actions_Obj.dragAndDrop(email, email).build().perform();
		
		actions_Obj.clickAndHold(email).build().perform();
		actions_Obj.release().build().perform();
		
		/*WebElement login=driver.findElement(By.id("login"));
		
		actions_Obj.doubleClick(login).build().perform();*/
		
		/*actions_Obj.sendKeys(Keys.F5).build().perform();
		actions_Obj.sendKeys(Keys.CONTROL+"t").build().perform();*/
		
	//	driver.navigate().refresh();
		
		
		/*// Move focus to element
		actions_Obj.moveToElement(companies).build().perform();
		
		// Click on About Companies Link
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/div/ul/li[2]/a")).click();*/

	}

}
