package co.org.pratice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploading {
static WebDriver driver;
static Robot robot;
	
public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shajahan\\workspace\\Robotclass\\Driver\\chromedriver.exe");
         driver=new ChromeDriver();
         driver.get("https://blueimp.github.io/jQuery-File-Upload/");	
	
          robot =new Robot();
          robot.delay(3000);
         
         WebElement web1= driver.findElement(By.xpath("//*[@class='btn btn-success fileinput-button']"));
          driver.manage().window().maximize();
          Thread.sleep(3000);
          web1.click();
          Thread.sleep(2000);
          
          StringSelection str=new StringSelection("Arraylist");// storing the  string value
          Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);  //copy the string value  in clipboard
          /*for(int i=1; i<=7; i++) 
          {
          
        	  robot.keyPress(KeyEvent.VK_TAB);
              robot.keyRelease(KeyEvent.VK_TAB);
         }*/

          robot.keyPress(KeyEvent.VK_TAB);		//1
          robot.keyRelease(KeyEvent.VK_TAB);
          robot.delay(3000);
          
          robot.keyPress(KeyEvent.VK_TAB);			//2
          robot.keyRelease(KeyEvent.VK_TAB);
          robot.delay(3000);
          
          robot.keyPress(KeyEvent.VK_TAB);     		//3
          robot.keyRelease(KeyEvent.VK_TAB);
          robot.delay(3000);
         
          robot.keyPress(KeyEvent.VK_TAB);			//4
          robot.keyRelease(KeyEvent.VK_TAB);
          robot.delay(3000);
          
          robot.keyPress(KeyEvent.VK_TAB);	//5		
          robot.keyRelease(KeyEvent.VK_TAB);
          robot.delay(3000);
          
          robot.keyPress(KeyEvent.VK_TAB);    //6
          robot.keyRelease(KeyEvent.VK_TAB);
          robot.delay(3000);
          
          robot.keyPress(KeyEvent.VK_TAB);		//7
          robot.keyRelease(KeyEvent.VK_TAB);
          robot.delay(3000);
          /*robot.keyPress(KeyEvent.VK_TAB);
          robot.keyRelease(KeyEvent.VK_TAB);
          
          robot.keyPress(KeyEvent.VK_DOWN);
          robot.keyRelease(KeyEvent.VK_DOWN);*/
          
          /*robot.keyPress(KeyEvent.VK_UP);
          robot.keyRelease(KeyEvent.VK_UP);
          
          robot.keyPress(KeyEvent.VK_UP);
          robot.keyRelease(KeyEvent.VK_UP);*/

          robot.keyPress(KeyEvent.VK_DOWN);
          robot.keyRelease(KeyEvent.VK_DOWN); 
          robot.delay(3000);
          
          robot.keyPress(KeyEvent.VK_ENTER);
          robot.keyRelease(KeyEvent.VK_ENTER);
          robot.delay(3000);
         
          robot.keyPress(KeyEvent.VK_TAB);
          robot.keyRelease(KeyEvent.VK_TAB);
          robot.delay(3000);
          
          robot.keyPress(KeyEvent.VK_TAB);
          robot.keyRelease(KeyEvent.VK_TAB);
          robot.delay(3000);
          
          robot.keyPress(KeyEvent.VK_TAB);
          robot.keyRelease(KeyEvent.VK_TAB);
          robot.delay(3000);
          
          robot.keyPress(KeyEvent.VK_CONTROL);
          robot.keyPress(KeyEvent.VK_V);
          robot.delay(3000);
          
          robot.keyRelease(KeyEvent.VK_CONTROL);
          robot.keyRelease(KeyEvent.VK_V);
          robot.delay(3000);
          
          robot.keyPress(KeyEvent.VK_DOWN);
          robot.keyRelease(KeyEvent.VK_DOWN); 
          robot.delay(3000);
          
          robot.keyPress(KeyEvent.VK_ENTER);
          robot.keyRelease(KeyEvent.VK_ENTER);
}
}
