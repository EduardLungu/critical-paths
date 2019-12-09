package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTests {

	public static void main(String[] args) throws InterruptedException {
		 		
		 //Test the homepage
		 WebDriver driverHomepage = new ChromeDriver();
		 driverHomepage.get("http://www.emag.ro/homepage");
		 Homepage.checkHomepage(driverHomepage);
		 driverHomepage.close();
		 System.out.println("The homepage tests have finished running.");
		 
		 //Test the user login
		 WebDriver driverLogin = new ChromeDriver();
		 driverLogin.get("http://www.emag.ro/user/login");
		 Login.userLogin(driverLogin);
		 driverLogin.close();
		 System.out.println("The Login tests have finished running.");
		 
		 //Test product purchase with a credit card
		 WebDriver driverPurchaseCard = new ChromeDriver();
		 driverPurchaseCard.get("http://www.emag.ro/homepage");
		 BuyProduct.buyWithCreditCard(driverPurchaseCard);
		 driverPurchaseCard.close();
		 System.out.println("The cash purchase tests have finished running.");
		 
		 //Test product purchase with cash
		 WebDriver driverPurchaseCash = new ChromeDriver();
		 driverPurchaseCash.get("http://www.emag.ro/homepage");
		 BuyProduct.buyWithCash(driverPurchaseCash);
		 driverPurchaseCash.close();
		 System.out.println("The card purchase tests have finished running.");
	}

}
