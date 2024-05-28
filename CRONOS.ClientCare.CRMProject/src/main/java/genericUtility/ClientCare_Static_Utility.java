package genericUtility;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

public class ClientCare_Static_Utility {
	
	public static ThreadLocal<ExtentTest> test=new ThreadLocal<ExtentTest>();
	public static ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();
	
	public static ExtentTest getTest() {
		return test.get();
	}
	
	public static void setTest(ThreadLocal<ExtentTest> acttest) {
		ClientCare_Static_Utility.test = acttest;
	}

	public static WebDriver getDriver() {
		return driver.get();
	}
	
	public static void setDriver(ThreadLocal<WebDriver> actdriver) {
		ClientCare_Static_Utility.driver = actdriver;
	}
	
	
   
}
