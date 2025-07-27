package Capstone.AutomationPractice14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutes {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice14\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		//WebElement sbutton = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span/input"));
		//sbutton.click();
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email or phone number']"));
		email.sendKeys("john@gmail.com");
		Thread.sleep(6000);
		WebElement pword = driver.findElement(By.xpath("//input[@type='password']"));
		pword.sendKeys("abcdef");
		Thread.sleep(3000);
		WebElement fpword = driver.findElement(By.xpath("//*[text()='Forgot password?']"));
		fpword.click();
		
		

	}

}
