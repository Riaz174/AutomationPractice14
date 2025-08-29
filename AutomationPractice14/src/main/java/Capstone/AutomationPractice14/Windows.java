package Capstone.AutomationPractice14;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository32\\AutomationPractice14\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement owindow = driver.findElement(By.id("openwindow"));
		owindow.click();
		Thread.sleep(6000);
		String currentwhandle = driver.getWindowHandle();
		System.out.println(currentwhandle);
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> iterators = windowhandles.iterator();
		String Firstwhandle = iterators.next();
		String Secondwhandle = iterators.next();
		System.out.println("First windowhandle is: " + Firstwhandle);
		System.out.println("Second windowhandle is : " + Secondwhandle);
		Thread.sleep(6000);
		driver.switchTo().window(Secondwhandle);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement contact = driver.findElement(By.xpath("(//*[text()='Contact'])[1]"));
		contact.click();
		
		

	}

}
