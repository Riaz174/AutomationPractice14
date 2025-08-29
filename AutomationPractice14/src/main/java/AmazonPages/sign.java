package AmazonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sign {
	public WebDriver driver;
	
	@FindBy(name = "firstname") WebElement fname;
	@FindBy(name = "lastname") WebElement lname;
	
	public sign(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void fname() {
		fname.sendKeys("Ali");
	}
	public void lname() {
		lname.sendKeys("Ahmad");
	}
	

}
