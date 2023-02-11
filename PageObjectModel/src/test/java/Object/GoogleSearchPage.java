package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver=driver;
	
	}
    By searchbox = By.name("q");
    By Search_btn = By.xpath("(//input[@name=\"btnK\"])[1]");    
    
    public void searchGoogle(String SearchInput) {
    	try {
        	driver.findElement(searchbox).sendKeys(SearchInput);
        	driver.findElement(Search_btn).click();
		} catch (Exception e) {
			System.out.println("Exceptions caught"+e.getMessage());
		}
    	driver.findElement(searchbox).sendKeys(SearchInput);
    }
    public void ClickFacebook() {
    	try {
    		
			driver.get("https://www.facebook.com/");
		} catch (Exception e) {
			System.out.println("Exceptions caught"+e.getMessage());
		}
    }
}
