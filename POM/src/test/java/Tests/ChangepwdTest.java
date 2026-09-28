package Tests;
import Utilities.Generalutility;
import Pages.changepassword;
import java.io.IOException;
import org.testng.annotations.Test;
import Base.baseclass;
import Locators.changepassword_Locators;
import Pages.Loginpage;
import Pages.changepassword;
public class ChangepwdTest extends baseclass {
	public changepassword cpwd;
	public Loginpage lp;
	@Test(priority=1)
	public void app_Login() {
	    lp=new Loginpage(driver);
		lp.Login();	
	}
	@Test(priority=2)
	public void screenimg() throws IOException {
		cpwd=new changepassword(driver);
		cpwd.updatepwd();
	}
}
