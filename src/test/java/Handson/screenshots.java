package Handson;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Handson.amazon;
public class screenshots  {

	public static String timestamp()
	{
		return new SimpleDateFormat("YYYYMMDD_HHMMSS").format(new Date());
	}
	public static void capture(WebDriver driver) throws IOException
	{
	
		File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File (System.getProperty("user.dir")+"/Screenshots/"+timestamp()+".png"));
	}
}
