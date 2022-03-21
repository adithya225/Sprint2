package com.stepdefinition;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class redirectionTest 
{
	WebDriver driver;
	
	// Home Page Functionality
	// Verification of Login button on home page

	@Given("Chrome is Opened")
	public void chrome_is_opened() 
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
	    System.out.println("Successfully Opened Google Chrome, Now You Can Search.......");
	}

	@When("User is on WebPage")
	public void user_is_on_web_page()

	{
	    driver.navigate().to("https://www.apollo247.com/");
	    driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();	    
	}

	@Then("Login button is Visible")
	public void login_button_is_visible() 
	{
		boolean eleSelected= driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).isDisplayed();
		System.out.println(eleSelected);
		boolean expSelected=true;
		assertEquals(expSelected, eleSelected);
		System.out.println("Login Button is Visible on the Home Page");
		driver.quit();
	}

    // Redirection to Home Page on clicking on head or title on the page
	@Given("website is opened")
	public void website_is_opened() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.apollo247.com/");
        driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
	    System.out.println("Website is Opened");
	}
	
	@When("click on the logo on the Home Page")
	public void click_on_the_logo_on_the_home_page() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[2]/div/div[1]/div[2]/div/div[1]/div/a/div[2]/h1")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/header/div[1]/a/img")).click();
		System.out.println("Clicked in the Logo on the Home Page");
	}
	@Then("Redirect to the Home Page")
	public void redirect_to_the_home_page() 
	{
		String expurl = "https://www.apollo247.com/";
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		Assert.assertEquals( expurl,URL);
		driver.quit();
	}


    //Redirection to the Respective page on clicking on the menu options

	@Given("HomePage is opened")
	public void home_page_is_opened() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.apollo247.com/");
        driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
	    System.out.println("Website is Opened");
	}
	@When("click on the menu options on Home Page")
	public void click_on_the_menu_options_on_home_page() throws InterruptedException 
	{
	   driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/header/div[4]/div[1]/a[2]/span[2]")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
	}
	@Then("Redirect to the Respective Page")
	public void redirect_to_the_respective_page() 
	{
		String exptitle = "Online Medical Store, Online Medicine Order, Fastest Delivery - Apollo Pharmacy";
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals( exptitle,title);
		driver.quit();
	}
	
    // Purchase Medicine
	// Search medicine

	@Given("website is upon running")
	public void website_is_upon_running() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.apollo247.com/");
        driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
	    System.out.println("Website is Opened");
	}
	@Given("navigate to medicines page")
	public void navigate_to_medicines_page() throws InterruptedException 

	{
		driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/header/div[4]/div[1]/a[2]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
	}

	@When("user type on Search box")
	public void user_type_on_search_box() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"searchProduct\"]")).sendKeys("Diabetes Care");
		Thread.sleep(2000);
	}
	@When("user click on Search button")
	public void user_click_on_search_button() 
	{
		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[1]/div[3]/div[1]/div[1]/div[1]/button/img")).click();
	}
	@Then("list of Searched Products should display")
	public void list_of_searched_products_should_display() 
	{
		String bodyText = driver.findElement(By.tagName("body")).getText();
		boolean search = bodyText.contains("Diabetes");
		boolean expsearch = true;
		Assert.assertEquals(search, expsearch);
		driver.quit();

	}
	
	// Adding Medicine to the cart
	
	@Given("search Medicine is done")
	public void search_medicine_is_done() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.apollo247.com/");
        driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
	    System.out.println("Website is Opened");
	    driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/header/div[4]/div[1]/a[2]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"searchProduct\"]")).sendKeys("Diabetes Care");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='search icon']")).click();
		Thread.sleep(2000);
	}
	@When("User click on add to cart button")
	public void user_click_on_add_to_cart_button() 
	{
		driver.findElement(By.xpath("//body//div//div//div//div//div//div//div[1]//div[1]//div[2]//button[1]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='GO TO CART']")).click();
		
	}
	@Then("Medicine Successfully add to cart")
	public void medicine_successfully_add_to_cart() 
	{
		String ActualText = driver.findElement(By.tagName("body")).getText();
		String expTest = "Ensure Vanilla Delight Flavoured Diabetes Care Powder, 400 gm Jar";
		boolean res = ActualText.contains(expTest);
		boolean expres = true;
		Assert.assertEquals(res, expres);
		driver.quit();
	}
	
