package Enzigma;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript {
public static void main(String[] args) {
	//open the browser
	ChromeDriver driver=new ChromeDriver();
	//maximize the browser
	driver.manage().window().maximize();
	//navigate to a noKodr platform
	driver.navigate().to("https://app-staging.nokodr.com/");
	//close the browser
	driver.close();
}
}
