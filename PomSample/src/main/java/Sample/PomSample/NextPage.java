package Sample.PomSample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextPage extends Base {
	@FindBy(xpath="//*[text()='Recover Your Account']")  
	private WebElement txtRecover;    
	public WebElement getTxtRecover() {   
		return txtRecover;  
		} 

	  public void setTxtRecover(WebElement txtRecover) {  
		  this.txtRecover = txtRecover;  
		  } 
	 
	 public NextPage() {      
		    
		 PageFactory.initElements(driver, this);    
		 } 
}
