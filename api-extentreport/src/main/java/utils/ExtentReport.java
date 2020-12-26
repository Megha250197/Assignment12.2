package utils;

import java.io.File;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	
	public static ExtentReports report;
	public static ExtentTest logger;

	@BeforeSuite
	public void setup() throws Exception
	{
		ExtentHtmlReporter htmlReporter =new ExtentHtmlReporter(new File(System.getProperty("user.dir") + "/Reports/TestReport_"+ TimeStamp.getCurrentDateTime() +".html"));
		report = new ExtentReports();
		report.attachReporter(htmlReporter);
		// test = report.createTest("MyFirstTest", "Sample description");
	}
	@AfterSuite
	public void setdown()
	{
		report.flush();
	}


}
