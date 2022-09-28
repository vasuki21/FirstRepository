package amazon;

import java.io.IOException;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.UtilityMethods;
import objectRepositoryPOM.LoginPageAmazon;

public class TC01_Test extends BaseClass {
	@Test
	public void entering_valid_login_credentials() throws IOException
	{
		LoginPageAmazon login=new LoginPageAmazon(driver);
		UtilityMethods utility=new UtilityMethods();
		
		login.getEmailtextfield().sendKeys(utility.ReadProperties("username"));
		login.getContinuebutton().click();
		
		login.getPasswordtextfield().sendKeys(utility.ReadProperties("password"));
		login.getSigninbutton().click();
	}
}
