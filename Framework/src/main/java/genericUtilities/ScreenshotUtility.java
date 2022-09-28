package genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility 
{
	public void takingscreenshot(WebDriver driver, String screenshotName) throws IOException
	{
		TakesScreenshot ss=(TakesScreenshot) driver;
		File photo = ss.getScreenshotAs(OutputType.FILE);
		
		// to get the local time and date in the screenshot name
		String time = LocalDateTime.now().toString();
		String date = time.replace(':', '-');
		System.out.println(date);
		File shot = new File("./errorshots/"+screenshotName+""+date+".png");
		FileUtils.copyFile(photo, shot);
	}
}
