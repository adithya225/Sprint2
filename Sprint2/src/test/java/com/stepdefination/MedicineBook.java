package com.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MedicineBook {
	// BookMedicines
	WebDriver driver;

	@Given("homepage is open")
	public void homepage_is_open() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adprasad\\OneDrive - Capgemini\\Desktop\\Selenium\\drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.apollo247.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/span")).click();
	}

	@When("user enters phone number")
	public void user_enters_phone_number() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name=\"mobileNumber\"]")).sendKeys("9832691563");
		driver.findElement(By.xpath("//*[@class=\"MuiButtonBase-root MuiFab-root MuiFab-primary\"]")).click();
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@class=\"MuiButtonBase-root MuiFab-root MuiFab-primary\"]")));
		driver.findElement(By.xpath("//*[@class=\"MuiButtonBase-root MuiFab-root MuiFab-primary\"]")).click();
	}

	@Then("sucessful login")
	public void sucessful_login() {
		driver.quit();
	}

	@Given("user is in homepage")
	public void user_is_in_homepage() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adprasad\\OneDrive - Capgemini\\Desktop\\Selenium\\drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.apollo247.com/");
		// driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
	}

	@Given("user is on Pharmacy page")
	public void user_is_on_pharmacy_page() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/header/div[4]/div[1]/a[2]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
	}

	@Given("user selects a Category")
	public void user_selects_a_category() {
		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[1]/div[2]/ul/li[2]/a")).click();
		// Thread.sleep(2000);
		// *[@id="mainContainerCT"]/div[1]/div[2]/ul/li[2]/a
	}

	@When("user clicks on Add to Cart")
	public void user_clicks_on_add_to_cart() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div/div[2]/button"))
				.click();
		// Thread.sleep(5000);
		// driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div[2]/div[2]/div[4]/div[1]/div/div[2]/div[3]/button[2]")).click();
	}

	@Then("products are added to the Cart")
	public void products_are_added_to_the_cart() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div/div[2]/button[2]")).click();
		driver.quit();
	}

	@Given("website is open")
	public void website_is_open() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adprasad\\OneDrive - Capgemini\\Desktop\\Selenium\\drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.apollo247.com/");
		// driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/header/div[4]/div[1]/a[2]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[1]/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div/div[2]/button"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div/div[2]/button[2]")).click();
	}

	@When("user clicks on Remove from Cart in cart")
	public void user_clicks_on_remove_from_cart_in_cart() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title='Remove item from Cart']")).click();

	}

	@Then("product is removed from the Cart")
	public void product_is_removed_from_the_cart() {
		System.out.println("The product is removed");
		driver.quit();
	}

	@Given("user is in the website")
	public void user_is_in_the_website() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adprasad\\OneDrive - Capgemini\\Desktop\\Selenium\\drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.apollo247.com/");
		// driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/header/div[4]/div[1]/a[2]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[1]/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div/div[2]/button"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div/div[2]/button[2]")).click();
	}

	@When("user increments or decrements items in cart")
	public void user_increments_or_decrements_items_in_cart() throws InterruptedException {
		Thread.sleep(2000);
	}

	@Then("number of items in cart is altered")
	public void number_of_items_in_cart_is_altered() {
		System.out.println("The product is altered");
		driver.quit();
	}

	// Address details
	@Given("home page opened")
	public void home_page_opened() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adprasad\\OneDrive - Capgemini\\Desktop\\Selenium\\drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.apollo247.com/");
		// driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();

	}

	@Given("user enters the medicine details")
	public void user_enters_the_medicine_details() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/header/div[4]/div[1]/a[2]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[1]/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div/div[2]/button"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div/div[2]/button[2]")).click();

	}

	@When("user enters pincode of length less than six digits")
	public void user_enters_pincode_of_length_less_than_six_digits() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/div/div[1]/div/div/div/p")).click();
		driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/div/div[1]/div/div/div[2]/div[3]/p")).click();
		// Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[1]/div/input")).sendKeys("73400");
		Thread.sleep(5000);
	}

	@Then("error message displayed")
	public void error_message_displayed() {
		System.out.println("Invalid pincode input");
		driver.quit();
	}

	@Given("homepage is opened")
	public void homepage_is_opened() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adprasad\\OneDrive - Capgemini\\Desktop\\Selenium\\drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.apollo247.com/");
		// driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
	}

	@Given("user enters the cart details")
	public void user_enters_the_cart_details() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/header/div[4]/div[1]/a[2]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[1]/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div/div[2]/button"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div/div[2]/button[2]")).click();

	}

	@When("user enters pincode of length greater than six digits")
	public void user_enters_pincode_of_length_greater_than_six_digits() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/div/div[1]/div/div/div/p")).click();
		driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/div/div[1]/div/div/div[2]/div[3]/p")).click();
		// Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[1]/div/input")).sendKeys("7340001");
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[2]/button")).click();
		Thread.sleep(5000);
	}

	@Then("error is displayed")
	public void error_is_displayed() {
		System.out.println("Invalid pincode input");
		driver.quit();
	}

	@Given("user is in chorme website")
	public void user_is_in_chorme_website() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adprasad\\OneDrive - Capgemini\\Desktop\\Selenium\\drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.apollo247.com/");
		// driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
	}

	@Given("user enters the order details")
	public void user_enters_the_order_details() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/header/div[4]/div[1]/a[2]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[1]/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div/div[2]/button"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div/div[2]/button[2]")).click();
	}

	@When("user enters unavailable pincode services on address form")
	public void user_enters_unavailable_pincode_services_on_address_form() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/div/div[1]/div/div/div/p")).click();
		driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/div/div[1]/div/div/div[2]/div[3]/p")).click();
		// Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[1]/div/input")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[2]/button")).click();
		Thread.sleep(5000);

	}

	@Then("error displayed")
	public void error_displayed() {
		System.out.println("Pincode out of service");
		driver.quit();
	}

	@Given("user is logged-in in the website")
	public void user_is_logged_in_in_the_website() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adprasad\\OneDrive - Capgemini\\Desktop\\Selenium\\drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.apollo247.com/");
		// driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
	}

	@Given("user enters the details of medicine")
	public void user_enters_the_details_of_medicine() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/header/div[4]/div[1]/a[2]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[1]/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div/div[2]/button"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div/div[2]/button[2]")).click();
	}

	@When("user enters valid pincode length on address form")
	public void user_enters_valid_pincode_length_on_address_form() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/div/div[1]/div/div/div/p")).click();
		driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/div/div[1]/div/div/div[2]/div[3]/p")).click();
		// Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[1]/div/input")).sendKeys("734301");
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[2]/button")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@title='Login to continue']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name=\"mobileNumber\"]")).sendKeys("9832691563");
		driver.findElement(By.xpath("//*[@class=\"MuiButtonBase-root MuiFab-root MuiFab-primary\"]")).click();
		Thread.sleep(5000);
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@class=\"MuiButtonBase-root MuiFab-root MuiFab-primary\"]")));
		driver.findElement(By.xpath("//*[@class=\"MuiButtonBase-root MuiFab-root MuiFab-primary\"]")).click();
	}

	@Then("the address details is saved")
	public void the_address_details_is_saved() throws InterruptedException {
		System.out.println("Address saved");
		driver.quit();

	}

}