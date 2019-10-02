package tools.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchWindow {
	 public static WebDriver driver;
	 
	 public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manikandan K\\Downloads\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\pathto\\my\\chromedriver.exe");
	 
	 // Create a new instance of the Firefox driver
	 
	         driver = new ChromeDriver();
	 
	         // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	 
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	         // Launch the URL
	 
	         driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	 
	         // Click on the Button "Alert Box"
	 
	         driver.findElement(By.name("Alert Box")).click();
	 
	         // Switch to JavaScript Alert window
	 
	         Alert myAlert = driver.switchTo().alert();
	 
	         // Accept the Alert
	 
	         myAlert.accept();
	 
	         // Close Original window
	 
	         driver.close();
	 
	 }
	 
	}


