package com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseclassInsta;

public class InstagramLogin extends BaseclassInsta{
	
	public InstagramLogin(WebDriver wdriver) {
		this.driver = wdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//i[@aria-label='Instagram']")
	public WebElement instaLogo;
	
	@FindBy(name = "username")
	private WebElement userName;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(xpath = "//div[text()='Log in']")
	public WebElement loginButton;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(id = "slfErrorAlert")
	public WebElement errorText;
	

}
