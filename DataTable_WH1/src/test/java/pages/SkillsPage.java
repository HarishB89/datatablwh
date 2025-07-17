package pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SkillsPage {
	WebDriver driver;

	public void SkillsPageDriver(WebDriver driver1) {

		this.driver = driver1;
	}

	public void go_to_skills_page() {

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]")).click();

	}

	public void user_enters_skills_details(io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> skillrecord = dataTable.asMaps();

		for (int i = 0; i < 3; i++) {

			String SKILLNAME = skillrecord.get(i).get("SkillName");
			String SKILLDESC = skillrecord.get(i).get("SkillDesc");

			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();

			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"))
					.sendKeys(SKILLNAME);

			driver.findElement(
					By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea"))
					.sendKeys(SKILLDESC);

			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		}
	}

}
