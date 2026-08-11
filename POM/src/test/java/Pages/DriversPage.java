package Pages;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import Base.baseclass;
import Locators.DriverModule_Locators;

public class DriversPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public DriversPage(WebDriver driver){
		
		this.driver=driver;
		
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	
	//verify whether user able to click Drivers tab
	
	public void Driver_Tab() {
		WebElement driverstab=driver.findElement(DriverModule_Locators.Drivers);
		driverstab.click();
	}
	//verify whether user able to click Drivers list
	public void DriverList() {
		
		WebElement driverslist=driver.findElement(DriverModule_Locators.DriverList);
		driverslist.click();
	}
	
	//verify whether user able to enter name or mobile in name filed from drivers list
	
	public void Driver_Name() {
		
		WebElement name=driver.findElement(DriverModule_Locators.DriverName);
		name.sendKeys("Ajay");
	}
	
	public void Driver_Type() {
		
		WebElement list=driver.findElement(DriverModule_Locators.DriverType);
		WebElement list1=driver.findElement(DriverModule_Locators.AdminStatus);
		Select sel=new Select(list);
		Select sel1=new Select(list1);
		List<WebElement>opt=sel.getOptions();
		List<WebElement>opts=sel1.getOptions();
		for(int i=0;i<opt.size();i++) {
			for(int j=0;j<opts.size();j++) {
				if(opt.get(i).getText()!="-All-" && opts.get(j).getText()!="-All-") {
					sel.selectByVisibleText(opt.get(i+1).getText());
					sel1.selectByVisibleText(opts.get(j).getText());
					//wait.until(ExpectedConditions.elementToBeClickable(DriverModule_Locators.FilterResults)).click();
				}		
			}
		 }
      }
}
