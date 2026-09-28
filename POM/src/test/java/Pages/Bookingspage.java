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
import Locators.BookingsLocators;
import Locators.DriverModule_Locators;

public class Bookingspage{
	WebDriver driver;
	WebDriverWait wait;
	public Bookingspage(WebDriver driver) {
		this.driver=driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	public void bookingsearch() {
		WebElement btn=driver.findElement(BookingsLocators.bookinglocator);
		btn.click();
	}
	public void booking_status() {
		WebElement booking=driver.findElement(BookingsLocators.bookingopt);
		booking.click();
	}
	public void booking_option() {
		WebElement opt=driver.findElement(BookingsLocators.bookingopt);
		Select s=new Select(opt);
		s.selectByVisibleText("Accepted");
	}
	public void Payment_option() {
		WebElement payopt=driver.findElement(BookingsLocators.paymentopt);
		payopt.click();	
	}
	public void Select_Payment_Option() {
		WebElement payopt=driver.findElement(BookingsLocators.paymentopt);
		Select s=new Select(payopt);
		s.selectByVisibleText("Paid");
	}
    public void from_date() {
    	driver.findElement(BookingsLocators.fromdate).click();
		String expectedMonth = "September";
        String expectedYear = "2026";
        String expectedDate = "20";
        while(true) {
        	String currentMonth=wait.until(ExpectedConditions.elementToBeClickable(BookingsLocators.month)).getText();
        	String currentYear=wait.until(ExpectedConditions.elementToBeClickable(BookingsLocators.year)).getText();
        	if(currentMonth.equalsIgnoreCase(expectedMonth) && currentYear.equalsIgnoreCase(expectedYear)) {
        		System.out.println("Found");
        		break;
        	}
        	driver.findElement(BookingsLocators.nextmonth).click();
        }
        driver.findElement(By.xpath("//td[@data-date='" + expectedDate + "' and @data-month='8' and @data-year='2026']/div")).click();   
   }
    public void Todate() {
    	driver.findElement(BookingsLocators.todate).click();
    	String expected_month="December";
    	String expected_Year="2026";
    	String expected_Date="15";
    	while(true) {
    		String current_month=wait.until(ExpectedConditions.elementToBeClickable(BookingsLocators.todatemonth)).getText();
    		String current_year=wait.until(ExpectedConditions.elementToBeClickable(BookingsLocators.todateyear)).getText();
    		if(current_month.equalsIgnoreCase(expected_month) && current_year.equalsIgnoreCase(expected_Year)) {
    			break;
    		}
    		driver.findElement(BookingsLocators.todatenext).click();
    	}
    	driver.findElement(By.xpath("//td[@data-date='" + expected_Date + "' and @data-month='11' and @data-year='2026']/div")).click();
    }
}
