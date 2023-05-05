package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags ="", snippets = SnippetType.CAMELCASE, 
publish = true, dryRun = false, monochrome = true, 
stepNotifications = true, plugin = {
"pretty","json:target\\Output.json" }, glue = "com.stepdefinition", features = "src\\test\\resources\\Features")
public class TestRunnerClass extends BaseClass {
	/**
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @see  Method to be run after all the execution and generate JVM report foe every scenarios
	 */
	@AfterClass
	public static void afterclass() throws FileNotFoundException, IOException {
		Reporting.generatesJvmReport(System.getProperty("user.dir") + getPropertyFileValue("jsonpath"));
	}
		

}
