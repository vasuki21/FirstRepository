package extentreports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class demoofextentreports1 {
	@Test
  public void thereport() {
	  ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/demo1.html");
	  ExtentReports re = new ExtentReports();
	  re.attachReporter(reporter);
	  ExtentTest logger = re.createTest("the report");
	  
	  logger.log(Status.PASS, "my test is passed");
	  
	  logger.log(Status.FAIL, "my test is failed");
	  
	  re.flush(); 			 // flush() is mandatory
  }
}
