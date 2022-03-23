package com.steps;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RedirectionTest {
	WebDriver driver;
	
	//Doctor Consultation Records
	@Given("User is logged-in for Valid results of Consultation records till date for the logged-in profile")
	public void user_is_logged_in_for_valid_results_of_consultation_records_till_date_for_the_logged_in_profile() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknanda\\Documents\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();    
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(Keys.RETURN);
		Thread.sleep(15000);

	}
	
	@Given("Health Records page is accessible")
	public void health_records_page_is_accessible() {
		driver.findElements(By.cssSelector("[title=\"View Health Records\"]"));
	}

	@When("the user clicks on View Health Records")
	public void the_user_clicks_on_view_health_records() {
		driver.findElement(By.cssSelector("[title=\"View Health Records\"]")).click();
	}

	@When("selects Doctor Consultations")
	public void selects_doctor_consultations() {
		driver.findElement(By.cssSelector("[href=\"/health-records/prescription\"]")).click();
	}

	@Then("all the previous Doctor Consultations records are displayed")
	public void all_the_previous_doctor_consultations_records_are_displayed() {
	    System.out.println("Out of Scope");
	    driver.quit();
	}
	
	@Given("User is logged-in to Validate error message in case of No data available")
	public void user_is_logged_in_to_validate_error_message_in_case_of_no_data_available() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknanda\\Documents\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();    
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(Keys.RETURN);
		Thread.sleep(15000);
	}
	
	@Then("No Data Available is displayed !!!")
	public void no_data_available_is_displayed() {
		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'No data available !!!')]")));
		driver.findElement(By.xpath("//h3[contains(text(),'No data available !!!')]"));
		driver.quit();
	}
	
	@Given("User is logged-in to Validate the redirection to a particular Consultation record")
	public void user_is_logged_in_to_validate_the_redirection_to_a_particular_consultation_record() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknanda\\Documents\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();    
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(Keys.RETURN);
		Thread.sleep(15000);
	}
	
	@When("selects a record under Doctor Consultations")
	public void selects_a_record_under_doctor_consultations() {
		System.out.println("Out of Scope");
	}

	@Then("the page is redirected to detailed consultation page for that particular record")
	public void the_page_is_redirected_to_detailed_consultation_page_for_that_particular_record() {
		System.out.println("Out of Scope");
		driver.quit();
	}
	
	@Given("User is logged-in to Check the details of a particular Consultation record")
	public void user_is_logged_in_to_check_the_details_of_a_particular_consultation_record() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknanda\\Documents\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();    
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(Keys.RETURN);
		Thread.sleep(15000);
	}
	
	@Then("the page is redirected to the consultation page for that particular record")
	public void the_page_is_redirected_to_the_consultation_page_for_that_particular_record() {
		System.out.println("Out of Scope");
	}

	@Then("all the details for that record are displayed")
	public void all_the_details_for_that_record_are_displayed() {
		System.out.println("Out of Scope");
		driver.quit();
	}
	
	//Health Bill Records
	@Given("User is logged-in for Valid results of Billing records till date for the logged-in profile")
	public void user_is_logged_in_for_valid_results_of_billing_records_till_date_for_the_logged_in_profile() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknanda\\Documents\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();    
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(Keys.RETURN);
		Thread.sleep(15000);
	}
	
	@When("selects Bills")
	public void selects_bills() {
//		driver.navigate().to("https://www.apollo247.com/health-records/bill");
		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Bills')]")));
		driver.findElement(By.xpath("//span[contains(text(),'Bills')]")).click();
	}

	@Then("all the previous Bills are displayed")
	public void all_the_previous_bills_are_displayed() {
		System.out.println("Out of Scope");
	    driver.quit();
	}
	
	@Given("User is logged-in to Validate error message in case of No data available for Billing Records")
	public void user_is_logged_in_to_validate_error_message_in_case_of_no_data_available_for_billing_records() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknanda\\Documents\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();    
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(Keys.RETURN);
		Thread.sleep(15000);
	}
	
	@Given("User is logged-in to Validate the redirection to a particular Bill")
	public void user_is_logged_in_to_validate_the_redirection_to_a_particular_bill() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknanda\\Documents\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();    
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(Keys.RETURN);
		Thread.sleep(15000);
	}
	
	@When("selects a record under Bills")
	public void selects_a_record_under_bills() {
		System.out.println("Out of Scope");
	}
	
	@Then("the page is redirected to detailed page for that particular bill")
	public void the_page_is_redirected_to_detailed_page_for_that_particular_bill() {
		System.out.println("Out of Scope");
		driver.quit();
	}
	
	@Given("User is logged-in to Check the details of a particular Bill")
	public void user_is_logged_in_to_check_the_details_of_a_particular_bill() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknanda\\Documents\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();    
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(Keys.RETURN);
		Thread.sleep(15000);
	}
	
	@Then("all the details for that bill are displayed")
	public void all_the_details_for_that_bill_are_displayed() {
		System.out.println("Out of Scope");
		driver.quit();
	}
	
	@Given("User is logged-in to Validate redirection to Bills page from a particular record")
	public void user_is_logged_in_to_validate_redirection_to_bills_page_from_a_particular_record() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknanda\\Documents\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();    
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(Keys.RETURN);
		Thread.sleep(15000);
	}
	
	@Then("the page is redirected to detailed page for that particular record")
	public void the_page_is_redirected_to_detailed_page_for_that_particular_record() {
		System.out.println("Out of Scope");
	}

	@Then("click on Back button")
	public void click_on_back_button() {
		System.out.println("Out of Scope");
	}

	@Then("the page is redirected to Bills page")
	public void the_page_is_redirected_to_bills_page() {
		System.out.println("Out of Scope");
	}
	
	//Health Condition Records
	@Given("User is logged-in for Valid results of Health Condition records till date for the logged-in profile")
	public void user_is_logged_in_for_valid_results_of_health_condition_records_till_date_for_the_logged_in_profile() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknanda\\Documents\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();    
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(Keys.RETURN);
		Thread.sleep(15000);
	}
	
	@When("selects Health Conditions")
	public void selects_health_conditions() {
		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Health Conditions')]")));
		driver.findElement(By.xpath("//span[contains(text(),'Health Conditions')]")).click();
	}

	@Then("all the previous Health Conditions records are displayed")
	public void all_the_previous_health_conditions_records_are_displayed() {
		System.out.println("Out of Scope");
	    driver.quit();
	}
	
	@Given("User is logged-in to Validate error message in case of No data available for Health Condition records")
	public void user_is_logged_in_to_validate_error_message_in_case_of_no_data_available_for_health_condition_records() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknanda\\Documents\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();    
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(Keys.RETURN);
		Thread.sleep(15000);
	}
	

	@Given("User is logged-in to Validate the redirection to a particular Health Condition record")
	public void user_is_logged_in_to_validate_the_redirection_to_a_particular_health_condition_record() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknanda\\Documents\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();    
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(Keys.RETURN);
		Thread.sleep(15000);
	}
	
	@When("selects a record under Health Conditions")
	public void selects_a_record_under_health_conditions() {
		System.out.println("Out of Scope");
	}
	
	@Then("the page is redirected to detailed page for that particular record under Health Condition Records")
	public void the_page_is_redirected_to_detailed_page_for_that_particular_record_under_health_condition_records() {
		System.out.println("Out of Scope");
		driver.quit();
	}
	
	@Given("User is logged-in to Check the details of a particular Health Condition record")
	public void user_is_logged_in_to_check_the_details_of_a_particular_health_condition_record() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknanda\\Documents\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();    
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(Keys.RETURN);
		Thread.sleep(15000);
	}
	
	@Given("User is logged-in to Validate redirection to Health Conditions page from a particular record")
	public void user_is_logged_in_to_validate_redirection_to_health_conditions_page_from_a_particular_record() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknanda\\Documents\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();    
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(Keys.RETURN);
		Thread.sleep(15000);
	}
	
	@Then("the page is redirected to Health Conditions page")
	public void the_page_is_redirected_to_health_conditions_page() {
		System.out.println("Out of Scope");
		driver.quit();
	}
	
	//Hospitalization Records
	@Given("User is logged-in for Valid results of Hospitalization records till date for the logged-in profile")
	public void user_is_logged_in_for_valid_results_of_hospitalization_records_till_date_for_the_logged_in_profile() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknanda\\Documents\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();    
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(Keys.RETURN);
		Thread.sleep(15000);
	}
	
	@When("selects Hospitalization")
	public void selects_hospitalization() {
		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Hospitalization')]")));
		driver.findElement(By.xpath("//span[contains(text(),'Hospitalization')]")).click();
	}

	@Then("all the previous Hospitalization records are displayed")
	public void all_the_previous_hospitalization_records_are_displayed() {
		System.out.println("Out of Scope");
	    driver.quit();
	}
	
	@Given("User is logged-in to Validate error message in case of No data available under Hospitalization records")
	public void user_is_logged_in_to_validate_error_message_in_case_of_no_data_available_under_hospitalization_records() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknanda\\Documents\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();    
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(Keys.RETURN);
		Thread.sleep(15000);
	}
	
	@Given("User is logged-in to Validate the redirection to a particular Hospitalization record")
	public void user_is_logged_in_to_validate_the_redirection_to_a_particular_hospitalization_record() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknanda\\Documents\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();    
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(Keys.RETURN);
		Thread.sleep(15000);
	}
	
	@When("selects a record under Hospitalization")
	public void selects_a_record_under_hospitalization() {
		System.out.println("Out of Scope");
	}
	
	@Then("the page is redirected to detailed page for that particular record under Hospitalization records")
	public void the_page_is_redirected_to_detailed_page_for_that_particular_record_under_hospitalization_records() {
		System.out.println("Out of Scope");
		driver.quit();
	}
	
	@Given("User is logged-in to Check the details of a particular Hospitalization record")
	public void user_is_logged_in_to_check_the_details_of_a_particular_hospitalization_record() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknanda\\Documents\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();    
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(Keys.RETURN);
		Thread.sleep(15000);
	}
	
	@Then("the page is redirected to Hospitalization page")
	public void the_page_is_redirected_to_hospitalization_page() {
		System.out.println("Out of Scope");
		driver.quit();
	}
	
	//Insurance Records
	@Given("User is logged-in for Valid results of Insurance records till date for the logged-in profile")
	public void user_is_logged_in_for_valid_results_of_insurance_records_till_date_for_the_logged_in_profile() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknanda\\Documents\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();    
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(Keys.RETURN);
		Thread.sleep(15000);
	}
	
	@When("selects Insurance")
	public void selects_insurance() {
		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Insurance')]")));
		driver.findElement(By.xpath("//span[contains(text(),'Insurance')]")).click();
	}
	
	@Then("all the previous Insurance Bills are displayed")
	public void all_the_previous_insurance_bills_are_displayed() {
		System.out.println("Out of Scope");
		driver.quit();
	}
	
	@Given("User is logged-in to Validate error message in case of No data available under Insurance Records")
	public void user_is_logged_in_to_validate_error_message_in_case_of_no_data_available_under_insurance_records() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknanda\\Documents\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();    
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(Keys.RETURN);
		Thread.sleep(15000);
	}
	
	@Given("User is logged-in to Validate the redirection to a particular Insurance")
	public void user_is_logged_in_to_validate_the_redirection_to_a_particular_insurance() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknanda\\Documents\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();    
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(Keys.RETURN);
		Thread.sleep(15000);
	}
	
	@When("selects a record under Insurance")
	public void selects_a_record_under_insurance() {
		System.out.println("Out of Scope");
	}

	@Then("the page is redirected to detailed page for that particular Insurance report")
	public void the_page_is_redirected_to_detailed_page_for_that_particular_insurance_report() {
		System.out.println("Out of Scope");
		driver.quit();
	}
	
	@Given("User is logged-in to Check the details of a particular Insurance report")
	public void user_is_logged_in_to_check_the_details_of_a_particular_insurance_report() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknanda\\Documents\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();    
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(Keys.RETURN);
		Thread.sleep(15000);
	}
	
	@Then("all the details for that Insurance are displayed")
	public void all_the_details_for_that_insurance_are_displayed() {
		System.out.println("Out of Scope");
		driver.quit();
	}
	
	@Given("User is logged-in to Validate redirection to Insurance page from a particular record")
	public void user_is_logged_in_to_validate_redirection_to_insurance_page_from_a_particular_record() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aknanda\\Documents\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();    
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
	    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(Keys.RETURN);
		Thread.sleep(15000);
	}
	
	@Then("the page is redirected to Insurance page")
	public void the_page_is_redirected_to_insurance_page() {
		System.out.println("Out of Scope");
		driver.quit();
	}
}
