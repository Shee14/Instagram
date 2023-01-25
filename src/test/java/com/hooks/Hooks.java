package com.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.baseclass.BaseclassInsta;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseclassInsta {
	
	@Before
	public static void beforeHooks () {
		System.out.println("ChromeBrowser is yet to Start");
	}
	
	@After
	public static void afterHooks(Scenario sc) {
		System.out.println("Execution Completed Successfully");
		TakesScreenshot ts = (TakesScreenshot)driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		sc.attach(screenshotAs, "image/png", "Screenshot");
		
		driver.quit();
	}
	
	

}
