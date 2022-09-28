package loginModule;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.UtilityMethods;
import objectRepositoryPOM.LoginPage;

public class TC01_Test extends BaseClass {
	@Test
	public void validate_whether_user_login_with_valid_credentials() throws IOException {
		LoginPage login=new LoginPage(driver);
		UtilityMethods utility=new UtilityMethods();
		login.getLoginLink().click();
		
		//Assert.assertEquals(true, false);   //to terminate the script if true != false and take screenshot
		
		login.getEmailTextField().sendKeys(utility.ReadProperties("username"));
		login.getPasswordTextField().sendKeys(utility.ReadProperties("password"));
		login.getLoginButton().click();
	}
}
