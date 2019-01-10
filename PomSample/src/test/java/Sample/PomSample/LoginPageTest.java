package Sample.PomSample;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginPageTest extends Base {
	LoginPage login;   
	static Base base;   
	NextPage next;  
	@BeforeClass
	public static void launchBrowser() 
	{   
		driver=base.getDriver("firefox"); 
	}  
	
	@Test 
	public void verifyLogin() {   
		login=new LoginPage();   
		next=new NextPage();   
		// verify the fb logo is available   
		Assert.assertTrue(login.getImgFbLogo().isDisplayed());   
		// set the user name      
		login.setTxtUserName("ezhilr62@gmail.com");      
		//check the user name you entered      
		Assert.assertEquals("ezhilr62@gmail.com", login.getTxtUserName());      

		// set the password   
		login.setTxtUserPassword("ezhil1234");    
		//check the user name you entered      
		Assert.assertEquals("ezhil1234", login.getTxtUserPassword());   
		//click login   
		login.getBtnLoginButton().click();   
		//verify next page recover option is available   
		Assert.assertTrue(next.getTxtRecover().isDisplayed()); 
	 
	 }  
	@AfterClass 
	public static  void closeBrowser() { 
	  driver.quit(); 
	 } 
}
