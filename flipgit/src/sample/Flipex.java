package sample;

import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Flipex {
	static WebDriver dri;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mano\\eclipse-workspace\\flipgit\\lib\\chromedriver.exe");
		dri=new ChromeDriver();
		dri.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		dri.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(2000);
		WebElement w=dri.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/div/ul/li[1]/a/span"));
		Actions a=new Actions(dri);
		a.moveToElement(w).perform();
		dri.findElement(By.xpath(".//*[@title=\"Mobile Cases\"]")).click();
		Thread.sleep(2000);
		
		String t=dri.getTitle();
		if(t.equals("Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More")) {
			System.out.println(t);
			System.out.println();
		}
		else {
			System.out.println("*********************************************************");
			System.out.println("Please check Title");
			System.out.println("*********************************************************");
		}
		System.out.println(t);
		
		TakesScreenshot ts=(TakesScreenshot)dri;
		File f=ts.getScreenshotAs(OutputType.FILE);
		File f1=new File("D:\\Java Soft\\Tascreen\\flip_moto.jpg");
		Files.copy(f, f1);
		
		
		dri.quit();
	}
}
