package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\Instagram.feature", glue = { "com.stepdefinition",
		"com.hooks" }, stepNotifications = true, dryRun = true, monochrome = true, plugin = {
				"html: target\\report\\Instagram.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"json:target\\report\\Instagram_j.json " }, publish = true)

public class Runner {

}
