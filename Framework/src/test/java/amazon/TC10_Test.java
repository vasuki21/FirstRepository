package amazon;

import java.io.IOException;

import genericUtilities.BaseClass;
import genericUtilities.UtilityMethods;
import objectRepositoryPOM.LoginPageAmazon;

public class TC10_Test extends BaseClass
{
	public void signing_out_from_the_app() throws IOException, InterruptedException {
		LoginPageAmazon login = new LoginPageAmazon(driver);
		UtilityMethods utility = new UtilityMethods();

		login.getEmailtextfield().sendKeys(utility.ReadProperties("username"));
		login.getContinuebutton().click();

		login.getPasswordtextfield().sendKeys(utility.ReadProperties("password"));
		login.getSigninbutton().click();
		Thread.sleep(2000);
		
		login.getAllLink().click();
		Thread.sleep(2000);
		login.getSignout().click();
  }
}