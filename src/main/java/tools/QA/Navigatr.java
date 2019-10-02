package tools.QA;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatr {
	public static WebDriver driver;
	 
		 public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Manikandan K\\Downloads\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "C:\\pathto\\my\\chromedriver.exe");
		 
		 // Create a new instance of the Firefox driver
		 
		         driver = new ChromeDriver();
		 
		         // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
		 
		         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		         // Launch the URL
		 
		         driver.get("https://www.google.com");
		         Thread.sleep(1000);
		         
		         driver.navigate().to("https://www.facebook.com");
		 
		         // Click on the Button "Alert Box"
		         driver.navigate().back();
		        // File src=((TakeaScrrenShot)driver
		 
		 }
		 
}