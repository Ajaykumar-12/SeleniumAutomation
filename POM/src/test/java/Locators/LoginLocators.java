package Locators;

import org.openqa.selenium.By;

public class LoginLocators {
	
	public static final By username=By.cssSelector("input#username");
	public static final By pwd=By.cssSelector("input#password");
	public static final By button=By.xpath("//button[text()='Log In']");

}
