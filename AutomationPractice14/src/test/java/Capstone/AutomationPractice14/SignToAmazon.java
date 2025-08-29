package Capstone.AutomationPractice14;

import org.testng.annotations.Test;

import AmazonPages.Home;
import AmazonPages.sign;
import Common.Utilities;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SignToAmazon extends Utilities {

  @Test
  public void f() {
	  Home homef = new Home(driver);
	  homef.signClick();
	  sign signf = new sign(driver);
	  signf.fname();
	  signf.lname();
  }
  
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(6000);
	  driver.quit();
	  
  }

}
