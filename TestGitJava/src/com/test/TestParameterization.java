package com.parameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestParameterization {

	WebDriver driver;
	String url = "http://demo.automationtesting.in/Index.html";

	@Given("navigate to demo automation")
	public void navigate_to_demo_automation() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\WindowsDrive\\Selenium_Jar\\Driver\\Runner\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}

	@Then("click on {string} button")
	public void click_on_button(String skipSignin) {
		driver.findElement(By.id(skipSignin)).click();
	}

	@Then("verify title of the register page")
	public void verify_title_of_the_register_page() {
		if (!driver.getTitle().equals("Register")) {
			System.out.println("Register title not matched");
		} else {
			System.out.println("Register Title matched");
		}
	}

	@Then("click on the tab web table")
	public void click_on_the_tab_web_table() {
		driver.findElement(By.xpath("//a[text()='WebTable']")).click();
	}

	@Then("verify title of the web table page")
	public void verify_title_of_the_web_table_page() {
		if (!driver.getTitle().equals("Web Table")) {
			System.out.println("Web Table title not matched");
		} else {
			System.out.println("Web Table title matched");
		}
	}

	@Then("click on the tab home")
	public void click_on_the_tab_home() {
		driver.findElement(By.xpath("//a[text()='Home']")).click();
	}

	@Then("verify title of the home page")
	public void verify_title_of_the_home_page() {
		if (!driver.getTitle().equals("Home")) {
			System.out.println("Home page title not matched");
		} else {
			System.out.println("Home page title matched");
		}
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	}
}
