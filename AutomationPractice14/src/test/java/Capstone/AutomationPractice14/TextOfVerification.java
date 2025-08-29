package Capstone.AutomationPractice14;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import AmazonPages.HomeOfFacebook;
import Common.Utilities;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TextOfVerification extends Utilities {
	
  @Test(priority = 2)
  public void f() throws IOException, InterruptedException {
	  HomeOfFacebook homeb = new HomeOfFacebook(driver);
	  String tx = homeb.verificationOfText();
	  shots();
	  Thread.sleep(3000);
	  System.out.println(tx);
	 // Assert.assertEquals(tx, "Facebook helps you connect and share with the people in your life.");
	  SoftAssert st = new SoftAssert();// It is from TestNG class
	  shots();
	  Thread.sleep(3000);
	  st.assertEquals(tx, "Facebook helps you connect and share with the people in your life.");
	  System.out.println("This is after assertion");
	  shots();
	  Thread.sleep(3000);
	  st.assertAll();
	   }
   @Test(priority = 1)
  public void signin(String n, String s) {
	  HomeOfFacebook homeb = new HomeOfFacebook(driver);
	  homeb.username(n);
	  homeb.Pssword(s);
	  homeb.login();
  }
   

}
