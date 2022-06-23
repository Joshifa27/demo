package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	public static void main(String[] args) {
		
		
		//1.Browser Configuration
		
	//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application.exe");
		
		
	WebDriverManager.chromedriver().setup();
		
		
		//2. Launch the Browser
		
		WebDriver driver = new ChromeDriver();
		
		//3.Open the Url of the application
		
		driver.get("https://www.facebook.com/");
			
		
	}

}
