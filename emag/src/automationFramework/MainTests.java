package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTests {

	public static void main(String[] args) throws InterruptedException {
		 //Create a new instance of ChromeDriver
		 WebDriver driver = new ChromeDriver();
		 
		 //Test the emag homepage
		 driver.get("http://www.emag.ro/homepage");
		 Homepage.checkHomepage(driver);
		 
		 //Test the user login
		 driver.get("http://www.emag.ro/user/login");
		 Login.userLogin(driver);
		 
		 //Test product purchase. The test starts with the login form, so the driver doesn't need to be updated
		 //BuyProduct.buyWithCreditCard(driver);
		 //BuyProduct.buyWithCash(driver);
		 
		 //The tests have finished running
		 System.out.println("All tests have finished running.");
		 
		 //Close the window
		 driver.close();
		 System.out.println("Successfully closed the window.");
	}

}
