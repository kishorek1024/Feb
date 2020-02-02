package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTabless {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://money.rediff.com/sectors/bse/infra");
		driver.manage().window().maximize();
		
		WebElement header=driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/thead/tr"));
		List<WebElement> columns=header.findElements(By.tagName("th"));
		
		int i;
		for(i=1; i<=columns.size(); i++){
			System.out.println(header.findElement(By.xpath("th[" + i + "]")).getText());
		}
		
		//System.out.println(driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody/tr[5]/td[3]")).getText());

		/*List<WebElement> r=driver.findElements(By.tagName("tr"));
		System.out.println(r.size());
		
		WebElement table=driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		int i;
		
		String xpath1="tr[";
		String xpath2="]/td[1]/a";
		
		for(i=1; i<=rows.size(); i++){
			//System.out.println(table.findElement(By.xpath("tr[" + i + "]/td[1]/a")).getText());
			System.out.println(table.findElement(By.xpath(xpath1+i+xpath2)).getText());
		}*/
		
		
		
		
		
		/*System.out.println(rows.size());
		
		List<WebElement> rr=driver.findElements(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody/descendant::tr"));
		System.out.println(rr.size());*/
		
	}

}
