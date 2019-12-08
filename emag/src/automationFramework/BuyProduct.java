package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyProduct {
	public static void buyWithCreditCard(WebDriver driverToken) {
		WebDriver driver = driverToken;
	 
		//Print a message that opening was successful
		 System.out.println("Successfully opened the eMAG Homepage.");
		 

		 
		 //Close the window
		 driver.quit();
		 System.out.println("Successfully closed the eMAG Homepage.");
	}
	
	public static void buyWithCash(WebDriver driverToken) {
		WebDriver driver = driverToken;
	 
		//Print a message that opening was successful
		 System.out.println("Successfully opened the eMAG Homepage.");
		 

		 
		 //Close the window
		 driver.quit();
		 System.out.println("Successfully closed the eMAG Homepage.");
	}
	 
}
