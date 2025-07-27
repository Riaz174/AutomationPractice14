package Capstone.AutomationPractice14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice14\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement flight = driver.findElement(By.xpath("(//*[contains(text(),'Flights')])[3]"));
		flight.click();
		Thread.sleep(3000);
		WebElement dts = driver.findElement(By.name("EGDSDateRange-date-selector-trigger"));
		dts.click();
		Thread.sleep(6000);
		WebElement depdt = driver.findElement(By.xpath("(//div[@class='uitk-date-number uitk-date-number-default uitk-type-300 uitk-type-regular'])[27]"));
		depdt.click();
		Thread.sleep(6000);
		

	}

}
