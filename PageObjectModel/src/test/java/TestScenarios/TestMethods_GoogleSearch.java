 package TestScenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Object.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_GoogleSearch {
	WebDriver driver;
	GoogleSearchPage objectrepo;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.get("https://www.google.com/");
	}
	@Test
	public void searchOperations() {
		GoogleSearchPage page=new GoogleSearchPage(driver);
		page.searchGoogle("facebook");	
	}
	@Test
	public void VerifyandAccessFacebok() {
		objectrepo = new GoogleSearchPage(driver);
		objectrepo.ClickFacebook();
		
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
