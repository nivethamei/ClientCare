package genericUtility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
	/**
	 * Actions class method for click on web element 
	 * @param driver
	 * @param element
	 */
	public void click(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		action.click(element).perform();
	}
	/**
	 * Actions class method for mouse over action
	 * @param driver
	 * @param element
	 */
	public void moveToElement(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
	}
	/**
	 * Actions class method for right click on web element
	 * @param driver
	 * @param element
	 */
	public void rightClick(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		action.contextClick(element).perform();
	}
	/**
	 * Drop down handle by index
	 * @param element
	 * @param index
	 */
	public void selectByIndexDropdown(WebElement element,int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	/**
	 * Drop down handle by visible text
	 * @param element
	 * @param text
	 */
	public void  selectByVisibleTextDropdown(WebElement element,String text)
	{
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	/**
	 * Drop down handle by value
	 * @param value
	 * @param element
	 */
	public static void selectByValueDropDown(String value,WebElement element)
	{
		Select s=new Select(element);
		s.selectByValue(value);	
	}
	/**
	 * used to handle alert with accept method
	 * @param driver
	 */
	public void switchToAlertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	/**
	 * used to handle alert with dismiss method
	 * @param driver
	 */
	public void switchToAlertDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/**
	 * used to get text from alert 
	 * @param driver
	 */
	public void getTextFromAlert(WebDriver driver)
	{
		driver.switchTo().alert().getText();
	}
	/**
	 * used to switch frame based on index
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver,int index)
	{
		 driver.switchTo().frame(index);
	}
	/**
	 * used to switch frame based on name and id
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver,String NameAndId)
	{
		 driver.switchTo().frame(NameAndId);
	}
	/**
	 * used to switch frame based on name and id
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver,WebElement element)
	{
		 driver.switchTo().frame(element);
	}
	/**
	 * used to switch another window
	 * @param driver
	 * @param PartialTitle
	 */
	public void switchToWindow(WebDriver driver,String PartialTitle)
	{
		Set<String> allwindow = driver.getWindowHandles();
	    for(String window:allwindow)
	    {
	    	driver.switchTo().window(window);
	    	String actualResult = driver.getTitle();
	    	if(actualResult.contains(PartialTitle))
	    	{
	    		break;
	    	}
	    }	
	}

}
