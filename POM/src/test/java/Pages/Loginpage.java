package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import Pages.Logoutpage;
import Base.baseclass;
import Locators.LoginLocators;
public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void Login() {
		driver.findElement(LoginLocators.username).sendKeys("themeeride");
		driver.findElement(LoginLocators.pwd).sendKeys("$@Meeride|@|2024^$");
		driver.findElement(LoginLocators.button).click();	
	}
}
