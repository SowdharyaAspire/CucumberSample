package com.greens.TestPaperAssignment;

import java.util.Scanner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "F:\\JAVA course\\workspace\\CucumberSample\\src\\test\\resources\\FeatureFile\\FbLogin.feature", glue = {
		"com.greens.Stepdef" }, monochrome = true)
public class FBLogin {
}
