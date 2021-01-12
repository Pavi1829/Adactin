package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.BaseClass;
import com.adactin.utility.ConfigurationReader;
import com.adactin.utility.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/adactin/feature/Adactin.feature",
                 glue = "com\\adactin\\stepdefinition",
                 plugin= {//"pretty","html:Repot/cucumberReport.html","json:Report/cucumber.json",
                		 "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:Report/CucumberExtentReport.html"},
                		 
                 //tags= {"@SmokeTest"},
                 monochrome = true, 
                 dryRun = false, 
                 strict = true)
public class TestRunner {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws IOException {
		String browserName = FileReaderManager.getInstance().getcrInstance().getBrowserName();
		driver = BaseClass.getBrowser(browserName);
		

	}

	@AfterClass
	public static void teardown() {
		driver.close();
		
		/*
		 * ConfigurationReader cr = new ConfigurationReader(); String browserName =
		 * cr.getBrowserName(); driver = BaseClass.getBrowser(browserName);
		 */
		

	}

}
