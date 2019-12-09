package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void userLogin(WebDriver driverToken) {
		WebDriver driver = driverToken;
	 
		//Print a message that opening was successful
		 System.out.println("Successfully opened the eMAG Login page.");
		 
		 //Input email
		 driver.findElement(By.id("email")).sendKeys("m.dante.games@gmail.com");
		 
		 //Click continue
		 driver.findElement(By.className("auth-submit")).click();
		 
		 //Input password
		 driver.findElement(By.id("password")).sendKeys("testare automata 1");
		 
		 //Click continue
		 driver.findElement(By.className("auth-submit")).click();
		 
		 //Check if I am on the user page
		 if(driver.findElement(By.xpath("//*[text()='Datele mele']")).isDisplayed())
			 System.out.println("Successfully logged in.");
		 else
			 System.out.println("Login failed.");
	}
	 
}
