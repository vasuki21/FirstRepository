package amazon;

import java.io.IOException;

import genericUtilities.BaseClass;
import genericUtilities.UtilityMethods;
import objectRepositoryPOM.LoginPageAmazon;

public class TC05_Test extends BaseClass {

	public void adding_the_item_to_cart() throws IOException, InterruptedException {
		LoginPageAmazon login = new LoginPageAmazon(driver);
		UtilityMethods utility = new UtilityMethods();

		login.getEmailtextfield().sendKeys(utility.ReadProperties("username"));
		login.getContinuebutton().click();

		login.getPasswordtextfield().sendKeys(utility.ReadProperties("password"));
		login.getSigninbutton().click();
		Thread.sleep(2000);
		login.getSearchbar().sendKeys(utility.ReadProperties("search"));
		login.getSubmitbutton().click();

		login.getProductclick().click();
		Thread.sleep(2000);

		login.getAddtocartbtn().click();
		Thread.sleep(2000);

	}
}
