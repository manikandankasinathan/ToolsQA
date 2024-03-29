package tools.QA;
	import java.util.Set;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class HandlesWindow {

			public static WebDriver driver;

			public static void main(String[] args) throws InterruptedException {

				// Create a new instance of the Firefox driver

				System.setProperty("webdriver.chrome.driver","C:\\Users\\Manikandan K\\Downloads\\chromedriver.exe");
				//System.setProperty("webdriver.chrome.driver", "C:\\pathto\\my\\chromedriver.exe");
			 
			 // Create a new instance of the Firefox driver
			 
			         driver = new ChromeDriver();

		        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		        // Launch the URL

		        driver.get("http://toolsqa.com/automation-practice-switch-windows/");

		        // Store and Print the name of the First window on the console
		        Thread.sleep(1000);

		        String handle= driver.getWindowHandle();

		        System.out.println(handle);

		        // Click on the Button "New Message Window"

		        driver.findElement(By.name("New Message Window")).click();

		        // Store and Print the name of all the windows open	              

		        Set handles = driver.getWindowHandles();

		        System.out.println(handles);

		        // Pass a window handle to the other window

		        for (String handle1 : driver.getWindowHandles()) {

		        	System.out.println(handle1);

		        	driver.switchTo().window(handle1);

		        	}

		        // Closing Pop Up window

		        driver.close();

		        // Close Original window

		        driver.quit();

		}

	

}

