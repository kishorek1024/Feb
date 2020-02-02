package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_HomePage {

	// Firsy Way
	/*public By uid=By.id("email");
	public By pwd=By.id("pass");*/
	
	public @FindBy(id="email") WebElement uid1;
	@FindBy(id="pass") WebElement pwd1;
	@FindBy(xpath="//a[@href='https://www.facebook.com/recover/initiate?lwv=110&ars=royal_blue_bar']") WebElement link;
	
	
	
}