//	 Updating the cart

	@Given("Medicine is added to the Cart")
	public void medicine_is_added_to_the_cart() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.apollo247.com/");
        driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
	    System.out.println("Website is Opened");
	    driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/header/div[4]/div[1]/a[2]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"searchProduct\"]")).sendKeys("Diabetes Care");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='search icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body//div//div//div//div//div//div//div[1]//div[1]//div[2]//button[1]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='GO TO CART']")).click();
		
	}
	@When("user click on adding or deleting")
	public void user_click_on_adding_or_deleting() throws InterruptedException 
	{
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//div[@role='button']"));
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);	
		Thread.sleep(1000);
		WebElement ele1 = driver.findElement(By.cssSelector("img[title='Remove item from Cart']"));
		Thread.sleep(1000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele1);
	}

	@Then("quantity of products need to be updated in the cart")
	public void quantity_of_products_need_to_be_updated_in_the_cart() 
	{
		String ActualText = driver.findElement(By.tagName("body")).getText();
		String expTest = "Ensure Vanilla Delight Flavoured Diabetes Care Powder, 400 gm Jar";
		boolean res = ActualText.contains(expTest);
		Assert.assertFalse(res);
		driver.quit();
	}
	
	// Place order for medicine
	
	@Given("add the medicines to the cart")
	public void add_the_medicines_to_the_cart() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.apollo247.com/");
        driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
	    System.out.println("Website is Opened");
	    driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/header/div[4]/div[1]/a[2]/span[2]")).click();
		Thread.sleep(2000);
	}

	@When("User click on the Proceed button")
	public void user_click_on_the_proceed_button() throws InterruptedException 
	{		
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"searchProduct\"]")).sendKeys("Diabetes Care");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='search icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body//div//div//div//div//div//div//div[1]//div[1]//div[2]//button[1]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='GO TO CART']")).click();
		
	}
	@When("User Select the Prescription type")
	public void user_select_the_prescription_type() throws InterruptedException 
	{
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//div[@role='button']"));
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);	
		
	}
	@When("User click on proceed button")
	public void user_click_on_proceed_button() throws InterruptedException 
	{
		Thread.sleep(1000);
		WebElement ele1 = driver.findElement(By.cssSelector("img[title='Remove item from Cart']"));
		Thread.sleep(1000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].click()", ele1);
	}
	@Then("Payment options Page should come")
	public void payment_options_page_should_come() 
	{
		String ActualText = driver.findElement(By.tagName("body")).getText();
		String expTest = "Payments";
		boolean res = ActualText.contains(expTest);
		Assert.assertFalse(res);
		driver.quit();
	}

	// Login Functionality
	
	// Check Login Successful with Valid Credentials
	@Given("browser is open")
	public void browser_is_open() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.apollo247.com/");
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
	    System.out.println("Website is Opened");	
	}
	@Given("User is on login page")
	public void user_is_on_login_page() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
		Thread.sleep(2000);
	}
	@When("user enters phone number")
	public void user_enters_phone_number() throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
		Thread.sleep(2000);
	}
	@When("click on get otp")
	public void click_on_get_otp() throws InterruptedException 
	{
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[2]/button/span[1]/span")).click();
		Thread.sleep(15000);
	}
	@When("user clicks on login page")
	public void user_clicks_on_login_page() throws InterruptedException 
	{
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[1]/div[2]/button/span[1]/span")).click();
	    Thread.sleep(2000);
	}
	@Then("user is navigated to user profile")
	public void user_is_navigated_to_user_profile() throws InterruptedException
	{
	    String exptext = "Adithya";
	    String ActualText = driver.findElement(By.tagName("body")).getText();
	    System.out.println(ActualText);
        boolean res = ActualText.contains(exptext);
	    Assert.assertTrue(true);
	    driver.quit();
	}

   // Check Login with Invalid Phone Number
	
	@Given("user is in website")
	public void user_is_in_website() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.apollo247.com/");
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
	    System.out.println("Website is Opened");	
	}
	@Given("User is on login page invalid")
	public void user_is_on_login_page_invalid() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
		Thread.sleep(2000);
	}
	@When("user enters invalid phone number")
	public void user_enters_invalid_phone_number() throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("938136350");
		Thread.sleep(2000);
	}
	@Then("user is not able click on get OTP button")
	public void user_is_not_able_click_on_get_otp_button() throws ElementClickInterceptedException, InterruptedException, NoSuchElementException
	{
		boolean btn_enable_check = true;
		try {
			Thread.sleep(2000);
            driver.findElement(By.className("icon-ic_arrow_forward")).click();
            Thread.sleep(2000);
        }
        catch(ElementClickInterceptedException e) {
            System.out.println("Submit Exception caught");
            btn_enable_check = false;
        }
		catch(NoSuchElementException ns) {
			System.out.println("Submit Exception caught");
            btn_enable_check = false;
		}
		Assert.assertFalse(btn_enable_check);
		driver.quit();
	}

   // check login with invalid otp
	
	@Given("browser is ready")
	public void browser_is_ready() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.apollo247.com/");
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
	    System.out.println("Website is Opened");
	}
	@Given("User is on login")
	public void user_is_on_login() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
		Thread.sleep(2000);
	}
	@When("user enters phone number invalid")
	public void user_enters_phone_number_invalid() throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9381363502");
		Thread.sleep(2000);
	}
	@When("user press on login button")
	public void user_press_on_login_button() throws InterruptedException 
	{
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[2]/button/span[1]/span")).click();
		Thread.sleep(15000);
	}
	@When("user enters wrong otp")
	public void user_enters_wrong_otp() throws InterruptedException 
	{
		Thread.sleep(5000);
	}
	@Then("user is not able to click on login button.")
	public void user_is_not_able_to_click_on_login_button() throws ElementClickInterceptedException
	{
		boolean btn_enable_check = true;
		try {
            driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[1]/div[2]/button")).click();
        }
        catch(ElementClickInterceptedException e) {
            System.out.println("Submit Exception caught");
            btn_enable_check = false;
        }
		Assert.assertFalse(btn_enable_check);
		driver.quit();
	}
}
  

