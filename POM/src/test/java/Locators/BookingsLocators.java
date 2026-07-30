package Locators;

import org.openqa.selenium.By;

public class BookingsLocators {
	
	public static final By bookinglocator=By.xpath("//span[text()='Bookings']");
	public static final By bookingopt=By.cssSelector("select#booking_status");
	public static final By paymentopt=By.cssSelector("select#payment_status");
	public static final By fromdate=By.id("from_date");
	public static final By month=By.xpath("//div[contains(@class,'xdsoft_month')]/span");
	public static final By year=By.xpath("//div[contains(@class,'xdsoft_year')]/span");
	public static final By nextmonth=By.xpath("(//div[contains(@class,'xdsoft_datetimepicker ') and contains(@style,'display: block')]//button[@class='xdsoft_next'])[1]");
	public static final By todate=By.cssSelector("input#to_date");
	public static final By todatemonth=By.xpath("//div[contains(@class,'xdsoft_datetimepicker ') and contains(@style,'display: block;')]//div[contains(@class,'xdsoft_month')]/span");
	public static final By todateyear=By.xpath("//div[contains(@class,'xdsoft_datetimepicker ') and contains(@style,'display: block;')]//div[contains(@class,'xdsoft_year')]/span");
	public static final By todatenext=By.xpath("(//div[contains(@class,'xdsoft_datetimepicker ') and contains(@style,'display: block;')]//button[@class='xdsoft_next'])[1]");
}

