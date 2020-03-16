package testcases;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

//import Pages.LoginPage;
import seleniumBase.ProjectSpecificMethods;

public class TC001_LoginLogout extends ProjectSpecificMethods {
	
	@Test
	
	
	public void Loginpage()
	{
		Pages.LoginPage Login = PageFactory.initElements(driver, Pages.LoginPage.class);
		
		Login.Login("abc","123");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@BeforeTest
	public void setData() {
		excelFilename = "LoginLogout";
	}
	
	@Test(dataProvider = "fetchData")
	public void loginLogout(String userName, String password) {
		
		new LoginPage()
		.enterUsername(userName)
		.enterPassword(password)
		.clickLogin()
		.clickLogout();*/
		
		
		
		
		
		
		/*
		 * LoginPage lp = new LoginPage(); 
		 * lp.enterUsername(); 
		 * lp.enterPassword();
		 */
	
	}
	
	
	
	
	
	
	
	
	

