package Capstone.AutomationPractice14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice14\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement sbutton = driver.findElement(By.id("nav-search-submit-button"));
		sbutton.click();
		Thread.sleep(10000);
		WebElement allbutton = driver.findElement(By.xpath("(//*[text()='All'])[2]"));
		allbutton.click();
		Thread.sleep(6000);
		WebElement ahaulbutton = driver.findElement(By.xpath("(//*[text()='Amazon Haul'])[3]"));
		ahaulbutton.click();
		Thread.sleep(6000);

	}

}
