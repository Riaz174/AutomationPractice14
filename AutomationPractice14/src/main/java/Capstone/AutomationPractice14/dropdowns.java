package Capstone.AutomationPractice14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice14\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement caccount = driver.findElement(By.xpath("//*[text()='Create new account']"));
		caccount.click();
		Thread.sleep(3000);
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("john");
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("Doe");
		Thread.sleep(6000);
		WebElement bmonth = driver.findElement(By.name("birthday_month"));
		Select bm = new Select(bmonth);
		bm.selectByIndex(10);
		Thread.sleep(3000);
		WebElement bday = driver.findElement(By.name("birthday_day"));
		Select bd = new Select(bday);
		bd.selectByValue("15");
		Thread.sleep(3000);
		WebElement byear = driver.findElement(By.name("birthday_year"));
		Select by = new Select(byear);
		by.selectByVisibleText("2024");
		Thread.sleep(3000);
		WebElement genderm = driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
		genderm.click();
		
		

	}

}
