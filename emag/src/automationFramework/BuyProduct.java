package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyProduct {
	public static void buyWithCreditCard(WebDriver driverToken) {
		WebDriver driver = driverToken;
		
		//Starting on homepage
		//Clicking on the first product they show
		driver.findElement(By.className("product-title")).click();
		
		//Clicking "Adauga in cos"
		driver.findElement(By.xpath("//button[contains(text(),'Adauga in Cos')]")).click();
		
		//Clicking "Vezi detalii cos"
		//driver.findElement(By.linkText("https://www.emag.ro/cart/products?ref=add-to-cart-module_go-to-cart_button"));
		driver.get("https://www.emag.ro/cart/products?ref=add-to-cart-module_go-to-cart_button");
		
		//Go to Checkout
		driver.get("https://www.emag.ro/cart/checkout");
		
		//Login
		//Input email
		driver.findElement(By.id("email")).sendKeys("m.dante.games@gmail.com");
		 
		//Click continue
		driver.findElement(By.className("auth-submit")).click();
		 
		//Input password
		driver.findElement(By.id("password")).sendKeys("testare automata 1");
		
		//Click continue
		driver.findElement(By.className("auth-submit")).click();
		
		//Select "Livrare prin curier"
		driver.findElement(By.id("courierTab")).click();
		
		/* 
		-This section is relevant only if the user didn't set an address yet 
		-For ulterior testing, this section is skipped
		//Click "adauga" in the section "Adresa de livrare"
		driver.findElement(By.className("address-add-new")).click();
		
		//Add name
		driver.findElement(By.name("name")).sendKeys("Flemu");
		
		//Add phone
		driver.findElement(By.id("phone")).sendKeys("0777777777");
		
		//Add address
		driver.findElement(By.name("street_address")).sendKeys("Calea Frumoasa nr. 1, sc. A, et. 4, ap. 94");
		
		//Click "Salveaza"
		driver.findElement(By.xpath("//button[contains(text(),'Salveaza')]")).click();
		*/
		
		//Choose payment method card
		driver.findElement(By.id("paymentLinecard")).click();
		
		/*Click "Pasul urmator"
		-This test should be done only on testing environments
		-Since I'm testing on the production website, I will comment this section
		driver.get("https://www.emag.ro/cart/summary");
		*/

	}
	
	public static void buyWithCash(WebDriver driverToken) {
		WebDriver driver = driverToken;
		
		//Starting on homepage
		//Clicking on the first product they show
		driver.findElement(By.className("product-title")).click();
		
		//Clicking "Adauga in cos"
		driver.findElement(By.xpath("//button[contains(text(),'Adauga in Cos')]")).click();
		
		//Clicking "Vezi detalii cos"
		//driver.findElement(By.linkText("https://www.emag.ro/cart/products?ref=add-to-cart-module_go-to-cart_button"));
		driver.get("https://www.emag.ro/cart/products?ref=add-to-cart-module_go-to-cart_button");
		
		//Go to Checkout
		driver.get("https://www.emag.ro/cart/checkout");
		
		//Login
		//Input email
		driver.findElement(By.id("email")).sendKeys("m.dante.games@gmail.com");
		 
		//Click continue
		driver.findElement(By.className("auth-submit")).click();
		
		//Input password
		driver.findElement(By.id("password")).sendKeys("testare automata 1");
		
		//Click continue
		driver.findElement(By.className("auth-submit")).click();
		
		//Select "Livrare prin curier"
		driver.findElement(By.id("courierTab")).click();
		
		/* 
		-This section is relevant only if the user didn't set an address yet 
		//Click "adauga" in the section "Adresa de livrare"
		driver.findElement(By.className("address-add-new")).click();
		
		//Add name
		driver.findElement(By.name("name")).sendKeys("Flemu");
		
		//Add phone
		driver.findElement(By.id("phone")).sendKeys("0777777777");
		
		//Add address
		driver.findElement(By.name("street_address")).sendKeys("Calea Frumoasa nr. 1, sc. A, et. 4, ap. 94");
		
		//Click "Salveaza"
		driver.findElement(By.xpath("//button[contains(text(),'Salveaza')]")).click();
		*/
		
		//Choose payment method cash (ramburs la curier)
		driver.findElement(By.className("payment-method-numerar")).click();
		
		/*Click "Pasul urmator"
		-This test should be done only on testing environments
		-Since I'm testing on the production website, I will comment this section
		driver.get("https://www.emag.ro/cart/summary");
		*/
	}
	 
}
