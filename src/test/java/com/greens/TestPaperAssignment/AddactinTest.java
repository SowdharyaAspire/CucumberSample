package com.greens.TestPaperAssignment;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "F:\\JAVA course\\workspace\\CucumberSample\\src\\test\\resources\\FeatureFile\\addactin.feature", glue = {
		"com.greens.Stepdef" }, plugin = { "pretty",
				"html:target/outputReport" }, dryRun = false, monochrome = true)
public class AddactinTest {

}