package com.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.types.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Book_Appointment {
	
	public WebDriver driver ;
	SimpleDateFormat date_ext = new SimpleDateFormat("dd");
    SimpleDateFormat mon_ext = new SimpleDateFormat("MM");
    SimpleDateFormat hour_ext = new SimpleDateFormat("HH");
    SimpleDateFormat minutes_ext = new SimpleDateFormat("mm");
    
    Date date = new Date();  
    
    String curr_date = date_ext.format(date);
    String curr_month = mon_ext.format(date);
    String curr_hour = hour_ext.format(date);
    String curr_minutes = minutes_ext.format(date);
    
    String past_date_chk = Integer.toString(Integer.parseInt(curr_date)-1);
    String future_date_chk = Integer.toString(Integer.parseInt(curr_date)+1);
    
	@Given("user can view Doctors List")
	public void user_can_view_doctors_list() {
		System.setProperty("webdriver.chrome.driver","") ;
		driver = new ChromeDriver();
		driver.get("https://www.apollo247.com/specialties/dermatology");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
		boolean visibilityofcards = driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[3]/div[1]/div[2]/div[2]/div[5]/div/div[1]")).isDisplayed();
		 if(visibilityofcards) { 
		       System.out.println("Displayed"); 
		    } 
		    else { 
		       System.out.println("Not Displayed"); 
		    } 
	}

	@Then("valid status is availability")
	public void valid_status_is_availability() {
		String chec = driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[3]/div[1]/div[2]/div[2]/div[4]/div/div[1]/p/span")).getText();
		if (chec.contains("Availability")) {
			System.out.println("Availability- Cool");
		}
		else {
			System.out.println("Availability - NotCool");
		}
		
//		driver.close();
//		driver.quit();
	}

	@Given("Doctor is available")
	public void doctor_is_available() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","") ;
		driver = new ChromeDriver();

		driver.get("https://www.apollo247.com/specialties/covid-consultation");

		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("wzrk-cancel")).click();
		Thread.sleep(3000);
		boolean available_txt = driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[3]/div[1]/div[2]/div[2]/div[5]/div/div[1]/div/div/div/p")).isDisplayed();
		System.out.println("available_txt");
		System.out.println(available_txt);
		
//		boolean chec1 = driver.findElement(By.className("jss384")).isDisplayed();
//		
//		boolean exp_avail = true;
//		System.out.println("Test1 Done");
//		
//		Assert.assertEquals(chec1,exp_avail);
		
	}

	@Given("user can click on profile")
	public void user_can_click_on_profile() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,\"/doctors/\")]")).click();
	}

	@Then("user is redirected to doctor profile")
	public void user_is_redirected_to_doctor_profile() throws InterruptedException {
		Thread.sleep(5000);
		
		boolean page_redirect_chk = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div/button/span[1]")).isDisplayed();
		
		System.out.println(page_redirect_chk);
		
//		driver.close();
//		driver.quit();
	}

	@Given("user has selected a Doctor")
	public void user_has_selected_a_doctor() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","") ;
		driver = new ChromeDriver();
		driver.get("https://www.apollo247.com/doctors/dr-dhanraj-k-745e6e8a-96ed-4239-b2a2-0eb37b241a14");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("wzrk-cancel")).click();
		Thread.sleep(5000);
		
		String reg_nos = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[2]/div[1]")).getText();
		System.out.println(reg_nos);
		boolean check_redirection = reg_nos.contains("Registration Number");
		boolean check_if_url_true = true;
		Assert.assertEquals(check_redirection,check_if_url_true);
		
		System.out.println("user has selected a Doctor DONE");
	}

	@Given("book appointment button is clicked")
	public void book_appointment_button_is_clicked() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div/button/span[1]")).click();
		
		System.out.println("book appointment button is clicked DONE");
		
	}
	
	@Given("user is logged-in")
	public void user_is_logged_in() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[1]/div[1]/input")).sendKeys("     ");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[2]/button")).click();
	    Thread.sleep(20000);
	    System.out.println("LOGIN DONE");
	}
	

	@Then("user can view appointment form")
	public void user_can_view_appointment_form() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button/span[1]")).click();
//		String form_check = driver.findElement(By.xpath("/html/body/div[23]/div[3]/div/div[2]/div/div")).getText();
		Thread.sleep(5000);
		boolean form_visible_check = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[3]/div/div[1]/div[1]/div/button[2]")).isDisplayed();
		System.out.println(form_visible_check);
		boolean check_if_form_visible_true = true;
		Assert.assertEquals(form_visible_check ,check_if_form_visible_true );
		
		System.out.println("DONE PROGRAM");
		
