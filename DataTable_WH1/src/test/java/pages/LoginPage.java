package pages;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public void LoginPageDriver(WebDriver driver1) {
		
		this.driver = driver1;
	}
	
	
	

	public void user_enter_url_as(String TestURL) {

		driver.get(TestURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public void user_enters_login_details(io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> login = dataTable.asMaps();

		String USERNAME = login.get(0).get("Username");
		String PASSWORD = login.get(0).get("Password");

		driver.findElement(By.name("username")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

	}

}
