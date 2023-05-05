package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass {
	/**
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @see Method which is going to execute before each scenario like browser launch,maximize window.
	 */
	
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		getDriver(getPropertyFileValue("browser"));
		enterURL(getPropertyFileValue("url"));
		maximizewindow();
		implicitlyWaits(10);
		
		
	}
	/**
	 * 
	 * @param scenario
	 * @see Method which is going to execute after each scenario like quit browser,screenshot.
	 */
	@After
	public void afterScenario(Scenario scenario) {
		if(scenario.isFailed()) {
			scenario.attach(screenshot(), "sample.png", "Every after scenario");
		}
		//quit();
	}

}
