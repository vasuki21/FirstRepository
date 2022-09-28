package amazon;

import java.io.IOException;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.UtilityMethods;
import objectRepositoryPOM.LoginPageAmazon;

public class TC02_Test extends BaseClass{
	@Test
	public void search_a_product() throws IOException, InterruptedException
	{
		LoginPageAmazon login=new LoginPageAmazon(driver);
		UtilityMethods utility=new UtilityMethods();
		
		login.getEmailtextfield().sendKeys(utility.ReadProperties("username"));
		login.getContinuebutton().click();
		
		login.getPasswordtextfield().sendKeys(utility.ReadProperties("password"));
		login.getSigninbutton().click();
		Thread.sleep(2000);
		login.getSearchbar().sendKeys(utility.ReadProperties("search"));
		login.getSubmitbutton().click();
	}
}
