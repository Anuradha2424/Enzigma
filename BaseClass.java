package Enzigma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass {

	public static String browser="Chrome";
	public static WebDriver driver=null;
		public static void preCondition() throws InterruptedException 
		{
			if(browser.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("edge"))
			{
				driver=new EdgeDriver();
			}
			else if(browser.equalsIgnoreCase("safari"))
			{
				driver=new SafariDriver();
			}
			else if(browser.equalsIgnoreCase("internetexplorer")) {
				driver=new InternetExplorerDriver();
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				driver=new FirefoxDriver();
			}
			else {
				driver=new ChromeDriver();
			}
			//maximize the browser
			driver.manage().window().maximize();
			//waiting condition
			Thread.sleep(1000);
			//enter into url
			driver.get("https://app-staging.nokodr.com/");	
			
		}
		
		
		public static void postCondition() {
			driver.quit();
		}
	

}
