package Pages;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Base.baseclass;
import Locators.Notifications_Locators;
import Utilities.Generalutility;
public class Alerts {
	WebDriver driver;
	Generalutility glu;
	//Constructor
	public Alerts(WebDriver driver) {
		this.driver=driver;
	}
	public void notificationalert() throws IOException{
		WebElement ele=driver.findElement(Notifications_Locators.alert);
		ele.click();
		WebElement ele1=driver.findElement(Notifications_Locators.notification);
		ele1.click();
		glu=new Generalutility(driver);
		glu.screenshot("Unable to delete notification");
	}
}
