package steps;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.LoginPage;
import pages.SkillsPage;

public class stepdefination {

	WebDriver driver;
	
	LoginPage LP;
	SkillsPage SP;
	HomePage HP;

	@Given("user launch browser")
	public void user_launch_browser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Then("user enter URL as {string}")
	public void user_enter_url_as(String TestURL) {

		
		LP = new LoginPage();   // classname name = new classname();--object creation
		LP.LoginPageDriver(driver);
		LP.user_enter_url_as(TestURL);
	}

	@Then("user enters login details")
	public void user_enters_login_details(io.cucumber.datatable.DataTable dataTable) {

		
		LP.LoginPageDriver(driver);
		LP.user_enters_login_details(dataTable);
	}

	@Then("go to skills page")
	public void go_to_skills_page() {

		SP = new SkillsPage();
		SP.SkillsPageDriver(driver);
		SP.go_to_skills_page();
	}

	@Then("user enters skills details")
	public void user_enters_skills_details(io.cucumber.datatable.DataTable dataTable) {

		SP.SkillsPageDriver(driver);
		SP.user_enters_skills_details(dataTable);
	}

	@Then("logout")
	public void logout() {
		HP =new HomePage();
		HP.HomePageDriver(driver);

	}

	@Then("close browser")
	public void close_browser() {

		HP.HomePageDriver(driver);
	}

}
