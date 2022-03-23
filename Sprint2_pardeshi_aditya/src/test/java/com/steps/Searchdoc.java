//package com.steps;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Searchdoc {
//	
//	public WebDriver driver;	
////	@Given("user is logged in")
////	public void user_is_logged_in() throws InterruptedException {
////		System.setProperty("webdriver.chrome.driver","") ;
////		driver = new ChromeDriver();
////
////		driver.get("https://www.apollo247.com/");
////
////		driver.manage().window().maximize();
////		Thread.sleep(3000);
////		driver.findElement(By.id("wzrk-cancel")).click();
////		Thread.sleep(5000);
////
////		driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
////		Thread.sleep(3000);
////		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[1]/div[1]/input")).sendKeys("      ");
////		Thread.sleep(3000);
////	    driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[2]/button")).click();
////	    Thread.sleep(20000);
////	}
//
//	@Given("search bar should be accessible")
//	public void search_bar_should_be_accessible() {
//		driver.get("https://www.apollo247.com/");
//		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[2]/div/div[1]/div[2]/div/div[1]/div/a/div[2]/h1")).click();
//		boolean search_bar_visible = driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[2]/div[2]/div/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div/input")).isDisplayed();
//		System.out.println(search_bar_visible);
//	}
//
//	@When("user types input string")
//	public void user_types_input_string() {
//		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[2]/div[2]/div/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div/input")).sendKeys("Sharma");
//		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[2]/div[2]/div/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div[2]/div[1]/ul/a[1]/li")).click();
//	}
//
//	@Then("valid results with Doctor name appear in the suggestions")
//	public void valid_results_with_doctor_name_appear_in_the_suggestions() {
//	    driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[3]/div[1]/div[2]/div[2]/div[3]/div/button[1]/span[1]")).isDisplayed();
//	    
//	}
//
//	@Given("user is logged-in")
//	public void user_is_logged_in1() {
//	    
//	}
//
//	@Given("Clicks on Search Bar")
//	public void clicks_on_search_bar() {
//	    
//	}
//
//	@Given("types Doctor Name to Search")
//	public void types_doctor_name_to_search() {
//	    
//	}
//
//	@Then("valid results with Doctor name appear")
//	public void valid_results_with_doctor_name_appear() {
//	    
//	}
//
//	@When("user click on a city")
//	public void user_click_on_a_city() {
//	    
//	}
//
//	@Then("all the doctors from that city appear")
//	public void all_the_doctors_from_that_city_appear() {
//	    
//	}
//
//	@Then("Search functionality is available")
//	public void search_functionality_is_available() {
//	    
//	}
//
//	@When("user clicks on different filters")
//	public void user_clicks_on_different_filters() {
//	    
//	}
//
//	@Then("results are sorted according to the filters")
//	public void results_are_sorted_according_to_the_filters() {
//	   
//	}
//
//
//}



// -----------------------------------------------



package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searchdoc{
	ChromeDriver driver = new ChromeDriver();
////////////////////////////////////////////////////
//	BackGround
	/////////////////////////////////
	
	
	@Given("User is logged in")
	public void user_is_logged_in() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","") ;
		driver.get("https://www.apollo247.com/");
	
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("wzrk-cancel")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[1]/div[1]/input")).sendKeys("9552066154");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[2]/button")).click();
	    Thread.sleep(20000);
	}

	@Given("search bar should be accessible")
	public void search_bar_should_be_accessible() {
		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[2]/div/div[1]/div[2]/div/div[1]/div/a/div[2]/h1")).click();
	
		boolean search_bar_visible = driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[2]/div[2]/div/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div/input")).isDisplayed();
		System.out.println(search_bar_visible);
	}
	
///////////////////////////////////////////////////////////
//	Scenario 1:

	@When("user types input string")
	public void user_types_input_string() {
		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[2]/div[2]/div/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div/input")).sendKeys("Sharma");
		
	}

	@When("available specialities appear")
	public void available_specialities_appear() {
		boolean is_disp = driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[2]/div[2]/div/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div[2]/div[1]/ul/a[1]/li")).isDisplayed();
		System.out.println(is_disp);
	}

	@Then("user clicks on speciality")
	public void user_clicks_on_speciality() {
		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[2]/div[2]/div/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div[2]/div[1]/ul/a[1]/li")).click();
	}

	
	//////////////////////////
//	Scenario 2:	
	
	@When("user clicks on a city")
	public void user_clicks_on_a_city() {
	    driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[2]/div[2]/div/div[2]/div/div[1]/div/div[1]/div[3]/div/ul/li[1]/a")).click();
	}

	@Then("all the doctors from that city appear")
	public void all_the_doctors_from_that_city_appear() {
		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[3]/div[1]/div[2]/div[2]/div[5]/div/div[1]/div/a/div[1]")).isDisplayed();
	}

	@Then("User clicks on doctors name")
	public void user_clicks_on_doctors_name() {
		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[3]/div[1]/div[2]/div[2]/div[5]/div/div[1]/div/a/div[1]")).click();
	}
///////////////////////////////////////////
//	Scenario 3:
	
	@When("user types input string")
	public void user_types_input_string1() {
		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[2]/div[2]/div/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div/input")).sendKeys("Sharma");
		
	}

	@When("available specialities appear")
	public void available_specialities_appear1() {
		boolean is_disp = driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[2]/div[2]/div/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div[2]/div[1]/ul/a[1]/li")).isDisplayed();
		System.out.println(is_disp);
	}

	@Then("user clicks on speciality")
	public void user_clicks_on_speciality1() {
		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[2]/div[2]/div/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div[2]/div[1]/ul/a[1]/li")).click();
	}
	
	Thread.sleep(5000);
	
	@When("user clicks on different filters")
	public void user_clicks_on_different_filters() {
		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[3]/div[1]/div[2]/div[2]/div[4]/div/div[3]/button/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div[37]/div[3]/div[1]/div[2]/div/div/button[1]/span[1]/img")).click();
		driver.findElement(By.xpath("/html/body/div[37]/div[3]/div[2]/span[2]/button[2]/span[1]")).click();
	}

	@Then("results are sorted according to the filters")
	public void results_are_sorted_according_to_the_filters() {
	    
	}

}
