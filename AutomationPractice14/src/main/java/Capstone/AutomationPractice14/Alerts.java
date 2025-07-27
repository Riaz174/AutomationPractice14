package Capstone.AutomationPractice14;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice14\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(" https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement cuid = driver.findElement(By.name("cusid"));
		cuid.sendKeys("abcde");
		WebElement smit = driver.findElement(By.name("submit"));
		smit.click();
		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		Thread.sleep(6000);
		alert.accept();

		
	}

}
