package aSeleniumPractical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAndDebug {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\My Java Programs\\Java and Selenium\\Selenium\\Browser\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://adactin.com/HotelApp/");
		
		WebElement user = d.findElement(By.id("username"));
		user.sendKeys("settu4u@gmail.com");	
		
		WebElement pass = d.findElement(By.id("password"));
		pass.sendKeys("1234567890");
		
		Thread.sleep(2000);
		
		WebElement login = d.findElement(By.id("login"));
		login.click();

	}

}
