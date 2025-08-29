package Capstone.AutomationPractice14;

import org.testng.annotations.Test;

import AmazonPages.HomeOfFacebook;
import Common.Utilities;

import org.testng.annotations.DataProvider;

public class Points extends Utilities {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  HomeOfFacebook homeb = new HomeOfFacebook(driver);
	  homeb.username(n);
	  homeb.Pssword(s);
	  homeb.login();
  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Ali", "abcdef" },
      new Object[] { "Saleem", "ghijkl" },
      new Object[] {"Rabin",  "mnopqrs"},
    };
  }
}
