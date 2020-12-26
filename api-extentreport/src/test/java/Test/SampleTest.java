package Test;



import org.testng.annotations.Test;

import Base.BaseClass;
import utils.ExtentReport;
import utils.SampleApi;


public class SampleTest extends ExtentReport{
	
	
	@Test
	public void test1()
	{
		BaseClass.getMethod("https://reqres.in/api/users?page=2");//get
		logger=report.createTest("Test case 1");
		logger.info("Test case 1 is executed");
		logger.pass("passed");
	}
	@Test
	public void test2()
	{
		BaseClass.getMethod1("http://moolya.com", "nitesh");//using queryparam
	    BaseClass.getMethod2("http://moolya.com", "megha");//using path param
	    logger=report.createTest("Test case 2");
		logger.info("Test case 2 excecuted successfully");
		logger.pass("passed");
	}
	@Test
	public void test3()
	{
		SampleApi.api1("http://moolya.com/demo/name=nitesh", "{\"name\":\"nitesh\",\"password\":\"abcd\"}");//post
		SampleApi.api2();
		SampleApi.api3();
		logger=report.createTest("Test case 3");
		logger.info("Test case 3 excecuted successfully");
		logger.pass("passed");
	}
	
	
}
