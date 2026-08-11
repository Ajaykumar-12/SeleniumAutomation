package Utilities;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import Base.baseclass;
import Locators.changepassword_Locators;

public class Generalutility extends baseclass {
	
	WebDriverWait wait;

	public Generalutility(WebDriver driver) {
		this.driver=driver;
		
		 wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	public void screenshot(String name) throws IOException {
	
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\hp\\git\\repository\\POM\\Screeshots\\"+name+".png");
		Files.copy(src, dest);
		
	}
}
