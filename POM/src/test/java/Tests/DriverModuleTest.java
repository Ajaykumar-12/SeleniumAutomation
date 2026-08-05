package Tests;
import Base.baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Base.baseclass;
import Pages.DriversPage;
import Pages.Loginpage;


public class DriverModuleTest extends baseclass {
	
	Loginpage lp;
	DriversPage dp;
	
	@Test(priority=1)
	public void AppLogin() {
		lp=new Loginpage(driver);
		lp.Login();	
	}
	@Test(priority=2)
	public void drivertab() {
		
		dp=new DriversPage(driver);
		dp.Driver_Tab();
	}
	@Test(priority=3)
	public void driverlist() {
		
		dp=new DriversPage(driver);
		dp.DriverList();
	}
	@Test(priority=4)
	public void drivername() {
		
		dp=new DriversPage(driver);
		dp.Driver_Name();
	}
	@Test(priority=5)
	public void Drivertype() {
		
		dp=new DriversPage(driver);
		dp.Driver_Type();
	}
	
	
}
