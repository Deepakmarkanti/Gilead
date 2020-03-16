package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import seleniumBase.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.CLASS_NAME, using="_2zrpKA _1dBPDZ") 
	WebElement UserName;
	
	@FindBy(how=How.CLASS_NAME, using="_2zrpKA _3v41xv _1dBPDZ") 
	WebElement Password;
	
	@FindBy(how=How.CLASS_NAME, using="_2AkmmA _1LctnI _7UHT_c") 
	WebElement Submit;
	
	public void Login(String user,String pass)
	{
		UserName.sendKeys(user);
		Password.sendKeys(pass);
		Submit.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@FindBy(how=How.ID, using="username") WebElement eleUserName;
	public LoginPage enterUsername(String data) {
		eleUserName.sendKeys(data);
		return this;
	}
	@FindBy(how=How.ID, using="password") WebElement elePass;
	public LoginPage enterPassword(String data) {
		elePass.sendKeys(data);
		return this;
	}
	
	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	} */
	
	
	
	
	
	
	

}
