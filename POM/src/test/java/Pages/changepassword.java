package Pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Locators.changepassword_Locators;
import Utilities.Generalutility;

public class changepassword {
	
	WebDriver driver;
	WebDriverWait wait;
	Generalutility gl;
	
	public changepassword(WebDriver driver) {
		
		this.driver=driver;
		
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	

	public void updatepwd() throws IOException {
		wait.until(ExpectedConditions.elementToBeClickable(changepassword_Locators.Accountsettings)).click();
		//wait.until(ExpectedConditions.elementToBeClickable(changepassword_Locators.logout)).click();
		wait.until(ExpectedConditions.elementToBeClickable(changepassword_Locators.changepwd)).click();
		WebElement pwdele=driver.findElement(changepassword_Locators.pwd);
		pwdele.sendKeys("themeeride");
		WebElement newpwdele=driver.findElement(changepassword_Locators.newpwd);
		newpwdele.sendKeys("Ajay@1217");
		WebElement confirmpwdele=driver.findElement(changepassword_Locators.confirmpwd);
		confirmpwdele.sendKeys("Ajay@1217");
		gl=new Generalutility(driver);
		gl.screenshot("changepassword");
		driver.findElement(changepassword_Locators.Updateprofile_btn).click();
		gl.screenshot("changepassword screeshot");
	}

}
