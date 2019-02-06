package co.org.pratice;
		
		import java.awt.AWTException;
		import java.awt.Robot;
		import java.awt.event.KeyEvent;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Practice1 {
		static WebDriver driver;
		//Without taking Login button Xpath using Roboclass function
			public static void main(String[] args) throws AWTException, InterruptedException {
				
				System.out.println("This is Practice1 Class File for Robot class Please Check....");
				
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shajahan\\workspace\\Robotclass\\Driver\\chromedriver.exe");
				driver=new ChromeDriver();
				//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				driver.findElement(By.id("email")).sendKeys("hello.hi@gmail.com");
				Thread.sleep(3000);
				driver.findElement(By.name("pass")).sendKeys("9876543210");
				Thread.sleep(3000);
				Robot r=new Robot();
				r.keyPress(KeyEvent.VK_ENTER);
				
				r.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(4000);
				
				driver.quit();
			}
	}


