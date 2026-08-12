package Tests;

import java.io.IOException;

import org.testng.annotations.Test;
import Base.baseclass;
import Pages.Alerts;
import Pages.Loginpage;
public class NotificationTest extends baseclass {
	
	Alerts al;
	@Test(priority=1)
	public void app_Login() {
		Loginpage lp=new Loginpage(driver);
		lp.Login();	
	}
	
	@Test(priority=2)
	public void promotionalerts() throws IOException {
		
		al=new Alerts(driver);
		al.notificationalert();
	}

}
