package Locators;

import org.openqa.selenium.By;

public class changepassword_Locators {
	
	
	public static final By Accountsettings=By.xpath("//ul[contains(@class,'nav navbar-top-links navbar-right pull-right')]");
	//public static final By logout=By.xpath("//a[@data-toggle='dropdown']");
	public static final By changepwd=By.xpath("//div[contains(@class,'mail-contnet')]//h5[contains(text(),'Change Password')]");
    public static final By pwd=By.xpath("//input[@id='password']");
    public static final By newpwd=By.xpath("//input[@id='new_password']");
    public static final By confirmpwd=By.xpath("//input[@id='confirm_password']");
    public static final By Updateprofile_btn=By.xpath("//button[text()='Update profile']");
}