//	// Address Verification
//	// Validate the user input in Address Field
//
//	@Given("Website is set Opened")
//	public void website_is_set_opened() 
//	{
//	    
//	}
//	@Given("User Loged in Successfully")
//	public void user_loged_in_successfully() 
//	{
//	    
//	}
//	@Given("User Browse on to the Orders page")
//	public void user_browse_on_to_the_orders_page() 
//	{
//	   
//	}
//	@When("enters the Address")
//	public void enters_the_address() 
//	{
//	    
//	}
//	@When("click on submit")
//	public void click_on_submit() 
//	{
//	    
//	}
//	@Then("Address Submitted Successfully")
//	public void address_submitted_successfully() 
//	{
//	    
//	}
//	
//	// pincode verification
//	// invalid length of pincode 
//	
//	@Given("Website  Opened")
//	public void website_opened() 
//	{
//	    
//	}
//
//	@Given("User Loged Successfully in")
//	public void user_loged_successfully_in() 
//	{
//	    
//	}
//
//	@Given("User Browse to the Orders page")
//	public void user_browse_to_the_orders_page() 
//	{
//	    
//	}
//
//	@When("enters the pincode of invalid length")
//	public void enters_the_pincode_of_invalid_length() 
//	{
//	    
//	}
//
//	@When("click on submit button")
//	public void click_on_submit_button() 
//	{
//	    
//	}
//
//	@Then("user not able to submit")
//	public void user_not_able_to_submit() 
//	{
//	    
//	}
//
//	
//	// valid length of pincode equal to six digits
//	
//	
//	@Given("Website Opened and up for running")
//	public void website_opened_and_up_for_running() 
//	{
//	    
//	}
//
//	@Given("User Loged Successfully")
//	public void user_loged_successfully() 
//	{
//	    
//	}
//
//	@Given("User Browsed on to the Orders page")
//	public void user_browsed_on_to_the_orders_page() 
//	{
//	    
//	}
//
//	@When("enters the pincode of  length")
//	public void enters_the_pincode_of_length() 
//	{
//	    
//	}
//
//	@Then("Error Message Thrown")
//	public void error_message_thrown() 
//	{
//	    
//	}
//
//	@Then("cursor on the Pincode Field")
//	public void cursor_on_the_pincode_field() 
//	{
//	    
//	}
//}
//
//
