package com.greens.TestPaperAssignment;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.greens.util.Report;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "F:\\JAVA course\\workspace\\CucumberSample\\src\\test\\resources\\FeatureFile\\addactin.feature", glue = {
		"com.greens.Stepdef" }, plugin = { "pretty",
				"html:target/outputReport" }, dryRun = false, monochrome = true)
public class AddactinTest {
	@AfterClass
	public static void afterClass() {
		Report.genrateJVMReport(System.getProperty("user.dir")+"\\target\\outputReport\\data.json");
	}
}
