package Handson;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentmanage {
	
	private static ExtentReports extent;
	
	public static ExtentReports getInstance()
	{
		if(extent==null)
		{
			String reportpath=System.getProperty("user.dir")+"/report/extentreprt.html";
			ExtentSparkReporter spark=new ExtentSparkReporter(reportpath);
			spark.config().setReportName("Extent report generated");
			spark.config().setDocumentTitle("document");
			spark.config().setTheme(Theme.DARK);
			extent =new ExtentReports();
			extent.attachReporter(spark);
			
		}
		return extent;
		
	}

}
