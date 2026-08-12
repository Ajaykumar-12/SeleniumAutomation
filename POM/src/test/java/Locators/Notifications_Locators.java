package Locators;

import org.openqa.selenium.By;

public class Notifications_Locators {
	
	
	public static final By alert=By.xpath("//span[contains(@class,'hide-menu') and contains(text(),'Alerts')]");
	public static final By notification=By.xpath("//li[contains(@class,'active')]//li//a[contains(text(),'Notifications')]");
    
}
