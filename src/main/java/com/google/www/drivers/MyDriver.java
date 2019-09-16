package com.google.www.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class MyDriver {
	
	private static WebDriver driver;
	
	public static MyDriver web() {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\1074258\\Desktop\\Reto\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito", "--star-maximized", "--disable-infobars");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return new MyDriver();
	}
	
	public WebDriver enLaPagina(String url) {
		driver.get(url);
		return driver;
	} 

}