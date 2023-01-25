package com.stepdefinition;

import org.junit.Assert;

import com.baseclass.BaseclassInsta;
import com.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps extends BaseclassInsta {

	PageObjectManager pom = new PageObjectManager(driver);

	@Given("User {string} Browser Launch")
	public void user_browser_launch(String string) {
		browserLaunch();

	}

	@Given("User website Url {string}")
	public void user_website_url(String string) {
		getUrl(string);

	}

	@Given("User Verify Login Page landed")
	public void user_verify_login_page_landed() {
		Assert.assertTrue(elementIsDisplayed(pom.getLoginId().instaLogo));

	}

	@Given("User Enter Invalid Username {string}")
	public void user_enter_invalid_username(String string) {
		elementSendkeys(pom.getLoginId().getUserName(), string);

	}

	@Given("User Enter Invalid Password {string}")
	public void user_enter_invalid_password(String string) {
		elementSendkeys(pom.getLoginId().getPassword(), string);

	}

	@Given("User Click Login Button")
	public void user_click_login_button() {
		elementClick(pom.getLoginId().loginButton);

	}

	@Given("User Verify Invalid Login Message")
	public void user_verify_invalid_login_message() {
		Assert.assertTrue(elementIsDisplayed(pom.getLoginId().errorText));

	}

	@Then("User Verify Login is Successful")
	public void user_verify_login_is_successful() {

	}

}
