package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTests {

	public static void main(String[] args) throws InterruptedException {
		 //Create a new instance of ChromeDriver
		 WebDriver driver = new ChromeDriver();
		 
		 //Launch the emag homepage
		 driver.get("http://www.emag.ro/homepage");
		 
		 Homepage.checkHomepage(driver);
		 //Login.userLogin(driver);
		 //BuyProduct.buyWithCreditCard(driver);
		 //BuyProduct.buyWithCash(driver);
		 
		 //The tests have finished running
		 System.out.println("All tests have finished running.");
	}

}
