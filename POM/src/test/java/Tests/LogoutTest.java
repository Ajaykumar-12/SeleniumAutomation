package Tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Base.baseclass;
import Pages.Loginpage;
import Tests.BookingsTest;
import Pages.Logoutpage;
import Pages.Bookingspage;
public class LogoutTest extends baseclass {
	Logoutpage applogout;
	Bookingspage bpg;
	@Test
	public void App_Logout() {
		Loginpage lp=new Loginpage(driver);
		lp.Login();
		applogout=new Logoutpage(driver);
		applogout.logoutbtn();
		applogout.app_logout();
	}
}
