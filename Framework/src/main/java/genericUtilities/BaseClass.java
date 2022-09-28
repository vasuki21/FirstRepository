package genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public WebDriver driver;
	@BeforeSuite(alwaysRun = true)
	public void launchBrowser() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	@BeforeClass(alwaysRun = true)
	public void navigatetoApp() 
	{
		//driver.get("https://demowebshop.tricentis.com/");
		driver.get("https://www.amazon.in/ap/signin?ie=UTF8&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Drhf_sign_in&openid.assoc_handle=inflex&openid.mode=checkid_setup&ignoreAuthState=1&ie=UTF8&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&fromAuthPrompt=1");
	}
	
	
//	@AfterMethod(alwaysRun = true)
//	public void takingss(ITestResult result) throws IOException {
//		if(result.getStatus()==result.FAILURE) {
//			ScreenshotUtility screenshot=new ScreenshotUtility();
//			screenshot.takingscreenshot(driver, result.getName());
//		}
//	}
	
	@AfterClass(alwaysRun = true)
	public void logoutfromapp() {
		System.out.println("logging out");
	}
	
//	@AfterSuite(alwaysRun = true)
//	public void teardown() {
//		driver.quit();
//	}
}
