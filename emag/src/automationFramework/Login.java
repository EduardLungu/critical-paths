package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void UserLogin(WebDriver driverToken) {
		WebDriver driver = driverToken;
	 
		//Print a message that opening was successful
		 System.out.println("Successfully opened the eMAG Homepage.");
		 

		 
		 //Close the window
		 driver.quit();
		 System.out.println("Successfully closed the eMAG Homepage.");
	}
	 
}
