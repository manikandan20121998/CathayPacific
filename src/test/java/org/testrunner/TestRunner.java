package org.testrunner;

import org.base.BaseClass;
import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.core.api.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources",
dryRun=false,glue= "org.stepdefinition",
plugin= {"json:src\\test\\resources\\Reports\\JsonRep\\rep.json",
       "html:src\\test\\resources\\Reports\\HtmlRep\\html"})
public class TestRunner extends BaseClass{
@AfterClass
public static void afterClass() {

	JVMReport.jvmrep("src\\test\\resources\\Reports\\JsonRep\\rep.json");
	System.out.println("Done........");

}

}
