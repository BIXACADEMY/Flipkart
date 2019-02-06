package co.org.pratice;




	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Pratice2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\Shajahan\\workspace\\Robotclass\\Driver\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement we=driver.findElement(By.xpath("//a[@href=contains(text(),'array formula calendar.xls')]"));
		Thread.sleep(3000);
		we.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(4000);
		we.click();
			
		Robot Rb=new Robot();
		Thread.sleep(3000);
		Rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		Rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		Rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		Rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		Rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		Rb.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(4000);
		
		driver.quit();
	}
	}



