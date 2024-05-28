package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientCareLoginPage {
	/**
	 * constructor call
	 * @param driver
	 */
		public ClientCareLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath=" //input[@name='user_name']")
		private WebElement LoginUserName;
		
		@FindBy(xpath ="//input[@name='user_password']")
		private WebElement LoginPassword;
		
		@FindBy(xpath="//input[@type='submit']")
		private WebElement LoginButton;
		
		/**
		 * Element for login UserName of Login Page
		 * @return
		 */
		public WebElement getLoginUserName() {
			return LoginUserName;	
		}
		/**
		 * Element for login password of Login Page
		 * @return
		 */
		public WebElement getLoginPassword() {
			return LoginPassword;
		}
		/**
		 * Element for login button of Login Page
		 * @return
		 */
		public WebElement getLoginButton() {
			return LoginButton;
		}

}
