package Tests;

import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.baseclass;
import Pages.Bookingspage;
import Pages.DriversPage;
import Pages.Loginpage;
import Tests.Logintest;
public class Bookingstest extends baseclass {
	public Bookingspage bpg;
	public Logintest tst;
	public DriversPage dp;
	@Test(priority=1)
	public void app_Login() {
		Loginpage lp=new Loginpage(driver);
		lp.Login();	
	}
	@Test(priority=2)
	public void app_Bookings() {
		bpg=new Bookingspage(driver);
		bpg.bookingsearch();
	}
	@Test(priority=3)
	public void app_Booking_Option() {
		bpg=new Bookingspage(driver);
		bpg.booking_option();
	}
	@Test(priority=4)
	public void app_payment_option() {
		bpg=new Bookingspage(driver);
		bpg.Payment_option();
	}
	@Test(priority=5)
	public void app_payment_option_selection() {
		bpg=new Bookingspage(driver);
		bpg.Select_Payment_Option();
	}
	@Test(priority=6)
     public void datepicer() {
		
		bpg=new Bookingspage(driver);
		bpg.from_date();
	}
	@Test(priority=7)
	public void todatepicker() {
		
		bpg=new Bookingspage(driver);
		bpg.Todate();
		
	}
}