//		driver.close();
//		driver.quit();
	}
	
	@Given("appointment form is accessable")
	public void appointment_form_is_accessable() throws InterruptedException {
	   
		System.setProperty("webdriver.chrome.driver","") ;
		driver = new ChromeDriver();
		
		driver.get("https://www.apollo247.com/doctors/dr-sahana-gangatkar-caf8bbb1-ead8-4302-a5f2-8373c39a73a8");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("wzrk-cancel")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[1]/div[1]/input")).sendKeys("   ");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[2]/button")).click();
	    Thread.sleep(20000);
	    
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div/button")).click();
	
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[3]/div/div[1]/div[1]/div/button[2]/span[1]")).click();
		
		
		Thread.sleep(3000);
		
		
		
		boolean timeslot_visible = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div")).isDisplayed();
		System.out.println(timeslot_visible);
	}


	@Given("valid dates are available")
	public void valid_dates_are_available() throws InterruptedException {
		
		boolean present_view_valid_dates =driver.findElement(By.xpath("//p[text() = '"+curr_date+"']")).isDisplayed();
		Thread.sleep(2000);
		
		boolean future_view_valid_dates = driver.findElement(By.xpath("//p[text() = '"+future_date_chk+"']")).isDisplayed();
		Thread.sleep(2000);

		
		Assert.assertEquals(present_view_valid_dates,future_view_valid_dates);
		
		 
	}
	
	@Then("user can view all valid timeslot")
	public void user_can_view_all_valid_timeslot() {
		
		boolean view_valid_timeslot = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[3]/div/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div/ul/li[1]/button")).isDisplayed();
		boolean enabled_valid_timeslot = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[3]/div/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div/ul/li[1]/button")).isEnabled();
		System.out.println(view_valid_timeslot);
		System.out.println(enabled_valid_timeslot);
		Assert.assertEquals(view_valid_timeslot,enabled_valid_timeslot);
	}
	
	@Then("user cannot view all invalid timeslot")
	public void user_cannot_view_all_invalid_timeslot() {
		
//		boolean timeslot_visible = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div")).isDisplayed();
//		System.out.println(timeslot_visible);
	}

	@Then("user can view all valid dates")
	public void user_can_view_all_valid_dates() throws InterruptedException {
		boolean view_valid_dates_p =driver.findElement(By.xpath("//p[text() = '"+curr_date+"']")).isDisplayed();
		Thread.sleep(2000);
		boolean enabled_valid_dates_p = driver.findElement(By.xpath("//p[text() = '"+curr_date+"']")).isEnabled();
		Thread.sleep(2000);
		
		
		boolean view_valid_dates_f = driver.findElement(By.xpath("//p[text() = '"+future_date_chk+"']")).isDisplayed();
		Thread.sleep(2000);
		boolean enabled_valid_dates_f = driver.findElement(By.xpath("//p[text() = '"+future_date_chk+"']")).isEnabled();
		Thread.sleep(2000);
		
		Assert.assertEquals(view_valid_dates_p,enabled_valid_dates_p);
		Assert.assertEquals(view_valid_dates_f,enabled_valid_dates_f);
	}

	@Given("invalid dates are available")
	public void invalid_dates_are_available() {
		boolean view_invalid_dates_chk = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[3]/div/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[3]/div[5]/button")).isDisplayed();
		System.out.println(view_invalid_dates_chk);
	}

	@Then("user can view all invalid dates")
	public void user_can_view_all_invalid_dates() {
		
		SimpleDateFormat date_today = new SimpleDateFormat("dd");
		Date date1 = new Date();
		String t_curr_date = date_today.format(date1);
		
		
		String past_date_chk = Integer.toString(Integer.parseInt(t_curr_date)-1);
		System.out.println("past_date_chk :"+ past_date_chk);
		
		boolean view_invalid_dates = driver.findElement(By.xpath("//p[text() = '"+past_date_chk+"']")).isDisplayed();
		
		boolean disabled_invalid_dates = true;
		try {
			driver.findElement(By.xpath("//p[text() = '"+past_date_chk+"']")).click();
		}
		catch(ElementClickInterceptedException e) {
			System.out.println("invalid date click caught");
			disabled_invalid_dates = true;
		}
		
		System.out.println(disabled_invalid_dates);
	
		Assert.assertEquals(view_invalid_dates,disabled_invalid_dates);
	}


	@Given("user is loggedin")
	public void user_is_loggedin() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","") ;
