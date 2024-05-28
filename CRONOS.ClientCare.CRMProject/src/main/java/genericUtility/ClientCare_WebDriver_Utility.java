package genericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class ClientCare_WebDriver_Utility {
	/**
	 * Method for maximize browser
	 * @param driver
	 */
	public void maximize(WebDriver driver)
	{
	driver.manage().window().maximize();
	}
	/**
	 * Method for maximize browser
	 * @param driver
	 */
	
	public void minimize(WebDriver driver)
	{
	driver.manage().window().minimize();
	}
	/**
	 * Method for implicit wait
	 * @param driver
	 */
	public void implicitWait(WebDriver driver)
	{
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

}
