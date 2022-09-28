package loginModule;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ReadExcel;
import objectRepositoryPOM.LoginPage;

public class TC02_Test extends BaseClass {
	@Test(dataProvider = "test", dataProviderClass = ReadExcel.class)
	public void enteringInvalidData(String data1,String data2) 
   {
		LoginPage login =new LoginPage(driver);
		login.getLoginLink().click();
		
		login.getEmailTextField().sendKeys(data1);
		login.getPasswordTextField().sendKeys(data2);
	}	
}

