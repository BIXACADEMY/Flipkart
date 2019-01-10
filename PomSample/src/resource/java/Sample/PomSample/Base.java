package Sample.PomSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {
	static WebDriver driver;  
	
	public static WebDriver getDriver(String browser) 
	{   
			if(browser.equals("chrome"))
		{    
			System.setProperty("webdriver.chrome.driver", "E:/PomSample/Dri/chromedriver.exe");    
			driver = new ChromeDriver();    	
		}
		else if(browser.equals("firefox"))
		{  
				System.setProperty("webdriver.gecko.driver","E:/PomSample/Dri/geckodriver.exe");
				driver = new FirefoxDriver();           	
		}
		else if(browser.equals("ie"))
		{    
					System.setProperty("webdriver.ie.driver","C:/Users/siva/workspace/Pom/Driver/IEDriverServer.exe"); 
					driver = new InternetExplorerDriver();           
		}
		else if(browser.equals("opera"))
		{    
						System.setProperty("webdriver.opera.driver","C:/Users/siva/workspace/Pom/Driver/operadriver.exe");    
						driver = new OperaDriver();        
		}
		
		
		driver.manage().window().maximize();  
		driver.get("https://www.facebook.com/");   
		return driver; 
}
	
	public static void sendKey(WebElement element,String name) {
element.sendKeys(name);
	}
	

	public static void click(WebElement element) {
element.click();
	}
	
	
}
