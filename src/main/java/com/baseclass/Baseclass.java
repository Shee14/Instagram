package com.baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	public static WebDriver driver;
	
	public static void browserLaunch() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace2\\BDD_Task\\src\\test\\resources\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static void elementSendkeys(WebElement element, String keys) {
		try {
			element.sendKeys(keys);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static void elementClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static Boolean elementIsDisplayed(WebElement element) {
		Boolean displayed = false;
		 try {
			displayed = element.isDisplayed();
			 System.out.println(displayed);
		} catch (Exception e) {
			e.printStackTrace();
		}return displayed;
	}
	
	
	
	
	

}