//		driver = new ChromeDriver();
//		
//		driver.get("https://www.apollo247.com/doctors/dr-sahana-gangatkar-caf8bbb1-ead8-4302-a5f2-8373c39a73a8");
//		
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.findElement(By.id("wzrk-cancel")).click();
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[1]/div[1]/input")).sendKeys("  ");
//		Thread.sleep(3000);
//	    driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[2]/button")).click();
//	    Thread.sleep(20000);
	}
	
	@Given("user access to valid dates and timeslots")
	public void user_access_to_valid_dates_and_timeslots() {
		boolean timeslot_visible = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div")).isDisplayed();
		System.out.println(timeslot_visible);
	}

	@Given("timeslot is not selected")
	public void timeslot_is_not_selected() throws InterruptedException {
		driver.findElement(By.xpath("//p[text() = '"+future_date_chk+"']")).click();
		
		Thread.sleep(2000);
	}

	@Then("Book button is Disabled")
	public void book_button_is_disabled() throws InterruptedException {
		boolean book_btn_enable_check_f = true;
		try {
			driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[3]/div/div[2]/a/button/span")).click();
		}
		catch(ElementClickInterceptedException e) {
			System.out.println("Submit Exception caught");
			book_btn_enable_check_f = false;
		}
		
		System.out.println(book_btn_enable_check_f);
		
		boolean book_btn_false = false;
		
		Assert.assertEquals(book_btn_enable_check_f,book_btn_false);
		
	}

	

	@Given("user selected valid dates and timeslots")
	public void user_selected_valid_dates_and_timeslots() throws InterruptedException {
		
		
		//Fetching valid case data in real-time
		
		String time_to_book="";
	    SimpleDateFormat date_ext = new SimpleDateFormat("dd");
	    SimpleDateFormat mon_ext = new SimpleDateFormat("MM");
	    SimpleDateFormat hour_ext = new SimpleDateFormat("HH");
	    SimpleDateFormat minutes_ext = new SimpleDateFormat("mm");
	    
	    Date date = new Date();  
	    
	    String curr_date = date_ext.format(date);
	    String curr_month = mon_ext.format(date);
	    String curr_hour = hour_ext.format(date);
	    String curr_minutes = minutes_ext.format(date);
	    
	    
	    
	    
	    System.out.println("past_date_chk :"+ past_date_chk);
	    System.out.println("future_date_chk :"+ future_date_chk);
	    
	    System.out.println(curr_date);
	    System.out.println(curr_month);
	    System.out.println("curr_hour" + curr_hour);
	    System.out.println(curr_minutes);
	    
	    int i=Integer.parseInt(curr_minutes);  
	    
	    int num = Integer.parseInt(curr_hour);
	    System.out.println(num);
	    int answer = ((i+10)/10)*10;
	    if ((answer!=60) ) {
	    	
	    	num = Integer.parseInt(curr_hour);
	    	curr_hour = Integer.toString(num);

	    	time_to_book = curr_hour +":"+ Integer.toString(answer);
	    	
	    }
	    else {
	    	curr_hour = Integer.toString(Integer.parseInt(curr_hour)+1);
	    	curr_minutes = "00";
	    	if (Integer.parseInt(curr_hour) == 24) {
	    		time_to_book = "00" +":"+ curr_minutes;
	    	}
	    	else{
	    		time_to_book = curr_hour +":"+ curr_minutes;
	    	}
	    	}
	    
	    
	    
	    System.out.println(time_to_book);
		
	  //Implementation based on received data
		
		
		driver.findElement(By.xpath("//p[text() = '"+curr_date+"']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text() = '"+future_date_chk+"']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text() = '"+curr_date+"']")).click();
		Thread.sleep(5000);
		
		try {
		driver.findElement(By.xpath("//button[contains(@value,'"+time_to_book+"')]")).click();
		Thread.sleep(2000);
		}
		catch(NoSuchElementException e) {
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[3]/div/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div/ul/li[1]")).click();
		}
		
		boolean submit_btn_enables = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[3]/div/div[2]/a/button/span[1]")).isEnabled();
		System.out.println("submit_btn_enables");
		System.out.println(submit_btn_enables);
		boolean submit_btn_t_chk = true;
		
		
		Assert.assertEquals(submit_btn_enables ,submit_btn_t_chk );
	}

	@Then("Book button is Enabled")
	public void book_button_is_enabled() throws InterruptedException {
		Thread.sleep(2000);
		boolean book_btn_enable_check_t = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[3]/div/div[2]/a/button")).isEnabled();
		System.out.println(book_btn_enable_check_t);
		
		boolean check_if_btn_enable_true = true;
		Assert.assertEquals(book_btn_enable_check_t ,check_if_btn_enable_true );
	}
	
}
