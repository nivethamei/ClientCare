package genericUtility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ClientCare_Listeners_Utility implements ITestListener,ISuiteListener{
	ExtentSparkReporter htmlreport;
	ExtentReports report;
	ExtentTest test;

	@Override
	public void onStart(ISuite suite) {
		System.out.println("Report Configuration");
		
		// Spark report generation
		ClientCare_Java_Utility jutil=new ClientCare_Java_Utility();
		htmlreport=new ExtentSparkReporter("./ExtentReports/reports" +jutil.toGetSystemDateAndTime() +".html");
		htmlreport.config().setDocumentTitle("ClientCare Results");
		htmlreport.config().setReportName("ClientCare Execution Report");
		htmlreport.config().setTheme(Theme.DARK);
		
		// Add the environment variable
		report=new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("Browser","chrome");
		report.setSystemInfo("OS", "Windows-11");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("Report Configuration");
		report.flush();
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+ "START");
		test= report.createTest(methodName);
		test.log(Status.INFO, "Start");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test.log(Status.INFO, methodName + "completed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testName = result.getMethod().getMethodName();
//		TakesScreenshot ts=(TakesScreenshot)BaseClass.sdriver;
//		String temp = ts.getScreenshotAs(OutputType.BASE64);
//		test.addScreenCaptureFromBase64String(temp,testName);
		test.log(Status.FAIL, testName +"Failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
