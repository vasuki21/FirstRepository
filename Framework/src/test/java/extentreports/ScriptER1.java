package extentreports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScriptER1 {
	@Test
	public void launchFB() 
	{
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  String actualtile = driver.getTitle();
		  String expectedtile = "Facebook – log in or sign up";
		  		
		  ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/script1.html");
		  ExtentReports re = new ExtentReports();
		  re.attachReporter(reporter);
		  ExtentTest logger = re.createTest("the report");
		  
		  if(actualtile.equals(expectedtile))
		  {
			  logger.log(Status.PASS, "my test is passed");
		  }
		  else
		  {
			  logger.log(Status.FAIL, "my test is failed");
		  }
		  re.flush(); 			 
	  }
}
