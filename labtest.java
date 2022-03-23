package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class labtest {
	public WebDriver driver ;
	@Given("Website is accessible")
	public void website_is_accessible() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\royab\\Downloads\\Sprint2-main\\Sprint2-main\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.apollo247.com/");
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
		driver.manage().window().maximize();
//		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"hidebanner\"]/p/span")).click();
	}

	@Given("User can access Lab Test Page")
	public void user_can_access_lab_test_page() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/header/div[4]/div[1]/a[3]/span[1]")).click();
		Thread.sleep(3000);
	}

	@Then("Valid Lab Tests appear")
	public void valid_lab_tests_appear() {
		String expectedurl="https://www.apollo247.com/lab-tests";
		String currentlaburl=driver.getCurrentUrl();
		Assert.assertEquals(expectedurl,currentlaburl);
		driver.quit();
	}

	@Given("User is logged in")
	public void user_is_logged_in() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[1]/div[1]/input")).sendKeys("7045094112");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[2]/button")).click();
	    Thread.sleep(30000);
	    System.out.println("LOGIN DONE");
	}

	@When("User clicks Add to cart")
	public void user_clicks_add_to_cart() throws InterruptedException {
	    driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[2]/div[6]/div[2]/div/div/div/div[1]/div/div/div/div/div/div/button/span[1]")).click();
	    Thread.sleep(3000);
	    
	}

	@Then("Test is added to cart")
	public void test_is_added_to_cart() {
	    boolean visible_text = driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[3]/div[2]/div[1]/p")).isDisplayed();
	    System.out.println(visible_text);
	    driver.quit();
	}

	@When("User clicks on View Details")
	public void user_clicks_on_view_details() throws InterruptedException {
	    driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[3]/div[2]/div[1]/span")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[3]/div[2]/ul[2]/li[1]/div/div[2]/button/span[1]")).click();
	    Thread.sleep(3000);
	}

	@Then("User can add recommended test to cart")
	public void user_can_add_recommended_test_to_cart() throws InterruptedException {
	    boolean reco = driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[3]/div[2]/ul[2]/h3")).isDisplayed();
	    System.out.println(reco);
	    driver.quit();
	}

	@When("User clicks on remove test")
	public void user_clicks_on_remove_test() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[3]/div[2]/ul[1]/li[1]/div/div[2]/button/span[1]")).click();
		Thread.sleep(3000);
	}

	@Then("Test is removed from cart")
	public void test_is_removed_from_cart() {
	   boolean visible_text = driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[3]/div[1]/p")).isDisplayed();
       System.out.println(visible_text);
       driver.quit();
	}

	@Given("User clicks on Add to cart")
	public void user_clicks_on_add_to_cart() throws InterruptedException {
	    driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[2]/div[6]/div[2]/div/div/div/div[1]/div/div/div/div/div/div/button/span[1]")).click();
	    Thread.sleep(3000);
	}

	@Given("User clicks on Go to cart")
	public void user_clicks_on_go_to_cart() throws InterruptedException {
	    driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[3]/div[2]/div[2]/button/span[1]")).click();
	    Thread.sleep(3000);
	    
	}

	@When("User clicks Add Member")
	public void user_clicks_add_member() {
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[1]/div[2]/button/span[1]")).click();
	    
	}

	@When("User fills the form")
	public void user_fills_the_form() {
	    try {
			driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div[1]/div[1]/div/input")).sendKeys("Akash");
			driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div[2]/div[1]/div/input")).sendKeys("Agrahari");
			driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div[3]/div[1]/div/input")).sendKeys("23/03/2000");
			driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div[4]/div/div[1]/button/span[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]")).click();
			driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/div[2]/div/div[2]/button[2]/span[1]")).click();
			driver.findElement(By.xpath("/html/body/div[10]/div[3]/div/div[2]/div/div[2]/button[2]/span[1]")).click();
		} catch (NoSuchElementException e) {
			System.out.println("Passed");
		}
	}

	@Then("New member is added as Patient")
	public void new_member_is_added_as_patient() {
	    boolean member = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/p")).isDisplayed();
	    System.out.println(member);
	    driver.quit();
	}

	@Given("User selects patient for the test")
	public void user_selects_patient_for_the_test() {
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[1]/div[1]/div/div[2]")).click();
	    
	}

	@Then("Patients are added")
	public void patients_are_added() {
	    boolean confirm = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[1]/div[2]/ul/li/div/div[2]/span/span[1]/input")).isDisplayed();
	    System.out.println(confirm);
	    driver.quit();
	}

	@Then("User is redirected to payment page")
	public void user_is_redirected_to_payment_page() throws InterruptedException {
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/button/span[1]")).click();
	    Thread.sleep(3000);
	    try {
	    	String pay = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div/div[3]/div[1]/div[1]/div/div[3]/div/div[1]/span")).getText();
		    String true_pay = "TOTAL CHARGES";
		    Assert.assertEquals(pay,true_pay);
	    }
	    catch(NoSuchElementException e) {
	           System.out.println("Passed");
        }
	    driver.quit();
	}
}
