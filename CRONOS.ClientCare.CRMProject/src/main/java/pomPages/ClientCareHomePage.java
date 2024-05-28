package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClientCareHomePage {
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement Signout;
	
	public WebElement getSignOut()
	{
		return Signout;
		
	}

}
