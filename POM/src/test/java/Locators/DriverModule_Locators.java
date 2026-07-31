package Locators;

import org.openqa.selenium.By;

public class DriverModule_Locators {
	
	public static final By Drivers=By.xpath("//span[text()='Drivers']");
	public static final By DriverList=By.xpath("//a[text()='Drivers List']");
	public static final By DriverName=By.xpath("//input[@id='name']");
	public static final By DriverType=By.xpath("//select[@id='captain_type']");
	public static final By AdminStatus=By.xpath("//select[@id='admin_status']");
	public static final By HideStatus=By.xpath("//select[@id='driver_hidden']");
	public static final By FilterResults=By.xpath("//button[contains(text(),'Filter Results ')]");
	
	

}
