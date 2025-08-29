package AmazonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public WebDriver driver;
	@FindBy(xpath = "//*[contains(text(),'Create new account')]") WebElement cnaccount;
	
	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	public void signClick() {
		cnaccount.click();
	}

}
