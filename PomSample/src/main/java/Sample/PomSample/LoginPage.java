package Sample.PomSample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  extends Base{
	@FindBy(name="email")  
	private WebElement txtUserName;
	
	@FindBy(id="pass")  
	private WebElement txtUserPassword; 
	
	@FindBy(id="loginbutton")  
	private WebElement btnLoginButton; 
	
	@FindBy(xpath="//u[text()='Facebook']//parent::i")  
	private WebElement imgFbLogo;    
	
	public LoginPage() 
	{      
		PageFactory.initElements(driver,this);     
	}
	
	 public WebElement getImgFbLogo() {   
		 return imgFbLogo;  
		 }  
	 public void setImgFbLogo(WebElement imgFbLogo) {   
		 this.imgFbLogo = imgFbLogo;  
		 }  
	 public String getTxtUserName() {   
		 return txtUserName.getAttribute("value");  
		 }  
	 public  void setTxtUserName(String txtUserName) {   
		 this.txtUserName.sendKeys(txtUserName);  
		 }  
	 public String getTxtUserPassword() {   
		 return txtUserPassword.getAttribute("value");  
		 }  
	 public void setTxtUserPassword(String txtUserPassword) {   
		 this.txtUserPassword.sendKeys(txtUserPassword);  
		 }  
	 public WebElement getBtnLoginButton() {   
		 return btnLoginButton;  
		 }  
	 public void setBtnLoginButton(WebElement btnLoginButton) {   
		 this.btnLoginButton = btnLoginButton;  
		 } 
	 
}
