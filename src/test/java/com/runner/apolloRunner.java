package com.runner;

//import org.junit.runner.RunWith;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeMethod;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", 
				glue = "com.stepdefinition", 
				plugin = { "html:target/Cucumber-html-report",
		"json:target/cucumber.json", "pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json",
		"junit:target/cucumber-results.xml" }, 
				dryRun = false, 
				monochrome = true)

public class apolloRunner{
	 
	 private TestNGCucumberRunner testNGCucumberRunner;
	 
	 public static WebDriver driver;
	 
	 @BeforeClass(alwaysRun = true)
	 public void setUpCucumber() {
	 testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	 }
	 
		/*
		 * @BeforeMethod(alwaysRun = true) public void setUpClass() throws Exception {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\driver\\chromedriver_win32\\chromedriver.exe"); driver = new
		 * ChromeDriver(); System.out.println(driver); }
		 */
	 
	 @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "Scenarios")
	 public void Scenario(PickleWrapper pickle,FeatureWrapper cucumberFeature) {
	 testNGCucumberRunner.runScenario(pickle.getPickle());
	 }
	 
	 @DataProvider
	 public Object[][] Scenarios() {
	 return testNGCucumberRunner.provideScenarios();
	 }
	 
	 @AfterClass(alwaysRun = true)
	 public void tearDownClass() throws Exception {
	 testNGCucumberRunner.finish();
	 }
}



//package com.runner;
//
//import org.junit.runner.RunWith;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import cucumber.api.CucumberOptions;
//import cucumber.api.testng.CucumberFeatureWrapper;
//import cucumber.api.testng.TestNGCucumberRunner;
//import io.cucumber.junit.Cucumber;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//		features = "Features",
//        glue = "com.stepdefinition",
//        tags = {"~@Ignore"},
//        format = {
//                "pretty",
//                "html:target/cucumber-reports/cucumber-pretty",
//                "json:target/cucumber-reports/CucumberTestReport.json",
//                "rerun:target/cucumber-reports/rerun.txt"
//        },plugin = "json:target/cucumber-reports/CucumberTestReport.json"
//)
//
//public class apolloRunner 
//{
//	private TestNGCucumberRunner testNGCucumberRunner;
//	 
//    @BeforeClass(alwaysRun = true)
//    public void setUpClass() throws Exception {
//        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//    }
// 
//    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
//    public void feature(CucumberFeatureWrapper cucumberFeature) {
//        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
//    }
// 
//    @DataProvider
//    public Object[][] features() {
//        return testNGCucumberRunner.provideFeatures();
//    }
// 
//    @AfterClass(alwaysRun = true)
//    public void tearDownClass() throws Exception {
//        testNGCucumberRunner.finish();
//    }
//}
