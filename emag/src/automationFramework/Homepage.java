package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {

	public static void main(String[] args) throws InterruptedException {
		 //Create a new instance of ChromeDriver
		 WebDriver driver = new ChromeDriver();
		 
		 //Launch the emag homepage
		 driver.get("http://www.emag.ro/homepage");
		 
		 //Print a message that opening was successful
		 System.out.println("Successfully opened the eMAG Homepage.");
		 
		 //Check website title
		 String Title = driver.getTitle();
		 if(Title.equals("eMAG.ro - Libertate în fiecare zi"))
			 System.out.println("The title is correct.");
		 else
			 System.out.println("The title is incorrect.");
		 
		 //Check GDPR popup
		 if(driver.findElement(By.className("gdpr-cookie-banner")).isDisplayed())
			 System.out.println("The Homepage button is displayed.");
		 else
			 System.out.println("The Homepage button is not displayed.");		 
		 
		 //Check home button
		 if(driver.findElement(By.className("navbar-branding")).isDisplayed())
			 System.out.println("The Homepage button is displayed.");
		 else
			 System.out.println("The Homepage button is not displayed.");
		 
		//Check search bar
		 if(driver.findElement(By.className("navbar-searchbox")).isDisplayed())
			 System.out.println("The search field is displayed.");
		 else
			 System.out.println("The search field is not displayed.");
		 
		//Check user-specific toolbox section
		 if(driver.findElement(By.className("navbar-toolbox")).isDisplayed())
			 System.out.println("The user toolbox is displayed.");
		 else
			 System.out.println("The user toolbox is not displayed.");
		 
		//Check the product categories
		 if(driver.findElement(By.id("navbar-aux-menu")).isEnabled())
			 System.out.println("The product categories are displayed.");
		 else
			 System.out.println("The product categories are not displayed.");
		 
		//Check login navigation bar
		 if(driver.findElement(By.className("page-section-widget-login")).isDisplayed())
			 System.out.println("The login navigation bar is displayed.");
		 else
			 System.out.println("The login navigation bar is not displayed.");
		 
		 //Check the "Alti clienti au vizitat si..." section
		 if(driver.findElement(By.xpath("//*[text()='Alti clienti au vizitat si...']")).isDisplayed())
			 System.out.println("The 'Alti clienti au vizitat si...' section is displayed.");
		 else
			 System.out.println("The 'Alti clienti au vizitat si...' section is not displayed.");
		 
		 //Check the "Fii conectat la lumea ta!" section
		 if(driver.findElement(By.xpath("//*[text()='Fii conectat la lumea ta!']")).isDisplayed())
			 System.out.println("The 'Fii conectat la lumea ta!' section is displayed.");
		 else
			 System.out.println("The 'Fii conectat la lumea ta!' section is not displayed.");		 
		 
		 // Check the "Bucura-ti simturile!" section
		 if(driver.findElement(By.xpath("//*[text()='Bucura-ti simturile!']")).isDisplayed())
			 System.out.println("The 'Bucura-ti simturile!' section is displayed.");
		 else
			 System.out.println("The 'Bucura-ti simturile!' section is not displayed.");
		 
		 //Check the "Recent adaugate la Favorite" section
		 if(driver.findElement(By.xpath("//*[text()='Recent adaugate la Favorite']")).isDisplayed())
			 System.out.println("The 'Branduri de top' section is displayed.");
		 else
			 System.out.println("The 'Branduri de top' section is not displayed.");
		 
		 //Check the "Te-ar putea interesa si..." section
		 if(driver.findElement(By.xpath("//*[text()='Te-ar putea interesa si...']")).isDisplayed())
			 System.out.println("The 'Branduri de top' section is displayed.");
		 else
			 System.out.println("The 'Branduri de top' section is not displayed.");

		 //Check the mobile app section
		 if(driver.findElement(By.id("tpb-home-banner-1")).isDisplayed())
			 System.out.println("The mobile apps section is displayed.");
		 else
			 System.out.println("The mobile apps section is not displayed.");
		 
		 //Check the "Branduri de top" section
		 if(driver.findElement(By.xpath("//*[text()='Branduri de top']")).isDisplayed())
			 System.out.println("The newsletter is displayed.");
		 else
			 System.out.println("The newsletter is not displayed.");
		 
		 //Check the newsletter
		 if(driver.findElement(By.className("widget-newsletter")).isDisplayed())
			 System.out.println("The marketplace is displayed.");
		 else
			 System.out.println("The marketplace is not displayed.");
		 
		 //Check the marketplace
		 if(driver.findElement(By.id("mktp-sell-with-emag")).isDisplayed())
			 System.out.println("The mobile apps section is displayed.");
		 else
			 System.out.println("The mobile apps section is not displayed.");
		 
		 //Check the footer
		 if(driver.findElement(By.className("footer-default")).isDisplayed())
			 System.out.println("The footer is displayed.");
		 else
			 System.out.println("The footer is not displayed.");
		 
		 //Close the window
		 driver.quit();
		 System.out.println("Successfully closed the eMAG Homepage.");
	}

}
