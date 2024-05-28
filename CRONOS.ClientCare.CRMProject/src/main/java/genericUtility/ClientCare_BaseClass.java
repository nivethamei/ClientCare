package genericUtility;

import java.sql.SQLException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
/**
 * This class is Baseclass contains Configuration annotations 
 */

public class ClientCare_BaseClass {
	public ClientCare_DataBase_Utility dutil=new ClientCare_DataBase_Utility();
	 public ClientCare_PropertyFile_Utility putil=new ClientCare_PropertyFile_Utility();
	 public WebDriver driver;
	
	@BeforeSuite
	public void beforeSuiteConfiguration() throws Throwable {
		dutil.getConnection();
		System.out.println("Connected to database");
	}
	
	@BeforeClass
	public void beforeClassConfiguration() {
	   String BROWSER = System.getProperty("url");
	          
	   if(BROWSER.equals("chrome")) {
		   driver=new ChromeDriver();
	   }
	   else if(BROWSER.equals("edge")) {
		   driver=new EdgeDriver();
	   }
	   else if(BROWSER.equals("firefox")) {
		   driver=new FirefoxDriver();
	   }
	   else {
		   driver=new ChromeDriver();
	   }
	   System.out.println("browser launched successfully");
	}
	
	@BeforeMethod
	public void beforeMethodConfiguration() {
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PASSWORD= System.getProperty("password");
		
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     driver.get(URL);
	}
	
	@AfterMethod
	public void afterMethodConfiguration() {
		
		
	}
	
	@AfterClass
	public void afterClassConfiguration() {
		driver.quit();
		System.out.println("browser closed successfully");
		
	}
	
	@AfterSuite
	public void afterSuiteConfiguration() throws SQLException {
		dutil.getCloseConnection();
		System.out.println("Disconnected to database");
	}
	

}
