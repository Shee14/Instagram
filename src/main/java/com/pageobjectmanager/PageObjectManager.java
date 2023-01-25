package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseclassInsta;
import com.locators.InstagramLogin;

public class PageObjectManager extends BaseclassInsta {
	
	public PageObjectManager(WebDriver wdriver) {
		this.driver = wdriver;
	}
	
	private InstagramLogin loginId;

	public InstagramLogin getLoginId() {
		if(loginId == null) {
			loginId = new InstagramLogin(driver);
		}
		return loginId;
	}

}
