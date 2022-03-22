package com.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.types.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class Appointment_List {
	public WebDriver driver ;
	
	@Given("user is logged in")
	public void user_is_logged_in() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","") ;
		driver = new ChromeDriver();
		
		driver.get("https://www.apollo247.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("wzrk-cancel")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[1]/div[1]/input")).sendKeys("      ");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[2]/button")).click();
	    Thread.sleep(20000);
	}

	@Given("Appointment page is accessed")
	public void appointment_page_is_accessed() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/header/div[4]/div[1]/a[1]")).click();
	    Thread.sleep(3000);
	    String title_live = driver.getCurrentUrl();
	    System.out.println(title_live);
	    String url_check_valid = "https://www.apollo247.com/appointments";
	    Assert.assertEquals(title_live ,url_check_valid);
	}

	@Then("all booked Appointments will be visible")
	public void all_booked_appointments_will_be_visible() throws InterruptedException {
		Thread.sleep(3000);
	    boolean s = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div")).isDisplayed();
	    //Out of scope due to booking button
	    System.out.println(s);
	    System.out.println("Out of scope due to booking button");
	}

	@Then("error message is displayed when no history")
	public void error_message_is_displayed_when_no_history() throws InterruptedException {
	    Thread.sleep(3000);
	    boolean s = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div")).isDisplayed();

	    System.out.println(s);
	}

	
//	@Given("Appointment page is accessed")
//	public void appointment_page_is_accessed() {
//		
//		System.setProperty("webdriver.chrome.driver","") ;
//		driver = new ChromeDriver();
//		driver.get("https://www.apollo247.com/appointments");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//*[@id=\"loginPopup\"]")).click();
//		
//	}
//	
//	
//
//	@Then("all booked Appointments will be visible")
//	public void all_booked_appointments_will_be_visible() {
//		System.out.println("Out of Scope");
//	}
//
//
//	@Then("error message is displayed")
//	public void error_message_is_displayed() {
//	  String error_msg_check =  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/h3")).getText();
//	  boolean check_if_emsg_visible_true = true;
//	  Assert.assertEquals(error_msg_check ,check_if_emsg_visible_true );
//	}
	
	
}
